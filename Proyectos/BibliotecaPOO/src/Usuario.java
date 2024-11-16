import java.util.ArrayList;

public abstract class Usuario {
    String nombre;
    int cedula;
    private ArrayList<Libro> lstLibros;

    public Usuario(String nombre, int cedula, ArrayList<Libro> lstLibros) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.lstLibros = lstLibros;
    }

    public boolean agregarLibro(ArrayList<Libro> libro, Usuario usuario) {
        if(this.cedula == 0){
            return false;
        }
        usuario.setLstLibros(libro);
        return true;
    }

    public String devolverLibro(ArrayList<Libro> libro, Usuario usuario) {
        if(this.cedula == 0){
            return "No existe persona con cedula 0";
        }
        
        return usuario.nombre+ " ha devuelto los libros" + libro.toString();
    }

    public ArrayList<Libro> getLstLibros() {
        return lstLibros;
    }
    public void setLstLibros(ArrayList<Libro> lstLibros) {
        this.lstLibros = lstLibros;
    }

    
}
