package Torneo;

import PartidoAnidado.Partido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public final class Torneo {

    private String nombre;
    private ArrayList<Partido> partidos = new ArrayList();
    private ArrayList<Equipo> listaequipos = new ArrayList();


    public Torneo(String nombre) {
        this.nombre = nombre;
    }


    public void realizarSorteo (ArrayList<Equipo> equipos){
        this.listaequipos = equipos;

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = 1+i ; j < equipos.size(); j++) {
                Partido ps = new Partido(equipos.get(i),equipos.get(j));
                partidos.add(ps);
            }
        }
    }

    public void mostrarPartidos(){

        for (Partido item: partidos) {
            System.out.println(item.getEquipo_local().nombre+"  vs  "+item.getEquipo_visitante().nombre);
        }
    }

    public void iniciarTorneo(){
        for (Partido item: partidos) {
            jugarPartido(item);
        }
    }

    public void jugarPartido(Partido partido){

        for (int i = 0; i < 3; i++) {
            if (partido.equipo_local.nivel_ataque > partido.equipo_visitante.nivel_defensa){
                partido.golesp1++;
                partido.equipo_local.golesencuentro++;
            }
            if (partido.equipo_visitante.nivel_ataque > partido.equipo_local.nivel_defensa){
                partido.golesp1++;
                partido.equipo_visitante.golesencuentro++;
            }
            if (partido.equipo_local.nivel_ataque > partido.equipo_visitante.nivel_defensa){
                partido.golesp2++;
                partido.equipo_local.golesencuentro++;
            }
            if (partido.equipo_visitante.nivel_ataque > partido.equipo_local.nivel_defensa){
                partido.golesp2++;
                partido.equipo_visitante.golesencuentro++;
            }
        }

        if (partido.equipo_local.golesencuentro > partido.equipo_visitante.golesencuentro) {
            partido.equipo_local.puntos += 3;
        }
        if (partido.equipo_visitante.golesencuentro > partido.equipo_local.golesencuentro) {
            partido.equipo_visitante.puntos += 3;
        }
        if (partido.equipo_visitante.golesencuentro == partido.equipo_local.golesencuentro){
            partido.equipo_local.puntos += 1;
            partido.equipo_visitante.puntos += 1;
        }

        partido.goles_totales = partido.golesp1 + partido.golesp2;
        System.out.println("En la primera parte hubo: "+partido.golesp1+" y en la segunda: "+partido.golesp2+" sumando un total de "+partido.goles_totales+" goles");
        System.out.println(partido.equipo_local.nombre+":"+partido.equipo_local.golesencuentro+" - "+partido.equipo_visitante.nombre+":"+partido.equipo_visitante.golesencuentro);
        partido.equipo_local.golesencuentro = 0;
        partido.equipo_visitante.golesencuentro = 0;
    }

    public void mostrarPuntos(ArrayList<Equipo> equipos){
        for (Equipo item: equipos) {
            System.out.println(item.nombre+": "+item.puntos);
        }
    }

    public void imprimirClasificacion(){
        Collections.sort(listaequipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos() > o2.getPuntos()) {
                    return -1;
                }
                return 0;
            }
        });

        int contador = 1;

        for (Equipo item: listaequipos) {
            System.out.printf("%d - %s - %d%n",contador,item.getNombre(),item.getPuntos());
            contador++;
        }
    }

    class Partido{
        private Equipo equipo_local, equipo_visitante;
        private int goles_totales;
        private boolean jugado;
        private int golesp1,golesp2;

        public Partido(Equipo equipo_local, Equipo equipo_visitante) {
            this.equipo_local = equipo_local;
            this.equipo_visitante = equipo_visitante;
        }

        public Equipo getEquipo_local() {
            return equipo_local;
        }

        public void setEquipo_local(Equipo equipo_local) {
            this.equipo_local = equipo_local;
        }

        public Equipo getEquipo_visitante() {
            return equipo_visitante;
        }

        public void setEquipo_visitante(Equipo equipo_visitante) {
            this.equipo_visitante = equipo_visitante;
        }

        public int getGoles_totales() {
            return goles_totales;
        }

        public void setGoles_totales(int goles_totales) {
            this.goles_totales = goles_totales;
        }

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }
    }

    public static class Equipo{
        private String nombre;
        private int nivel_ataque, nivel_defensa, golesencuentro, puntos;

        public Equipo(String nombre, int nivel_ataque, int nivel_defensa, int puntos) {
            this.nombre = nombre;
            this.nivel_ataque = nivel_ataque;
            this.nivel_defensa = nivel_defensa;
            this.puntos = puntos;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNivel_ataque() {
            return nivel_ataque;
        }

        public void setNivel_ataque(int nivel_ataque) {
            this.nivel_ataque = nivel_ataque;
        }

        public int getNivel_defensa() {
            return nivel_defensa;
        }

        public void setNivel_defensa(int nivel_defensa) {
            this.nivel_defensa = nivel_defensa;
        }

        public int getGolesencuentro() {
            return golesencuentro;
        }

        public void setGolesencuentro(int golesencuentro) {
            this.golesencuentro = golesencuentro;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

    }
}
