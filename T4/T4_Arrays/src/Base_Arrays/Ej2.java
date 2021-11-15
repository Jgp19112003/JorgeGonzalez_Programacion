package Base_Arrays;

//Ejercicio 2
public class Ej2 {
    public static void main(String[] args) {

        int[] numAleatorios = new int[30];
        double suma = 0;
        double media = 0;

        for (int i = 0; i < numAleatorios.length; i++) {
            numAleatorios[i] = (int) (Math.random()*10+1);
            System.out.println(numAleatorios[i]);
            suma = suma + numAleatorios[i];
            media = suma/30;
        }
        System.out.println("El numeros de puntos obtenidos es: "+suma);
        System.out.println("La media de puntos obtenidos es: "+media);
    }
}
