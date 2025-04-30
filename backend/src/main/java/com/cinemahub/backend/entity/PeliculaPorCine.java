package com.cinemahub.backend.entity;

@Entity
@IdClass(PeliculaPorCineId.class)
public class PeliculaPorCine {
    @Id
    private Integer cinesCodigoCine;

    @Id
    private Integer peliculasCodigoPelicula;
}
