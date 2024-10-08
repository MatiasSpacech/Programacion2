public class FiltroNombreExacto extends Filtro {
    String nombreABuscar;

    public FiltroNombreExacto(String nombreABuscar) {
        this.nombreABuscar = nombreABuscar;
    }

    @Override
    public boolean cumple(Documento documento) {
        return this.nombreABuscar.equals(documento.getTitulo());
    }    

}
