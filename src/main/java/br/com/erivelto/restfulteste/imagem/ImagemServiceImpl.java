package br.com.erivelto.restfulteste.imagem;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagemServiceImpl extends CrudServiceImpl<Imagem, Long> implements ImagemService{

    @Autowired
    ImagemRepository imagemRepository;

    @Override
    protected JpaRepository<Imagem, Long> getRepository() {
        return imagemRepository;
    }
}
