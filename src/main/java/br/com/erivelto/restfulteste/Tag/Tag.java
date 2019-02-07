package br.com.erivelto.restfulteste.Tag;

import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 01/02/19
 */
@Entity
@Data
public class Tag {

    @Id
    @GeneratedValue
    private Long tagId;

    @Column
    private String nome;

}
