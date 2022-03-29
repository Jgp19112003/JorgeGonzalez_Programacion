package Ej2Repaso;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc, id,pin, saldo;
        Cuenta c1 = new Cuenta();


        do {
            System.out.println("¿Que quiere hacer?: ");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Ver saldo");
            System.out.println("5. Ver errores");
            opc = in.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Introduzca id: ");
                    id = in.nextInt();
                    System.out.println("Introduzca pin: ");
                    pin = in.nextInt();
                    System.out.println("Introduzca saldo inicial: ");
                    saldo = in.nextInt();
                    c1 = new Cuenta(id,pin,saldo);
                    c1.crearCuenta(c1);
                    break;

                case 2:
                    System.out.println("Introduzca id: ");
                    id = in.nextInt();
                    System.out.println("Introduzca pin: ");
                    pin = in.nextInt();
                    c1.ingresarDinero(id,pin);
                    break;

                case 3:
                    System.out.println("Introduzca id: ");
                    id = in.nextInt();
                    System.out.println("Introduzca pin: ");
                    pin = in.nextInt();
                    c1.sacarDinero(id,pin);
                    break;

                case 4:
                    break;
            }

        }while (opc != 0);
    }
}
