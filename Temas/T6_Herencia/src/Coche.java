public class Coche {

    protected String matricula, bastidor;
    protected int velocidad, cv, cc;

    public Coche(String matricula, String bastidor, int cv, int cc){

        this.matricula = matricula;
        this.bastidor = bastidor;
        this.cv = cv;
        this.cc = cc;
    }

    public Coche (){}

    public void  calcularVelocidad (int velocidad){
        this.velocidad += velocidad;
    }
    public void mostrarDatos(){
        System.out.println(matricula);
        System.out.println(bastidor);
        System.out.println(cv);
        System.out.println(cc);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
