package br.com.erivelto.restfulteste.core.config.jwt.filter;

import lombok.Data;

/**
 * Create by erivelto on 25/02/19
 */
@Data
public class UserCredentials {

    private String username;
    private String password;
}
