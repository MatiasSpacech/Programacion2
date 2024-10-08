public class FiltroNombreParcial extends Filtro {
    String nombreABuscar;

    public FiltroNombreParcial(String nombreABuscar) {
        this.nombreABuscar = nombreABuscar;
    }

    @Override
    public boolean cumple(Documento documento) {
        return documento.getTitulo().contains(nombreABuscar);
    }   

}
