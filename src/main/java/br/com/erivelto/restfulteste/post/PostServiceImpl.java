package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import br.com.erivelto.restfulteste.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl extends CrudServiceImpl<Post, Long> implements PostService {

    @Autowired private PostRepository postRepository;

    @Override
    protected JpaRepository<Post, Long> getRepository() {
        return postRepository;
    }

    @Override
    protected void preSave(Post entity) throws ValidationException {
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
