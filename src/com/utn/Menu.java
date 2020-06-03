package com.utn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Cancion> canciones;

    ListaReproduccion miLista;

    Scanner miScanner;

    public Menu(ListaReproduccion miLista) {
        this.canciones = traerCanciones();
        this.miLista = miLista;
        this.miScanner = new Scanner(System.in);
    }

    public void menuCanciones() {

        int respuesta;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Elija una opcion (0 para volver)");

            System.out.println("1- Reproducir lista");
            System.out.println("2- Ver mi lista");
            System.out.println("3- Añadir Canción");
            System.out.println("4- Eliminar Canción");

            respuesta = miScanner.nextInt();

            switch (respuesta) {
                case 1:
                    reproducir();
                    break;
                case 2:
                    miLista.verMiLista();
                    break;
                case 3:
                    elegirCancion();
                    break;
                case 4:
                    eliminarCancion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro no valido, Reintente...");
                    break;
            }
        } while (respuesta != 0);
    }

    public void reproducir() {

        String pausa;
        miLista.reproducir();
        System.out.println("Presione 'p' para pausar y regresar al menu.");
        do {
            pausa = miScanner.nextLine();
        } while (!pausa.equals("p"));
    }

    public void elegirCancion() {

        System.out.println("-----------------------------------");

        System.out.println("Elegir canción a agregar: ");

        int count = 0;
        for (Cancion cancionAux : canciones) {
            System.out.println(count + ": " + cancionAux.toString());
            count++;
        }
        int numeroCancion = miScanner.nextInt();
        Cancion cancion = canciones.get(numeroCancion);
        miLista.añadirCancion(cancion);
        System.out.println("Cancion agregada correctamente.");
    }

    public void eliminarCancion() {

        System.out.println("-----------------------------------");

        System.out.println("Elegir canción a eliminar: ");

        miLista.verMiLista();

        int numeroCancion = miScanner.nextInt();
        Cancion cancion = canciones.get(numeroCancion);
        miLista.eliminarCancion(cancion);
    }

    public static List<Cancion> traerCanciones() {
        List<Cancion> canciones = new ArrayList<Cancion>();

        Artista disturbed = new Artista("Disturbed", 25, Nacionalidad.ESTADOUNIDENSE);
        Album theSickness = new Album("The Sickness", 2000, disturbed);
        Cancion downWithTheSickness = new Cancion("Down With The Sickness", "4:38", Genero.METAL, theSickness);

        canciones.add(downWithTheSickness);


        Artista gunsNRoses = new Artista("Guns 'n Roses", 34, Nacionalidad.ESTADOUNIDENSE);
        Album appetiteForDestruction = new Album("Appetite for Destruction", 1987, gunsNRoses);
        Cancion sweetChildOMine = new Cancion("Sweet Child o' Mine", "5:38", Genero.ROCK, appetiteForDestruction);

        canciones.add(sweetChildOMine);

        Artista billieEilish = new Artista("Billie Eilish", 18, Nacionalidad.ESTADOUNIDENSE);
        Album whenWeAllFallAsleep = new Album("When We All Fall Asleep, Where Do We Go?", 2019, billieEilish);
        Cancion badGuy = new Cancion("Bad Guy", "3:33", Genero.POP, whenWeAllFallAsleep);

        canciones.add(badGuy);

        Artista queen = new Artista("Queen", 45, Nacionalidad.INGLES);
        Artista davidBowie = new Artista("David Bowie", 69, Nacionalidad.ESTADOUNIDENSE);
        Album hotSpace = new Album("Hot Space", 1982, queen);
        Cancion underPressure = new Cancion("Under Pressure", "5:33", Genero.ROCK, hotSpace, davidBowie);

        canciones.add(underPressure);

        Album newsOfTheWorld = new Album("News Of The World", 1977, queen);
        Cancion weWillRockYou = new Cancion("We Will Rock You", "5:21", Genero.ROCK, newsOfTheWorld);

        canciones.add(weWillRockYou);

        Artista gorillaz = new Artista("Gorillaz", 21, Nacionalidad.INGLES);
        Album demonDays = new Album("Demon Days", 2005, gorillaz);
        Cancion feelGoodInc = new Cancion("Feel Good Inc", "4:25", Genero.ROCK, demonDays);

        canciones.add(feelGoodInc);

        Artista michaelJackson = new Artista("Michael Jackson", 50, Nacionalidad.ESTADOUNIDENSE);
        Album bad = new Album("Bad", 1987, michaelJackson);
        Cancion smoothCriminal = new Cancion("Smooth Criminal", "5:33", Genero.POP, bad);

        canciones.add(smoothCriminal);


        Artista theWeeknd = new Artista("The Weeknd", 30, Nacionalidad.CANADIENSE);
        Artista daftPunk = new Artista("Daft Punk", 26, Nacionalidad.FRANCES);
        Album starboy = new Album("Starboy", 2016, theWeeknd);
        Cancion iFeelItComing = new Cancion("I Feel It Coming", "4:33", Genero.POP, starboy, daftPunk);

        canciones.add(iFeelItComing);

        Artista theStrokes = new Artista("The Strokes", 21, Nacionalidad.ESTADOUNIDENSE);
        Album roomOnFire = new Album("Room On Fire", 2003, theStrokes);
        Cancion reptilia = new Cancion("Reptilia", "4:15", Genero.POP, roomOnFire);

        canciones.add(reptilia);

        Album randomAccessMemories = new Album("Random Access Memories", 2013, daftPunk);
        Cancion instantCrush = new Cancion("Instant Crush ", "4:15", Genero.POP, randomAccessMemories, theStrokes);

        canciones.add(instantCrush);

        return canciones;
    }
}
