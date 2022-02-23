package TrabajadoresHerencia;

public class Asalariado extends Trabajador{

    int sueldo, pagas;
    boolean contratado;

    public Asalariado(){}

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int pagas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.pagas = pagas;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(sueldo);
        System.out.println(pagas);
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
