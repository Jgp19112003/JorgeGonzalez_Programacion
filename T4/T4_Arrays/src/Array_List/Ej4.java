package Array_List;

import java.util.ArrayList;

public class Ej4 {
    public static void main(String[] args) {

        ArrayList<Integer> listaNums1 = new ArrayList();
        ArrayList<Integer> listaNums2 = new ArrayList();
        int iguales= 0;

        for (int i = 0; i < 20 ; i++) {

            listaNums1.add((int) (Math.random()*20+1));
            listaNums2.add((int) (Math.random()*20+1));
                if (listaNums1.get(i)==(listaNums2.get(i))){
                    iguales++;
                    
            }

        }
        System.out.println(listaNums1);
        System.out.println(listaNums2);
        System.out.printf("Hay %d numeros iguales",iguales);

        
        
        
        
    }
}
