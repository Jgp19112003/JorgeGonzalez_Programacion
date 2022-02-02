package CajeroBase;

public class Cliente {


    private String dni;
    private int isbn, pin,saldo;

    public Cliente(){

    }
    public Cliente(String dni, int isbn, int pin, int saldo){
        this.dni = dni;
        this.isbn = isbn;
        this.pin = pin;
        this.saldo = saldo;

    }
    public Cliente(String dni,int pin, int saldo){
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
    }


    public String getDni() {
        return dni;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPin() {
        return pin;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
