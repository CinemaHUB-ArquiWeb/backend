package com.cinemahub.backend.entity;

@Entity
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEntradas;
    private BigDecimal precioTotal;
    private String numeroAsiento;

    @ManyToOne
    @JoinColumn(name = "funciones_codigo_funcion")
    private Funcion funcion;
}
