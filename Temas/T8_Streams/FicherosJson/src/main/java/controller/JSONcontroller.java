package controller;

import Model.Conocimiento;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONcontroller {

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    public void pasarStringJSON(){
        /*(org.Json)*/
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject);
        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }
    public void leerFicheroJSON(){
        File file = new File("src/main/resources/persona.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            //bufferedReader.readLine();/*Leer linea completa*/
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();
            while ((linea = bufferedReader.readLine()) != null){
                lecturaCompleta.append(linea);
            }

            //PASAR STRING A JSON
            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            System.out.println(jsonObject);
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                System.out.println(conocimientoJava.getAnios());
                /* String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println(concepto);
                System.out.println(experiencia);
                System.out.println("Los detalles del conocimiento "+concepto+ " son:");
                JSONArray detalles = conocimiento.getJSONArray("detalles");
                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(i);
                    System.out.println(detalle);
                }*/
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
