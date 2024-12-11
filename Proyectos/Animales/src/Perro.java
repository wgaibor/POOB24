public class Perro extends Animal implements Mascotas{
    public Perro(String nombre, String codigo){
        super(nombre, codigo);
    }

    @Override
    public void hazRuido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hazRuido'");
    }

    @Override
    public void come(String comida) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'come'");
    }

    @Override
    public void peleaCon(Animal contrincante) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peleaCon'");
    }
}
