package br.com.erivelto.restfulteste.Tag;

import br.com.erivelto.restfulteste.Tag.validation.NomeTagValidator;
import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Create by erivelto on 08/02/19
 */
@Service
public class TagServiceImpl extends CrudServiceImpl<Tag, Long> implements TagService {

    @Autowired
    TagRepository tagRepository;
    
    @Override
    protected JpaRepository<Tag, Long> getRepository() {
        return tagRepository;
    }

    @Override
    protected void preSave(Tag entity) {
        valida(new NomeTagValidator(), entity.getNome());
        super.preSave(entity);
    }
}
