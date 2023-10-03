package com.nicolas.trabajo5.servicios;

import com.nicolas.trabajo5.entidades.Localidad;
import com.nicolas.trabajo5.repositorios.BaseRepository;
import com.nicolas.trabajo5.repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <Localidad, Long> implements LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;

    }
}
