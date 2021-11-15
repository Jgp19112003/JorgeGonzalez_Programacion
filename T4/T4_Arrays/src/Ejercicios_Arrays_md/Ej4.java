package Ejercicios_Arrays_md;

import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int longuitud = 0;
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
    }
}

