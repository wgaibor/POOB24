public class App {
    /**
     * Escribe un programa en Java que solicite al usuario que ingrese 
     * el número de un mes (1 al 12) y muestre en pantalla el nombre del mes correspondiente.
     *  Utiliza la sentencia "switch" para implementar la lógica.
        El programa debe seguir los siguientes pasos:
        Solicitar al usuario que ingrese un número de mes.
        Utilizar la sentencia "switch" para evaluar el número ingresado.
        Para cada caso, imprimir en pantalla el nombre del mes correspondiente.
        Si el número ingresado no se encuentra en el rango válido (1 al 12), mostrar un mensaje de error.
        ¡Recuerda que los nombres de los meses deben estar en español!
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese un número del 1 al 12");
        String valorMes = System.console().readLine();
        int numero = Integer.valueOf(valorMes);
        String mes;
        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Hay un error!";
                break;
        }
        System.out.println(mes);
    }
}
