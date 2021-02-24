package com.restbasico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.restbasico.entidad.Videojuego;
import com.restbasico.persistencia.DaoVideojuego;

public class Controlador {
	
	@Autowired
	private DaoVideojuego daoVideojuego;

	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar() {
		List<Videojuego> lista = daoVideojuego.listado();
		ResponseEntity<List<Videojuego>> re = new ResponseEntity<List<Videojuego>>(lista, HttpStatus.OK);
		return re;
	}

	@GetMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> consultar(@PathVariable("id") int id_videojuego) {
		System.out.println("El id del videojuego a buscar es: ");

		Videojuego v = daoVideojuego.buscar(id_videojuego);
		HttpStatus hs = null;
		if (v != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(v, hs);
		return re;
	}

	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> altaVideojuego(@RequestBody Videojuego v) {
		Videojuego vAlta = daoVideojuego.alta(v);
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vAlta, HttpStatus.CREATED);
		return re;
	}

	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> modificar(@RequestBody Videojuego v, @PathVariable("id") int id_videojuego) {
		v.setId(id_videojuego);

		Videojuego vModificado = daoVideojuego.modificar(v);

		HttpStatus hs = null;
		if (vModificado != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vModificado, hs);
		return re;
	}

	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> borrar(@PathVariable("id") int id_videojuego) {
		Videojuego v = daoVideojuego.borrar(id_videojuego);

		HttpStatus hs = null;
		if (v != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(v, hs);
		return re;

	}

}
