package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String marca;
        Object[] coche1 = new Object[]{"Mercedes","C220",250};
        Object[] coche2 = new Object[]{"Audi","A330",350};
        Object[] coche3 = new Object[]{"Ford","Focus",150};

        ArrayList<Object[]> coches = new ArrayList<>();

        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        System.out.println("¿Qué marca desea buscar? ");
        marca = in.next();


        for (Object[] coche: coches) {
            //System.out.println(" Modelo: "+coche[0] +" Marca: "+coche[1]+ " CV: "+coche[2]);
            if (((String)coche[0]).equalsIgnoreCase(marca)) {
                for (Object item : coche) {
                    System.out.print(item + "\t");
                }
                System.out.println();
            }
        }



    }
}
