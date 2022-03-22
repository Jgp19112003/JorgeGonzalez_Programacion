package Idiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<Idiomas> idiomas = new ArrayList<>();

        Idiomas castellano = new Idiomas("Castellano",100) {
            @Override
            public void saludar() {
                System.out.println("Hola");
            }

            @Override
            public void despedir() {
                System.out.println("Adios");
            }
        };
        idiomas.add(castellano);
        castellano.getPalabras().add("España");
        castellano.getPalabras().add("Tiene");
        castellano.getPalabras().add("Un");
        castellano.getPalabras().add("Mundial");

        Idiomas ingles = new Idiomas("Ingles",75) {
            @Override
            public void saludar() {
                System.out.println("Hello");
            }

            @Override
            public void despedir() {
                System.out.println("Bye");
            }
        };
        idiomas.add(ingles);
        ingles.getPalabras().add("The");
        ingles.getPalabras().add("Teacher");
        ingles.getPalabras().add("Is");
        ingles.getPalabras().add("Gorgeous");


        Idiomas aleman = new Idiomas("Aleman",120) {
            @Override
            public void saludar() {
                System.out.println("Hallo");
            }

            @Override
            public void despedir() {
                System.out.println("Tschüss");
            }
        };
        idiomas.add(aleman);
        aleman.getPalabras().add("Das");
        aleman.getPalabras().add("Ist");
        aleman.getPalabras().add("Deutsch");


        for (Idiomas item: idiomas) {
            System.out.println("El saludo en "+ item.getNombre() + " es ");
            item.saludar();
            System.out.println("La despedida en "+ item.getNombre() + " es ");
            item.despedir();
            System.out.println("Las palabras en "+ item.getNombre() + " son");
            item.listarPalabras();
        }


    }
}
