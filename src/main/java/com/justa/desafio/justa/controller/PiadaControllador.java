package com.justa.desafio.justa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.justa.desafio.justa.interfaces.Piadanterface;
import com.justa.desafio.justa.model.Piada;
import com.justa.desafio.justa.service.WsConsultarPiadasService;

@RestController
public class PiadaControllador implements Piadanterface {

	@Autowired
	WsConsultarPiadasService wsConsultarPiadasService;

	public Piada[] find() {
		Piada[] response = wsConsultarPiadasService.buscarPiadas();
		return response;
	}

}
