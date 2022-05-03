package controller;

import com.google.gson.Gson;
import model.Name;
import model.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;


public class JSONcontroller {

    private int num_users;
    private String genero;
    private ArrayList<Usuario> lista_escritura = new ArrayList<>();

    public void lecturaJSONAPI(int num_users, String genero){

        String urlString = "https://randomuser.me/api/?results="+num_users+"&gender="+genero;
        try {
            URL url = new URL(urlString);
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

            JSONArray arrayResultados = responseJSON.getJSONArray("results"); //DE LOS RESULTADOS SACAMOS LO QUE QUEREMOS
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                //System.out.println(objetoResultado);
                JSONObject name = objetoResultado.getJSONObject("name");
                Gson gson = new  Gson();
                Name nameJava = gson.fromJson(name.toString(),Name.class);
                System.out.println();

                JSONObject location = objetoResultado.getJSONObject("location");
                String city = location.getString("city");
                String country = location.getString("country");

                String email = objetoResultado.getString("email");

                JSONObject picture = objetoResultado.getJSONObject("picture");

                lista_escritura.add(new Usuario(nameJava,city,country,email,picture));



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirBinario(){
        lista_escritura = new ArrayList<>();
        //ABSOLUTA --> DESDE LA RAIZ
        //RELATIVA --> DESDE DONDE ESTOY UBICADO
        File file = new File("src/main/java/resources/usuarios.bin");
        //CERRARLO!!!!//
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(lista_escritura);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void lecturaBinario() {
        if (lista_escritura == null){
            lista_escritura = new ArrayList<>();
        }
        File file = new File("src/main/java/resources/usuarios.bin");

        ObjectInputStream ois = null;
        Usuario usuario = null;
        do{
            try {
                ois = new ObjectInputStream(new FileInputStream(file));
                lista_escritura = (ArrayList<Usuario>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }while (ois == null);
    }

}