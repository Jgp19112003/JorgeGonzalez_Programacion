package Controllers;

import java.io.*;
import java.nio.Buffer;

public class FicheroController {

   /* public void getfileinfo(File file) {
        System.out.println("Informacion de fichero: ");
        System.out.println("Es directorio?" + file.isDirectory());
        System.out.println("Es fichero?" + file.isFile());
        System.out.println("Existe?" + file.exists());
        System.out.println("Padre: " + file.getParent());
        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
        System.out.println("Ruta relativa: " + file.getPath());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getdirectoryinfo(File file){
        if (file.isDirectory()){
            String[] nombreFicheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero: ficheros) {
                System.out.println(fichero);
            }
           /* for (String nombre: nombreFicheros) {
                System.out.println(nombre);
            }
        }
    }

    public void listarDirectorio(File file){

        File[] ficheros = file.listFiles(); */


   /* public void lecturaFichero (File file){

            FileReader fileReader = null;

                try {
                    fileReader = new FileReader(file);
                    int lectura = 0;
                    /*while (lectura != 0){
                        lectura = fileReader.read();
                        System.out.println(lectura);
                    }
                    while ((lectura = fileReader.read())!= -1){
                        System.out.println((char) lectura);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        fileReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


    }

        public void lecturaBuffer(File file){

            BufferedReader bufferedReader = null;

            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String lectura;
                String lecturaCompleta = "";
              while ((lectura = bufferedReader.readLine()) != null) {
                  System.out.println(lectura);
                  lecturaCompleta += lectura;
                  lecturaCompleta += "\n";
              }
                System.out.println("La lectura completa es: ");
                System.out.println(lecturaCompleta);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public void escrituraFichero(File file){

            FileWriter fileWriter = null;
            String lineaEscribir = "Esto es un ejemplo de una linea dentro del fichero";

            try{
                fileWriter = new FileWriter(file);
                fileWriter.write("Ejemplo");
                fileWriter.write("\n");
                fileWriter.write("Esto es una nueva linea");
            } catch (IOException e){
                e.printStackTrace();
            }finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/


}