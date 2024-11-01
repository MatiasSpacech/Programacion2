import java.util.ArrayList;

public class PiezaCompuesta extends Elemento{
    public static final int extrasegundos=45;
    private ArrayList<Elemento> elementos;
    
    public PiezaCompuesta(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.elementos= new ArrayList<>();        
    }
    public void addElemento(Elemento elemento){
        this.elementos.add(elemento);
    }

    @Override
    public int getTiempoImpresion() {
        int tiemposumado=0;
        for (Elemento elemento : elementos) {
            tiemposumado += elemento.getTiempoImpresion();
        }
        return tiemposumado+45;        
    }

    @Override
    public int cantidadPiezasSimples() {
        int sumador=0;
        for (Elemento elemento : elementos) {
            sumador +=elemento.cantidadPiezasSimples();
        }
        return sumador;
    }

    

}
