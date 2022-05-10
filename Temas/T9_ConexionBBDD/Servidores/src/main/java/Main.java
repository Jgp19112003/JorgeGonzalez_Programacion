import controller.ControllerBD;
import database.SchemaDB;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ControllerBD controllerBD = new ControllerBD();
        int opc;
        String nombre, apellido;
        int edad;

       /* System.out.println("¿Qué quiere hacer?  (1. Introducir alumno)  (0. Parar de introducir)");
        opc = in.nextInt();
        while (opc != 0){

            System.out.println("Introduzca nombre: ");
            nombre = in.next();
            System.out.println("Introduzca apellido: ");
            apellido = in.next();
            System.out.println("Introduzca edad: ");
            edad = in.nextInt();

            Alumno a1 = new Alumno(nombre,apellido,edad);
            controllerBD.introducirAlumnosDeseados(a1);

            System.out.println("¿Qué quiere hacer?  (1. Introducir alumno)  (0. Parar de introducir)");
            opc = in.nextInt();
        }
        System.out.println("Proceso terminado");*/


        /*System.out.println("*Modificar Alumno*");
        System.out.println("Introduzca nombre: ");
        nombre = in.next();
        System.out.println("Introduzca edad con nuevo valor: ");
        edad = in.nextInt();
        controllerBD.modificarEdad(nombre,edad);*/

        /*System.out.println("*Borrar Alumnos*");
        System.out.println("Introduzca edad: ");
        edad = in.nextInt();
        controllerBD.borrarAlumno(edad);*/
    }
}
