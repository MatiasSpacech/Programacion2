import java.util.ArrayList;

public class Enfermedad {
    String nombre;
    ArrayList<String> estadosPatologicos;
    
    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addEstadoPatologico(String patologia){
        this.estadosPatologicos.add(patologia);
    }
    public boolean existePatologia(String patologia){
        return this.estadosPatologicos.contains(patologia);
    }
    public ArrayList<String> getEstadosPatologicos(){
        ArrayList<String> retorno = new ArrayList<>();
        for (String string : estadosPatologicos) {
            retorno.add(string);
        }
        return retorno;
    }

}
