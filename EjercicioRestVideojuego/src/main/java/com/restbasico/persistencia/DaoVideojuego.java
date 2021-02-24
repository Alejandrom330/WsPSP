package com.restbasico.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restbasico.entidad.Videojuego;

@Component
public class DaoVideojuego {
	
	private List<Videojuego> listaVideojuegos;
	private int cont = 0;
	
	public DaoVideojuego() {
		Videojuego videojuego1 = new Videojuego();
		videojuego1.setId(cont++);
		videojuego1.setNombre("Epic Seven");
		videojuego1.setCompania("Smile Gate");
		videojuego1.setPrecio(0.0);
		videojuego1.setPuntuacion(9);

		Videojuego videojuego2 = new Videojuego();
		videojuego2.setId(cont++);
		videojuego2.setNombre("Pokemon Master");
		videojuego2.setCompania("DeNa Co");
		videojuego2.setPrecio(0.0);
		videojuego2.setPuntuacion(7);
		
		Videojuego videojuego3 = new Videojuego();
		videojuego3.setId(cont++);
		videojuego3.setNombre("Seven Deadly Sins");
		videojuego3.setCompania("Netmarble");
		videojuego3.setPrecio(0.0);
		videojuego3.setPuntuacion(6);

		listaVideojuegos = new ArrayList<Videojuego>();
		listaVideojuegos.add(videojuego1);
		listaVideojuegos.add(videojuego2);
	}
	
	public List<Videojuego> listado() {
		return listaVideojuegos;
	}

	public Videojuego buscar(int id) {
		Videojuego v = null;
		for (Videojuego videojuego : listaVideojuegos) {
			if (videojuego.getId() == id) {
				v = videojuego;
				break;
			}
		}
		return v;
	}

	public Videojuego alta(Videojuego v) {
		v.setId(cont++);
		listaVideojuegos.add(v);
		return v;
	}

	public Videojuego modificar(Videojuego vModif) {
		Videojuego v = buscar(vModif.getId());
		if (v != null) {
			v.setNombre(vModif.getNombre());
			v.setCompania(vModif.getCompania());
			v.setPrecio(vModif.getPrecio());
			v.setPuntuacion(vModif.getPuntuacion());
		}
		return v;
	}

	public Videojuego borrar(int id) {
		Videojuego v = buscar(id);
		if (v != null) {
			listaVideojuegos.remove(id);
		}
		return v;
	}
}
