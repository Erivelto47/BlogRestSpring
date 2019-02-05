package br.com.erivelto.restfulteste.autor;

import br.com.erivelto.restfulteste.pessoa.Pessoa;
import lombok.Data;

import javax.persistence.*;

/**
 * Create by erivelto on 01/02/19
 */
@Data
@Entity
@PrimaryKeyJoinColumn(name = "autorId", referencedColumnName = "id")
public class Autor extends Pessoa {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long autorId;

    private Integer idade;


}
