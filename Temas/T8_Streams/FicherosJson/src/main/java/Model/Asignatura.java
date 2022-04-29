package Model;

import java.util.Arrays;

public class Asignatura {

    private  String nombre, ciclo, siglas;
    private String[] conocimientos;
    private int hora, curso;
    private Profesor profesor;

    public Asignatura (){}

    public Asignatura(String nombre, String ciclo, String siglas, String[] conocimientos, int hora, int curso, Profesor profesor) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.siglas = siglas;
        this.conocimientos = conocimientos;
        this.hora = hora;
        this.curso = curso;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String[] getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String[] conocimientos) {
        this.conocimientos = conocimientos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", siglas='" + siglas + '\'' +
                ", conocimientos=" + Arrays.toString(conocimientos) +
                ", hora=" + hora +
                ", curso=" + curso +
                ", profesor=" + profesor +
                '}';
    }
}
