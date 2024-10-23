public class App {
    // comentario de una sola línea

    /*
     * Comentario 1
     * Comentario 2 
     */
    public static void main(String[] args) throws Exception {
        int numero = 5;
        Integer numero2 = 3;
        
        final Double PI = 3.14;
        //PI = 8;
        int resultado = numero % numero2;
        //System.out.println(resultado);

        String nombre = "Maria";
        //System.out.println(nombre);
        String parrafo = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";
        //System.out.println(parrafo);

        /*int valor = 11;
        if (valor % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        valor++;
        valor++;
        System.out.println(valor);
        valor++;
        valor++;
        System.out.println(valor);*/

        int valor1 = 9;
        int valor2 = 4;

        Double resultadoDivision = (double) valor1/ (double) valor2;
        System.out.println(resultadoDivision);

        System.out.println("Ingresa un valor de caracter:");
        String valorDelCaracter = System.console().readLine();
        System.out.println("El texto es ingresado es:  "+valorDelCaracter);
    }
}
