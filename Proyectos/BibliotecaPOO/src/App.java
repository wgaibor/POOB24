import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        //Libros
        Libro objLibro1 = new Libro("La Familia", "Ferrer Soria, Isidro; Mesa, Sara", "A-0060-Z", new Date(), true, null);
        Libro objLibro2 = new Libro("Ceniza En La Boca", "Navarro, Brenda", "A-0050-Z", new Date(), true, null);
        Libro objLibro3 = new Libro("El Libro De Las Brujas", "Husain, Shahrukh", "H-1060-Z", new Date(), true, null);
        Libro objLibro4 = new Libro("Historias De Mujeres Casadas", "Campos, Cristina", "C-1050-Z", new Date(), true, null);
        
        //Estudiantes
        Estudiante estudiante1 = new Estudiante("Maria", 0, null, "Sistemas");
        Estudiante estudiante2 = new Estudiante("Jimmy", 333333, null, "Parvulo");

        Profesor profesorMatematica = new Profesor("Alberto", 22222, null, "Matemáticas");

        //Los usuarios pueden realizar préstamos y devoluciones de libros.
        Prestamo objPrestamo = new Prestamo();
        objPrestamo.setUsuario(estudiante1);
        objPrestamo.setLibro(objLibro3);
        objPrestamo.setFechaPrestamo(new Date());
        boolean isPrestado = objPrestamo.registrarPrestamo(objPrestamo);
        System.out.println("El objeto con usuario "+ estudiante1.nombre+" ha prestado el libro "+objLibro3.titulo+ " y su prestamo fue  "+isPrestado);
    }
}
