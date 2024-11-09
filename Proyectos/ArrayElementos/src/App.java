import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lstEmpleado = new ArrayList<>();
        lstEmpleado.add("Juan");
        lstEmpleado.add("Maria");
        lstEmpleado.add("Johana");
        lstEmpleado.set(1, "Juana");
        lstEmpleado.add("Mario");
        System.out.println(lstEmpleado.toString());
        mostrarPersona(lstEmpleado);
    }
        
    private static void mostrarPersona(ArrayList<String> lstEmpleado) {
        System.out.println(lstEmpleado.get(1));
    }
}
