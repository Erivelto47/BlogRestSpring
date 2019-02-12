package br.com.erivelto.restfulteste.pessoa;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Create by erivelto on 07/02/19
 */
public class PessoaController extends CrudController<Pessoa, Long> {

    @Autowired
    private PessoaService pessoaService;

    @Override
    public CrudService<Pessoa, Long> getService() {
        return pessoaService;
    }
}
