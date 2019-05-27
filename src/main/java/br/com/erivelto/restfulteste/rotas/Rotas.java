package br.com.erivelto.restfulteste.rotas;

import br.com.erivelto.restfulteste.usuario.TipoUsuario;
import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 27/05/19
 */
@Data
@Entity(name = "rotas")
public class Rotas {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Esta váriavel armazena o privilégio:
     * Caso o tipo de usuário seja ADM, somente administradores poderão vizualizar a rota
     * Caso seja USR, usuários e administradores poderão visualizar
     * */
    @Column(name = "tipo_usuario")
    private TipoUsuario tipoUsuario;

    /**
     * Nome da rota é composto pelo menu exemplo '/login', nesta variável 'login'
     * */
    @Column(name = "nome")
    private String nome;

    /**
     * Caminho da rota ex. '/login'
     * */
    @Column(name = "path")
    private String path;

    /**
     * Descricao para via de cadastros e liberação de privilégios.
     * */
    @Column(name = "descricao")
    private String descricao;

    /**
     * O menu pai, serve para submenus, quando é null significa que este é um menu raiz
     * */
    @Column(name = "menu_pai")
    private Long menuPai;
}
