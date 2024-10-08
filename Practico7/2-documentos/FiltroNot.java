public class FiltroNot extends Filtro {
    Filtro filtro1;
    
    public FiltroNot(Filtro f1){
        this.filtro1 = f1;
    }
    @Override
    public boolean cumple(Documento documento) {
       return(!filtro1.cumple(documento));
    }
}
