package Clases;

public class Entrada {
    public static void main(String[] args) {

        Motor motorGasoil = new Motor(150,1000);
        Motor motorGasolina = new Motor(120,500);

        Coche cocheGasolina = new Coche("Ford","Fiesta",new Motor(120,500));
        Coche cocheGasoil = new Coche("Opel","Corda",new Motor(150,1000));

        //System.out.println(cocheGasoil.getMotor().getCv());
        //System.out.println(cocheGasoil.getPrecioAcumulado());

        Garaje garaje = new Garaje();

       if (garaje.aceptarCoche(cocheGasoil,"aceite")){
           System.out.println("Coche aceptado");
           System.out.println(cocheGasoil.getMotor().getLitrosAceite());
       }else {
           System.out.println("Garaje ocupado");
       }
    }
}
