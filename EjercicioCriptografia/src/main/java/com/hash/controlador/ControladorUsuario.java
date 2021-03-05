package com.hash.controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hash.modelo.entidad.Usuario;
import com.hash.modelo.gestor.GestorUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gestorUsuario;

	@GetMapping("registrar_usuario")
	private String registrarUsuario() {
		return "signIn";
	}

	@GetMapping("loguearse")
	private String login() {
		return "login";
	}

	@PostMapping("registrar")
	private String registrar(@RequestParam("nombre_usuario") String nombreUser,
			@RequestParam("pass") String pass, Model model) throws NoSuchAlgorithmException {

		String passwordHasheada = hashPassword(pass);
		
		Usuario u = new Usuario();
		u.setNombreUser(nombreUser);
		u.setPassword(passwordHasheada);
		
		boolean validado = gestorUsuario.validarUsuario(u);
		
		if (!validado) {
            gestorUsuario.addUsuario(u);
            System.out.println(u);
            return "login";
        } else {
            return "signInError";
        }
	}

	@PostMapping("login")
	private String loginUsuario(@RequestParam("nombre_usuario") String nombreUser,
			@RequestParam("pass") String pass, Model model) throws NoSuchAlgorithmException {

		String passwordHasheada = hashPassword(pass);
		
		Usuario u = new Usuario();
		u.setNombreUser(nombreUser);
		u.setPassword(passwordHasheada);
		
		boolean validado = gestorUsuario.validarUsuario(u);

		if (validado) {
			return "main";

		} else {
			return "loginError";
		}
	}
	
	@GetMapping("volver_sign_in")
    private String volverSignIn() {
        return "signIn";
    }

	@GetMapping("salir")
	private String cerrarSesion() {
		return "../static/inicio";
	}
	
	@GetMapping("volver_login")
	private String volverLogin() {
		return "login";
	}

	private String hashPassword(String password) throws NoSuchAlgorithmException {
		byte[] pass = password.getBytes();

		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(pass);

		byte[] resumen = md.digest();
		String mensaje = new String(resumen);
		return mensaje;
	}
	
}
