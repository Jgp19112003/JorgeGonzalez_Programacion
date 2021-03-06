package TrabajadoresHerencia;

public class Autonomo extends Trabajador{


    int sueldo;
    boolean contratado;


    public Autonomo(){}

    public Autonomo(String nombre,String apellido,String dni,int sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(sueldo);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
