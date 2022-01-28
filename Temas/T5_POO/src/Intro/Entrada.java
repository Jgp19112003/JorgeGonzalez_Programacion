package Intro;

public class Entrada {
    //ambito de clase
    String nombre = "Borja";


    public static void main(String[] args) {
        //ambito de metodo - local
        Usuario usuario1 = new Usuario();
        //nombre , password , correo , edad , fecha--son null

        Usuario usuario2 = new Usuario();
        //nombre , password , correo , edad , fecha--son null

        Usuario usuario3 = new Usuario("Pepe","borja.martin@gmail.com","pass");
        //nombre = Borja , password = pass, correo = borja.martin@gmail.com , edad , fecha


        Usuario usuario4 = new Usuario("borja.martin@gmail.com","pass",20);
        //nombre = Borja , password = pass, correo = borja.martin@gmail.com , edad , fecha

        usuario1.setPassword("contraseña");
        usuario1.setNombre("Borja");
        usuario1.setCorreoElectronico("borja.martin@gmail.com");
        usuario1.setApellidos("Martin");
        usuario1.setFecha("11/08/2021");
        usuario1.setEdad(20);

        System.out.println(usuario1.getPassword());
        //usuario1.mostrarDatos();
        System.out.println(usuario1.mostrarDatosRetorno());
        usuario1.saludar(usuario3);
    }
}
