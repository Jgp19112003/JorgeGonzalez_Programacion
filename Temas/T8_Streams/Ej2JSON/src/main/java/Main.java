import controller.JSONcontroller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int id;

        JSONcontroller jsoNcontroller = new JSONcontroller();

        System.out.println("4328. English Premier League");
        System.out.println("4331. German Bundesliga");
        System.out.println("4332. Italian Serie A");
        System.out.println("4334. French Ligue 1");
        System.out.println("4335. Spanish La Liga");

        System.out.println("Introduzca el id de la liga que quiere consultar: ");
        id = in.nextInt();
        jsoNcontroller.leerLigas(id);
        jsoNcontroller.escribirEquipos();
        jsoNcontroller.leerFichero();



    }
}
