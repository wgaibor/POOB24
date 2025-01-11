public abstract class Animal {
    String nombre;
    private String codigo;
    
    public Animal(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    void debesTenerUnNombre(){}

    @Override
    public String toString() {
        return this.nombre;
    }
}
