package com.justa.desafio.justa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idUsuario;
	String nomeUsuario;
	String email;
	String senha;
	String cidadeUsuario;
	String estadoUsuario;
	Integer idadeUsuario;

	public Usuario() {

	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCidadeUsuario() {
		return cidadeUsuario;
	}

	public void setCidadeUsuario(String cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public Integer getIdadeUsuario() {
		return idadeUsuario;
	}

	public void setIdadeUsuario(Integer idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha="
				+ senha + ", cidadeUsuario=" + cidadeUsuario + ", estadoUsuario=" + estadoUsuario + ", idadeUsuario="
				+ idadeUsuario + "]";
	}

}
