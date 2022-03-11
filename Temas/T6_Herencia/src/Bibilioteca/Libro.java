package Bibilioteca;

public final class Libro extends Elemento implements Prestar{

    private int ISBN, paginas;
    private String autor, editorial;


    public Libro (){}

    public Libro(int id, String seccion, String titulo, boolean estado, int ISBN, int paginas, String autor, String editorial) {
        super(id, seccion, titulo, estado);
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public void mostrarDatos(){
        System.out.println(id);
        System.out.println(ISBN);
        System.out.println(paginas);
        System.out.println(seccion);
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(estado);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
