package Base_Arrays;//Ejercicio 1
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length ; i++) {

            System.out.printf("Introduzca el numero %d%n",i);
            numeros[i] = in.nextInt();
        }

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }
    }
}
