package database;

public interface SchemaDB {

    String dtbs = "empresa";
    String user = "root";
    String pass = "admin";
    String host = "127.0.0.1:3306";
    String url = "jdbc:mysql://" + SchemaDB.host + "/" + SchemaDB.dtbs
            + "?" + "user=" + SchemaDB.user + "&password=" + SchemaDB.pass;
    String TAB_FACTURAS = "factura";
    String TAB_FILTRADA = "filtrada";
    String COL_ID = "id";
    String COL_COMPANIA = "compania";
    String COL_PAIS = "pais";
    String COL_TELEFONO = "telefono";
    String COL_TOTAL = "total";





}
