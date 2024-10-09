import java.time.LocalTime;
import java.util.ArrayList;

public class ConjuntoMesas extends ElementoMesa{
    private String nombre;
    private ArrayList<ElementoMesa> elementosMesas;

    public ConjuntoMesas(String nombre) {
        this.nombre = nombre;
        this.elementosMesas = new ArrayList<>();
    }

    public void addElementoMesa(ElementoMesa elem){
        this.elementosMesas.add(elem);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int cantidadTotalVotos() {
        int suma=0;
        for (ElementoMesa elementoMesa : elementosMesas) {
            suma+=elementoMesa.cantidadTotalVotos();
        }
        return suma;
    }

    @Override
    public int cantidadVotosXcandidato(Candidato candido) {
        int suma =0;
        for (ElementoMesa elementoMesa : elementosMesas) {
            suma += elementoMesa.cantidadVotosXcandidato(candido);
        }
        return suma;
    }

    @Override
    public int cantidadVotosEnPeriodo(LocalTime inicio, LocalTime fin) {
        int suma =0;
        for (ElementoMesa elementoMesa : elementosMesas) {
            suma += elementoMesa.cantidadVotosEnPeriodo(inicio, fin);
        }
        return suma;
        
    }
    

}
