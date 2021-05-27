package com.justa.desafio.justa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justa.desafio.justa.model.Usuario;
import com.justa.desafio.justa.repository.UsuarioRepository;
import com.justa.desafio.justa.rn.RegraNegocio;
import com.justa.desafio.justa.service.exceptions.ExcecaoDadosNaoEncontrado;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RegraNegocio regraNegocio;

	public Usuario insert(Usuario request) {

		regraNegocio.verificarEmailJaExiste(request.getEmail());

		Usuario usuario = new Usuario();
		usuario.setNomeUsuario(request.getNomeUsuario());
		usuario.setEmail(request.getEmail());
		usuario.setSenha(request.getSenha());
		usuario.setIdadeUsuario(request.getIdadeUsuario());
		usuario.setEstadoUsuario(request.getEstadoUsuario());
		usuario.setCidadeUsuario(request.getCidadeUsuario());
		usuarioRepository.save(usuario);
		return usuario;
	}

	public List<Usuario> findAll() {
		List<Usuario> listUsuario = usuarioRepository.findAll();
		return listUsuario;

	}
	
	public Usuario findByNomeUsuario(String name) {
		Usuario usuario = usuarioRepository.findByNomeUsuario(name);
		if(usuario == null) {
			throw new ExcecaoDadosNaoEncontrado("Usuário não encontrado!");
		}
		return usuario;
	}

	public void delete(Long id) {
		usuarioRepository.deleteUsuario(id);
	}

	public Usuario updateUsuario(Long idUsuario, Usuario request) {

		regraNegocio.verificarEmailJaExiste(request.getEmail());

		Usuario usuario = new Usuario();

		usuario.setIdUsuario(idUsuario);
		usuario.setNomeUsuario(request.getNomeUsuario());
		usuario.setEmail(request.getEmail());
		usuario.setSenha(request.getSenha());
		usuario.setIdadeUsuario(request.getIdadeUsuario());
		usuario.setEstadoUsuario(request.getEstadoUsuario());
		usuario.setCidadeUsuario(request.getCidadeUsuario());
		usuarioRepository.save(usuario);
		return usuario;

	}

}
