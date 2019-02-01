package br.com.erivelto.restfulteste.autor;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by erivelto on 01/02/19
 */

@RestController
@RequestMapping("autor")
public class AutorController extends CrudController<Autor, Long> {

    @Autowired private AutorService autorService;

    @Override
    public CrudService getService() {
        return autorService;
    }
}
