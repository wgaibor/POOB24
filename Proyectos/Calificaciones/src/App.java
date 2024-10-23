public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresar calificación");
        String calificacion = System.console().readLine();
        int valor = Integer.valueOf(calificacion);
        if(valor <=6){
            System.err.println("Baja");
        }
        else if(valor <= 8){
            System.out.println("Regular");
        }  else if(valor <= 9){
            System.out.println("Buena");
        }  else {
            System.out.println("Excelente");
        }
    }
}
