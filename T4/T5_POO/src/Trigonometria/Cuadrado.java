package Trigonometria;

public class Cuadrado {

    private int base, altura;
    double area, perímetro;

    public Cuadrado(){

    }

    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura= altura;
    }

    public void areaCuadrado(){

        this.area = (this.base*this.altura);

    }
    public void perimetroCuadrado(){

        this.perímetro = ((2*this.altura)+(2*this.base));

    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public double getPerímetro() {
        return perímetro;
    }
}
