import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio>{
    Comparator<Socio> criterio1, criterio2;

    public ComparadorCompuesto(Comparator<Socio> criterio1, Comparator<Socio> criterio2) {
        this.criterio1 = criterio1;
        this.criterio2 = criterio2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
       int retorno= criterio1.compare(o1, o2);
       if (retorno == 0){
            retorno = criterio2.compare(o1, o2);
       }
       return retorno;

    }

}
