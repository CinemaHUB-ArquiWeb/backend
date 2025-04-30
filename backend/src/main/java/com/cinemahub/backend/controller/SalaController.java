package com.cinemahub.backend.controller;
import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.entity.Sala;
import com.cinemahub.backend.repository.CineRepository;
import com.cinemahub.backend.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
public class SalaController {
    @Autowired
    private SalaRepository repository;

    @GetMapping
    public List<Sala> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Sala registrar(@RequestBody Sala sala) {
        return repository.save(sala);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}