package Ejercicios_Arrays_md;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];
        double suma = 0;
        double media = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Introduzca el numero %d:%n",i+1);
            nums[i] = in.nextInt();
            nums[i] = nums[i]*2;
            suma = suma + nums[i];
            media = suma/5;
        }
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La media de puntos obtenidos es: "+media);
    }
}

