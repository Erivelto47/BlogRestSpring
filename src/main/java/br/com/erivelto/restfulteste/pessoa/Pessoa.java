package br.com.erivelto.restfulteste.pessoa;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
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

//    @NotBlank(message = "Nome nao pode ser vazio")
    @Column(nullable = true)
    private String nome;

//    @NotBlank(message = "Sobrenome nao pode ser vazio")
    @Column(nullable = true)
    private String sobrenome;

    @CPF(message = "cpf invalido")
    @Column(nullable = true)
    private String cpf;

    @Email
    @Column(nullable = true)
    private String email;

//    @Pattern(regexp = )

    @Column(name = "data_aniversario")
    private LocalDate dob;

    public String getFullName() {
        return this.nome + " " + this.sobrenome;
    }
}
