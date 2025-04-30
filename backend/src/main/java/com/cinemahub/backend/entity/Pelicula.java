package com.cinemahub.backend.entity;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPelicula;
    private String titulo;
    private String genero;
    private Date fechaEstreno;
    private String idioma;
}
