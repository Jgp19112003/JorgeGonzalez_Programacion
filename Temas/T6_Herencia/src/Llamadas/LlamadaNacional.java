package Llamadas;

public class LlamadaNacional extends Llamada{

    int franja;

    public LlamadaNacional(){}

    public LlamadaNacional(String origen, String destino, int franja, double duracion){
        this.franja = franja;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;

        if (franja == 1){
            coste = 0.20 * duracion;
        }
        if (franja == 2){
            coste = 0.25 * duracion;
        }
        if (franja == 3){
            coste = 0.30 * duracion;
        }

    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(origen);
        System.out.println(destino);
        System.out.println(franja);
        System.out.println(duracion);
        System.out.println(coste);
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
