package BEj1;

public class Usuario {

    private String nombre , apellido , dni;
    private int edad, altura;
    private double peso;

        //constructores

        public Usuario (String nombre, String apellido, String dni, int edad, double peso, int altura){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.edad = edad;
            this.peso = peso;
            this.altura = altura;
        }

        public Usuario (String nombre, String apellido, String dni, int edad){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.edad = edad;
        }

        public Usuario (String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = "111111111X";
            this.edad = 0;
            this.peso = 0;
            this.altura = 0;
        }

        public Usuario (){
            this.nombre = "";
            this.apellido = "";
            this.dni = "111111111X";
            this.edad = 0;
            this.peso = 0;
            this.altura = 0;
        }


        //metodos
        public void mostrarDatos(){

            System.out.println("Nombre: "+nombre);
            System.out.println("Apellido: "+apellido);
            System.out.println("Dni: "+dni);
            System.out.println("Edad: "+edad);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);

        }

        //setters y getters

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getDni() {
            return dni;
        }

        public int getEdad() {
            return edad;
        }

        public int getAltura() {
            return altura;
        }

        public double getPeso() {
            return peso;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }
}
