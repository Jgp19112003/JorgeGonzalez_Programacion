package Trigonometria;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

    /* De esta formal creas un circulo de tipo circulo, triangulo de tipo triangulo y el rectangulo de tipo rectangulo */
    Circulo circulo = new Circulo(7);
    Rectangulo rectangulo = new Rectangulo(2, 4);
    Triangulo triangulo = new Triangulo(2, 6);


        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularDiametro());

        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

        System.out.println(triangulo.calcularArea());

        /* De la otra forma en la que añades circulo,triangulo y rectangulo de tipo figura */
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(rectangulo);
        figuras.add(triangulo);
        figuras.add(circulo);

        for ( Figura item: figuras) {

            System.out.println(item.calcularArea());
            if (item instanceof Circulo){
                ((Circulo) item).calcularDiametro();
            }

        }


        }
    }

