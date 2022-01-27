package CajeroBase;

import java.util.ArrayList;

public class Banco {

    private String nombre, cif;
    private ArrayList<Cliente> cuentas = new ArrayList<>();

    public Banco(){

    }
    public void crearCuenta(Cliente cliente){

        this.cuentas.add(cliente);

    }


}
