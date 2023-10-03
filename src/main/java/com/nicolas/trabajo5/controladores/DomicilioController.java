package com.nicolas.trabajo5.controladores;

import com.nicolas.trabajo5.entidades.Domicilio;
import com.nicolas.trabajo5.servicios.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")
public class DomicilioController extends BaseControllerImpl <Domicilio, DomicilioServiceImpl>{

}
