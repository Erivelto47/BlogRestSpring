package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import br.com.erivelto.restfulteste.usuario.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By erivelto	on 27/05/19
 */
@Service
public class RotaServiceImpl extends CrudServiceImpl<Rota, Long> implements RotaService {


    @Autowired
    private RotaRepository repository;

    @Override
    protected JpaRepository<Rota, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Rota> findAllByTipoUsuario(TipoUsuario tipoUsuario) {
        return repository.findAllByTipoUsuario(tipoUsuario);
    }
}
