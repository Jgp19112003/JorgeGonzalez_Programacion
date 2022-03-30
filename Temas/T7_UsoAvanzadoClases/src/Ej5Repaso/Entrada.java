package Ej5Repaso;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc;
        int m2_terreno;
        String  orientacion;
        double valoracion;
        int m2_casa,m2_habitacion, habitaciones;
        Terreno t1 = new Terreno();
        int m2_anexo;
    do {
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Crear un terreno ");
        System.out.println("2. Crear una casa ");
        System.out.println("3. Crear una habitación en la casa");
        System.out.println("4. Crear un anexo en la vivienda");
        opc = in.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Introduzca m2: ");
                m2_terreno = in.nextInt();
                System.out.println("Introduzca orientacion:");
                orientacion = in.next();
                System.out.println("Introduzca valoracion: ");
                valoracion = in.nextInt();
                t1 = new Terreno(m2_terreno, valoracion, orientacion);
                break;

            case 2:
                System.out.println("Introduzca m2: ");
                m2_casa = in.nextInt();
                Terreno.Casa c1 = t1.new Casa(m2_casa);
                t1.construirCasa(c1);
                break;

            case 3:
                System.out.println("Introduzca m2: ");
                m2_habitacion = in.nextInt();
                t1.construirHabitacion(m2_habitacion);
                break;

            case 4:
                System.out.println("Introduzca m2: ");
                m2_anexo = in.nextInt();
                t1.construirAnexo(m2_anexo);
                break;

        }
    }while (opc != 0);

    }
}
