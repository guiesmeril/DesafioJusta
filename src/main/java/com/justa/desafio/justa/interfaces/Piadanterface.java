package com.justa.desafio.justa.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.justa.desafio.justa.model.Piada;

@RequestMapping("/piadas")
public interface Piadanterface {

	@GetMapping
	public Piada[] find();
}
