package br.com.erivelto.restfulteste.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Create by erivelto on 05/02/19
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryCustom {

    Optional<Usuario> findByCredenciais_NomeUsuario(String nomeUsario);//develve um optional de usuario, nao precisa verificar se é diferente de null

}
