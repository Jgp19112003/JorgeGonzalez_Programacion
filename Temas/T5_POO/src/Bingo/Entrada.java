package Bingo;

import CajeroBase.Cliente;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc;

        String dni, nombre;
        int saldo, cartones;


        Carton c1 = new Carton();

        do {
        System.out.println("Introduce una opcion: ");
        System.out.println("1. Crear jugador: ");
        System.out.println("2. Comprar cartón: ");
        System.out.println("3. Iniciar juego: ");
        System.out.println("4. Salir ");
        opc = in.nextInt();

        switch (opc) {

                case 1:

                        System.out.println("-- Seleccionado crear jugador");
                        System.out.println("Introduce el nombre del titular: ");
                        nombre = in.next();
                        System.out.println("Introduce DNI de titular: ");
                        dni = in.next();
                        System.out.println("Introduce saldo inicial: ");
                        saldo = in.nextInt();
                        System.out.println("--- Jugador creada correctamente ---");
                        Jugador j1 = new Jugador(nombre,dni, saldo);
                        c1.crearJugador(j1);
                        break;

                case 2:
                        System.out.println("-- Seleccionado comprar carton");
                        System.out.println("Introduce DNI del jugador: ");
                        dni = in.next();
                        c1.comprarCartones(dni);

                        break;
                case 3:
                        System.out.println("-- Seleccionado iniciar juego");
                        c1.iniciarJuego();


                        break;

                    }


               }    while (opc != 4);

        }
    }

