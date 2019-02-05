package br.com.erivelto.restfulteste.usuario;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Create by erivelto on 05/02/19
 */
@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @Embedded
    private Credenciais credenciais;


}
