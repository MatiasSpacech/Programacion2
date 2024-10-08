import java.util.ArrayList;

public class Encuesta {
    ArrayList<Pregunta> preguntas;
    private Persona encuestado;
    private Empleado encuestador;
    
    public Encuesta(Persona encuestado, Empleado encuestador) {
        this.encuestado = encuestado;
        this.encuestador = encuestador;
        this.preguntas = new ArrayList<>();
    }
    
    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(String pregunta) {
        this.preguntas.add(new Pregunta(pregunta));
    }
    public Persona getEncuestado() {
        return encuestado;
    }
    public void setEncuestado(Persona encuestado) {
        this.encuestado = encuestado;
    }
    public Empleado getEncuestador() {
        return encuestador;
    }
    public void setEncuestador(Empleado encuestador) {
        this.encuestador = encuestador;
    }
    
}
