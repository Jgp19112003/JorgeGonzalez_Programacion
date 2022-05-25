package controller;

import model.Personaje;

import java.io.*;
import java.net.MalformedURLException;

public class JSONcontroller2 {


    public void leerFichero(){
        File file = new File("src/main/resources/personajes_vf.bin");
        ObjectInputStream objectInputStream =null;
        Personaje personaje = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            while ((personaje = (Personaje) objectInputStream.readObject()) != null){
                System.out.println(personaje);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
