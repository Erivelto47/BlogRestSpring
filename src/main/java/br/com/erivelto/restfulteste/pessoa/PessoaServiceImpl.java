package br.com.erivelto.restfulteste.pessoa;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Create by erivelto on 06/02/19
 */
@Service
public class PessoaServiceImpl extends CrudServiceImpl<Pessoa, Long> implements PessoaService{

    @Autowired
    PessoaRespository pessoaRespository;

    @Override
    protected JpaRepository<Pessoa, Long> getRepository() {
        return pessoaRespository;
    }
}
