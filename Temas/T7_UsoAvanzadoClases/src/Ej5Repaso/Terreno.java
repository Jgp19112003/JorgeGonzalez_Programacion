package Ej5Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public final class Terreno {
    Scanner in = new Scanner(System.in);

    private int m2_terreno;
    private String  orientacion;
    private boolean casa_boolean, piscina;
    private double valoracion;
    private ArrayList<Casa> casas = new ArrayList<>();
    private ArrayList<Terreno> terrenos = new ArrayList<>();

    public Terreno (){}

    public Terreno(int m2_terreno, double valoracion, String orientacion) {
        this.m2_terreno = m2_terreno;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    public void revalorizarCasa(){

        for (Terreno item: terrenos) {
            if (casa_boolean){
                valoracion += (valoracion * 0.25);
            }
            if (casa_boolean && m2_terreno > 100){
                valoracion += (valoracion * 0.30);
            }
            if (casa_boolean && piscina){
                valoracion += (valoracion * 0.50);
            }
        }
        System.out.println("El valor de su casa es de "+valoracion);
    }

    public void construirCasa(Casa casa){
        String piscina_opc;
        casas.add(casa);
        casa_boolean = true;
        System.out.println("¿Desea piscina?");
        piscina_opc = in.next();
        if (piscina_opc.equalsIgnoreCase("si")){
            piscina = true;
            System.out.println("Casa construida correctamente con piscina");
        }else {
            System.out.println("Casa construida correctamente sin piscina");
        }
        revalorizarCasa();
    }

    public void  construirHabitacion(int m2_habitacion) {
        for (Casa item : casas) {

        if (m2_habitacion > item.m2_casa) {
            System.out.println("La casa no tiene los suficientes m2 para construir la habitacion.");
        } else {
            System.out.println("Habitacion construida.");
        }
    }
}
    public void construirAnexo(int m2_anexo){
        for (Terreno item: terrenos) {
            if (m2_anexo > item.m2_terreno) {
                System.out.println("El terreno no tiene los suficientes m2 para construir un anexo.");
            } else {
                System.out.println("Se ha construido un edificio extra de" + m2_anexo + " metros");
            }
        }
    }

    public int getM2_terreno() {
        return m2_terreno;
    }

    public void setM2_terreno(int m2) {
        this.m2_terreno = m2;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public boolean isCasa_boolean() {
        return casa_boolean;
    }
    public void setCasa_boolean(boolean casa) {
        this.casa_boolean = casa_boolean;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public ArrayList<Terreno> getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(ArrayList<Terreno> terrenos) {
        this.terrenos = terrenos;
    }
    public final class Casa{


        private int m2_casa, habitaciones;

        public Casa(){}

        public Casa(int m2_casa) {
            this.m2_casa = m2_casa;
        }

        public int getM2_casa() {
            return m2_casa;
        }

        public void setM2_casa(int m2_casa) {
            this.m2_casa = m2_casa;
        }

        public int getHabitaciones() {
            return habitaciones;
        }

        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }

    }




}
