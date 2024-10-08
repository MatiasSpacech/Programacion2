public class FiltroPorAutor extends Filtro{
    private String autorABuscar;

    public FiltroPorAutor(String autorABuscar) {
        this.autorABuscar = autorABuscar;
    }

    @Override
    public boolean cumple(Documento documento) {
       return documento.contieneAutor(autorABuscar);
    }    

}
