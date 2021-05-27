package com.justa.desafio.justa.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.justa.desafio.justa.model.Usuario;

@RequestMapping("/usuario")
public interface UsuarioInterface {

	@PostMapping
	public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario);

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll();

	@GetMapping(params = "name")
	public ResponseEntity<Usuario> findByNomeUsuario(@RequestParam(required = false) String name);

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable(required = true) Long id);

	@PatchMapping("/{idUsuario}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable(required = true) Long idUsuario,
			@RequestBody Usuario usuario);

}
