package Base_Arrays;//Ejercicio3
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Introduzca el numero %d%n", i);
            numeros[i] = in.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {


            for ( i = 0; i < 9; i++) {

                System.out.println(numeros[i]);
            }

            for ( i = 0; i < numeros.length; i++) {

                System.out.println(numeros[i]);
            }
        }
    }
}
