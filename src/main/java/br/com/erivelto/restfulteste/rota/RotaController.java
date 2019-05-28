package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import br.com.erivelto.restfulteste.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By erivelto	on 27/05/19
 */
@RestController
@RequestMapping("rota")
public class RotaController extends CrudController<Rota,Long> {

    @Autowired
    private RotaService service;
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public CrudService<Rota, Long> getService() {
        return service;
    }

    @GetMapping("user")
    public ResponseEntity<?> findByTipoUsuario(@RequestParam String nomeUsuario){
        try {
            List<Rota> rotas = service.findAllByTipoUsuario(usuarioService.findByNomeUsuario(nomeUsuario).getCredenciais().getTipoUsuario());
            return ResponseEntity.ok(rotas);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
