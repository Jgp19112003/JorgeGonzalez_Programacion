package controller;

import database.SchemaDB;
import model.Perfil;
import model.Usuario;

import java.sql.*;

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

    public  void insertarUsuarios(){

        addUserIndividual(new Usuario("Heide-Marie","Rausch","Holanda",2145024,1));
        addUserIndividual(new Usuario("Liam","Montgomery","España",116977,2));
        addUserIndividual(new Usuario("Ioanna"," Van der Gaag","Belgica",978229,3));
        addUserIndividual(new Usuario("Eloane","Bourgeois","Francia",1595439,2));
    }

    private void addUserIndividual(Usuario usuario){

        getConnection();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) VALUES (?,?,?,?,?)";
        String queryFormat = String.format(query,SchemaDB.TAB_USU,SchemaDB.COL_NOMBRE,SchemaDB.COL_APELLIDO,SchemaDB.COL_PAIS,SchemaDB.COL_TELEFONO,SchemaDB.COL_PERFIL);
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conn.prepareStatement(queryFormat);
            preparedStatement.setString(1,usuario.getNombre());
            preparedStatement.setString(2,usuario.getApellido());
            preparedStatement.setString(3,usuario.getPais());
            preparedStatement.setInt(4,usuario.getTelefono());
            preparedStatement.setInt(5,usuario.getPerfil());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();

        }

    }

    public  void insertarPerfiles(Perfil perfil){


        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("INSERT INTO "+SchemaDB.TAB_PERF+" ("+SchemaDB.COL_NOMBRE_PERF+") VALUES ("+" '"+perfil.getNombre()+"')");

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

    public  void actualizarEspañoles(){

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("UPDATE "+SchemaDB.TAB_USU+" SET "+SchemaDB.COL_SUELDO+" = "+ 10000 +" WHERE "+SchemaDB.COL_PAIS+" = "+ "'"+"España"+"'");

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
