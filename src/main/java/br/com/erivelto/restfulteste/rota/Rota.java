package br.com.erivelto.restfulteste.rota;

import br.com.erivelto.restfulteste.usuario.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * Create by erivelto on 27/05/19
 */
@Data
@Entity(name = "rotas")
@AllArgsConstructor
@NoArgsConstructor
public class Rota {

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
     * Nome da rota é composto pelo menu exemplo '/login', nesta variável 'Login'
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
    @ManyToOne
    @JoinColumn
    private Rota menuPai;


    public Rota(@Valid TipoUsuario tipoUsuario, @Valid String nome, @Valid String path, @Valid String descricao, @Valid Rota menuPai){
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.path = path;
        this.descricao = descricao;
        this.menuPai = menuPai;
    }
}
