package com.justa.desafio.justa.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.justa.desafio.justa.model.Usuario;

@RequestMapping("/auth")
public interface AuthInterface {

	@PostMapping
	public ResponseEntity<Usuario> verificarAuth(@RequestBody Usuario usuario);

}
