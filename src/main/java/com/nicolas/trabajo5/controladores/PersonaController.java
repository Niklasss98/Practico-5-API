package com.nicolas.trabajo5.controladores;

import com.nicolas.trabajo5.entidades.Persona;
import com.nicolas.trabajo5.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl>{

}
