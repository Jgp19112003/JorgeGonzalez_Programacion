import controller.ControllerDB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int opc,total;
        String pais;

        ControllerDB controllerDB = new ControllerDB();
        /*controllerDB.leerJSON();*/


        System.out.println("Seleccione:  1. Buscar por total  2. Buscar por país");
        opc = in.nextInt();

        switch (opc){
            case 1:
                System.out.println("Introduzca un total: ");
                total = in.nextInt();
                controllerDB.getResultadosTotal(total);


                break;

            case 2:
                System.out.println("Introduzca un pais: ");
                pais = in.next();
                controllerDB.getResultadosPais(pais);
                break;

        }



    }
}
