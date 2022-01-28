package CajeroBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Banco BBVA = new Banco();
        Banco Santander = new Banco();

        int opc;
        String dni;
        int isbn, pin, saldo_inicial;
        String nombre, cif;

        System.out.println("Introduce el banco con el que quieres operar: ");
        opc = in.nextInt();

        switch (opc) {
            case 1:
                do {
                    int opcB;
                    System.out.println("--Seleccionado BBVA--");
                    System.out.println("1. Crear una cuenta");
                    System.out.println("2. Ingresar dinero");
                    System.out.println("3. Sacar dinero");
                    System.out.println("4. Ver cuentas de un cliente");
                    System.out.println("5. Ver todas las cuentas");
                    System.out.println("Que quieres hacer: ");
                    opcB = in.nextInt();
                    switch (opcB) {
                        case 1:
                            System.out.println("-- Seleccionado crear cuenta");
                            System.out.println("Introduce DNI de titular: ");
                            dni = in.next();
                            System.out.println("Introduce pin asociado: ");
                            pin = in.nextInt();
                            System.out.println("Introduce saldo inicial: ");
                            saldo_inicial = in.nextInt();
                            System.out.println("--- Cuenta creada correctamente ---");
                            Cliente c1 = new Cliente(dni, pin, saldo_inicial);
                            BBVA.crearCuenta(c1);
                            break;
                        case 2:
                            System.out.println("-- Seleccionado ingresar dinero");
                            System.out.println("Introduce DNI de titular: ");
                            dni = in.next();
                            System.out.println("Introduce pin asociado: ");
                            pin = in.nextInt();
                            BBVA.ingresarDinero(dni, pin);

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;

                    }


                } while (opc != 0);


        }
    }
}
