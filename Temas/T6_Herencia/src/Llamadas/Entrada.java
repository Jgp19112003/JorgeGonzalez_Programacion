package Llamadas;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int opc, opc2, opc3;
        String origen, destino;
        double coste, duracion;
        int franja;

        Centralita c1 = new Centralita();
    do {
        System.out.println("1. Registrar llamada");
        System.out.println("2. Mostrar costes");
        System.out.println("3. Mostrar llamada");
        opc = in.nextInt();

        switch (opc) {
            case 1:

                System.out.println("1. LLamada local");
                System.out.println("2. LLamada provincial");
                System.out.println("3. LLamada nacional");

                opc2 = in.nextInt();

                switch (opc2) {

                    case 1:
                        System.out.println("Introduce origen");
                        origen = in.next();
                        System.out.println("Introduce destino");
                        destino = in.next();
                        System.out.println("Introduce duracion");
                        duracion = in.nextDouble();
                        LlamadaLocal llamadaLocal = new LlamadaLocal(origen, destino, duracion);
                        c1.registrarLLamadas(llamadaLocal);

                        break;


                    case 2:
                        System.out.println("Introduce origen");
                        origen = in.next();
                        System.out.println("Introduce destino");
                        destino = in.next();
                        System.out.println("Introduce duracion");
                        duracion = in.nextDouble();
                        LlamadaProvincial llamadaprovincial = new LlamadaProvincial(origen, destino, duracion);
                        c1.registrarLLamadas(llamadaprovincial);

                        break;

                    case 3:
                        System.out.println("Introduce origen");
                        origen = in.next();
                        System.out.println("Introduce destino");
                        destino = in.next();
                        System.out.println("Introduce franja");
                        franja = in.nextInt();
                        System.out.println("Introduce duracion");
                        duracion = in.nextDouble();
                        LlamadaNacional llamadanacional = new LlamadaNacional(origen, destino, franja, duracion);
                        c1.registrarLLamadas(llamadanacional);
                        break;

                }
            break;

            case 2:
                c1.mostrarCostes();

                break;

            case 3:
                System.out.println("Que llamada quiere mostrar");
                opc3 = in.nextInt();
                c1.mostrarLlamadas(opc3);

                break;
        }

    }while (opc != 0);
    }
}
