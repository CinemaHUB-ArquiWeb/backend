package com.cinemahub.backend.controller;

import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.entity.Entrada;
import com.cinemahub.backend.repository.CineRepository;
import com.cinemahub.backend.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entradas")
public class EntradaController {
    @Autowired
    private EntradaRepository repository;

    @GetMapping
    public List<Entrada> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Entrada registrar(@RequestBody Entrada entrada) {
        return repository.save(entrada);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}