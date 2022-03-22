package CocheAnidado;

public final class Coche {

    private int  velocidad;
    private double precio;
    private String marca, modelo;
    private Motor motor;

    public Coche(){}

    public Coche(int precio, int velocidad, String marca, String modelo) {
        this.precio = precio;
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }


    public void mostrarDatos (){
        System.out.println(precio);
        System.out.println(velocidad);
        System.out.println(marca);
        System.out.println(modelo);
        if (this.motor == null){
            System.out.println("El coche no tiene motor");
        }
        else {
            motor.mostrarDatos();
        }
    }


    class Motor{
        int cv,cc;

        public Motor(){}

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }
        public void mostrarDatos(){
            System.out.println(cv);
            System.out.println(cc);
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.cv < 50 && motor.cv > 0){
            this.precio = (precio * 0.25) + precio;
        }
        if (motor.cv < 100 && motor.cv > 50){
            this.precio = (precio * 0.40) + precio;
        }
        if (motor.cv < 200 && motor.cv > 100){
            this.precio = (precio * 0.60) + precio;
        }
        if (motor.cv > 200){
            this.precio = (precio * 0.80) + precio;
        }

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
