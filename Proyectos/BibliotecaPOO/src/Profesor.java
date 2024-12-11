import java.util.ArrayList;

public class Profesor extends Usuario {
    private String departamento;

    
    public Profesor(String nombre, int cedula, ArrayList<Libro> lstLibros, String departamento) {
        super(nombre, cedula, lstLibros);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
   
    @Override
    public Usuario mostrarInformacion(Usuario usuario) {
        System.out.println("Es docente");
        return super.mostrarInformacion(usuario);
    }
   
}
