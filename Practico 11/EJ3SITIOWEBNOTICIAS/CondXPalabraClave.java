public class CondXPalabraClave extends Condicion{
    private String palabra;

    public CondXPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabraClave(palabra);
    }
    


}
