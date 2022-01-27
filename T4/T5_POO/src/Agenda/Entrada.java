package Agenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Agenda a1 = new Agenda();
        int opc;
        String dni , nombre;
        int telefono;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1. Agregar persona a la agenda");
            System.out.println("2. Borrar persona");
            System.out.println("3. Editar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Listar agenda");
            opc = in.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Introduzca el DNI: ");
                    dni = in.next();
                    System.out.println("Introduzca el nombre: ");
                    nombre = in.next();
                    System.out.println("Introduzca el telefono: ");
                    telefono = in.nextInt();
                    Persona p1 = new Persona(dni, nombre, telefono);
                    a1.agregarPersona(p1);

                    break;

                case 2:
                    System.out.println("Introduzca el DNI: ");
                    dni = in.next();
                    a1.borrarPersona(dni);

                    break;

                case 3:
                    System.out.println("Introduzca el DNI: ");
                    dni = in.next();
                    System.out.println("Introduzca el nombre para editar: ");
                    nombre = in.next();
                    System.out.println("Introduzca el telefono para editar: ");
                    telefono = in.nextInt();
                    a1.editarPersona(dni, nombre, telefono);

                    break;

                case 4:
                    System.out.println("Introduzca el DNI: ");
                    dni = in.next();
                    a1.mostrarDatosa(dni);

                    break;

                case 5:
                    a1.mostrarListado();
                    break;

            }
        }while (opc != 0);

    }
}
