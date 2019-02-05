package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.core.crud.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class PostServiceImpl extends CrudServiceImpl<Post, Long> {

    @Autowired
    PostRepository postRepository;

    @Override
    protected JpaRepository<Post, Long> getRepository() {
        return postRepository;
    }
}
