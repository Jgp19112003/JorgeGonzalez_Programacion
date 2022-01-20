package Ejercicios_Arrays_md;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int longuitud,aux;

        System.out.println("De que longuitud desea que sea su array: ");
        longuitud = in.nextInt();
        int[] nums = new int[longuitud];


        for (int i = 0; i < nums.length; i++) {

            System.out.printf("Introduzca el numero %d:%n", i + 1);
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < nums.length-1; i++) {
                aux = nums[i+1];
                nums[i+1] = nums[0];
                nums[0] = aux;
            }

        for (int item: nums) {
            System.out.println(item);
        }
        


        }


   }

