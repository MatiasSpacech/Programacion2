public class Vehiculo extends Producto {
    private String marca;
    private int km;
    private String patente;

    public Vehiculo(String marca, int km, String patente) {
        super();
        this.marca = marca;
        this.km = km;
        this.patente = patente;
    }

    @Override
    public void alquilar() {
        setDisponible(false);       
       
    }
    @Override
    public void devolver() {
        setDisponible(true);        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

}
