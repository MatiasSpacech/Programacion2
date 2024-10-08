public class Pelicula extends Producto{
    int cantidadCopias;
    String nombre;

    public Pelicula(int cantidadCopias, String nombre) {
        super();
        this.cantidadCopias = cantidadCopias;
        this.nombre = nombre;
    }

    @Override
    public void alquilar() {
        if (cantidadCopias > 0 ) {
            cantidadCopias--;            
        }
        if (cantidadCopias == 0 ) {
            setDisponible(false);            
        }
    }

    @Override
    public void devolver() {
        cantidadCopias++;
        setDisponible(true);
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
