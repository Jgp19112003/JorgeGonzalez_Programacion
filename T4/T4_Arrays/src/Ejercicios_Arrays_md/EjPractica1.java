package Ejercicios_Arrays_md;

import java.util.Scanner;

public class EjPractica1   {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] palabras = new String[10];
        int opc;
        int suma = 0;
        double media;
        int mayor = -999999;
        int menor = 99999;
        String palabraMenor = "";
        String palabraMayor = "";

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduzca la palabra "+(i+1));
            palabras[i] = in.next();
        }
        System.out.println("Eliga una opción: ");
        System.out.printf("1.Mostrar palabras%n2.Obtener una palabra al azar%n3.Obtener letras%n4.Ver media de letras%n5.Ver palabras con mas letras%n6.Ver palabra con menos letras%n");
        opc = in.nextInt();
        if (opc ==1){
            for (int i = 0; i < palabras.length; i++) {
                System.out.println(palabras[i]);
            }
        }

        if (opc ==  2){
           int azar =(int) (Math.random()*11);
            System.out.println("Palabra al azar: "+palabras[azar]);
        }

        if(opc == 3){

            for (int i = 0; i < palabras.length; i++) {

               suma += palabras[i].length();


            }
            System.out.println("El nuero de letras totales es: "+suma);
        }

        if(opc == 4){

            media = (double) suma/palabras.length;

            System.out.println("La media de las letras es: "+media);
        }

        if(opc == 5){
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].length()>mayor){
                    mayor = palabras[i].length();
                    palabraMayor = palabras[i];
                }
            }
            System.out.println("La palabra con mas letras es: "+palabraMayor);
        }

        if(opc == 6){
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].length()<menor){
                    menor = palabras[i].length();
                    palabraMenor = palabras[i];
                }
            }
            System.out.println("La palabra con mas letras es: "+palabraMenor);
        }


    }
}
