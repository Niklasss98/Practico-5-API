package com.nicolas.trabajo5.servicios;

import com.nicolas.trabajo5.entidades.Persona;
import com.nicolas.trabajo5.repositorios.BaseRepository;
import com.nicolas.trabajo5.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Long> implements PersonaService {

     @Autowired
    private final PersonaRepository personaRepository;


    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
