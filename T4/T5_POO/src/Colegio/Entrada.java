package Colegio;

public class Entrada {

    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno jorge = new Alumno(asignatura1,asignatura2,asignatura3);

        Profesor profesor1 = new Profesor();

        profesor1.ponerNota(jorge);

        System.out.println("La nota de la primera asignatura es: "+jorge.getAsignatura1().getCalificacion());
        System.out.println("La nota de la segunda asigntura es: "+jorge.getAsignatura2().getCalificacion());
        System.out.println("La nota de la tercera asignatura es: "+jorge.getAsignatura3().getCalificacion());
        System.out.println("La media de las notas es: "+profesor1.calcularMedia(jorge));

    }
}
