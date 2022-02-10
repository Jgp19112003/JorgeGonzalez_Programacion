public class Entrada {

    public static void main(String[] args) {
        Coche coche = new Coche("1234A","123",100,2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        Deportivo deportivo = new Deportivo("234B","234",200,5000,600);
        deportivo.calcularVelocidad(100);
        deportivo.mostrarDatos();
        Electricos electricos = new Electricos("234B","234",200,5000,600);
        electricos.calcularVelocidad(100);
        electricos.mostrarDatos();
        Suv suv = new Suv("234B","234",200,5000,"Trasera");
        suv.calcularVelocidad(100);
        suv.mostrarDatos();

    }
}
