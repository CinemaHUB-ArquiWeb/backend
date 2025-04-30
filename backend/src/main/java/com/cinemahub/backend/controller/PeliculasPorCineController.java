package com.cinemahub.backend.controller;
import com.cinemahub.backend.entity.Cine;
import com.cinemahub.backend.entity.PeliculaPorCine;
import com.cinemahub.backend.entity.PeliculaPorCineId;
import com.cinemahub.backend.repository.CineRepository;
import com.cinemahub.backend.repository.PeliculaPorCineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas-por-cine")
public class PeliculaPorCineController {
    @Autowired
    private PeliculaPorCineRepository repository;

    @GetMapping
    public List<PeliculaPorCine> listar() {
        return repository.findAll();
    }

    @PostMapping
    public PeliculaPorCine registrar(@RequestBody PeliculaPorCine entity) {
        return repository.save(entity);
    }

    @DeleteMapping
    public void eliminar(@RequestBody PeliculaPorCineId id) {
        repository.deleteById(id);
    }
}