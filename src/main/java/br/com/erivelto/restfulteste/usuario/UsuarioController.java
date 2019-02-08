package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.ValidationException;

/**
 * Create by erivelto on 07/02/19
 */
@RestController
@RequestMapping("usuario")
public class UsuarioController extends CrudController<Usuario, Long> {

    @Autowired
    private UsuarioService usuarioService;


    @Override
    public CrudService<Usuario, Long> getService() {
        return usuarioService;
    }

    @Override
    public ResponseEntity<Usuario> save(@Valid @RequestBody Usuario entity) {
        try {
            Usuario usuario = usuarioService.save(entity);
            return ResponseEntity.ok(usuario);
        } catch (ValidationException e) {
            return ResponseEntity.badRequest().header("message", e.getLocalizedMessage()).build();
        }
    }
}
