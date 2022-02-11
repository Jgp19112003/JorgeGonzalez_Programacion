import java.util.Scanner;
public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        String matricula, bastidor;
        int velocidad, cv, cc;
        Concesionario c1 = new Concesionario();
        do {
            System.out.println("Elige una opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("inttroduce matricula: ");
                    matricula = in.next();
                    System.out.println("inttroduce bastidor: ");
                    bastidor = in.next();
                    System.out.println("inttroduce cv: ");
                    cv = in.nextInt();
                    System.out.println("inttroduce cc: ");
                    cc = in.nextInt();
                    Coche coche = new Coche(matricula, bastidor, cv, cc);
                    c1.agregarCoche(coche);

                    break;

                case 2:
                    System.out.println("inttroduce matricula: ");
                    matricula = in.next();
                    c1.buscarCoche(matricula);

                    break;

            }
        }while (opc != 0);

    }
}
