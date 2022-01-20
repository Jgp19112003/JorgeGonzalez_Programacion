package Ejercicios_Arrays_md;
public class Ej8 {
    public static void main(String[] args) {

        String larga = "";
        String corta = "000000000000000000000000000000000";
        String frase = "a mi padre le gusta jugar al tenis klk";
        String []frase2 = frase.split(" ");
        for (String item : frase2) {
            if (item.length()<corta.length()){
                corta = item;
            }
            if (item.length()>larga.length()){
                larga = item;
            }
        }
        System.out.println(corta);
        System.out.println(larga);


    }
}