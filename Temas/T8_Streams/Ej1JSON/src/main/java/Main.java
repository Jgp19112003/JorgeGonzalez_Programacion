import controller.JSONcontroller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int  num_users;
        String genero;

        System.out.println("¿Cuántos usuarios quiere obtener?");
        num_users = in.nextInt();
        System.out.println("¿Cuál quieres que sea el género de los usurarios? (male, female, both)");
        genero = in.next();

        if (genero != "male" || genero != "female"){
            genero = "both";

            JSONcontroller jsoNcontroller = new JSONcontroller();
            jsoNcontroller.lecturaJSONAPI(num_users,genero);
            jsoNcontroller.escribirBinario();
            jsoNcontroller.lecturaBinario();
        } else {
            JSONcontroller jsoNcontroller = new JSONcontroller();
            jsoNcontroller.lecturaJSONAPI(num_users,genero);
            jsoNcontroller.escribirBinario();
            jsoNcontroller.lecturaBinario();

        }


    }

}