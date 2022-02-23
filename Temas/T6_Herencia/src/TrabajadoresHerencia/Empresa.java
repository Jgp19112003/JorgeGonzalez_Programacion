package TrabajadoresHerencia;

import Llamadas.Llamada;
import Llamadas.LlamadaLocal;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    Scanner in = new Scanner(System.in);

    ArrayList<Trabajador>trabajadores = new ArrayList<>();

    public Empresa(){}

    public void registarTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }

    public void listarTrabajadores(int opc){


        switch (opc){
            case 1:
                for (Trabajador item : trabajadores) {

                    if (item instanceof Asalariado) {
                        System.out.println(item.nombre);
                        System.out.println(item.apellido);
                        System.out.println(item.dni);
                        System.out.println(((Asalariado) item).sueldo);
                        System.out.println(((Asalariado) item).pagas);
                    }
                }
                break;
            case 2:
                for (Trabajador item : trabajadores) {

                    if (item instanceof Autonomo) {
                        System.out.println(item.nombre);
                        System.out.println(item.apellido);
                        System.out.println(item.dni);
                        System.out.println(((Autonomo) item).sueldo);
                    }
                }
                break;
            case 3:
                for (Trabajador item : trabajadores) {
                    item.mostrarDatos();
                }
                break;


        }
    }

    public void datosTrabajador(String dni){

        for (int i = 0; i < trabajadores.size(); i++) {

                if (trabajadores.get(i).getDni().equalsIgnoreCase(dni)) {
                    trabajadores.get(i).mostrarDatos();
                } else {
                    System.out.println("El dni no existe");
                }
                break;
        }

    }


}
