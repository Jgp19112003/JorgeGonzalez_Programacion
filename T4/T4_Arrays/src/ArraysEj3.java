import java.util.Scanner;
public class ArraysEj3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10 ; i++) {

            System.out.printf("Introduzca el numero %d%n",i);
            numeros[i] = in.nextInt();
        }
        
        for (int i = 0; i < 9 ; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < 9 ; i++) {

            System.out.println(numeros[i]);

        }




    }
}
