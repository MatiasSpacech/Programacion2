import java.util.ArrayList;

public class Cliente {
    private String nombre;
    public ArrayList<Alquiler> alquileres;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void agregarAlquiler(Alquiler alquiler){
        this.alquileres.add(alquiler);
   }
   public boolean tieneAlquilerVencido(){
        for (Alquiler alquiler : alquileres) {
            if (alquiler.esVencidoElAlquiler()){
                return true;
            }                
        }return false;
    }

@Override
public String toString() {
    return "Cliente [nombre=" + nombre + ", alquileres=" + alquileres + "]";
}


}
        
