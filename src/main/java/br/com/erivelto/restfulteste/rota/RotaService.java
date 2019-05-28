package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.core.crud.CrudService;
import br.com.erivelto.restfulteste.usuario.TipoUsuario;

import java.util.List;

/**
 * Create By erivelto	on 27/05/19
 */
public interface RotaService extends CrudService<Rota,Long> {

    List<Rota> findAllByTipoUsuario(TipoUsuario tipoUsuario);
}
