package Ejercicios_Arrays_md;
import java.util.Scanner;
public class SumaAristas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fila,columnas;
        int sumaFila1 = 0, sumaFilaN = 0,sumaColumna1 = 0,sumaColumnaN = 0;

        System.out.println("De cuantas filas desea que sea su array: ");
        fila = in.nextInt();

        System.out.println("De cuantas columnas desea que sea su array: ");
        columnas = in.nextInt();

        int[][] nums = new int[fila][columnas];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] =(int) (Math.random()*21);
                System.out.print(nums[i][j]+"\t ");
            }
            System.out.printf("%n");
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i==0){
                    sumaFila1 += nums[i][j];
                }
                if (i == fila-1){
                    sumaFilaN += nums[i][j];
                }
                if (j==0){
                    sumaColumna1 += nums[i][j];
                }
                if (j == columnas -1){
                    sumaColumnaN += nums[i][j];
                }

            }

        }
        System.out.println("La suma de la primera fila es: "+sumaFila1);
        System.out.println("La suma de la ultima fila es: "+sumaFilaN);
        System.out.println("La suma de la primera columna es: "+sumaColumna1);
        System.out.println("La suma de la ulrima columna es: "+sumaColumnaN);
    }
}
