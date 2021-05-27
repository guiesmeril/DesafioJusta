package com.justa.desafio.justa.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.justa.desafio.justa.model.Endereco;

@RequestMapping("/endereco")
public interface EnderecoInterface {

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> buscarEndereco(@PathVariable(required = true) String cep);

}
