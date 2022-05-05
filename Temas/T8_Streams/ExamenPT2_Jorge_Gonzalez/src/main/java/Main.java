import controller.JSONcontroller3;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int opc;

        JSONcontroller3 jsoNcontroller3 = new JSONcontroller3();

        System.out.println("1. Ver películas en cartelera");
        System.out.println("2. Ver películas próximamente");
        opc = in.nextInt();
        jsoNcontroller3.verPeliculas(opc);
        if (opc == 1){

            File cartelera = new File("src/main/resources/cartelera.bin");
            jsoNcontroller3.escribirPeliculas(cartelera);
        }
        if (opc == 2){

            File proximamente = new File("src/main/resources/proximamente.bin");
            jsoNcontroller3.escribirPeliculas(proximamente);
        }


    }
}
