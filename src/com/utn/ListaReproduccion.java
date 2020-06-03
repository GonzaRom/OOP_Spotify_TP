package com.utn;

public abstract class ListaReproduccion implements Reproduccion {

    private String nombre;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public ListaReproduccion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
