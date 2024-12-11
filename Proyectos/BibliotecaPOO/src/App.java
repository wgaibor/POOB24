import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static final int CANTIDAD_MAX_LIBRO = 3;
    public static void main(String[] args) throws Exception {
        //Libros
        Libro objLibro1 = new Libro("La Familia", "Ferrer Soria, Isidro; Mesa, Sara", "A-0060-Z", 
                                    new Date(), true, null);
        Libro objLibro2 = new Libro("Ceniza En La Boca", "Navarro, Brenda", "A-0050-Z", 
                                    new Date(), true, null);
        Libro objLibro3 = new Libro("El Libro De Las Brujas", "Husain, Shahrukh", "H-1060-Z", 
                                    new Date(), true, null);
        Libro objLibro4 = new Libro("Historias De Mujeres Casadas", "Campos, Cristina", "C-1050-Z", 
                                    new Date(), true, null);
        
        //Estudiantes
        Estudiante estudiante1 = new Estudiante("Maria", 111111, null, "Sistemas");
        Estudiante estudiante2 = new Estudiante("Jimmy", 333333, null, "Parvulo");
        estudiante2.

        Profesor profesorMatematica = new Profesor("Alberto", 22222, null, "Matemáticas");

        //Los usuarios pueden realizar préstamos y devoluciones de libros.
        Prestamo objPrestamo = new Prestamo();
        objPrestamo.setUsuario(estudiante1);
        objPrestamo.setLibro(objLibro3);
        objPrestamo.setFechaPrestamo(new Date());
        boolean isPrestado = objPrestamo.registrarPrestamo(objPrestamo);
        System.out.println("El objeto con usuario "+ estudiante1.nombre+" ha prestado el libro "+objLibro3.titulo+ 
                            " y su prestamo fue  "+isPrestado);

        Prestamo objPrestamo2 = new Prestamo(objLibro2, estudiante2);
        objPrestamo2.registrarDevolucion(objPrestamo2);

        ArrayList<Libro> lstLibros = new ArrayList<>();
        lstLibros.add(objLibro1);
        lstLibros.add(objLibro2);
        lstLibros.add(objLibro3);
        lstLibros.add(objLibro4);
        Profesor profesorPOO = new Profesor("Walther", 4545454, lstLibros, "TI");

        ArrayList<Libro> lstNuevoLibro = new ArrayList<>();
        Libro objLibro5 = new Libro("El principito", "Desconocido", "G-1050-Z", 
                                    new Date(), true, null);
        lstNuevoLibro.add(objLibro5);
        boolean resultadoEsperado = profesorPOO.agregarLibro(lstNuevoLibro, profesorPOO);
        if (resultadoEsperado) {
            System.out.println("El prestamo se realizo con éxito");
        } else {
            System.out.println("Si desea prestar más libros favor devolver los que ya posee");
        }

        ArrayList<Libro> lstDevolverLibros = new ArrayList<>();
        lstDevolverLibros.add(objLibro1);
        lstDevolverLibros.add(objLibro3);
        lstDevolverLibros.add(objLibro4);
        profesorPOO.devolverLibro(lstDevolverLibros, profesorPOO);


        boolean resultadoEsperado2 = profesorPOO.agregarLibro(lstNuevoLibro, profesorPOO);
        if (resultadoEsperado2) {
            System.out.println("El prestamo se realizo con éxito");
        } else {
            System.out.println("Si desea prestar más libros favor devolver los que ya posee");
        }
        profesorPOO.mostrarInformacion(profesorPOO);
        estudiante1.mostrarInformacion(estudiante1);
    }
}
