package com.cinemahub.backend.repository;

import com.cinemahub.backend.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
    List<Sala> findAll();

    Sala save(Sala sala);

    default void deleteById(Integer id) {

    }
}
