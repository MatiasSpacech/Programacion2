import java.util.Comparator;

public class ComparadoCantidadAlquileresPorCancha implements Comparator<Socio>{
    private int cancha;

    public ComparadoCantidadAlquileresPorCancha(int cancha) {
        this.cancha = cancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.cantidadAlquileresCancha(cancha) - o2.cantidadAlquileresCancha(cancha);
    }


}
