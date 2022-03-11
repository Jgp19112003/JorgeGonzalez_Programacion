package Bibilioteca;

public final class CD extends Elemento implements Prestar{

    protected String añoedicion;
    protected Tipocd tipocd;

    public CD() {}

    public CD(int id, String seccion, String titulo, boolean estado, String añoedicion, Tipocd tipocd) {
        super(id, seccion, titulo, estado);
        this.añoedicion = añoedicion;
        this.tipocd = tipocd;
    }

    public String getAñoedicion() {
        return añoedicion;
    }

    public void setAñoedicion(String añoedicion) {
        this.añoedicion = añoedicion;
    }

    public Tipocd getTipocd() {
        return tipocd;
    }

    public void setTipocd(Tipocd tipocd) {
        this.tipocd = tipocd;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
}
