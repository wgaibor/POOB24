public class App {
    /**
     * Muestra la tabla de multiplicar de un número introducido por teclado.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa un nùmero");
        String valor = System.console().readLine();
        int numero = Integer.valueOf(valor);
        for(int incremento = 0; incremento <= 12; incremento++) {
            int resultado = numero * incremento;
            System.out.println(numero+" * "+incremento+" = "+resultado);
        }
    }
}
