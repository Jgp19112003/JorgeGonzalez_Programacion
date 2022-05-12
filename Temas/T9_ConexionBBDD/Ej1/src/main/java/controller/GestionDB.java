package controller;

import database.SchemaDB;
import model.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionDB {



    private Connection conn;
    private Statement statement;


    private void getConnection(){

        String host = SchemaDB.URL_SERVER;
        String dtbs = SchemaDB.DB_NAME;
        String user = "root";
        String pass = "admin";



        String newConnectionURL = "jdbc:mysql://"+ host + "/" +dtbs
                + "?" + "user="+ user + "&password=" + pass;

        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void closeConnection(){

        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  void insertarUsuarios(Usuario usuario){



        //INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA', 'MARTIN', 38,)

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("INSERT INTO "+SchemaDB.TAB_USU+" ("+SchemaDB.COL_NOMBRE+","+SchemaDB.COL_APELLIDO+","+SchemaDB.COL_TELEFONO+","+SchemaDB.COL_SUELDO+","+SchemaDB.COL_PAIS+","+SchemaDB.COL_PERFIL+") VALUES ('"+usuario.getNombre()+ "','" +usuario.getApellido()+ "'," +usuario.getTelefono()+ "," +usuario.getSueldo()+ ",'" +usuario.getPais()+ "'," +usuario.getPerfil()+")");

            System.out.println(numeroRow);
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
}
