package Trigonometria;

public class Circulo extends Figura{

    private double radio, diametro, area;

    public Circulo(double radio){

        this.radio = radio;

    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = Math.PI * radio;

    }

    public void calcularDiametro(){
        diametro = 2 * radio;
    }
}
