package br.com.erivelto.restfulteste.Tag;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Create by erivelto on 01/02/19
 */
public class Tag {

    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String nome;

}
