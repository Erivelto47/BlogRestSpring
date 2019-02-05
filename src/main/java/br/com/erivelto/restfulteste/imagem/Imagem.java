package br.com.erivelto.restfulteste.imagem;

import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 01/02/19
 */
@Entity
@Data
public class Imagem {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long imagemId;

    @Column
    private String caminho;




}
