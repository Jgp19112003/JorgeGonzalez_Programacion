package Clases;

public class Garaje {

    private Coche coche;
    private String averia;
    private int numCoches;

    public boolean aceptarCoche(Coche coche, String averia){

        if (this.coche !=null){
            return false;
        } else{
            numCoches++;
            this.coche = coche;

            if (averia.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+10);

            }

            return true;
        }

    }



}
