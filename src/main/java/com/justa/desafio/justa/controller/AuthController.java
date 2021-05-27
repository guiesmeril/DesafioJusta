package com.justa.desafio.justa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.justa.desafio.justa.interfaces.AuthInterface;
import com.justa.desafio.justa.model.Usuario;
import com.justa.desafio.justa.service.ServiceAuth;

@RestController
public class AuthController implements AuthInterface {

	@Autowired
	private ServiceAuth serviceAuth;

	public ResponseEntity<Usuario> verificarAuth(Usuario usuario) {
		Usuario response = serviceAuth.verificarAuth(usuario);
		return ResponseEntity.ok().body(response);

	}

}
