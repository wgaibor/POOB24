public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa el número de mes");
        String caracterIngresado = System.console().readLine();
        int valor = Integer.valueOf(caracterIngresado);
        /*if(valor == 1) {
            System.out.println("Enero");
        } else if (valor == 2) {
            System.out.println("Febrero");
        } else if (valor == 3) {
            System.out.println("Marzo");
        } else if(valor == 4){
            System.out.println("Abril");
        } else if (valor == 5) {
            System.out.println("Mayo");
        } else if (valor == 6) {
            System.out.println("Junio");
        } else if(valor == 7){
            System.out.println("Julio");
        }*/
        switch (valor) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No se puede evaluar el mes ingresado, favor revisar");
                break;
        }
    }
}
