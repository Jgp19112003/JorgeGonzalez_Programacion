package Ejercicios_Arrays_md;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int longuitud;

        System.out.println("De que longuitud desea que sea su array: ");
        longuitud = in.nextInt();
        int[] array1 = new int[longuitud];
        int[] array2 = new int[longuitud];
        int[] array3 = new int[longuitud];

        System.out.println("Array 1");
        System.out.println("´´´´´´´´´");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Introduzca el numero %d:%n",i+1);
            array1[i] = in.nextInt();

        }

        System.out.println("Array 2");
        System.out.println("´´´´´´´´´");
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("Introduzca el numero %d:%n",i+1);
            array2[i] = in.nextInt();

        }

        System.out.println("Array 3 ");
        System.out.println("´´´´´´´´´");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i]+array2[i];

            System.out.printf("El valor %d vale: %d%n",i+1,array3[i]);

        }
    }
}
