package HasTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class GarageHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Hashtable<String,Object[]> listaCoches = new Hashtable();




        listaCoches.put("2456LDM",new String[]{"2456LDM","Mercedes","C200"});
        listaCoches.put("6784GGD",new String[]{"6784GGD","Audi","A5"});
        listaCoches.put("1902BLM",new String[]{"1902BLM","BMW","i8"});

        System.out.println("Listado elementos");
        Enumeration<String> listaDatos = listaCoches.keys();

        while (listaDatos.hasMoreElements()){

            String clave = listaDatos.nextElement();
            Object[] elemento = listaCoches.get(clave);


            for ( Object item: elemento) {
                System.out.println(item);
            }


        }


        System.out.println("Introduzca la matricula: ");
        String matricula = in.next();

        String[] elementoEncontrado = (String[]) listaCoches.get(matricula);

        if (listaCoches.get(matricula) != null) {
            for (Object item : elementoEncontrado) {
                System.out.println(item);
            }
        }else{
            System.out.println("El coche no esta en la lista");
        }


    }
}
