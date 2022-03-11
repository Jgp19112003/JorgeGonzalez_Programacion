package Bibilioteca;

import java.util.ArrayList;

public final class Socio extends Persona{

    private int numsocio;
    private ArrayList<Elemento> prestamos = new ArrayList();

    public Socio() {}

    public Socio(String nombre, String apellido, String dni, int numsocio, ArrayList<Elemento> prestamos) {
        super(nombre, apellido, dni);
        this.numsocio = numsocio;
        this.prestamos = prestamos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(numsocio);
    }


    public int getNumsocio() {
        return numsocio;
    }

    public void setNumsocio(int numsocio) {
        this.numsocio = numsocio;
    }

    public ArrayList<Elemento> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Elemento> prestamos) {
        this.prestamos = prestamos;
    }
}
