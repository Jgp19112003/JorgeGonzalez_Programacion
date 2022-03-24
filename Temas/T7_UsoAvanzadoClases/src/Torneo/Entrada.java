package Torneo;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Torneo mundial = new Torneo("Mundial");

        ArrayList<Torneo.Equipo> equipos_mundial = new ArrayList<>();

        Torneo.Equipo atleti = new Torneo.Equipo("Atleti",80,90,0);
        equipos_mundial.add(atleti);
        Torneo.Equipo madrid = new Torneo.Equipo("Real Madrid",95,70,0);
        equipos_mundial.add(madrid);
        Torneo.Equipo barcelona = new Torneo.Equipo("Barcelona",90,60,0);
        equipos_mundial.add(barcelona);
        Torneo.Equipo betis = new Torneo.Equipo("Betis",75,90,0);
        equipos_mundial.add(betis);

        mundial.realizarSorteo(equipos_mundial);
        mundial.iniciarTorneo();
        mundial.mostrarPuntos(equipos_mundial);
        mundial.imprimirClasificacion();


    }
}
