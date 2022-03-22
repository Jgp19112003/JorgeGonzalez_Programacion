package Idiomas;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Idiomas {
    Scanner in = new Scanner(System.in);

   private String nombre;
   private int numeroHablantes;
   private ArrayList<String> palabras = new ArrayList();

    public Idiomas() {
    }

    public Idiomas(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
    }

    public abstract void saludar();
    public abstract void despedir();

    public void ingresarPalabra (String palabra){
        palabras.add(palabra);
    }

    public void listarPalabras (){

        for (String item: palabras) {
            System.out.println(item);
        }
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList<String> palabras) {
        this.palabras = palabras;
    }
}
