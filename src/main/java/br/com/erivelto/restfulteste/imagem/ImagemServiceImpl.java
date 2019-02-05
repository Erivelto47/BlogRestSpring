package br.com.erivelto.restfulteste.imagem;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class ImagemServiceImpl extends CrudServiceImpl<Imagem, Long> {

    @Autowired
    ImagemRepository imagemRepository;

    @Override
    protected JpaRepository<Imagem, Long> getRepository() {
        return imagemRepository;
    }
}
