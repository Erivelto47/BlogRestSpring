package br.com.erivelto.restfulteste.usuario;

import javax.persistence.Embeddable;

/**
 * Create by erivelto on 05/02/19
 */
@Embeddable
public class Credenciais {

    private String nomeUsuario;
    private String senha;

}
