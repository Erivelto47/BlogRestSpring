package br.com.erivelto.restfulteste.exception;

/**
 * Create by erivelto on 07/02/19
 */
public class ValidationException extends Exception {

    public ValidationException(String mensage){
        super(mensage);
    }
}
