package com.justa.desafio.justa.service.exceptions;

public class ExcecaoDadosNaoEncontrado extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExcecaoDadosNaoEncontrado(String msg) {
		super(msg);
	}
}