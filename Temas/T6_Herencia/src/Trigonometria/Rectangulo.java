package Trigonometria;

public final class Rectangulo extends Figura{

    private int base, altura;
    private double area, perímetro;

    public Rectangulo(){}


    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {

        area = base * altura;
        return area;
    }

    public double calcularPerimetro(){
        perímetro = (2*(base+altura));
        return perímetro;
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

    public double getPerímetro() {
        return perímetro;
    }

    public void setPerímetro(double perímetro) {
        this.perímetro = perímetro;
    }
}
