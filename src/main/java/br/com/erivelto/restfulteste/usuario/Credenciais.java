package br.com.erivelto.restfulteste.usuario;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

/**
 * Create by erivelto on 05/02/19
 */
@Embeddable
@Data
public class Credenciais {

    @NotBlank
    @Column(name = "tipo_usuario", length = 3)
    private String tipoUsuario;

    @NotBlank
    @Column(name = "nome_usuario")
    private String nomeUsuario;

    @NotBlank
    @Column(name = "senha")
    private String senha;

}
