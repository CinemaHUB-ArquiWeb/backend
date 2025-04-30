package com.cinemahub.backend.repository;

import com.cinemahub.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    void deleteById(Integer id);
}

