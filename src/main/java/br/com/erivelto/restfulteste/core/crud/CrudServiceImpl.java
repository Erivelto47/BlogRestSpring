package br.com.erivelto.restfulteste.core.crud;

import br.com.erivelto.restfulteste.core.validation.Validator;
import br.com.erivelto.restfulteste.exception.ValidationException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Create by erivelto on 01/02/19
 */
public abstract class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T findById(ID id){
        //return getRepository().findById(id).orElseThrow(NoResultException::new);//lança uma exceção de que não encontrou resultdados
        return getRepository().findById(id).orElse(null); //dessa forma rerna null
    }

    @Override
    public T save(T entity) {
        preSave(entity);
        return postSave(getRepository().save(entity));
    }

    protected T postSave(T save) {
        return save;
    }

    protected void preSave(T entity) {

    }

    @Override
    public void delete(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public void delete(T entity) {
        getRepository().delete(entity);
    }


    protected  <T> void valida(Validator<T> validator, T obj){
        try {
            validator.valida(obj);
        }catch (ValidationException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
