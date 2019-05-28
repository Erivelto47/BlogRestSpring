package br.com.erivelto.restfulteste.produto;

import br.com.erivelto.restfulteste.imagem.Imagem;
import br.com.erivelto.restfulteste.tag.Tag;
import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 28/05/19
 */
@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double valor;

    @OneToMany
    @JoinColumn
    private Imagem imagem;

    @OneToOne
    @JoinColumn
    private Tag tag;


}
