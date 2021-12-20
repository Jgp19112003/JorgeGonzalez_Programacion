package HasTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class ListasHash {
    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        listaElementos.size();
        listaElementos.put("1","Elemento1");
        listaElementos.put("2","Elemento2");
        listaElementos.put("3",false);
        listaElementos.put("4",new String[]{"Cosa1","Cosa2","Cosa3"});

        System.out.println(listaElementos.size());

        String[] elementoEncontrado = (String[]) listaElementos.get("4");
        elementoEncontrado[0] = "Nuevo valor";
        listaElementos.remove("1");

        for (String item: elementoEncontrado) {
            System.out.println(item);
        }
        System.out.println("Listado elementos");
        Enumeration<Object> listaClaves= listaElementos.keys();

        while (listaClaves.hasMoreElements()){

            Object clave = listaClaves.nextElement();
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);

        }


    }
}