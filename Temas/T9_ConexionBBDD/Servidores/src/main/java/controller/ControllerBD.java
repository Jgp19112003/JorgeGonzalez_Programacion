package controller;

import database.SchemaDB;
import model.Alumno;

import java.sql.*;
import java.util.ArrayList;

public class ControllerBD {

    private Connection conn;

    //No comprueba tipos
    private Statement statement;
    private ResultSet resultSet;
    private ArrayList<Alumno> listaAlumnos = new ArrayList();


    // CRUD


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

    public  void insertarAlumnos(){

        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;

        //INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA', 'MARTIN', 38,)

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("INSERT INTO"+SchemaDB.TAB_ALU+" ("+SchemaDB.COL_NOMBRE+","+SchemaDB.COL_APELLIDO+","+SchemaDB.COL_EDAD+") VALUES ('"+nombre+ "','"+apellido+ "'," +edad+ ")");

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

    public void introducirAlumnosDeseados(Alumno alumno){

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("INSERT INTO "+SchemaDB.TAB_ALU+" ("+SchemaDB.COL_NOMBRE+","+SchemaDB.COL_APELLIDO+","+SchemaDB.COL_EDAD+") VALUES ('"+alumno.getNombre()+ "','"+alumno.getApellido()+ "'," +alumno.getEdad()+ ")");

            System.out.println(numeroRow);
            System.out.println("Alumno introducido correctamente");
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

    public void modificarEdad (String nombre, int edad){

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("UPDATE "+SchemaDB.TAB_ALU+" SET "+SchemaDB.COL_EDAD+" = "+ edad +" WHERE "+SchemaDB.COL_NOMBRE+" = "+ "'"+nombre+"'");

            System.out.println(numeroRow);
            System.out.println("Edad modificada correctamente");
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

    public void borrarAlumno(int edad){

        try {
            getConnection();
            statement = conn.createStatement();
            int numeroRow = statement.executeUpdate("DELETE FROM "+SchemaDB.TAB_ALU+" WHERE "+SchemaDB.COL_EDAD+" = "+edad);

            System.out.println(numeroRow);
            System.out.println("Alumnos borrados correctamente");
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


    public void getResultado (){

        getConnection();

        try{
            statement = conn.createStatement();
            String query = "SELECT * FROM "+SchemaDB.TAB_ALU;
            resultSet = statement.executeQuery(query);
            //La posicion donde estas ubicado



                while (resultSet.next()) {
                    String nombre = resultSet.getString(SchemaDB.COL_NOMBRE);
                    String apellido = resultSet.getString(SchemaDB.COL_APELLIDO);
                    int edad = resultSet.getInt(SchemaDB.COL_EDAD);
                    int id = resultSet.getInt(SchemaDB.COL_ID);

                    Alumno a1 = new Alumno(nombre, apellido, edad, id);
                    listaAlumnos.add(a1);

                    System.out.println(a1.getNombre());
                    System.out.println(a1.getApellido());
                    System.out.println(a1.getEdad());
                    System.out.println(a1.getId());
                }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
