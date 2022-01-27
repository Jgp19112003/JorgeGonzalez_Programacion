package Agenda;

public class Persona {

    private String dni , nombre;
    private int telefono;

    public Persona(){

    }
    public Persona(String dni, String nombre, int telefono){

        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;

    }

    public void mostrarDatos(){

        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);
        System.out.println("Telefono: "+telefono);


    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
