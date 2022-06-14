package Seleccion;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String posicion;
        Seleccion Espania = new Seleccion();

        Jugador j1 = new Jugador("Fernando","Torres","123A",21,"delantero",10000);
        Espania.contratarJugador(j1);
        Jugador j2 = new Jugador("David","Villa","456B",23,"delantero",20000);
        Espania.contratarJugador(j2);
        Jugador j3 = new Jugador("Sergio","Ramos","789C",24,"defensa",25000);
        Espania.contratarJugador(j3);
        Jugador j4 = new Jugador("Gerard","Piqué","321D",23,"defensa",23000);
        Espania.contratarJugador(j4);

        Entrenador e1 = new Entrenador("Vicente","Del Bosque","098V",45,"ofensiva",50000);
        Espania.contratarEntrenador(e1);
        Entrenador e2 = new Entrenador("Luis","Enrique","687L",35,"defensiva",35000);
        Espania.contratarEntrenador(e2);

        System.out.println("Introduzca posicion que quiere mostrar: ");
        posicion = in.next();
        Espania.verPosicion(posicion);

        Espania.mostrarGastos();

        Espania.verPlantilla();



    }
}
