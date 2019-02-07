package br.com.erivelto.restfulteste.usuario.validacao;

import br.com.erivelto.restfulteste.core.validation.Validator;
import br.com.erivelto.restfulteste.exception.ValidationException;
import br.com.erivelto.restfulteste.usuario.Usuario;
import br.com.erivelto.restfulteste.usuario.UsuarioRepository;

/**
 * Create by erivelto on 07/02/19
 */
public class NomeUsuarioValidator implements Validator<String> {

    private final UsuarioRepository usuarioRepository;

    public NomeUsuarioValidator(UsuarioRepository usuarioRepository) {
        this.usuarioRepository =  usuarioRepository;
    }

    @Override
    public void valida(String nomeUsuario) throws ValidationException {
        boolean present = usuarioRepository.findByCredenciais_NomeUsuario(nomeUsuario).isPresent();

        if (present) throw new ValidationException("O nome de usuário já existe.");


    }
}
