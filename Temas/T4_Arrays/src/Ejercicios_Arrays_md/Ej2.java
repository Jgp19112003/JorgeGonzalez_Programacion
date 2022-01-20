package Ejercicios_Arrays_md;
public class Ej2 {
    public static void main(String[] args) {

        String temas[] = {"Introducción", "Estructuras de datos", "Estructuras", "Array_List.Colecciones", "Orientación a objetos",
                "Clases y Objetos", "Abstracción, Herencia y Polimorfismo", "Ficheros y Excepciones", "Bases de datos", "Interfaces"};


        System.out.println("SALIDA");
        System.out.println("````");
        System.out.println("Numero de temas: 10");

        for (int i = 0; i < temas.length; i++) {

                System.out.printf("Tema %d: %s%n",i+1,temas[i]);

        }
        System.out.println("````");





    }
}
