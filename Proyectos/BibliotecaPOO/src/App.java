import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Libro crucesSobreElAgua = new Libro();
        crucesSobreElAgua.titulo = "Las cruces sobre el agua";
        crucesSobreElAgua.autor = "Joaquin Gallegos Lara";
        crucesSobreElAgua.anioPublicacion = new Date();
        crucesSobreElAgua.setIsbn("5094309584395bbb53");
        crucesSobreElAgua.estado = true;
        Libro elPrincipito = new Libro();
        elPrincipito.titulo = "El Principito";
        elPrincipito.autor = "Antoine de Saint-Exupéry";
        elPrincipito.anioPublicacion = new Date();
        elPrincipito.estado = false;

        crucesSobreElAgua.titulo = "La culpa de la vaca";
        crucesSobreElAgua.prestar(crucesSobreElAgua.getIsbn());

        elPrincipito.prestar(elPrincipito.titulo);
    }
}
