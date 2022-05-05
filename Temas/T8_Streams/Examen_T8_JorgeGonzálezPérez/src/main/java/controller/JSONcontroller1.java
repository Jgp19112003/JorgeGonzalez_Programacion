package controller;

import java.io.*;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class JSONcontroller1 {



    public void leerFichero() {


        File file = new File("src/main/resources/fichero_cifrado.txt");
        BufferedReader reader = null;


        try {

            reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;
            String lineaCompleta = null;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);



                String[] letras = linea.split("");
                for (String letra : letras) {
                    int codigo = (letra.charAt(0));
                    int codigoCifrado = codigo/2;
                    char caracterCifrado = (char) codigoCifrado;
                    System.out.print(caracterCifrado);
                }
            }




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
