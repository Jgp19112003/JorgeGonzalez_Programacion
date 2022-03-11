package Bibilioteca;

import java.util.ArrayList;

public final class Biblioteca {

    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Biblioteca (){}


    public void RegistrarPersona (Persona persona){

        personas.add(persona);
    }
    public void RegistrarAlquilable (Elemento elemento){

        elementos.add(elemento);
    }

    public void RealizarPrestamo(String dni, Prestar elemento){

        for (Persona item: personas) {
            if (item instanceof Socio){
                if (item.getDni().equalsIgnoreCase(dni)){
                    if (((Elemento)elemento).estado){
                        ((Socio) item).getPrestamos().add((Elemento) elemento);
                        System.out.println("Elemento prestado correctamente");
                    }
                }
            }
        }
    }

    public void RealizarDevolucion (String dni, Prestar elemento){

        for (Persona item: personas) {
            if (item instanceof Socio){
                if (item.getDni().equalsIgnoreCase(dni)){
                    if (((Socio) item).getPrestamos().contains(elemento)){
                        ((Socio) item).getPrestamos().remove(elemento);
                    }
                }
            }
        }

    }

    public void MostrarPrestados(){
        for (Elemento item: elementos) {
            if (item instanceof Prestar){
                if (!item.estado){
                    System.out.println(item);
                }
            }
        }
    }

    public void MostrarDisponibles(){
        for (Elemento item: elementos) {
            if (item.estado){
                System.out.println(item);
            }
        }
    }

    public void MostrarElementosSocio(String dni){
        for (Persona item: personas) {
            if (item instanceof Socio){
                for (int i = 0; i < ((Socio) item).getPrestamos().size(); i++) {
                        System.out.println(i);
                    }
            }
        }
    }


    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
}
