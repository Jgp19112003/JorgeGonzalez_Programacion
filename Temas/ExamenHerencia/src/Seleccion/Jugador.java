package Seleccion;

public class Jugador extends Persona{

    String posicion;

    public Jugador(){}

    public Jugador(String nombre, String apellido, String dni, int edad,String posicion, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.posicion = posicion;
        this.sueldo = sueldo+(sueldo/2);
        this.edad = edad;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
