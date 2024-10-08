package EJ3ONEPIECE;

public class FrutaPesoPorX extends Fruta{
    private int multiplicador;

    public FrutaPesoPorX(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public int getFuerza(Personaje pj) {
        return pj.getPeso() * multiplicador;
    }
    
}
