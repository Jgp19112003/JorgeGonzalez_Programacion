package Trigonometria;

public class Circulo {
    private double radio, diametro, area;

    public Circulo(){

    }

    public Circulo(double radio){
        this.radio = radio;

    }
    public void areaCirculo(){

        this.area = (3.141592*Math.pow(this.radio,2));

    }
    public void diametroCirculo(){

        this.diametro = (2*this.radio);

    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }
}
