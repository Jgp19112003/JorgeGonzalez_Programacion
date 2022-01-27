package Array_List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Object palabra;
        Object datosust;

        ArrayList listaCosas = new ArrayList();

        listaCosas.add(5);
        int tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Borja");
        tamanio = listaCosas.size();
        System.out.println(tamanio);
        int numero =  (int)listaCosas.get(0);
        System.out.println(numero);
        String  nombre =  (String)listaCosas.get(1);
        System.out.println(nombre);

        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("Hola");
        listaCosas.add("true");
        listaCosas.add(34567);


        System.out.println("¿Que palabra quiere buscar?: ");
        palabra = in.next();

        boolean contiene = listaCosas.contains(palabra);

        if (contiene){
            System.out.println(("Palabra encontrada en la posicion "+listaCosas.indexOf(contiene)));
            System.out.println("¿Porque dato lo quiere sustiruir?");
            datosust = in.next();
            listaCosas.set( listaCosas.indexOf(contiene)-1, datosust);
        }
        else{
            System.out.println("No contiene ese dato");
            listaCosas.add(palabra);
        }


        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.printf("%d- ",i+1);
            System.out.println(listaCosas.get(i));

        }


        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(0.9);
        listaCosas.add(6);
        listaCosas.add("Hola");
        listaCosas.add(6);
        listaCosas.add(":)");
        listaCosas.add(6);
        listaCosas.add(true);
        listaCosas.add(34567);
        listaCosas.add(6);

       /* for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals(6)){
                listaCosas.remove(i);
            }

        }*/
        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(6);
            }
        });
        System.out.println(listaCosas);








        /*int posiciones = 1;
        for ( Object item: listaCosas) {
            System.out.println(posiciones + "-"+item);
            posiciones++;
        }
         */
    }
}
