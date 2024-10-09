
import java.time.LocalTime;
public abstract class ElementoMesa {
    public abstract int cantidadTotalVotos();
    public abstract int cantidadVotosXcandidato(Candidato candido);
    public abstract int cantidadVotosEnPeriodo(LocalTime inicio, LocalTime fin);
    public double porcentajeVotosXCandidato(Candidato candido){
        int votosXCandidato = cantidadVotosXcandidato(candido);
        int totalVotos = cantidadTotalVotos();
        return (double) (votosXCandidato/totalVotos)*100;
    }

}
