package com.cinemahub.backend.entity;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoUsuario;
    private Integer dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String ciudad;
    private String rol;
    private String telefono;
}
