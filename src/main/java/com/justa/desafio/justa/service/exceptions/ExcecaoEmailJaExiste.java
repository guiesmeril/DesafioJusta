package com.justa.desafio.justa.service.exceptions;

public class ExcecaoEmailJaExiste extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcecaoEmailJaExiste(String msg) {
		super(msg);
	}

}
