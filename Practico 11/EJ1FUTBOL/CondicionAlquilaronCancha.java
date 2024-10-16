public class CondicionAlquilaronCancha extends Condicion {
    private int cancha;

    public CondicionAlquilaronCancha(int cancha) {
        this.cancha = cancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(cancha);
    }
    


}
