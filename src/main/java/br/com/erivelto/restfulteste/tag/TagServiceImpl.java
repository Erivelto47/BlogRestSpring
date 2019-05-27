package br.com.erivelto.restfulteste.tag;

import br.com.erivelto.restfulteste.exception.ValidationException;
import br.com.erivelto.restfulteste.tag.validation.NomeTagValidator;
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
    protected void preSave(Tag entity) throws ValidationException {
        valida(new NomeTagValidator(), entity.getNome());
        super.preSave(entity);
    }
}
