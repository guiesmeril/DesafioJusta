package com.justa.desafio.justa.rn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justa.desafio.justa.model.Usuario;
import com.justa.desafio.justa.repository.UsuarioRepository;
import com.justa.desafio.justa.service.exceptions.ExcecaoEmailJaExiste;

@Service
public class RegraNegocio {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public void verificarEmailJaExiste(String email) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		if (usuario != null) {
			throw new ExcecaoEmailJaExiste("E-Mail Já Existe!");
		}
	}

}
