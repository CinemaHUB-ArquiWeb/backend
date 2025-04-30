package com.cinemahub.backend.controller;
import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.entity.Usuario;
import com.cinemahub.backend.repository.CineRepository;
import com.cinemahub.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario registrar(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}