import java.util.ArrayList;

public class Agroquimico {
    String nombre;
    ArrayList<String> estadosPatologicos;
    ArrayList<Cultivo> cultivosDesaconsejados;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addEstadoPatologico(String patologia){
        this.estadosPatologicos.add(patologia);
    }
    
    public void addCultivoDesaconsejado(Cultivo cultivo){
        this.cultivosDesaconsejados.add(cultivo);
    }

    public boolean existePatologia(String patologia){
        return this.estadosPatologicos.contains(patologia);
    }

    public boolean existePatologias( ArrayList<String> patologias){
        return this.estadosPatologicos.containsAll(patologias);
    }
        
    public boolean existeCultivoDesaconsejado(Cultivo cultivo){
        return this.cultivosDesaconsejados.contains(cultivo);
    }

}
