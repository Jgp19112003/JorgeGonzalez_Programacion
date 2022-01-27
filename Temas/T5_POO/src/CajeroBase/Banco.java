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

                System.out.println("Introduce saldo a ingresar: ");
                saldo_introducido = in.nextInt();
                cuentas.get(i).setSaldo(saldo_introducido+cuentas.get(i).getSaldo_inicial()+cuentas.get(i).getSaldo());
                System.out.println("El saldo total de la cuenta es: "+ cuentas.get(i).getSaldo());
            }

        }


    }


}
