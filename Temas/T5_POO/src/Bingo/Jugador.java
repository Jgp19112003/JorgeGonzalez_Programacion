package Bingo;

public class Jugador {

    private String dni, nombre;
    private int saldo, cartones;

    public Jugador (){

    }

    public Jugador(String dni, String nombre, int saldo, int cartones){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.cartones = cartones;

    }
    public Jugador(String nombre,String dni, int saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo =saldo;
    }


    public void mostrarDatos(){


        System.out.println("Nombre: "+nombre);
        System.out.println("Saldo: "+saldo);
        System.out.println("Cartones: "+cartones);


    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getCartones() {
        return cartones;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setCartones(int cartones) {
        this.cartones = cartones;
    }
}
