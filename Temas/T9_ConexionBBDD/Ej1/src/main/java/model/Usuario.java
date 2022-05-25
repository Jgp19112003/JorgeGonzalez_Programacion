package model;

public class Usuario {

    private String nombre,apellido,pais;
    private int id, telefono,sueldo,perfil;

    public Usuario(String nombre, String apellido, String pais, int id, int telefono, int sueldo, int perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.id = id;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.perfil = perfil;
    }

    public Usuario(String nombre, String apellido, String pais, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.telefono = telefono;
    }

    public Usuario(String nombre, String apellido, String pais, int telefono,int perfil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.telefono = telefono;
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
}
