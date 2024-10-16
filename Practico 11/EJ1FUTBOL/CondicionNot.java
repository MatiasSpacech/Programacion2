public class CondicionNot extends Condicion{

    Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !c1.cumple(socio);
    }

}
