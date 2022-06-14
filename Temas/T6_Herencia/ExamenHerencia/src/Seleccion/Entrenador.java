package Seleccion;

public class Entrenador extends Persona{

    String vocacion;

    public Entrenador(){};

    public Entrenador(String nombre, String apellido, String dni, int edad,String vocacion, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.vocacion = vocacion;
        this.sueldo = sueldo+(sueldo/4);
        this.edad = edad;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(vocacion);
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}
