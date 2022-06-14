package controller;

import com.google.gson.Gson;
import model.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONcontroller3 {




        ArrayList<Pelicula> lista_peliculas;

        public void verPeliculas (int opc){

            if (opc == 1) {
                if (lista_peliculas == null) {
                    lista_peliculas = new ArrayList<>();
                }


                String urlString = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=es-ES";
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
                    JSONArray arrayTable = jsonObject.getJSONArray("results");
                    for (int i = 0; i < arrayTable.length(); i++) {
                        JSONObject objetoResultado = arrayTable.getJSONObject(i);
                        String original_title = objetoResultado.getString("original_title");
                        System.out.println("Título: "+original_title);
                        String poster_path = objetoResultado.getString("poster_path");
                        poster_path = "https://image.tmdb.org/t/p/w500/"+poster_path;
                        System.out.println("Póster: "+poster_path);
                        String overview = objetoResultado.getString("overview");
                        System.out.println("Descripción: "+overview);
                        String release_date = objetoResultado.getString("release_date");
                        System.out.println("Fecha de lanzamiento: "+release_date);

                        Pelicula p1 = new Pelicula(original_title,poster_path,overview,release_date);

                        Gson gson = new Gson();
                        lista_peliculas.add(p1);

                    }


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


            if (opc == 2) {
                if (lista_peliculas == null) {
                    lista_peliculas = new ArrayList<>();
                }


                String urlString = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=es-ES";
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
                    JSONArray arrayTable = jsonObject.getJSONArray("results");
                    for (int i = 0; i < arrayTable.length(); i++) {
                        JSONObject objetoResultado = arrayTable.getJSONObject(i);
                        String original_title = objetoResultado.getString("original_title");
                        System.out.println("Título: "+original_title);
                        String poster_path = objetoResultado.getString("poster_path");
                        poster_path = "https://image.tmdb.org/t/p/w500/"+poster_path;
                        System.out.println("Póster: "+poster_path);
                        String overview = objetoResultado.getString("overview");
                        System.out.println("Descripción: "+overview);
                        String release_date = objetoResultado.getString("release_date");
                        System.out.println("Fecha de lanzamiento: "+release_date);

                        Pelicula p1 = new Pelicula(original_title,poster_path,overview,release_date);

                        Gson gson = new Gson();
                        lista_peliculas.add(p1);

                    }


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

    public void escribirPeliculas(File file){

        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(lista_peliculas);
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
}


