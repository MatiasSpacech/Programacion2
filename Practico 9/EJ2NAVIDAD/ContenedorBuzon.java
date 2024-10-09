import java.util.ArrayList;

public class ContenedorBuzon extends ElementoBuzon{
    public String nombre;
    ArrayList<ElementoBuzon> buzones;
    public ContenedorBuzon(String nombre) {
        this.nombre = nombre;
        this.buzones = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addElementoBuzon(ElementoBuzon elemento) {
        this.buzones.add(elemento);
    }
    
    @Override
    public int cantidadCartasrecibidas() {
        int suma =0;
        for (ElementoBuzon elementoBuzon : buzones) {
            suma += elementoBuzon.cantidadCartasrecibidas();       
        }
         return suma;
    }
    @Override
    public int cantidadDeCartasporRegalo(String regalo) {
       int suma =0;
       for (ElementoBuzon elementoBuzon : buzones) {
            suma+= elementoBuzon.cantidadDeCartasporRegalo(regalo);
       }
       return suma;
    }

    


}
