import controller.GestionDB;
import model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        GestionDB gestionDB = new GestionDB();

        Usuario u1 = new Usuario("Jorge","González","España",1,645239745,10000,1);
        gestionDB.insertarUsuarios(u1);
        Usuario u2 = new Usuario("Alex","Aguado","España",2,687193070,5000,2);
        gestionDB.insertarUsuarios(u2);
        Usuario u3 = new Usuario("Andrés","Zamarreño","España",3,610992033,7000,3);
        gestionDB.insertarUsuarios(u3);
    }
}
