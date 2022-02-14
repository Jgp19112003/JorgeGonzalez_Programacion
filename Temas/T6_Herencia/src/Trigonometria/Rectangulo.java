package Trigonometria;

public class Rectangulo extends Figura{

    private int base, altura;
    private double area, perímetro;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = base * altura;
    }
}
