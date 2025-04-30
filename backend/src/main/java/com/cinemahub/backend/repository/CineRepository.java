package com.cinemahub.backend.repository;

import com.cinemahub.backend.entity.Cine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CineRepository extends JpaRepository<Cine, Integer> {
    List<Cine> findAll();

    Cine save(Cine cine);

    void deleteById(Integer id);
}