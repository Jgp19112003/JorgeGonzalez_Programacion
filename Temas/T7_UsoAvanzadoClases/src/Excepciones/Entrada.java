package Excepciones;

public class Entrada {
    public static void main(String[] args) {

        String palabra = null;
        String[] palabras = new String[]{"Uno","Dos","Tres","Cuatro"};

        try {
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        }catch (NullPointerException e) {
            System.out.println("La palabra es nula");

        } catch (IndexOutOfBoundsException e){
            System.out.println("LA posicion es nula");
        }
        finally {
            System.out.println("Ejecucuion obligatoria");
        }
        System.out.println("Bloque final");
    }
}
