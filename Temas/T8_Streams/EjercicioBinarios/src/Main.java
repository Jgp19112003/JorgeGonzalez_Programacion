import java.util.Scanner;
import controllerej.BinariosController;
import modelej.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BinariosController binariosController = new BinariosController();
        String nombre, apellido, password;
        int opc,opclectura;
        do {
        System.out.println("¿Qué quiere hacer?  1. Introducir usuario   0. Parar de introducir ");
        opc = in.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Introduzca nombre: ");
                    nombre = in.next();
                    System.out.println("Introduzca apellido: ");
                    apellido = in.next();
                    System.out.println("Introduzca password: ");
                    password = in.next();
                    Usuario u1 = new Usuario(nombre,apellido,password);
                    binariosController.addUsuario(u1);
                    System.out.println("Usuario registrado");
                    break;

                case 0:
                    break;
            }
        }while (opc != 0);
        binariosController.escrituraUsuario();

        System.out.println("¿Quieres leer el fichero? 1. Si  2. No");
        opclectura = in.nextInt();
        if (opclectura == 1){
            binariosController.lecturaUsuarios();
        } else {
            System.out.println("No se quiere leer el fichero");
        }
        System.out.println("Programa terminado");

    }
}
