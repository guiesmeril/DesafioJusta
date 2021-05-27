package com.justa.desafio.justa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.justa.desafio.justa.interfaces.UsuarioInterface;
import com.justa.desafio.justa.model.Usuario;
import com.justa.desafio.justa.service.UsuarioService;

@RestController
public class UsuarioControllador implements UsuarioInterface {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public ResponseEntity<Usuario> insert(Usuario usuario) {
		Usuario response = usuarioService.insert(usuario);
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> response = usuarioService.findAll();
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<Usuario> findByNomeUsuario(String name) {
		Usuario response = usuarioService.findByNomeUsuario(name);
		return ResponseEntity.ok().body(response);
	}

	@Override
	public ResponseEntity<Void> delete(Long id) {
		usuarioService.delete(id);
		return ResponseEntity.noContent().build();
	}

	public ResponseEntity<Usuario> updateUsuario(Long idUsuario, Usuario usuario) {
		Usuario response = usuarioService.updateUsuario(idUsuario, usuario);
		return ResponseEntity.ok().body(response);

	}

}
