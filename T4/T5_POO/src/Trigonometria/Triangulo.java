package Trigonometria;

public class Triangulo {

    private int base, altura;
    double area;


    public Triangulo(){

    }

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura= altura;
    }

    public void areaTriangulo(){

        area = (base*altura)/2;

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
}
