package com.cinemahub.backend.entity;

@Entity
public class Cine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCine;
    private String nombre;
    private String direccion;
    private String distrito;
    private String provincia;
    private String region;
    private String telefonoCines;

    @ManyToOne
    @JoinColumn(name = "usuarios_codigo_usuario")
    private Usuario usuario;
}