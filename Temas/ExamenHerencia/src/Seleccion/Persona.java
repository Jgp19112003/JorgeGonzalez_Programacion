package Seleccion;

public class Persona {

    String nombre, apellido, dni;
    int edad;
    double sueldo;

    public Persona(){}

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);
        System.out.println(edad);
        System.out.println(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
