package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Create by erivelto on 05/02/19
 */
public interface UsuarioService extends CrudService<Usuario, Long> {

    public Usuario findByNomeUsuario(String nomeUsuario);

}
