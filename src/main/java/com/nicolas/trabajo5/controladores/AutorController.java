package com.nicolas.trabajo5.controladores;

import com.nicolas.trabajo5.entidades.Autor;
import com.nicolas.trabajo5.servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping(path = "api/basedatos/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
