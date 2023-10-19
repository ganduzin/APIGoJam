package com.example.projetofinaldio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetofinaldio.diagram.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
