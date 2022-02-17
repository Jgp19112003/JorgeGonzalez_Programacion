package Trigonometria;

public final class Triangulo extends Figura{

    private int base, altura;
    private double area;

    public Triangulo(){}


    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        area = (base * altura) / 2;
        return area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }
}
