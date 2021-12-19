package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        ArrayList<Object[]> listaAgenda = new ArrayList();


        do {

            System.out.println("Bienvenido a la agenda, eliga una opcion: ");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Cerrar agenda");

            opc = in.nextInt();
            switch (opc) {
                case 1:
                    boolean encontrado2 = false;
                    System.out.println("Nombre del contacto: ");
                    String nombre = in.next();
                    System.out.println("Apellido del contacto: ");
                    String apellido = in.next();
                    System.out.println("Telefono del contacto: ");
                    int telefono = in.nextInt();
                    System.out.println("DNI del contacto: ");
                    String dni = in.next();
                    if (listaAgenda.size()>0) {
                        for (Object[] item : listaAgenda) {
                            if (dni.equalsIgnoreCase((String) item[3])) {
                               encontrado2 = true;
                            }
                        }
                        if (encontrado2){
                            System.out.println("Dni existente");
                        }else{
                            Object[] num = new Object[]{nombre, apellido, telefono, dni};
                            System.out.println("Numero recepcionado");
                            listaAgenda.add(num);
                        }

                    }else{
                        Object[] num = new Object[]{nombre, apellido, telefono, dni};
                        System.out.println("Numero recepcionado");
                        listaAgenda.add(num);
                    }

                    break;

                case 2:
                    System.out.println("Que dni quieres buscar");
                    String dnibuscado = in.next();
                    boolean encontrado = false;

                    for (Object[] item : listaAgenda) {

                        if (item[3].toString().equalsIgnoreCase(dnibuscado)) {
                            encontrado = true;
                            System.out.println("Nombre: " + item[0]
                                    + "\tApellido: " + item[1]
                                    + "\tNumero: " + item[2]
                                    + "\tDni: " + item[3]);

                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El numero no está en la agenda");
                    }
                    break;
                case 3:
                    System.out.println("Que dni quieres buscar");
                    dnibuscado = in.next();
                    encontrado = false;

                    for (int i = 0; i < listaAgenda.size(); i++) {
                        if (listaAgenda.get(i)[3].toString().equalsIgnoreCase(dnibuscado)) {
                            System.out.println("Usuario borrado");
                            encontrado = true;
                            listaAgenda.remove(i);
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Dni no encontrado en la agenda");
                    }

                    break;
                case 4:

                    if (listaAgenda.size() > 0) {
                        for (Object[] coche : listaAgenda) {
                            System.out.println("Nombre: " + coche[0]
                                    + "\tApellidos: " + coche[1]
                                    + "\tTelefono: " + coche[2]
                                    + "\tDni: " + coche[3]);
                        }
                    } else {
                        System.out.println("No hay usuarios en la agenda");
                    }

                    break;


            }



        }while (opc != 5) ;

        System.out.println("Agenda cerrada");

    }
}
