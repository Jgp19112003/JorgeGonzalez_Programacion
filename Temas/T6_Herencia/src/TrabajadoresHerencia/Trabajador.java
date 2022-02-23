package TrabajadoresHerencia;

public class Trabajador {

    String nombre, apellido, dni;

    public Trabajador(){}

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);
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
}
