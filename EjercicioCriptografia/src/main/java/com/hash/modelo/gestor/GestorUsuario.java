package com.hash.modelo.gestor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hash.modelo.entidad.Usuario;
import com.hash.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;

	public boolean validarUsuario(Usuario usuario) {
		Usuario auxiliar = daoUsuario.findByNombreUserAndPassword(usuario.getNombreUser(), usuario.getPassword());

		if (auxiliar != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUsuario(Usuario user) {
		daoUsuario.save(user);
	}
	
}