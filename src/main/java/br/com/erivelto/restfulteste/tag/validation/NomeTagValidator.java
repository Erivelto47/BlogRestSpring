package br.com.erivelto.restfulteste.tag.validation;

import br.com.erivelto.restfulteste.core.validation.Validator;
import br.com.erivelto.restfulteste.exception.ValidationException;

/**
 * Create by erivelto on 08/02/19
 */
public class NomeTagValidator implements Validator<String> {

    @Override
    public void valida(String tag) throws ValidationException {
        if(tag.length() < 3 || tag.length() > 10){
            throw new ValidationException("Uma tag deve conter entre 3 e 10 caracteres.");
        }
    }
}
