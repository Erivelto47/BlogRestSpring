package br.com.erivelto.restfulteste.tag;

import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 01/02/19
 */
@Entity
@Data
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long tagId;

    @Column
    private String nome;

    @Column
    private String descricao;

}
