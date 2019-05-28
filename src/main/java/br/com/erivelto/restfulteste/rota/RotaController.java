package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.core.crud.CrudController;
import br.com.erivelto.restfulteste.core.crud.CrudService;
import br.com.erivelto.restfulteste.usuario.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Create By erivelto	on 27/05/19
 */
public class RotaController extends CrudController<Rota,Long> {

    @Autowired
    private RotaService service;

    @Override
    public CrudService<Rota, Long> getService() {
        return service;
    }

    @GetMapping()
    public ResponseEntity<List<Rota>> findByTipoUsuario(@RequestParam String tipoUsuario){
        try {
            TipoUsuario role = TipoUsuario.getUsuarioPorTipo(tipoUsuario);
            List<Rota> rotas = service.findAllByTipoUsuario(role);
            return ResponseEntity.ok().body(rotas);
        } catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
