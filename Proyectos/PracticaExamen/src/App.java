import java.util.StringTokenizer;

public class App {
    /**
     * Escribe un programa en Java que solicite al usuario una cadena de texto 
     * y cuente la cantidad de vocales que contiene. Considera tanto vocales en 
     * minúsculas como en mayúsculas.
     * 
     * estO es Un ejEmplo
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese la cadena de texto  ");
        String cadena = System.console().readLine();
        cadena = cadena.toUpperCase();
        /*int contabiliceUnaVocal = 0;
        for(int incremento = 0; incremento < cadena.length(); incremento++){
            if (cadena.charAt(incremento) == 'A' ||
                cadena.charAt(incremento) == 'E' ||
                cadena.charAt(incremento) == 'I' ||
                cadena.charAt(incremento) == 'O' ||
                cadena.charAt(incremento) == 'U'
            ) {
                contabiliceUnaVocal++;
            }
        }
        System.out.println("La cantida de vocales es "+contabiliceUnaVocal);*/

        int cantidad = cadena.length() - cadena.toLowerCase().replaceAll("a|e|i|o|u", "").length();
        System.out.println("La cantida de vocales es "+cantidad);
    }
}
