import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ArraysExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];


        for (int i = 0; i < 9 ; i++) {

            System.out.printf("Introduzca el numero %d%n",i);
            numeros[i] = in.nextInt();
        }
        
        for (int i = 0; i < 9 ; i++) {
            System.out.println(numeros[i]);
        }



    }
}
