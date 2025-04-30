package com.cinemahub.backend.entity;

@Entity
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoSala;
    private String numeroDeSala;
    private String tipoSala;
    private Integer capacidadTotal;

    @ManyToOne
    @JoinColumn(name = "cines_codigo_cine")
    private Cine cine;
}
