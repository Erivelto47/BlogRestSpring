package br.com.erivelto.restfulteste.imagem;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by erivelto on 11/02/19
 */
@RestController
@RequestMapping("imagem")
public class ImagemController extends CrudController<Imagem, Long> {

    @Autowired
    ImagemService imagemService;

    @Override
    public CrudService<Imagem, Long> getService() {
        return imagemService;
    }
}
