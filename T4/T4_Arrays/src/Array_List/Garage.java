package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opc;
        String marca,modelo,matricula;
        ArrayList<Object[]> coches = new ArrayList<>();









        do {
            System.out.println("Que quieres hacer : ");
            opc = in.nextInt();
            if (opc == 1) {
                System.out.println("Introduzca los datos del coche");
                System.out.println("Marca: ");
                marca = in.next();
                System.out.println("Modelo: ");
                modelo = in.next();
                System.out.println("Mátricula: ");
                matricula = in.next();

                Object[] coche1 = new Object[]{marca, modelo, matricula};
                coches.add(coche1);


            }
            for (Object[] coche : coches) {

                for (Object item : coche) {
                    System.out.print(item + "\t");
                }
                System.out.println();


                if (opc == 2) {
                        for (Object item : coche) {
                            System.out.print(item + "\t");
                        }
                        System.out.println();

                }

                if (opc == 3) {
                    System.out.println("Introduzca matricula ");
                    matricula = in.next();
                        if (((String)coche[0]).equalsIgnoreCase(matricula)) {
                            for (Object item : coche) {
                                System.out.print(item + "\t");
                            }
                            System.out.println();
                        }


                }
            }


        }while (opc >= 1);



    }
}
