package CajeroBase;

public class Cliente {


    private String dni;
    private int isbn, pin, saldo_inicial,saldo;

    public Cliente(){

    }
    public Cliente(String dni, int isbn, int pin, int saldo_inicial){
        this.dni = dni;
        this.isbn = isbn;
        this.pin = pin;
        this.saldo_inicial = saldo_inicial;
    }
    public Cliente(String dni,int pin, int saldo_inicial){
        this.dni = dni;
        this.pin = pin;
        this.saldo_inicial = saldo_inicial;
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

    public int getSaldo_inicial() {
        return saldo_inicial;
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

    public void setSaldo_inicial(int saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
