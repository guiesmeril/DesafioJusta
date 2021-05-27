package com.justa.desafio.justa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justa.desafio.justa.model.Usuario;
import com.justa.desafio.justa.repository.UsuarioRepository;
import com.justa.desafio.justa.service.exceptions.ExcecaoDadosNaoEncontrado;

@Service
public class ServiceAuth {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario verificarAuth (Usuario usuario) {
		Usuario usuarioRetorno = new Usuario();
		usuarioRetorno = usuarioRepository.findByEmailAndSenha(usuario.getEmail(),usuario.getSenha());
		if(usuarioRetorno == null) {
			throw new ExcecaoDadosNaoEncontrado("Email ou Senha Invalido");
		}
		
		return usuarioRetorno;
	}

}
