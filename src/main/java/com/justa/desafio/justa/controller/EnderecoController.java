package com.justa.desafio.justa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.justa.desafio.justa.interfaces.EnderecoInterface;
import com.justa.desafio.justa.model.Endereco;

import com.justa.desafio.justa.service.WsConsultarEnderecoService;

@RestController
public class EnderecoController implements EnderecoInterface {

	@Autowired
	private WsConsultarEnderecoService wsConsultarEnderecoService;

	@Override
	public ResponseEntity<Endereco> buscarEndereco(String cep) {
		Endereco response = wsConsultarEnderecoService.buscarEnderecoPorCep(cep);
		return ResponseEntity.ok().body(response);
	}

}
