package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import br.com.erivelto.restfulteste.usuario.validacao.NomeUsuarioValidator;
import br.com.erivelto.restfulteste.usuario.validacao.SenhaValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Create by erivelto on 05/02/19
 */
@Service
public class UsuarioServiceImpl extends CrudServiceImpl<Usuario, Long> implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected JpaRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }

    @Override
    protected void preSave(Usuario entity) {
        valida(new SenhaValidator(), entity.getCredenciais().getSenha());
        valida(new NomeUsuarioValidator(usuarioRepository), entity.getCredenciais().getNomeUsuario());

        super.preSave(entity);
    }
}
