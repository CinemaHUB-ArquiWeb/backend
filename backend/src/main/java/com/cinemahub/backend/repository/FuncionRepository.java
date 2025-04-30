package com.cinemahub.backend.repository;

import com.cinemahub.backend.entity.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionRepository extends JpaRepository<Funcion, Integer> {
    List<Funcion> findAll();

    Funcion save(Funcion funcion);

    void deleteById(Integer id);
}
