package Llamadas;

import java.util.ArrayList;

public  class Centralita {


    ArrayList<Llamada> llamadas = new ArrayList<>();

    public Centralita(){}

    public void mostrarCostes(){
        double costetotal = 0;
        for (Llamada item: llamadas) {
            costetotal += item.coste;
        }
        System.out.println(costetotal);
    }

    public void registrarLLamadas(Llamada llamada){
        llamadas.add(llamada);
        llamada.mostrarDatos();
    }

    public void mostrarLlamadas(int opc3){
        if (opc3 == 1) {
            for (Llamada item : llamadas) {

                if (item instanceof LlamadaLocal) {
                    System.out.println(item.origen);
                    System.out.println(item.destino);
                    System.out.println(item.duracion);
                    System.out.println(item.coste);
                }
            }
        }
        if (opc3 == 2) {
            for (Llamada item : llamadas) {
                if (item instanceof LlamadaNacional) {
                    System.out.println(item.origen);
                    System.out.println(item.destino);
                    System.out.println(((LlamadaNacional) item).franja);
                    System.out.println(item.duracion);
                    System.out.println(item.coste);
                }
            }
        }
        if (opc3 == 3){
            for (Llamada item : llamadas) {
                if (item instanceof LlamadaProvincial) {
                    System.out.println(item.origen);
                    System.out.println(item.destino);
                    System.out.println(item.duracion);
                    System.out.println(item.coste);
                }
            }
        }

    }


    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
}
