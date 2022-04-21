import Controllers.FicheroController;

import java.io.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        File file = null;
        File directory = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\fichero2.txt");
        directory = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros");

        FicheroController ficheroController = new FicheroController();
        ficheroController.getfileinfo(file);
        ficheroController.getdirectoryinfo(directory);
        */

        /*FicheroController ficheroController = new FicheroController();
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\leer.txt");
        ficheroController.lecturaBuffer(file);*/

        /*FicheroController ficheroController = new FicheroController();
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\leer.txt");
        ficheroController.escrituraFichero(file);*/

        int opc;
        String linea;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\ficheroLineas.txt");
        FicheroController ficheroController = new FicheroController();

        do{
            try {
                System.out.println("Introduzca la linea: ");
                linea = bufferedReader.readLine();
                System.out.println(linea);
                fileWriter = new FileWriter(file,true);
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(linea);

           } catch (IOException e) {
               e.printStackTrace();
           } finally {
                printWriter.close();
            }

            System.out.println("¿Quiere crear una nueva línea? (1. Si   0. No)");
            opc = in.nextInt();
        }while (opc != 0);

        FileReader fileReader = null;
        BufferedReader bufferedReader1 = null;


        try {
             bufferedReader1 = new BufferedReader(new FileReader(file));
             String lectura = "";
             String lecturaCompleta = "";
             StringBuffer lecturaBuffer = new StringBuffer("");
             while( (lectura = bufferedReader1.readLine()) != null){
                 lecturaBuffer.append(lectura + "\n");
             }
             lecturaCompleta = lecturaBuffer.toString();
            System.out.println(lecturaBuffer.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    }

