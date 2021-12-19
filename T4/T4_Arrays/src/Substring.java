
public class Substring {
    public static void main(String[] args) {


        String correo = "borja.martin@cesjuanpablosegundo.es";
        correo.indexOf("@");
        String nombre = correo.substring(0,correo.indexOf("@"));
        System.out.println(nombre);

        String dominio = correo.substring(correo.indexOf("@")+1,correo.length());
        System.out.println(dominio);

    }
}
