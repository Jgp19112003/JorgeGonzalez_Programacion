package Llamadas;

public class LlamadaProvincial extends Llamada{


    public LlamadaProvincial(){}

    public LlamadaProvincial(String origen, String destino, double duracion){

        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        coste = 0.15 * duracion;

    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(origen);
        System.out.println(destino);
        System.out.println(duracion);
        System.out.println(coste);
    }
}
