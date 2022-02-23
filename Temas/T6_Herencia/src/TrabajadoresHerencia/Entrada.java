package TrabajadoresHerencia;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        String nombre;
        String apellido;
        String dni;
        int acciones, beneficio,sueldo,pagas;
        boolean contratado;
        Empresa e1 = new Empresa();
    do {
        System.out.println("Que quieres hacer: ");
        System.out.println("1.Registrar un trabajador");
        System.out.println("2.Listar trabajadores");
        System.out.println("3.Mostrar datos de trabajador");
        opc = in.nextInt();


        switch (opc) {
            case 1:
                System.out.println("Que quiere registrar:");
                System.out.println("1.Jefe");
                System.out.println("2.Asalariado");
                System.out.println("3.Autónomo");
                opc = in.nextInt();


                switch (opc) {
                    case 1:
                        System.out.println("Nombre: ");
                        nombre = in.next();
                        System.out.println("Apellido:");
                        apellido = in.next();
                        System.out.println("DNI: ");
                        dni = in.next();
                        System.out.println("Acciones: ");
                        acciones = in.nextInt();
                        System.out.println("Beneficio: ");
                        beneficio = in.nextInt();
                        Jefe j1 = new Jefe(nombre, apellido, dni, acciones, beneficio);
                        e1.registarTrabajador(j1);
                        break;
                    case 2:
                        System.out.println("Nombre: ");
                        nombre = in.next();
                        System.out.println("Apellido:");
                        apellido = in.next();
                        System.out.println("DNI: ");
                        dni = in.next();
                        System.out.println("Sueldo: ");
                        sueldo = in.nextInt();
                        System.out.println("Numero de pagas: ");
                        pagas = in.nextInt();
                        Asalariado a1 = new Asalariado(nombre, apellido, dni, sueldo, pagas);
                        e1.registarTrabajador(a1);
                        break;
                    case 3:
                        System.out.println("Nombre: ");
                        nombre = in.next();
                        System.out.println("Apellido:");
                        apellido = in.next();
                        System.out.println("DNI: ");
                        dni = in.next();
                        System.out.println("Sueldo: ");
                        sueldo = in.nextInt();
                        Autonomo am1 = new Autonomo(nombre, apellido, dni, sueldo);
                        e1.registarTrabajador(am1);
                        break;
                }
                break;
            case 2:
                System.out.println("Que quiere listar: ");
                System.out.println("1.Listar asalariados");
                System.out.println("2.Listar autonomos");
                System.out.println("3.Listar todos");
                opc = in.nextInt();
                e1.listarTrabajadores(opc);
                break;

            case 3:
                System.out.println("Introduzca el dni: ");
                dni = in.next();
                e1.datosTrabajador(dni);
                break;

        }
    }while (opc!=0);




    }
}
