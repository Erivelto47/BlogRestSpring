package br.com.erivelto.restfulteste.autor;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Create by erivelto on 01/02/19
 */
@Data
@Entity
public class Autor {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long autorId;

    private String nome;
    private String sobrenome;
    private Integer idade;
}
