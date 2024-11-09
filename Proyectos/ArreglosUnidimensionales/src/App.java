public class App {
    //Scope
    public static void main(String[] args) throws Exception {
        String nombre = "Pedro";
        String nombre2 = "Maria";
        String nombre3 = "Juan";
        String nombre4 = "Jessica";
        
        String[] listadoNombres = {"Pedro", "Maria", "Juan", "Jessica", "Walther", "Karen", "Anabelle"};
        //System.out.println(nombre3);
        /*System.out.println(listadoNombres[0]);
        System.out.println(listadoNombres[1]);
        System.out.println(listadoNombres[2]);
        System.out.println(listadoNombres[3]);
        System.out.println(listadoNombres.length);*/
        listadoNombres[0] = "Alberto";
        listadoNombres[1] = "";
        listadoNombres[7] = "Jennifer";
        for(int incrementador = 0; incrementador < listadoNombres.length; incrementador++){
            System.out.println("["+incrementador+"]  "+ listadoNombres[incrementador]);
        }
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        for(int decrementador = (listadoNombres.length - 1); decrementador >= 0; decrementador--){
            System.out.println("["+decrementador+"]  "+ listadoNombres[decrementador]);
        }
        String cadena1 = "Hola";
        String cadena2 = " Mundo";
        System.out.println(cadena1+cadena2);
        cadena2 = null;
        System.out.println(cadena1+cadena2);
    }
}
