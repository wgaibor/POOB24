import java.util.ArrayList;

public class Estudiante extends Usuario{
    private String carrera;

    public Estudiante(String nombre, int cedula, ArrayList<Libro> lstLibros, String carrera) {
        super(nombre, cedula, lstLibros);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}
