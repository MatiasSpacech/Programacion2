package Ej8congreso;
import java.util.ArrayList;
public class SistemaAsignador {
    ArrayList<Evaluador> evaluadores;
    ArrayList<Trabajo> trabajos;
    public SistemaAsignador() {
        this.trabajos = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
    }
    
    public void agregarTrabajo(Trabajo trabajo){
        this.trabajos.add(trabajo);
    }
    


    

    public void agregarEvaluadores(Evaluador ev){
        this.evaluadores.add(ev);
    }
}
