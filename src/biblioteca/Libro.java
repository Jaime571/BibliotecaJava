
package biblioteca;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(int ISBN, String titulo, String autor, int añoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    
    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public String toString(){
    String res = "";
    res = this.getISBN() + "\t" + this.getTitulo() + "\t" + this.getAutor() + "\t" + this.getAñoPublicacion() + "\n";
    return res;
    }
    
}
