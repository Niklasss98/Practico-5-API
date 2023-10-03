package com.nicolas.trabajo5.servicios;

import com.nicolas.trabajo5.entidades.BaseEntidad;
import java.util.List;
import java.io.Serializable;

public interface BaseService <E extends BaseEntidad, ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
