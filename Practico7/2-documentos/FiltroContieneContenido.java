public class FiltroContieneContenido extends Filtro{
    String contenidoABuscar;

    public FiltroContieneContenido(String contenidoABuscar) {
        this.contenidoABuscar = contenidoABuscar;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getContenido().contains(contenidoABuscar);
    }
    
}
