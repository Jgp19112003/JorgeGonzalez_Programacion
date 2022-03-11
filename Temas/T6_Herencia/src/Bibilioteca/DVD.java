package Bibilioteca;

public final class DVD extends Elemento{

    private String añoedicion, director, actores;
    private Tipodvd tipodvd;


    public DVD() {}

    public DVD(int id, String seccion, String titulo, boolean estado, String añoedicion, String director, String actores,Tipodvd tipodvd) {
        super(id, seccion, titulo, estado);
        this.añoedicion = añoedicion;
        this.director = director;
        this.actores = actores;
        this.tipodvd = tipodvd;
    }

    public String getAñoedicion() {
        return añoedicion;
    }

    public void setAñoedicion(String añoedicion) {
        this.añoedicion = añoedicion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public Tipodvd getTipodvd() {
        return tipodvd;
    }

    public void setTipodvd(Tipodvd tipodvd) {
        this.tipodvd = tipodvd;
    }
}
