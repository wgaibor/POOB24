public class Gato extends Animal implements Mascotas, DibujoAnimado{

    public Gato(String nombre, String codigo){
        super(nombre, codigo);
    }

    @Override
    public void hazRuido() {
        System.out.println("El objeto gato esta haciendo ruido");
    }

    @Override
    public void come(String comida) {
        System.out.println("El objeto gato esta comiendo  "+comida);
    }

    @Override
    public void peleaCon(Animal contrincante) {
        System.out.println("El objeto esta peleando con  "+contrincante.toString());
    }

    public void maulla() {
        System.out.println("Miua");
    }

    public void ronronea() {
        System.out.println("rrrrrr");
    }

    @Override
    public void dibujar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dibujar'");
    }

    @Override
    public void actuar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actuar'");
    }
    
    @Override
    public String toString() {
        return "No quiero decirte como me llamo";
    }
}
