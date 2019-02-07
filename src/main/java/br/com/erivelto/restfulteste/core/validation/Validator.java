package br.com.erivelto.restfulteste.core.validation;

import br.com.erivelto.restfulteste.exception.ValidationException;

/**
 * Create by erivelto on 05/02/19
 */
public interface Validator<T> {

    void valida(T o) throws ValidationException;
}
