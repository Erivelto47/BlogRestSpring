package br.com.erivelto.restfulteste.pessoa;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Create by erivelto on 05/02/19
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long pessoaId;

    @NotBlank(message = "Nome nao pode ser vazio")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "Sobrenome nao pode ser vazio")
    @Column(nullable = false)
    private String sobrenome;

    @CPF(message = "cpf invalido")
    @Column(nullable = false)
    private String cpf;

    private LocalDate dob; //Data de Aniversário

    public String getFullName() {
        return this.nome + " " + this.sobrenome;
    }
}
