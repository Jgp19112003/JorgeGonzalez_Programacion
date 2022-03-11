package Bibilioteca;

public final class Revista extends Elemento implements Prestar{

    private int  ISBN;

    public Revista (){}

    public Revista(int id, String seccion, String titulo, boolean estado, int ISBN) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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
