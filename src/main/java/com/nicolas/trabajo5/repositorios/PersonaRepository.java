package com.nicolas.trabajo5.repositorios;

import com.nicolas.trabajo5.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
