package Ejercicios_Arrays_md;
public class Ej1 {
    public static void main(String[] args) {

        int[] numAleatorios = new int[5];

        for (int i = 0; i < numAleatorios.length; i++) {
            numAleatorios[i] = (int) (Math.random()*41+10);
            System.out.println(numAleatorios[i]);

        }

        for (int i = 0; i < numAleatorios.length ; i++) {
            System.out.println(numAleatorios[i]);
        }



    }
}

