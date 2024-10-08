package EJ3ONEPIECE;

public class Frutacombinada extends Fruta {
    private Fruta f1;
    private Fruta f2;
    public Frutacombinada(Fruta f1, Fruta f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public int getFuerza(Personaje pj) {
        return f1.getFuerza(pj)+ f2.getFuerza(pj);
    }
    
}
