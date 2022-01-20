package Clases;

public class Coche {

    private Motor motor;
    private String marca, modelo;
    private double precioAcumulado = 0;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;

    }
    public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acumularAveria (double precioAcumulado){

        this.precioAcumulado += precioAcumulado;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public Motor getMotor() {
        return motor;
    }
}
