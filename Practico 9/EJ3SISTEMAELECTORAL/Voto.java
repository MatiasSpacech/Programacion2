import java.time.LocalTime;

public class Voto {
    private Candidato candidato;
    private LocalTime horaVoto;
    public Voto(Candidato candidato) {
        this.candidato = candidato;
        this.horaVoto = LocalTime.now();
    }
    public Candidato getCandidato() {
        return candidato;
    }
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    public LocalTime getHoraVoto() {
        return horaVoto;
    }
    public void setHoraVoto(LocalTime horaVoto) {
        this.horaVoto = horaVoto;
    }
}
