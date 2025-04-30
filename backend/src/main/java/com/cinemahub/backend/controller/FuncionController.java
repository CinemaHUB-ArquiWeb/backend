package com.cinemahub.backend.controller;
import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.entity.Funcion;
import com.cinemahub.backend.repository.CineRepository;
import com.cinemahub.backend.repository.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/funciones")
public class FuncionController {
    @Autowired
    private FuncionRepository repository;

    @GetMapping
    public List<Funcion> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Funcion registrar(@RequestBody Funcion funcion) {
        return repository.save(funcion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}