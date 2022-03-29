package Ej1Repaso;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_aleatorio = (int) (Math.random() * 7 + 1);
        int num_introducido = 0;



            do {
                try {
                System.out.println("Introduce un numero para adivanr el numero secrerto: ");
                num_introducido = in.nextInt();
                if (num_aleatorio == num_introducido) {
                    System.out.println("Enhorabuena, el numero secreto era el: " + num_aleatorio);
                } else {
                    System.out.println("Numero incorrecto");
                }
                } catch (InputMismatchException e) {

                    System.out.println("ERROR: El dígito introducido es incorrecto");
                    System.out.println("Introduce un numero para adivanr el numero secrerto: ");
                    in.next();  num_introducido = in.nextInt();
                }

            } while (num_aleatorio != num_introducido);


    }
}
