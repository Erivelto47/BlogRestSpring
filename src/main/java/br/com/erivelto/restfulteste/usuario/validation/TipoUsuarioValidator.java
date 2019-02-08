package br.com.erivelto.restfulteste.usuario.validation;

import br.com.erivelto.restfulteste.core.validation.Validator;
import br.com.erivelto.restfulteste.exception.ValidationException;
import br.com.erivelto.restfulteste.usuario.TipoUsuario;

/**
 * Create by erivelto on 08/02/19
 */
public class TipoUsuarioValidator implements Validator<String> {

    @Override
    public void valida(String tipoUsuario) throws ValidationException {
        if(TipoUsuario.getUsuarioPorTipo(tipoUsuario) == null){
            throw new ValidationException("Tipo de Usuario Inválido!");
        }
    }
}