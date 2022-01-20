package HasTable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class HashGarageF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        Hashtable<String,Object[]> listaGaraje = new Hashtable();

        do {

            System.out.println("Bienvenido al garaje");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Calcular costes");
            System.out.println("5. Borrar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");

            opc = in.nextInt();

            switch (opc) {
                case 1:
                    if (listaGaraje.size() < 5) {
                        System.out.println("Que marca tiene el coche");
                        String marca = in.next();
                        System.out.println("Que modelo tiene el coche");
                        String modelo = in.next();
                        System.out.println("Que matricula tiene el coche");
                        String matricula = in.next();
                        System.out.println("Que coste tiene el coche");
                        String coste = in.next();
                        listaGaraje.size();
                        listaGaraje.put("1",new String[]{marca,modelo,matricula,coste});
                        System.out.println("Coche recepcionado");
                    } else {
                        System.out.println("No hay espacio disponible");
                    }

                    break;

                case 2:
                    Enumeration<String> listaClaves= listaGaraje.keys();

                    while (listaClaves.hasMoreElements()){

                        String clave = listaClaves.nextElement();
                        Object[] elemento = listaGaraje.get(clave);


                        for ( Object item: elemento) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Que matrícula quieres buscar");
                    String matriculaIntroducida = in.next();
                    String[] elementoEncontrado = (String[]) listaGaraje.get(matricula);
                    if (listaGaraje.contains(matriculaIntroducida)){
                        for (Object item : elementoEncontrado) {
                            System.out.println(item);
                        }
                    }else{
                        System.out.println("Coche no encontrado");
                    }

                    break;

            }
        }while(opc > 0);
    }
}
