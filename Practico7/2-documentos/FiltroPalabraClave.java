public class FiltroPalabraClave extends Filtro {
    String palabraClaveABuscar;

    public FiltroPalabraClave(String palabraClaveABuscar) {
        this.palabraClaveABuscar = palabraClaveABuscar;
    }

    @Override
    public boolean cumple(Documento documento) {
       return documento.contienePalabraclave(palabraClaveABuscar);
    }    

}
