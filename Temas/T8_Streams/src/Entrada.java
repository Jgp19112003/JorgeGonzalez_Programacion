import Controllers.FicheroController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
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

        FicheroController ficheroController = new FicheroController();
        File file = new File("C:\\Users\\Usuario DAM1\\Desktop\\Ficheros\\leer.txt");
        ficheroController.escrituraFichero(file);
        }
    }

