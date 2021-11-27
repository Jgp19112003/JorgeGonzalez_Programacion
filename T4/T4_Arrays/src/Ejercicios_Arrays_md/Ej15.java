package Ejercicios_Arrays_md;

public class Ej15 {
    public static void main(String[] args) {
        Object[][] alumnos = new Object[3][5];


        alumnos[0][0] = "Borja";
        alumnos[0][1] = 6;
        alumnos[0][2] = 5;
        alumnos[0][3] = 7;
        alumnos[0][4] = false;

        alumnos[1][0] = "Pedro";
        alumnos[1][1] = 4;
        alumnos[1][2] = 7;
        alumnos[1][3] = 9;
        alumnos[1][4] = true;

        alumnos[2][0] = "Jose";
        alumnos[2][1] = 7;
        alumnos[2][2] = 1;
        alumnos[2][3] = 2;
        alumnos[2][4] = true;

        double media;
        int suspensas = 0;
        int suma = 0;
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 1; j < alumnos[i].length - 1; j++) {
                suma += (int) alumnos[i][j];
                if ((int) alumnos[i][j] < 5) {
                    suspensas++;
                }
            }
            media = (double) suma / (double) 3;
            boolean conv = (boolean) (alumnos[i][alumnos[i].length - 1]);
            String nombre = (String) alumnos[i][0];
            if (conv == true) {
                System.out.printf("%s tiene una media de %.2f, tiene %d asignaturas suspensas y tiene asignaturas convalidadas", nombre, media, suspensas);
            } else {
                System.out.printf("%s tiene una media de %.2f, tiene %d asignaturas suspensas y no tiene asignaturas convalidadas", nombre, media, suspensas);
            }

        }
    }
}




