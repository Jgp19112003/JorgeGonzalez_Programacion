package Ej2Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public final class Cuenta {
    Scanner in = new Scanner(System.in);

    private int id, pin, saldo;
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cuenta(){}

    public Cuenta(int id, int pin, int saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    public void crearCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public void ingresarDinero(int id, int pin){
        int saldo_introducido;

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getId() == id && cuentas.get(i).getPin() == pin){

                do {
                    System.out.println("Introduce saldo a ingresar: ");
                    saldo_introducido = in.nextInt();
                    if (saldo_introducido < 0) {
                        System.out.println("El saldo introducido no puede ser negativo");
                    }
                }while (saldo_introducido<0);
                cuentas.get(i).setSaldo(saldo_introducido+cuentas.get(i).getSaldo());
                System.out.println("El saldo total de la cuenta es: "+ cuentas.get(i).getSaldo());
            }

        }
    }

    public void sacarDinero(int id, int pin){

        int saldo_retitar;
        boolean sacar_todo = false;
        String respuesta;
        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getId() == id && cuentas.get(i).getPin() == pin) {
                do {
                    System.out.println("Introduce saldo a retirar: ");
                    saldo_retitar = in.nextInt();

                    if (cuentas.get(i).getSaldo() >= (saldo_retitar)) {

                        cuentas.get(i).setSaldo(cuentas.get(i).getSaldo()-saldo_retitar);
                        System.out.println("---Dinero retirado correctamente---");
                        System.out.println("Balance actual: " + cuentas.get(i).getSaldo());

                    } else {
                        System.out.println("---Balance insuficiente---");
                        System.out.println("¿Desea sacar todo el dinero?");
                        respuesta = in.next();
                        if (respuesta.equalsIgnoreCase("si")){
                            sacar_todo = true;
                        }else {
                            sacar_todo = false;
                        }
                        if (sacar_todo){
                            cuentas.get(i).setSaldo(cuentas.get(i).getSaldo()-cuentas.get(i).getSaldo());
                            System.out.println("---Dinero retirado correctamente---");
                            System.out.println("Balance actual: " + cuentas.get(i).getSaldo());
                        }
                    }
                }while(cuentas.get(i).getSaldo() > (cuentas.get(i).getSaldo()+saldo_retitar));

            }

        }

    }

    public void verSaldo(int id, int pin){
        for (Cuenta item: cuentas) {
            if (item.getId() == id && item.getPin() == pin) {
                System.out.println("Su balance actual es de : "+item.getSaldo());
            }
        }
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
