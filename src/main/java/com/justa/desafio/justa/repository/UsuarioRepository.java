package com.justa.desafio.justa.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.justa.desafio.justa.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByEmailAndSenha(String email, String senha);

	Usuario findByNomeUsuario(String name);

	Usuario findByEmail(String email);

	@Modifying
	@Query(value = "DELETE From Usuario WHERE id_usuario = :id ", nativeQuery = true)
	@Transactional
	void deleteUsuario(@Param("id") Long id);

}
