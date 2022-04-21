package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    public void escribirBinario(){
        //ABSOLUTA --> DESDE LA RAIZ
        //RELATIVA --> DESDE DONDE ESTOY UBICADO
        File file = new File("src/resources/objetos.bin");
        //CERRARLO!!!!//
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new Usuario("Borja","Martin","1234"));
            oos.writeObject(new Usuario("Pedro","Herrera","1234567"));
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

    public void lecturaBinario() {
        File file = new File("src/resources/objetos.bin");

        ObjectInputStream ois = null;
        Usuario usuario = null;
        do{
            try {
                ois = new ObjectInputStream(new FileInputStream(file));
                while ((usuario = (Usuario) ois.readObject()) != null){
                    System.out.println(usuario);
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

