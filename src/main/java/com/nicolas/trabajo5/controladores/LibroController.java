package com.nicolas.trabajo5.controladores;

import com.nicolas.trabajo5.entidades.Libro;
import com.nicolas.trabajo5.servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{

}
