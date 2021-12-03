package Ejercicios_Arrays_md;

public class champions {
    public static void main(String[] args) {
        String[] bombo1 = {"Barcelona","PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid" ,"Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};
        String[] equipoSalidosB1 = new String[bombo1.length];
        String[] equipoSalidosB2 = new String[bombo2.length];


            for (int i = 0; i < bombo1.length; i++) {

                int aleatorio1 = (int) (Math.random() * bombo1.length);
                int aleatorio2 = (int) (Math.random() * bombo2.length);
                String equipoGenerado1 = bombo1[aleatorio1];
                String equipoGenerado2 = bombo2[aleatorio2];

                for (int x = 0; x < equipoGenerado1.length(); x++) {
                    if (equipoGenerado1.equalsIgnoreCase(equipoSalidosB1[i])){
                        int aleatorio1 = (int) (Math.random() * bombo1.length);     
                    }

                }



                System.out.printf("*** Partido %s - %s ***%n", bombo1[aleatorio1], bombo2[aleatorio2]);

            }



    }
}
