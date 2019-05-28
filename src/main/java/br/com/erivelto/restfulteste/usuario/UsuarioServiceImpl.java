package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import br.com.erivelto.restfulteste.exception.ValidationException;
import br.com.erivelto.restfulteste.usuario.validation.NomeUsuarioValidator;
import br.com.erivelto.restfulteste.usuario.validation.SenhaValidator;
import br.com.erivelto.restfulteste.usuario.validation.TipoUsuarioValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

/**
 * Create by erivelto on 05/02/19
 */
@Service("usuarioServiceImpl")
public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> implements UsuarioService, UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected JpaRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }

    @Override
    protected void preSave(Usuario entity) throws ValidationException {
        try{
            valida(new SenhaValidator(), entity.getCredenciais().getSenha());
            valida(new NomeUsuarioValidator(usuarioRepository), entity.getCredenciais().getNomeUsuario());
            valida(new TipoUsuarioValidator(), entity.getCredenciais().getTipoUsuario());
        } catch (ValidationException e){
            throw new ValidationException(e.getMessage());
        }

        if(entity.getPessoaId() == null){
            String pass = passwordEncoder.encode(entity.getSenha());
            entity.setSenha(pass);
        }

        try {
            super.preSave(entity);
        } catch (ValidationException e){
            throw new ValidationException(e.getMessage());
        }
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Usuario> usuario = usuarioRepository.findByCredenciais_NomeUsuario(userName);
        return usuario.map(this::getUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("Não deu certo"));
    }

    private User getUserDetails(Usuario usuario1) {
        return new User(usuario1.getUsername(),
                usuario1.getSenha(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }

    @Override
    public Usuario findByNomeUsuario(String nomeUsuario) {
        return usuarioRepository.findByCredenciaisNomeUsuario(nomeUsuario);
    }
}
