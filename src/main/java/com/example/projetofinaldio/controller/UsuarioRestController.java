package com.example.projetofinaldio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetofinaldio.diagram.model.Usuario;
import com.example.projetofinaldio.service.UsuarioService;


@RestController
@RequestMapping("usuarios")
public class UsuarioRestController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getBtyId(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.getById(id));
    }

    @PostMapping
    public void insert(@RequestBody Usuario usuario){
       usuarioService.insert(usuario);
       
    }

    @PatchMapping
    public ResponseEntity<String> patch( Usuario usuario){
        usuarioService.patch(usuario);
        return ResponseEntity.ok("Usuario de ID " + usuarioService.getById(usuario.getId()) + " atualizado com sucesso");
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(Long id){
        usuarioService.deleteById(id);
        return ResponseEntity.ok("Usuario de ID " + id + " deletado com sucesso");
    }
    
}
