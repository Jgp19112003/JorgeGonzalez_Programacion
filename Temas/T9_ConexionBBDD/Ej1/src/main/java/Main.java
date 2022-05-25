import controller.GestionDB;
import model.Perfil;
import model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        GestionDB gestionDB = new GestionDB();

        gestionDB.insertarUsuarios();

        /*
        Perfil p1 = new Perfil(1,"trabajador");
        gestionDB.insertarPerfiles(p1);
        Perfil p2 = new Perfil(2,"director");
        gestionDB.insertarPerfiles(p2);
        Perfil p3 = new Perfil(3,"gerente");
        gestionDB.insertarPerfiles(p3);*/

       /* gestionDB.actualizarEspañoles();*/
    }
}
