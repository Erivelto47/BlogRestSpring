package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.usuario.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Create By erivelto	on 27/05/19
 */
public interface RotaRepository extends JpaRepository<Rota, Long> {

    List<Rota> findAllByTipoUsuario(TipoUsuario tipoUsuario);
}
