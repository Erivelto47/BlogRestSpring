package br.com.erivelto.restfulteste.core.validation;

/**
 * Create by erivelto on 05/02/19
 */
public interface Validator<T> {

    void valid(T o);
}
