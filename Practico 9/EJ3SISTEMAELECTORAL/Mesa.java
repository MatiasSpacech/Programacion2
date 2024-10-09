import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends ElementoMesa{
    private String Nombre;
    private ArrayList<String> padron;
    private ArrayList<Voto> votos;
    public Mesa(String nombre) {
        Nombre = nombre;
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    public void addVotante(String dni){
        if (!this.padron.contains(dni)) {
            this.padron.add(dni);            
        }
    }
    public void votar(Voto voto, String dni){
        if (padron.contains(dni)){
            this.votos.add(voto);
        }
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public int cantidadTotalVotos() {
        return votos.size();
    }

    @Override
    public int cantidadVotosXcandidato(Candidato candido) {
        int suma =0;
        for (Voto voto: votos) {
            if (voto.getCandidato().equals(candido)) {
                suma++;
            }            
        }
        return suma;
    }

    @Override
    public int cantidadVotosEnPeriodo(LocalTime inicio, LocalTime fin) {
        int suma=0;
        for (Voto voto: votos) {
            if (voto.getHoraVoto().isAfter(inicio) && voto.getHoraVoto().isBefore(fin) ) {
                suma++;
            }
        } return suma;
    }

   
}
