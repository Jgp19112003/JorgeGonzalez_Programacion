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

        area = (base*altura);

    }
    public void perimetroCuadrado(){

        perímetro = ((2*altura)+(2*base));

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
