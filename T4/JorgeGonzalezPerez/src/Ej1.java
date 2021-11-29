import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc;
        int longuitud;
        int aux;





                System.out.println("Eliga una opcion: ");
                System.out.printf("1.Indicar tamaño del array%n2.Guarda tantos números aleatorios como tamaño tenga el array.%n3.Lista solo aquellas posiciones donde el valor asignado sea superior a 10 y\n" +
                        "además número de par.%n4.Rota las posiciones del array a la izquierda.%n5.Lista todas las posiciones del array.%n");

                opc = in.nextInt();

             if (opc !=1) {
                 do {

                     System.out.println("NO SE HA INTRODUCIDO NINGUN TAMAÑO (Pulse 1 para hacerlo).");
                     System.out.println("Eliga una opcion: ");
                     System.out.printf("1.Indicar tamaño del array%n2.Guarda tantos números aleatorios como tamaño tenga el array.%n3.Lista solo aquellas posiciones donde el valor asignado sea superior a 10 y\n" +
                             "además número de par.%n4.Rota las posiciones del array a la izquierda.%n5.Lista todas las posiciones del array.%n");

                     opc = in.nextInt();

                 } while (opc != 1);
             }



            if(opc == 1){

                System.out.println("Indique el tamaño de su array: ");
                longuitud = in.nextInt();

                if (longuitud <= 0) {
                    System.out.println("Tamaño erroneo, introduzca un tamaño valido.");
                }



            int[] array = new int[longuitud];


                do {
                    System.out.println("Eliga una opcion: ");
                    System.out.printf("1.Iniciar el array%n2.Guarda tantos números aleatorios como tamaño tenga el array.%n3.Lista solo aquellas posiciones donde el valor asignado sea superior a 10 y\n" +
                            "además número de par.%n4.Rota las posiciones del array a la izquierda.%n5.Lista todas las posiciones del array.%n");

                    opc = in.nextInt();

                    if (opc == 2) {

                        for (int i = 0; i < longuitud; i++) {
                            array[i] = (int) (Math.random() * 101);
                        }
                        for (int item : array) {
                            System.out.println(item);
                        }

                    }


                    if (opc == 3) {

                        for (int i = 0; i < longuitud; i++) {
                            if (array[i] >= 10 && array[i] % 2 == 0) {
                                System.out.println(array[i]);
                            }
                        }
                    }

                    if (opc == 4) {
                        aux = array[0];
                        for (int i = 0; i < longuitud - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        array[array.length - 1] = aux;
                        for (int item : array) {
                            System.out.println(item);
                        }
                    }

                    if (opc == 5) {
                        for (int item : array) {
                            System.out.println(item);
                        }
                    }
                } while (opc > 0);
            }

    }
}
