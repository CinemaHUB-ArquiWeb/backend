package com.cinemahub.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemahub.backend.entity.Pelicula;

import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {
    List<Pelicula> findAll();

    Pelicula save(Pelicula pelicula);

    void deleteById(Integer id);
}
