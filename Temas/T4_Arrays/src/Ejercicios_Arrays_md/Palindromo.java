package Ejercicios_Arrays_md;
public class Palindromo     {
    public static void main(String[] args) {
        String frase = "alli ve sevilla";
        frase = frase.replaceAll(" ","").toLowerCase();
        boolean palindromo = false;


        for (int i = 0; i < frase.length()/2; i++) {

                if(frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                    palindromo = true;
                }
                else{
                    palindromo = false;
                    break;
                }
        }
        if (palindromo){
            System.out.println("La frase es palindroma");
        }
        else{
            System.out.println("La frase no es palindroma");
        }
    }
}
