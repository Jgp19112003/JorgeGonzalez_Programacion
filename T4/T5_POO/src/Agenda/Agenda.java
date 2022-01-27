package Agenda;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Persona> listado = new ArrayList<>();

    public Agenda(){

    }

    public void agregarPersona(Persona persona){

        this.listado.add(persona);

    }
    public void borrarPersona(String dni){

        for (int i = 0; i < listado.size(); i++) {

            if (listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.remove(i);
            }

        }

    }
    public void editarPersona(String dni, String nombre, int telefono){

        for (int i = 0; i < listado.size(); i++) {

            if (listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.get(i).setNombre(nombre);
                listado.get(i).setTelefono(telefono);
            }

        }

    }
    public void mostrarDatosa(String dni){

        for (int i = 0; i < listado.size(); i++) {

            if (listado.get(i).getDni().equalsIgnoreCase(dni)){
                listado.get(i).mostrarDatos();
            }

        }


    }

    public void mostrarListado(){

        for (int i = 0; i < listado.size(); i++) {

            listado.get(i).mostrarDatos();

        }


    }

}
