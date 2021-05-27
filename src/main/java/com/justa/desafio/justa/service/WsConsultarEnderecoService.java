package com.justa.desafio.justa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.justa.desafio.justa.model.Endereco;
import com.justa.desafio.justa.service.exceptions.ExcecaoDadosNaoEncontrado; 

@Service
public class WsConsultarEnderecoService {

	RestTemplate restTemplate = new RestTemplate();

	public Endereco buscarEnderecoPorCep(String cep) {
		Endereco retorno = new Endereco();

		try {
			retorno = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/", Endereco.class);

		} catch (Exception e) {
			throw new ExcecaoDadosNaoEncontrado("Dados não encontrado");

		}

		return retorno;

	}

}
