package br.com.erivelto.restfulteste.usuario;

import java.util.List;

/**
 * Create by erivelto on 21/02/19
 */
public interface UserRepositoryCustom {

    List<Usuario> findByExample();
}
