package br.com.erivelto.restfulteste.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by erivelto on 06/02/19
 */
public interface PessoaRespository extends JpaRepository<Pessoa, Long> {
}
