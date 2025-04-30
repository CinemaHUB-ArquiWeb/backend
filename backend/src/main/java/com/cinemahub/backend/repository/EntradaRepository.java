package com.cinemahub.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemahub.backend.entity.Entrada;

import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada, Integer> {
    List<Entrada> findAll();

    Entrada save(Entrada entrada);

    void deleteById(Integer id);
}
