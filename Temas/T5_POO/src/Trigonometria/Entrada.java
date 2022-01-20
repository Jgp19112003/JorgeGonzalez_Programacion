package Trigonometria;
import java.util.Scanner;
public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;

        System.out.println("Eliga una opcion: ");
        opc = in.nextInt();

        switch (opc){

            case 1:   = "Lunes";
                break;
            case 2:   = "Martes";
                break;
            case 3:   = "Miercoles";
                break;
            case 4:   = "Jueves";
                break;
            case 5:   = "Viernes";
                break;
            case 6:   = "Sabado";
                break;
            case 7:   = "Domingo";
                break;
            default:  = "Dia inválido";
                break;
        }


        Triangulo t1 = new Triangulo(2,5);
        Circulo cir1 = new Circulo(5);
        Cuadrado c1 = new Cuadrado(4,8);

        t1.areaTriangulo();
        System.out.println("El area del triangulo es: "+t1.getArea());

        cir1.areaCirculo();
        System.out.println("El area del circulo es: "+cir1.getArea());
        cir1.diametroCirculo();
        System.out.println("El diametro del circulo es: "+cir1.getDiametro());

        c1.areaCuadrado();
        System.out.println("El area del triangulo es: "+c1.getArea());
        c1.perimetroCuadrado();
        System.out.println("El perimetro del triangulo es: "+c1.getPerímetro());
    }
}
