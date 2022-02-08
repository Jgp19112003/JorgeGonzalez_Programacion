package Bingo;

import java.util.ArrayList;
import java.util.Scanner;


public class Carton {
    Scanner in = new Scanner(System.in);
    private int id, aciertos;
    private final int precio = 1;
    private ArrayList<Jugador> jugadores = new ArrayList<>();


    public Carton() {

    }


    public void crearJugador(Jugador jugador) {

        jugadores.add(jugador);

    }

    public void comprarCartones(String dni) {

        int cartones_comprar;

        for (int i = 0; i < jugadores.size(); i++) {

            if (jugadores.get(i).getDni().equalsIgnoreCase(dni)) {
                do {
                    System.out.println("Introduce cartones para comprar: ");
                    cartones_comprar = in.nextInt();
                    if (cartones_comprar < 0) {
                        System.out.println("El numero introducido es incorrecto");
                    }
                    if (jugadores.get(i).getSaldo() < cartones_comprar) {
                        System.out.println("Saldo insuficiente");
                    }
                } while (cartones_comprar < 0 || jugadores.get(i).getSaldo() < cartones_comprar);

                jugadores.get(i).setCartones(cartones_comprar +jugadores.get(i).getCartones());
                System.out.println("El numero de cartones total es : " + jugadores.get(i).getCartones());
                jugadores.get(i).setSaldo(jugadores.get(i).getSaldo()-cartones_comprar);
                System.out.println("El saldo actual es de: "+jugadores.get(i).getSaldo());


            }
        }



    }

    public void iniciarJuego() {

        for (int i = 0; i < jugadores.size(); i++) {
            int[] nums = new int[jugadores.get(i).getCartones()];
            int[] cartones = new int[jugadores.get(i).getCartones()];
            nums[i] = (int) (Math.random() * 5 + 1);
            cartones[i] = (int) (Math.random() * 5 + 1);
            for (int j = 0; j < cartones.length; j++) {
                if (nums[i] == cartones[j]){
                    System.out.println("El numero premiado es el : "+ nums[i]);
                }
            }
        }
    }






    public int getId() {
        return id;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
}
