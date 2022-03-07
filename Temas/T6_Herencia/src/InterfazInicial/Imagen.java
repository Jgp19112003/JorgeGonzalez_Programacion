package InterfazInicial;

public final class Imagen extends Elemento implements Ejecutable{

    private int ISBN;

    public Imagen(){}

    public Imagen(int id, int tamaño, String autor, String titulo, String formato, int ISBN){
        super( id,tamaño,autor,titulo,formato);
        this.ISBN = ISBN;
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

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
