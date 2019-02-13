package br.com.erivelto.restfulteste.imagem;

import br.com.erivelto.restfulteste.post.Post;
import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 01/02/19
 */
@Entity
@Data
public class Imagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long imagemId;

    @ManyToOne
    @JoinColumn
    private Post post;

    @Column
    private String caminho;

}
