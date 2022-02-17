package Trigonometria;

public final class Circulo extends Figura{

    private double radio, diametro, area;

    public Circulo(){}

    public Circulo(double radio){

        this.radio = radio;

    }

    @Override
    public double calcularArea() {

        area = Math.PI * Math.pow(radio,2);
        return area;

    }

    public double calcularDiametro(){
        diametro = 2 * radio;
        return diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
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
