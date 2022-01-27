package Array_List;

import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {

        ArrayList<String> listaPersonas = new ArrayList<>();

        listaPersonas.add("Pepe");
        listaPersonas.add("Juan");
        listaPersonas.add("Lucas");
        listaPersonas.add("Raúl");
        listaPersonas.add("Sergio");


        int randm = (int) (Math.random()* listaPersonas.size()+1);
        System.out.println(listaPersonas.get(randm));

    }
}
