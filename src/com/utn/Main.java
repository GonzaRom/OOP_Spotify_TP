package com.utn;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        Menu menu;

        int respuesta;

        do{
            System.out.println("BIENVENIDO! Elija una opción (0 para salir):");
            System.out.println("1 - Utilizar Lista Basica");
            System.out.println("2 - Utilizar Lista Premium");

            respuesta = miScanner.nextInt();

            switch (respuesta){
                case 1:
                    menu = new Menu(new ListaBasica());
                    menu.menuCanciones();
                    break;
                case 2:
                    menu = new Menu(new ListaPremium());
                    menu.menuCanciones();
                    break;
                default:
                    System.out.println("Opción no valida. Reintente");
                    break;
            }
        }while(respuesta != 0);

        System.out.println("Saliendo del programa.");
    }


}
