package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.rota.Rota;
import br.com.erivelto.restfulteste.rota.RotaService;
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

    @Autowired
    private RotaService rotaService;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario("pedro", "Pedro", "password");
        Usuario usuario1 = new Usuario("jose", "Jose", "password", TipoUsuario.ADMINISTRADOR);
        usuarioService.save(usuario);
        usuarioService.save(usuario1);

        Rota rotaProduto = new Rota(TipoUsuario.ADMINISTRADOR,"Produto", "/produto", "Rota para cadastrar, editar e excluir Produtos", null);
        rotaService.save(rotaProduto);
    }
}
