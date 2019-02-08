package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.Tag.Tag;
import br.com.erivelto.restfulteste.Tag.TagRepository;
import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import br.com.erivelto.restfulteste.usuario.Usuario;
import br.com.erivelto.restfulteste.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl extends CrudServiceImpl<Post, Long> implements PostService {

    @Autowired private PostRepository postRepository;

    @Autowired private UsuarioRepository usuarioRepository;

    @Autowired private TagRepository tagRepository;




    @Override
    protected JpaRepository<Post, Long> getRepository() {
        return postRepository;
    }

    @Override
    protected void preSave(Post entity) {
        //TODO adicionar autorList, Tag e Imagens por ID
        /*List<Usuario> autores = new ArrayList<>();
        entity.getAutorList().stream()
                .filter(a -> a.getPessoaId() != null)
                .forEach(a -> usuarioRepository
                        .findById(a.getPessoaId())
                        .ifPresent(autores::add));

        Não é necessário hibernate faz validação antes de inserir*/

        super.preSave(entity);
    }
}
