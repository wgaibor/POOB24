import java.util.Date;

public class Libro {
    public String titulo;
    public String autor;
    private String isbn;
    public Date anioPublicacion;
    public boolean estado;

   public void prestar(String titulo) {
        System.out.println("Se presto el libro  "+titulo);
   }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
}
