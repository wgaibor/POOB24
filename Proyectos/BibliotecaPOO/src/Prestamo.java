import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean isPrestado;

    

    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion, boolean isPrestado) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.isPrestado = isPrestado;
    }

    

    public Prestamo() {
    }

    

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }



    public boolean registrarPrestamo(Prestamo objPrestamo){
        this.isPrestado = true;
        return this.isPrestado;
    }    

    public boolean registrarDevolucion(Prestamo objPrestamo){
        this.isPrestado = false;
        return this.isPrestado;
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isPrestado() {
        return isPrestado;
    }

    public void setPrestado(boolean isPrestado) {
        this.isPrestado = isPrestado;
    }

    
}
