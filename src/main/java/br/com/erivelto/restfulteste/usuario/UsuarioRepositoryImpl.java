package br.com.erivelto.restfulteste.usuario;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Create by erivelto on 21/02/19
 */
@Repository
public class UsuarioRepositoryImpl implements UsuarioRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> exemplo() {
        String sql = "select * from usuario";

        Query query = entityManager.createNativeQuery(sql);
        query.unwrap(Usuario.class);

        return query.getResultList();
    }
}
