public class CondicionOr extends Condicion{
    Condicion c1, c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Socio socio) {
        return c1.cumple(socio)||c2.cumple(socio);
    }
}
