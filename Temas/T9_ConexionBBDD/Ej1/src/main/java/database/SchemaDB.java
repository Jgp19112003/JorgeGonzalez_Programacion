package database;

public interface SchemaDB {

    String URL_SERVER = "127.0.0.1:3306";
    String DB_NAME = "usuarios";
    String TAB_USU = "usuario";
    String COL_ID = "id";
    String COL_NOMBRE = "nombre";
    String COL_APELLIDO = "apellido";
    String COL_TELEFONO = "telefono";
    String COL_SUELDO = "sueldo";
    String COL_PAIS = "pais";
    String COL_PERFIL = "id_perfil";

    String TAB_PERF = "perfiles";
    String COL_ID_PERF = "id";
    String COL_NOMBRE_PERF = "nombre";

}
