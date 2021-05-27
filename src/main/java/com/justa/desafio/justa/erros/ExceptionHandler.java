package com.justa.desafio.justa.erros;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.justa.desafio.justa.service.exceptions.ExcecaoDadosNaoEncontrado;
import com.justa.desafio.justa.service.exceptions.ExcecaoEmailJaExiste;

@ControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(ExcecaoDadosNaoEncontrado.class)
	public ResponseEntity<Error> dadosNaoEncontrado(ExcecaoDadosNaoEncontrado e, HttpServletRequest request) {
		Error error = new Error();
		error.setTimestamp(Instant.now());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setError("Not found");
		error.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(ExcecaoEmailJaExiste.class)
	public ResponseEntity<Error> ExcecaoEmailJaExiste(ExcecaoEmailJaExiste e, HttpServletRequest request) {
		Error error = new Error();
		error.setTimestamp(Instant.now());
		error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		error.setMessage(e.getMessage());
		error.setError("E-Mail já existe!");
		error.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(error);
	}

}