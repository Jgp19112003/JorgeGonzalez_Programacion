package CajeroBase;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    Scanner in = new Scanner(System.in);
    private String nombre, cif;
    private ArrayList<Cliente> cuentas = new ArrayList<>();

    public Banco(){

    }
    public void crearCuenta(Cliente cliente){

        cuentas.add(cliente);

    }
    public void ingresarDinero(String dni, int pin){
        int saldo_introducido;

        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getDni().equals(dni) && cuentas.get(i).getPin() == pin){

                do {
                    System.out.println("Introduce saldo a ingresar: ");
                    saldo_introducido = in.nextInt();
                    if (saldo_introducido < 0) {
                        System.out.println("El saldo intrroducido no puede ser negativo");
                    }
                }while (saldo_introducido<0);
                cuentas.get(i).setSaldo(saldo_introducido+cuentas.get(i).getSaldo_inicial()+cuentas.get(i).getSaldo());
                System.out.println("El saldo total de la cuenta es: "+ cuentas.get(i).getSaldo());
            }

        }


    }
    public void sacarDinero(String dni, int pin){

        int saldo_retitar;
        for (int i = 0; i < cuentas.size(); i++) {

            if (cuentas.get(i).getDni().equals(dni) && cuentas.get(i).getPin() == pin) {
                do {
                    System.out.println("Introduce saldo a retirar: ");
                    saldo_retitar = in.nextInt();

                    if (cuentas.get(i).getSaldo() <= (cuentas.get(i).getSaldo()+saldo_retitar)) {

                        cuentas.get(i).setSaldo(cuentas.get(i).getSaldo()-saldo_retitar);
                        System.out.println("---Dinero retirado correctamente---");
                        System.out.println("Balance actual: " + cuentas.get(i).getSaldo());

                    } else {
                        System.out.println("---Balance insuficiente---");
                    }
                }while(cuentas.get(i).getSaldo() > (cuentas.get(i).getSaldo()+saldo_retitar));

            }

        }

    }


}
