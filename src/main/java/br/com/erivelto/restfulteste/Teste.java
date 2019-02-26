package br.com.erivelto.restfulteste;

import br.com.erivelto.restfulteste.usuario.Usuario;
import br.com.erivelto.restfulteste.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Create by erivelto on 26/02/19
 */
@Component
public class Teste implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {

        Usuario usuario = new Usuario("admin", "1234567");
        usuarioService.save(usuario);
    }
}
