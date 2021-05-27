package com.justa.desafio.justa.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.justa.desafio.justa.model.Piada; 

@Service
public class WsConsultarPiadasService {
	
	RestTemplate restTemplate = new RestTemplate();

	public Piada[] buscarPiadas() {  
	  
		String URL = "https://official-joke-api.appspot.com/jokes/programming/ten";  
		ResponseEntity<Piada[]> responsePiada = restTemplate.getForEntity(URL, Piada[].class);
		Piada[] piadas = responsePiada.getBody();
	 
		return piadas;
	}

}
