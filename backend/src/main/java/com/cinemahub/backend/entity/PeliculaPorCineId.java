package com.cinemahub.backend.entity;

public class PeliculaPorCineId implements Serializable {
    private Integer cinesCodigoCine;
    private Integer peliculasCodigoPelicula;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeliculaPorCineId that = (PeliculaPorCineId) o;
        return Objects.equals(cinesCodigoCine, that.cinesCodigoCine) &&
                Objects.equals(peliculasCodigoPelicula, that.peliculasCodigoPelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinesCodigoCine, peliculasCodigoPelicula);
    }
}
