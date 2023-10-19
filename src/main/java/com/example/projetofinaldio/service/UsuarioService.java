package com.example.projetofinaldio.service;


import com.example.projetofinaldio.diagram.model.Usuario;


public interface UsuarioService {
    
    Usuario getById(Long id);
    void insert(Usuario usuario);
    void patch(Usuario usuario);
    void deleteById(Long id);
    
}
