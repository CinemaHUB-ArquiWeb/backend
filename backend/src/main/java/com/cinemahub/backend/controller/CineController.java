package com.cinemahub.backend.controller;

import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.repository.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cines")
public class CineController {
    @Autowired
    private CineRepository repository;

    @GetMapping
    public List<Cine> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cine registrar(@RequestBody Cine cine) {
        return repository.save(cine);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}