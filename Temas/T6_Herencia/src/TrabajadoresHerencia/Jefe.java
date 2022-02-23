package TrabajadoresHerencia;

public class Jefe extends Trabajador{

    int acciones, beneficio;


    public Jefe(){}

    public Jefe(String nombre, String apellido, String dni, int acciones, int beneficio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.acciones = acciones;
        this.beneficio = beneficio;

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(acciones);
        System.out.println(beneficio);
    }


    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
}
