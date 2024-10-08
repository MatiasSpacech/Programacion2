public class FiltroAnd extends Filtro{
    Filtro filtro1;
    Filtro filtro2;
    public FiltroAnd(Filtro f1, Filtro f2){
        this.filtro1 = f1;
        this.filtro2 = f2;
    }
    @Override
    public boolean cumple(Documento documento) {
       return(filtro1.cumple(documento)&& filtro2.cumple(documento));
    }
    
}
