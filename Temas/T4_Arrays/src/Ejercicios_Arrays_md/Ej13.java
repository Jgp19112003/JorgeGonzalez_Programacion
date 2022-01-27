package Ejercicios_Arrays_md;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        int longuitud;
        int longuitudMayor;
        String direccion;
        int aux;


        System.out.println("¿Qué opcion quiere?");
        System.out.printf("1.Rellenar el array creado con números aleatorios.%n2.Rellenar el array creado con números pedidos por consola.%n3.Ordenar el array de mayor a menor.%n4.Clonar el array con una una mayor longitud.%n5.Mover todas las posiciones.%n6.Mostrar por pantalla el array según está.%n");
        opc = in.nextInt();

        System.out.println("De que longuitud quiere que sea su array: ");
        longuitud = in.nextInt();
        int[] array = new int[longuitud];

        if (opc == 1){
            for (int i = 0; i < longuitud; i++) {
                array [i] = (int) (Math.random()*11);
                System.out.println(array[i]);

            }
        }

        if (opc == 2){
            for (int i = 0; i < longuitud; i++) {
                System.out.printf("Introduzca el valor de la posicion %d: ",i+1);
                array [i] = in.nextInt();

            }
            for (int item: array) {
                System.out.println(item);
            }
        }

        if (opc == 3){
            /*for(int i=0;i<(lista.length-1);i++){
                for(int j=i+1;j<lista.length;j++){
                    if(lista[i]>lista[j]){
                        //Intercambiamos valores
                        int variableauxiliar=lista[i];
                        lista[i]=lista[j];
                        lista[j]=variableauxiliar;
                    }
                }
            }
        }
            */
            for (int i = 0; i < longuitud; i++) {
                System.out.printf("Introduzca el valor de la posicion %d: ",i+1);
                array [i] = in.nextInt();
            }

            for (int i = 0; i < longuitud; i++) {
                Arrays.sort(array);

            }
            for (int item: array) {
                System.out.println(item);

            }


        }

        if (opc == 4){
            do {
                System.out.println("Introduzca una nueva longuitud: ");
                longuitudMayor = in.nextInt();
            }while(longuitudMayor<=longuitud);
            int[] arrayMayor = new int[longuitudMayor];
                for (int i = 0; i < longuitudMayor; i++) {
                    System.out.printf("Introduzca el valor de la posicion %d: ",i+1);
                    arrayMayor [i] = in.nextInt();
                }

            for (int item: arrayMayor) {
                System.out.println(item);

            }
        }

        if (opc == 5){
            for (int i = 0; i < longuitud; i++) {
                System.out.printf("Introduzca el valor de la posicion %d: ",i+1);
                array [i] = in.nextInt();
            }
            System.out.println("¿Hacia que orientacion quiere mover el array?");
            System.out.println("Derecha(d), Izquierda(i)");
            direccion = in.next();
                if(Objects.equals(direccion, "d")) {
                    for (int i = 0; i < longuitud - 1; i++) {
                        aux = array[i + 1];
                        array[i + 1] = array[0];
                        array[0] = aux;
                    }
                }

                if(Objects.equals(direccion, "i")) {
                    aux = array[0];
                    for (int i = 0; i < longuitud-1; i++) {
                        array[i] = array[i+1];
                    }
                    array[array.length-1] = aux;
                }

                for (int item: array) {
                    System.out.println(item);

                }
        }

        if (opc ==6){
            for (int i = 0; i < longuitud; i++) {
                System.out.printf("Introduzca el valor de la posicion %d: ",i+1);
                array [i] = in.nextInt();
            }

            for (int item: array) {
                System.out.println(item);

            }
        }




    }
}
