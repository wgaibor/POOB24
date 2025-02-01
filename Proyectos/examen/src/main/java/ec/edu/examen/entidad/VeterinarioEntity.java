package ec.edu.examen.entidad;

public class VeterinarioEntity {

    private String nombre;
    private int edad;
    private String observacion;

    public VeterinarioEntity() {
    }

    public VeterinarioEntity(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public VeterinarioEntity(String nombre, int edad, String observacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "VeterinarioEntity{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", observacion='" + observacion + '\'' +
                '}';
    }

}
