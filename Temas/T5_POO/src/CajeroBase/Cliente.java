package CajeroBase;

public class Cliente {


    private String dni;
    private int isbn, pin, saldo_inicial;

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


}
