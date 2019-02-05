package br.com.erivelto.restfulteste.Tag;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class TagServiceImpl extends CrudServiceImpl<Tag, Long> {

    @Autowired
    TagRepository tagRepository;
    
    @Override
    protected JpaRepository<Tag, Long> getRepository() {
        return tagRepository;
    }
}
