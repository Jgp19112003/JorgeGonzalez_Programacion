package controllerej;
import modelej.Usuario;
import java.io.*;
import java.util.ArrayList;

public class BinariosController {

        ArrayList<Usuario> usuarios = new ArrayList<>();
    public void escrituraUsuario(){
        //ABSOLUTA --> DESDE LA RAIZ
        //RELATIVA --> DESDE DONDE ESTOY UBICADO
        File file = new File("src/resources/usuarios.bin");
        //CERRARLO!!!!//
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            for (Usuario user: usuarios) {
                oos.writeObject(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
        this.usuarios = usuarios;
    }

    public void mostrarDatosUsuario(Usuario usuario){
        System.out.println("Nombre: "+usuario.getNombre());
        System.out.println("Apellido: "+usuario.getApellido());
        System.out.println("Password: "+usuario.getPassword());
    }

    public void lecturaUsuarios() {
        File file = new File("src/resources/usuarios.bin");

        ObjectInputStream ois = null;

        do{
            try {
                ois = new ObjectInputStream(new FileInputStream(file));
                Usuario item = null;
                while ((item = (Usuario) ois.readObject()) != null){
                        mostrarDatosUsuario(item);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }while (ois == null);
    }
}
