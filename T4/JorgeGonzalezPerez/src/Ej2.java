import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double prefresco = 1.20;
        int refrescos = 0;
        double pcafe = 1;
        int cafes = 0;
        double pbocadillo = 3.20;
        int bocadillos = 0;
        double pmenu = 9.50;
        int menus = 0;
        int comensales;
        double preciototal;
        double preciopersona;
        int opc;





    do {
        System.out.printf("1.Pedir café.%n2.Pedir refresco.%n3.Pedir bocadillo.%n4.Pedir menú.%n5.Sacar la cuenta.%n");
        System.out.println("Introduce una opcion: ");

        opc = in.nextInt();
        if (opc == 1) {
            System.out.println("Introduzca el numero de cafes que desea: ");
            cafes = in.nextInt();
            if (cafes < 0) {
                System.out.println("ERROR");
            }
        }
        if (opc == 2) {
            System.out.println("Introduzca el numero de refrescos que desea: ");
            refrescos = in.nextInt();
            if (refrescos < 0) {
                System.out.println("ERROR");
            }
        }
        if (opc == 3) {
            System.out.println("Introduzca el numero de bocadillos que desea: ");
            bocadillos = in.nextInt();
            if (bocadillos < 0) {
                System.out.println("ERROR");
            }
        }
        if (opc == 4) {
            System.out.println("Introduzca el numero de menus que desea: ");
            menus = in.nextInt();
            if (menus < 0) {
                System.out.println("ERROR");
            }
        }


    }while(opc != 5);

            System.out.println("¿Para cuantos comensales?: ");
            comensales = in.nextInt();
            if (comensales < 0){
                System.out.println("ERROR");
            }
            preciototal = ((bocadillos*pbocadillo)+(refrescos*prefresco)+(menus*pmenu)+(cafes*pcafe));
            preciopersona = (preciototal/comensales);
            System.out.printf("Bocadillos: %d%n Refrescos: %d%n Menus: %d%n Cafes: %d%n Precio total: %.2f%n Precio por persona: %.2f%n ",bocadillos,refrescos,menus,cafes,preciototal,preciopersona);










    }
}
