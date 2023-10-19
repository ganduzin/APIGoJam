package com.example.projetofinaldio.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetofinaldio.diagram.model.Usuario;
import com.example.projetofinaldio.repository.UsuarioRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario getById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void insert(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void patch(Usuario usuario) {
        if(usuarioRepository.existsById(usuario.getId())){
            usuarioRepository.save(usuario);
        }
        else{
            throw new NoSuchElementException("No user with this ID was found.");
        }

    }

    @Override
    public void deleteById(Long id) {
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        }
        else{
            throw new NoSuchElementException("No user with this ID was found.");
        }


    }
    
}
