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
public class Autor /*extends Usuario*/ {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long autorId;

    private Integer idade;
}
