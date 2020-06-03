package com.utn;

public class Album {

    private String titulo;
    private Integer año;
    private Artista artista;

    public Album() {
    }

    public Album(String titulo, Integer año, Artista artista) {
        this.titulo = titulo;
        this.año = año;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album: " +
                titulo + " (" + año + ") - " +
                this.getArtista().toString();
    }
}
