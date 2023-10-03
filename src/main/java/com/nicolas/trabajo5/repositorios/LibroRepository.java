package com.nicolas.trabajo5.repositorios;

import com.nicolas.trabajo5.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long>{
}
