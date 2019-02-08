package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by erivelto on 08/02/19
 */
@RestController
@RequestMapping("post")
public class PostController extends CrudController<Post, Long> {

  @Autowired
  private PostService postService;

    @Override
    public CrudService<Post, Long> getService() {
        return postService;
    }
}
