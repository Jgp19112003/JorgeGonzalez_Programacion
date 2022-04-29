import controller.JSONcontroller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ciclo;
        int curso;

       /* System.out.println("Introduzca curso: ");
        curso = in.nextInt();
        System.out.println("Introduzca ciclo: ");
        ciclo = in.next();*/

        JSONcontroller controller = new JSONcontroller();
        /*controller.mostrarAsignaturaUsuario(curso,ciclo);*/
        controller.lecturaJSONAPI();


    }
}
