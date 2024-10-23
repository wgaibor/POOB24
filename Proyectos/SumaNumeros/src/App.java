public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese el primer número  ");
        String numero1 = System.console().readLine();

        System.out.println("Ingresa el segundo número");
        String numero2 = System.console().readLine();

        int resultado = Integer.valueOf(numero1)  +  Integer.valueOf(numero2);
        System.out.println("El resultado es  "+resultado);
    }
}
