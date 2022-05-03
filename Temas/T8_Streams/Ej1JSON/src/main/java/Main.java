import controller.JSONcontroller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genero;
        int numeroUsuarios;
        System.out.println("Cuantos usuarios");
        numeroUsuarios = scanner.nextInt();
        System.out.println("Que genero (male/female/ambos");
        genero = scanner.next();
        JSONcontroller controller = new JSONcontroller();
        controller.leerUsuarios(numeroUsuarios,genero);
        controller.escribirUsuarios();
        controller.leerFichero();

    }
}