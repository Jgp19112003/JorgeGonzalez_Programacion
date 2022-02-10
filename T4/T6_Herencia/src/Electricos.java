public class Electricos extends Coche{

    private int bateria;

    public Electricos (){}

    public Electricos (String matricula, String bastidor, int cv, int cc, int bateria ){
        super(matricula, bastidor, cv, cc);
        this.bateria = bateria;

    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        velocidad += (int)(Math.random()*11)+20;
        System.out.println(velocidad);

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(bateria);
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
