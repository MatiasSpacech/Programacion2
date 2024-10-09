import java.util.ArrayList;

public class Buzon extends ElementoBuzon{
    private String nombre;
    private ArrayList<Integer> ninosBuenos;
    ArrayList<Carta> Cartas;
    public Buzon(String nombre) {
        this.nombre = nombre;
        this.ninosBuenos = new ArrayList<>();
        this.Cartas = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addnino(Integer nino){
        this.ninosBuenos.add(nino);
    }
    
    public void addCarta(Carta carta){
        if (!this.Cartas.contains(carta)) {       
            if (!this.ninosBuenos.contains(carta.getDniRemitente())) {
                carta.setCarbonOn();
                this.Cartas.add(carta);            
            }else {
                this.Cartas.add(carta);
            }
        }
    }
    @Override
    public int cantidadCartasrecibidas() {
        return this.Cartas.size();
    }
    @Override
    public int cantidadDeCartasporRegalo(String regalo) {
        int suma =0;
        for (Carta carta : Cartas) {
            if (carta.contieneRegalo(regalo)) {
                suma++;
            }               
        }
        return suma; 
    }   



}
