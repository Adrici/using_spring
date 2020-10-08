package com.loja.games.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.loja.games.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
	List<UsuarioModel> findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);
	List<UsuarioModel> findAllByEmailUsuarioContainingIgnoreCase(String emailUsuario);
}