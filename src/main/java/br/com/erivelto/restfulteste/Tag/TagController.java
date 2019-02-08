package br.com.erivelto.restfulteste.Tag;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by erivelto on 08/02/19
 */
@RestController
@RequestMapping("tag")
public class TagController extends CrudController<Tag, Long> {

    @Autowired
    private TagService tagService;

    @Override
    public CrudService<Tag, Long> getService() {
        return tagService;
    }
}
