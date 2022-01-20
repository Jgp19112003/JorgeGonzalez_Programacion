package Ejercicios_Arrays_md;

import java.util.Arrays;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int longuitud;
        int mayor = 0;
        int menor = 99999999;

        System.out.println("De que longuitud desea que sea su array: ");
        longuitud = in.nextInt();
        int[] nums = new int[longuitud];

        for (int i = 0; i < nums.length; i++) {

            System.out.printf("Introduzca el numero %d:%n",i+1);
            nums[i] = in.nextInt();

            if(nums[i]>mayor){
                mayor = nums[i];
            }

            if(nums[i]<menor){
                menor = nums[i];
            }

        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);


        Arrays.sort(nums);


        for (int item: nums) {
            System.out.println(item);

        }
        System.out.println("El mayor numero es "+nums[nums.length-1]);
        System.out.println("El menor numero es "+nums[0]);


    }
}

