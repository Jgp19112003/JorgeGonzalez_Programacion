public class Arrays {
    public static void main(String[] args) {
        //array numeros
        int[] numeros = new int[10];
        int[] numaleatorio = new int [15];
        int [] numerosDos = {1,2,3,4,5,6,7,8,9,10};
       boolean[] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double[] decimales = new double[2];
        int pares = 0;
        int impares = 0;

        int longuitudArray = numerosDos.length;

        for (int i = 0; i < numerosDos.length; i++) {

            System.out.println(numerosDos [i]);
        }

        numerosDos[7] = 88;

        System.out.println("Modfico una posicion");

        for (int i = 0; i < numerosDos.length; i++) {

            System.out.println(numerosDos [i]);
        }
        //meter en un array de 15 posiciones 15 numeros aleatorios entre 0-50
        System.out.println("Aleatorios");

        for (int i = 0; i < 15; i++) {
            numaleatorio [i] = (int) (Math.random()*51);
            System.out.println(numaleatorio[i]);
        }
        for (int i = 0; i < numaleatorio.length ; i++) {

            if(numaleatorio[i] %2==0){
                pares++;
            }
            else{
                impares++;
            }

        }
        System.out.printf("Hay %d pares",pares);
        System.out.printf("Hay %d impares",impares);



    }
}
