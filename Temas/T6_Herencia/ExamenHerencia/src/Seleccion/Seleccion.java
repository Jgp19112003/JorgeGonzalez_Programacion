package Seleccion;

import java.util.ArrayList;

public class Seleccion {

    int nombre;
    double totalgastos = 0;

    ArrayList<Persona> personas = new ArrayList<>();

    public void contratarJugador(Jugador jugador){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equalsIgnoreCase(jugador.dni)){
                System.out.println("Ese dni ya esta registrado");
                break;
            }
        }
            personas.add(jugador);
    }

    public void contratarEntrenador(Entrenador entrenador){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equalsIgnoreCase(entrenador.dni)) {
                System.out.println("Ese dni ya esta registrado");
                break;
            }
        }
            personas.add(entrenador);
    }

    public void verPosicion(String posicion){
            for (Persona item: personas) {
                if (item instanceof Jugador){
                    if (((Jugador) item).posicion.equalsIgnoreCase(posicion)){
                        item.mostrarDatos();
                    }
                }
            }
    }

    public void verJugadores(){
        for (Persona item: personas) {
            if (item instanceof Jugador){
                item.mostrarDatos();
            }

        }
    }

    public void verEntrenadores(){
        for (Persona item: personas) {
            if (item instanceof Entrenador){
                item.mostrarDatos();
            }

        }
    }

    public void verPlantilla(){
        int numjugadores = 0,numentrenadores = 0;
        for (Persona item: personas) {
            item.mostrarDatos();
            if (item instanceof Jugador){
                numjugadores++;
            }
            else {
                numentrenadores++;
            }
        }
        System.out.println("Hay "+numjugadores+" jugadores");
        System.out.println("Hay "+numentrenadores+" entrenadores");

    }

    public void mostrarGastos(){
        for (Persona item: personas) {
           totalgastos += item.getSueldo();
        }
        System.out.println("Los gastos totales son "+ totalgastos);
    }





}
