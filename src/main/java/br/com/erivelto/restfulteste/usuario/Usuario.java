package br.com.erivelto.restfulteste.usuario;

import br.com.erivelto.restfulteste.pessoa.Pessoa;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Create by erivelto on 05/02/19
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "pessoaId", referencedColumnName = "id")
public class Usuario extends Pessoa {

    @Embedded
    private Credenciais credenciais;
}
