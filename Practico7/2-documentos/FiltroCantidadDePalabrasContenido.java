public class FiltroCantidadDePalabrasContenido extends Filtro {
    int cantidadDePalabras;
    
    public FiltroCantidadDePalabrasContenido(int cantidadDePalabras) {
        this.cantidadDePalabras = cantidadDePalabras;
    }
    @Override
    public boolean cumple(Documento documento) {
        String[] palabras = documento.getContenido().split("\\s+");
        return (palabras.length >= cantidadDePalabras);
    }

}
