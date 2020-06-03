package com.utn;

import java.util.LinkedList;

public class ListaPremium extends ListaReproduccion {

    LinkedList<Cancion> miLista;


    public ListaPremium() {
        super("Lista Premium");
        this.miLista = new LinkedList<Cancion>();
    }

    public LinkedList<Cancion> getMiLista() {
        return miLista;
    }

    public void setMiLista(LinkedList<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir() {

        Cancion cancion = miLista.removeFirst();

        miLista.addLast(cancion);

        System.out.println("Reproduciendo: " + cancion.toString());

    }

    @Override
    public void añadirCancion(Cancion cancion) {
        this.miLista.add(cancion);
    }

    @Override
    public void eliminarCancion(Cancion cancion) {

        this.miLista.remove(cancion);
    }

    @Override
    public void verMiLista() {
        System.out.println(this.getNombre());
        int count = 0;
        for (Cancion cancionAux : miLista){
            System.out.println(count + ": " + cancionAux.toString());
            count ++;
        }
    }
}
