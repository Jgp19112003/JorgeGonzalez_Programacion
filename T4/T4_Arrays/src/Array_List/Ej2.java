package Array_List;

import java.util.ArrayList;

public class Ej2 {
    public static void main(String[] args) {

        ArrayList<Integer> listaNums = new ArrayList();
        int suma = 0;
        double media = 0;

        listaNums.add((int) (Math.random()*100+1));
        listaNums.add((int) (Math.random()*100+1));
        listaNums.add((int) (Math.random()*100+1));
        listaNums.add((int) (Math.random()*100+1));
        listaNums.add((int) (Math.random()*100+1));

        for (int i = 0; i < listaNums.size(); i++) {


            suma += listaNums.get(i);
            media = (double) suma /listaNums.size();

        }
        System.out.println(listaNums);
        System.out.println(suma);
        System.out.println(media);


    }
}
