package br.com.erivelto.restfulteste.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Create by erivelto on 27/05/19
 */
@Component
public class CreateUserInit implements CommandLineRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario("pedro", "Pedro", "password");
        usuarioService.save(usuario);
    }
}
