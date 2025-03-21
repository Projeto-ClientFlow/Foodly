package com.generation.foodly.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.foodly.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	 public Optional<Usuario> findByUsuario(String usuario);

}