package InterfazInicial;

public final class Audio extends Elemento implements Ejecutable{

    private int duracion;
    private String soporte;

    public Audio(){}

    public Audio(int id, int tamaño, String autor, String titulo, String formato, int duracion, String soporte){

        super( id,tamaño,autor,titulo,formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
