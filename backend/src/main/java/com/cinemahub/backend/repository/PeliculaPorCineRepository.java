package com.cinemahub.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cinemahub.backend.entity.PeliculaPorCine;
import com.cinemahub.backend.entity.PeliculaPorCineId;

import java.util.List;

public interface PeliculaPorCineRepository extends JpaRepository<PeliculaPorCine, PeliculaPorCineId> {
    List<PeliculaPorCine> findAll();

    PeliculaPorCine save(PeliculaPorCine entity);

    void deleteById(PeliculaPorCineId id);
}
