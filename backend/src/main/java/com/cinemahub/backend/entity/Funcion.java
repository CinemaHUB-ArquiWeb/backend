package com.cinemahub.backend.entity;

@Entity
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoFuncion;
    private Date fechaFuncion;
    private LocalTime horaInicio;

    @ManyToOne
    @JoinColumn(name = "peliculas_codigo_pelicula")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "salas_codigo_sala")
    private Sala sala;
}