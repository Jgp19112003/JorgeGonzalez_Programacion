package controller;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONcontroller {


    private ArrayList<String> lista_ligas;

    public void leerLigas(int idLeague) {
        if (lista_ligas == null) {
            lista_ligas = new ArrayList<>();
        }

        String urlString = "https://www.thesportsdb.com/api/v1/json/2/lookuptable.php?l=" + idLeague;
        BufferedReader reader = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuffer = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine()) != null) {
                stringBuffer.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuffer.toString());
            JSONArray arrayTable = jsonObject.getJSONArray("table");
            for (int i = 0; i < arrayTable.length(); i++) {
                JSONObject objetoResultado = arrayTable.getJSONObject(i);
                String team = objetoResultado.getString("strTeam");

                Gson gson = new Gson();
                lista_ligas.add(team);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void escribirEquipos(){
        File file = new File("src/main/resources/equipos.json");
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista_ligas);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public void leerFichero(){
        File file = new File("src/main/resources/equipos.json");
        ObjectInputStream objectInputStream =null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            lista_ligas = (ArrayList<String>) objectInputStream.readObject();

            for (int i = 0; i < lista_ligas.size(); i++) {
                System.out.println(i+1+". "+ lista_ligas.get(i));
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
