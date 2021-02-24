package com.restbasico.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restbasico.entidades.Videojuego;

@RestController
public class Controlador {
	
	@Autowired
	Videojuego videojuego1 = new Videojuego();
	
	@GetMapping("videojuego")
	private Videojuego videojuego() {
		return videojuego1;
	}
	
	@PutMapping("modificar")
	private String modificacion() {
		videojuego1.setPrecio(videojuego1.getPrecio() + 10);
		return "Modificación realizada";
	}
	
}
