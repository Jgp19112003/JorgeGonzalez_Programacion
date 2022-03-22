package CocheAnidado;

public class Entrada {
    public static void main(String[] args) {


        Coche coche1 = new Coche(10000,200,"BMW","320");
        Coche coche2 = new Coche(10000,200,"BMW","320");
        Coche.Motor motor1 = coche1.new Motor(225,1800);

        coche1.mostrarDatos();
        coche2.mostrarDatos();


    }
}
