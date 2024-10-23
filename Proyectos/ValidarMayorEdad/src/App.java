public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Indicame tu edad: ");
        String edad = System.console().readLine();
        int valor = Integer.valueOf(edad);
        if(valor > 18) 
        {
            System.out.println("Mayor de edad");
        } 
        else
        {
            System.out.println("Menor de edad");
        }
    }
}
