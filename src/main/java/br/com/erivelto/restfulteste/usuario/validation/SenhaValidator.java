package br.com.erivelto.restfulteste.usuario.validation;

import br.com.erivelto.restfulteste.core.validation.Validator;
import br.com.erivelto.restfulteste.exception.ValidationException;

/**
 * Create by erivelto on 07/02/19
 */
public class SenhaValidator implements Validator<String> {
    @Override
    public void valida(String senha) throws ValidationException{
        if(senha == null || senha.length() < 6 || senha.length() > 12){
            throw new ValidationException("Senha inválida! A Senha deve ter entre 6 e 12 caracteres.");
        }
    }
}
