public class App {
    public static void main(String[] args) throws Exception {
        Gato silvestre = new Gato("Silvestre", "gato1");
        Gato tom = new Gato("Tom", "gato2");
        silvestre.hazRuido();
        silvestre.peleaCon(tom);
    }
}
