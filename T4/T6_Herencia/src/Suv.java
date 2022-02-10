public class Suv extends Coche{

    String traccion;

    public Suv (){}

    public Suv (String matricula, String bastidor, int cv, int cc, String traccion){
        super(matricula, bastidor, cv, cc);
        this.traccion = traccion;

    }

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        velocidad += (int)(Math.random()*8)+10;
        System.out.println(velocidad);

    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
