package EJ3ONEPIECE;

public class FrutaMasFijo extends Fruta{
    private int valorFijo;    

    public FrutaMasFijo(int valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public int getFuerza(Personaje pj) {
       return  valorFijo;
    }
}
