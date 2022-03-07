package InterfazInicial;

public abstract class Elemento {

    int id, tamaño;
    String autor, titulo, formato;

    public Elemento(){}

    public Elemento(int id, int tamaño, String autor, String titulo, String formato){
        this.id = id;
        this.tamaño = tamaño;
        this.autor = autor;
        this.titulo = titulo;
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
