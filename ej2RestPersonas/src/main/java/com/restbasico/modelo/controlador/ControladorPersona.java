package com.restbasico.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restbasico.modelo.entidad.Persona;
import com.restbasico.modelo.persistencia.DaoPersona;

/*
 * El objetivo de esta app es hacer un CRUD sencillo contra la entidad persona.
 * 
 * 
 * Un CRUD hablamos de las 4 operaciones basicas que podemos hacer contra una entidad
 * C -> Create
 * R -> Read
 * U -> Update
 * D -> Delete
 */

@RestController
public class ControladorPersona {
	
	@Autowired
	private DaoPersona daoPersona;
	
	@GetMapping("personas")
	public ResponseEntity<List<Persona>> listar() {
		
		List<Persona> lista = daoPersona.listado();
		
		ResponseEntity<List<Persona>> re = new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
		
		return re;
	}
	
	
	
	
	
	
	
	
}
