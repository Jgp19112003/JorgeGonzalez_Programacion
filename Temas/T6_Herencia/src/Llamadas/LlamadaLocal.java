package Llamadas;

public class LlamadaLocal extends Llamada{


    public LlamadaLocal(){}

    public LlamadaLocal(String origen, String destino, double duracion){

        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        coste = 0;
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
