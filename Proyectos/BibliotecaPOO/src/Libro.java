import java.util.ArrayList;
import java.util.Date;

public class Libro {
    public String titulo;
    public String autor;
    private String isbn;
    public Date anioPublicacion;
    public boolean estado;
    public String observacion;

    

   public Libro(String titulo, String autor, String isbn, Date anioPublicacion, boolean estado, String observacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
        this.observacion = observacion;
    }

public void prestar(String titulo) {
        System.out.println("Se presto el libro  "+titulo);
   }

   public String devolver(Libro libro) {
        return "Se ha devuelto el libro "+ libro.titulo +
                " del autor "+autor;
   }

   public ArrayList<Libro> mostrarInformacion(ArrayList<Libro> lstLibros) {
    int incremento = 1;
    ArrayList<Libro> listadoLibros = new ArrayList<>();
        for (Libro objetoLibro : lstLibros) {
            objetoLibro.observacion = "Este libro pertenece a esta librerìa   el id es [] "+incremento;
            incremento++;
            listadoLibros.add(objetoLibro);
        }
    return listadoLibros;
   } 

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return this.titulo + " ºº  "+ observacion;
    }
   
}
