package com.utn;

public class Cancion {

    private String nombre;
    private String duracion;
    private Genero genero;
    private Album album;
    private Artista artistaInvitado;

    public Cancion() {
    }

    public Cancion(String nombre, String duracion, Genero genero, Album album, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistaInvitado = artistaInvitado;
    }
    public Cancion(String nombre, String duracion, Genero genero, Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {

        String invitado = "";
        if(artistaInvitado != null)
            invitado = " - ft. " + artistaInvitado;

        return nombre
                + invitado +
                " (" + duracion + ") " +
                "- Genero: " + genero + " - " +
                this.getAlbum().toString();
    }
}
