package controller;

import Model.Asignatura;
import Model.Conocimiento;
import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;


public class JSONcontroller {

    ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
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
    public  void leerJSONAsignaturas(){

        File file = new File("src/main/resources/asignaturas.json");
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
            JSONArray arrayAsignaturas = jsonObject.getJSONArray("asignaturas");
            System.out.println(arrayAsignaturas);
            for (int i = 0; i < arrayAsignaturas.length(); i++) {
                JSONObject asignatura = arrayAsignaturas.getJSONObject(i);
                Gson gson = new Gson();
                Asignatura asignaturaJava = gson.fromJson(asignatura.toString(),Asignatura.class);
                carateristicasAsignatura(asignaturaJava);
                JSONArray conocimientos = asignatura.getJSONArray("conocimientos");
                for (int j = 0; j < conocimientos.length(); j++) {
                    String conocimiento = conocimientos.getString(j);
                    System.out.println(conocimiento);
                }
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

    public void carateristicasAsignatura (Asignatura asignatura){
        System.out.println(asignatura.getSiglas());
        System.out.println(asignatura.getNombre());
        System.out.println(asignatura.getProfesor());
        System.out.println(asignatura.getHora());
        System.out.println(asignatura.getCiclo());
        System.out.println(asignatura.getCurso());

    }public void carateristicasAsignaturas (String ciclo, int curso){
        for (Asignatura item: listaAsignaturas) {
            if (item.getCiclo().contains(ciclo) && item.getCurso() == curso) {
                carateristicasAsignatura(item);
                System.out.println(item.getSiglas());
                System.out.println(item.getNombre());
                System.out.println(item.getProfesor());
                System.out.println(item.getHora());
                System.out.println(item.getCiclo());
                System.out.println(item.getCurso());
                for (String itemconocimientos: item.getConocimientos()) {
                    System.out.println(itemconocimientos);
                }

            }
        }
    }
    public void mostrarAsignaturaUsuario (int curso, String ciclo){

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader bufferedReader = null;
        listaAsignaturas = this.listaAsignaturas;

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
            JSONArray arrayAsignaturas = jsonObject.getJSONArray("asignaturas");
            for (int i = 0; i < arrayAsignaturas.length(); i++) {
                JSONObject asignatura = arrayAsignaturas.getJSONObject(i);

                Gson gson = new Gson();
                Asignatura asignaturaJava = gson.fromJson(asignatura.toString(),Asignatura.class);
                listaAsignaturas.add(asignaturaJava);
                carateristicasAsignaturas(ciclo,curso);
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
    public void lecturaJSONAPI(){
        String urlString = "https://randomuser.me/api/?results=2";
        try {
            URL  url = new URL(urlString);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            //contestacion
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea=bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }
            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);

            //System.out.println(responseJSON); SACAMOS TO DO EL TEXTO

            JSONArray arrayResultados = responseJSON.getJSONArray("results"); //DE LOS RESULTADOS SACAMOS EL EMAIL
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                //System.out.println(objetoResultado);
                String mail = objetoResultado.getString("email");
                System.out.println(mail);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

