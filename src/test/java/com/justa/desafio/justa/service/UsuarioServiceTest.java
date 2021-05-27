package com.justa.desafio.justa.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.justa.desafio.justa.rn.RegraNegocio;
import com.justa.desafio.justa.service.exceptions.ExcecaoEmailJaExiste;

@SpringBootTest
public class UsuarioServiceTest {
	
	@Autowired 
	private RegraNegocio regraNegocio;
	
	@Test
	@DisplayName("Verifica se o E-mail já existe!")
	void verificaSeEmailJaExiste() {
		String email = "guiesmeril5@hotmail.com";
		assertThrows(ExcecaoEmailJaExiste.class, () -> regraNegocio.verificarEmailJaExiste(email));
	}
	
}
