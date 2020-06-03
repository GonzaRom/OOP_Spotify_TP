package com.utn;

import java.util.Stack;

public class ListaBasica extends ListaReproduccion{

    private Stack<Cancion> miLista;

    public ListaBasica() {
        super("Lista Basica");
        this.miLista = new Stack<Cancion>();
    }

    public ListaBasica(String nombre, Stack<Cancion> miLista) {
        super(nombre);
        this.miLista = miLista;
    }

    public Stack getMiLista() {
        return miLista;
    }

    public void setMiLista(Stack<Cancion> miLista) {
        this.miLista = miLista;
    }

    @Override
    public void reproducir() {

        Cancion cancion = miLista.pop();

        Stack<Cancion> listaAux = new Stack();

        for (Cancion cancionAux : miLista){
            listaAux.push(cancionAux);
        }
        listaAux.push(cancion);

        miLista = listaAux;

        System.out.println("Reproduciendo: " + cancion.toString());

    }

    @Override
    public void añadirCancion(Cancion cancion) {

        this.miLista.push(cancion);
    }

    @Override
    public void eliminarCancion(Cancion cancion) {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM.");
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
