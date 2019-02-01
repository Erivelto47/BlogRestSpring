package br.com.erivelto.restfulteste.autor;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Create by erivelto on 01/02/19
 */

@Service
public class AutorServiceImpl extends CrudServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    protected JpaRepository<Autor, Long> getRepository() {
        return autorRepository;
    }
}
