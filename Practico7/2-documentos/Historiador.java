import java.util.ArrayList;

public class Historiador {
    private String nombre;
    private ArrayList<Documento> documentos;
    
    public Historiador(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addDocumento(Documento documento){
        if (!this.documentos.contains(documento)){
            this.documentos.add(documento);
        }
    }
    public ArrayList<Documento> buscarDocumentos(Filtro filtro){
        ArrayList<Documento> resultado = new ArrayList<>();
        for (Documento documento : documentos) {
            if (filtro.cumple(documento)){
                resultado.add(documento);
            }
        }
        return resultado;
    }
}
