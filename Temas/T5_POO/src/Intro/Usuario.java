package Intro;

public class Usuario {

    // variables

    private String correoElectronico , password , nombre , apellidos ,fecha;
    private int edad;


    // constructores
    // si no hay contructores escritos, hay un constructor que es el vacio (por defecto)
    // este constructor deja de existir cuando se escribe un constructor
    public Usuario(){
        this.nombre = "Por defecto";
        this.correoElectronico= "Por defecto";
    }
    public Usuario(String nombre, String correoElectronico, String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public Usuario(String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }



    // metodos

    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Pass: "+password);
        System.out.println("Correo: "+correoElectronico);
        System.out.println("Fecha: "+fecha);
        System.out.println("Edad: "+edad);

    }

    public String mostrarDatosRetorno(){
       return "Nombre: "+ nombre+"\n"+"Apellidos: "+apellidos;
    }

    public void saludar (Usuario usuario){
        System.out.println("Hola soy"+ nombre+" y voy a saludar a "+usuario.getNombre());
    }
    // metodos especiales getter y setters

    //getter de pass
    public  String getPassword(){
        return password;
    }

    public  String getNombre(){
        return nombre;
    }

    public  String getCorreoElectronico(){
        return correoElectronico;
    }

    public  String getApellidos(){
        return apellidos;
    }

    public  String getFecha(){
        return fecha;
    }

    public  int getEdad(){
        return edad;
    }


    // setter pass


    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    }

