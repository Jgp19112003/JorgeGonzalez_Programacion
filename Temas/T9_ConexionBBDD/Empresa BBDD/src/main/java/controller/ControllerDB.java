package controller;

import com.google.gson.Gson;
import database.SchemaDB;
import model.Factura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;

public class ControllerDB {

    String urlFactura = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";

    private Connection conn;

    private Statement statement;
    private ResultSet resultSet;



    public void getConnection(){

        try {
            conn = (Connection) DriverManager.getConnection(SchemaDB.url);
            System.out.println(conn.getCatalog());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void closeConnection(){

        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void leerJSON(){
        String url = null;
        BufferedReader bufferedReader = null;
        ArrayList<Factura> listaFacturas = new ArrayList<>();
        ObjectOutputStream objectOutputStream = null;

        try {
            url = urlFactura;
            URL urlHTTP = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlHTTP.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                stringBuffer.append(linea);
            }

            JSONObject jsonFacturas = new JSONObject(stringBuffer.toString());
            JSONArray jsonArrayFacturas = jsonFacturas.getJSONArray("results");

            for (int i = 0; i < jsonArrayFacturas.length(); i++) {
                JSONObject factura = jsonArrayFacturas.getJSONObject(i);
                Gson gson = new Gson();
                Factura facturaItem = gson.fromJson(factura.toString(),Factura.class);
                listaFacturas.add(facturaItem);
                insertarFactura(new Factura(facturaItem.get_id(),facturaItem.getCompany(),facturaItem.getCountry(),facturaItem.getPhone(),facturaItem.getInvoice()));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {

                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }

                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public void insertarFactura(Factura factura) {

        try {
            getConnection();
            statement = conn.createStatement();

            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES ('%s','%s','%s','%s', %d)",SchemaDB.TAB_FACTURAS,
                    SchemaDB.COL_ID,SchemaDB.COL_COMPANIA,SchemaDB.COL_PAIS,SchemaDB.COL_TELEFONO,SchemaDB.COL_TOTAL,
                    factura.get_id(),factura.getCompany(),factura.getCountry(),factura.getPhone(),factura.getInvoice());
            //int numeroRow = statement.executeUpdate(queryFormat);
            if (statement.executeUpdate(queryFormat)>0){
                System.out.println("***Factura insertada correctamente***");
            }
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarFiltrada(Factura factura) {

        try {
            getConnection();
            statement = conn.createStatement();

            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES ('%s','%s','%s','%s', %d)",SchemaDB.TAB_FILTRADA,
                    SchemaDB.COL_ID,SchemaDB.COL_COMPANIA,SchemaDB.COL_PAIS,SchemaDB.COL_TELEFONO,SchemaDB.COL_TOTAL,
                    factura.get_id(),factura.getCompany(),factura.getCountry(),factura.getPhone(),factura.getInvoice());
            //int numeroRow = statement.executeUpdate(queryFormat);
            if (statement.executeUpdate(queryFormat)>0){
                System.out.println("***Factura insertada correctamente***");
            }
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void getResultadosTotal(int total){

        getConnection();
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM "+SchemaDB.TAB_FACTURAS+" WHERE "+SchemaDB.COL_PAIS+" >= '"+total+"'";
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String id = resultSet.getString(SchemaDB.COL_ID);
                String compania = resultSet.getString(SchemaDB.COL_COMPANIA);
                String pais1 = resultSet.getString(SchemaDB.COL_PAIS);
                String telf = resultSet.getString(SchemaDB.COL_TELEFONO);
                int total1 = resultSet.getInt(SchemaDB.COL_TOTAL);
                System.out.println(id);
                System.out.println(compania);
                System.out.println(pais1);
                System.out.println(telf);
                System.out.println(total1);
                insertarFiltrada(new Factura(id, compania, pais1, telf, total1));
            }
            // resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void getResultadosPais(String pais){

        getConnection();
        try {
            statement = conn.createStatement();
            String query = "SELECT "+SchemaDB.COL_ID+", "+SchemaDB.COL_COMPANIA+", "+SchemaDB.COL_PAIS+", "+SchemaDB.COL_TELEFONO+", "+SchemaDB.COL_TOTAL+" FROM "+SchemaDB.TAB_FACTURAS+" WHERE "+SchemaDB.COL_PAIS+" = '"+pais+"'";
            resultSet = statement.executeQuery(query);

            resultSet.next();
            String id = resultSet.getString(SchemaDB.COL_ID);
            String compania = resultSet.getString(SchemaDB.COL_COMPANIA);
            String pais1 = resultSet.getString(SchemaDB.COL_PAIS);
            String telf = resultSet.getString(SchemaDB.COL_TELEFONO);
            int total = resultSet.getInt(SchemaDB.COL_TOTAL);
            System.out.println(id);
            System.out.println(compania);
            System.out.println(pais1);
            System.out.println(telf);
            System.out.println(total);
            insertarFiltrada(new Factura(id,compania,pais1,telf,total));
            // resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
