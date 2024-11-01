package EJ4ADMINISTRADORDETAREAS;

import java.util.ArrayList;

public class TareaCompuesta extends Elemento{
    private int tiempoEntreTareas; // CONSULTAR SI TAREA COMPUESTA METALMECANIZADA ES IGUAKL A TAREA COMPUESTA
    private ArrayList<Elemento> tareas;
    private String especialidad;
    


    public TareaCompuesta(String especialidad,int tiempoEntreTareas) {
        this.tareas = new ArrayList<>();
        this.especialidad = especialidad;
        this.tiempoEntreTareas = tiempoEntreTareas;
    }
    public int cantidadDeTareas(){
        return this.accionesARealizar().size();
    }
    
    public ArrayList<String> accionesARealizar(){
        ArrayList<String> acciones = new ArrayList<>();
        for (Elemento tarea : tareas) {        
            acciones.addAll(tarea.accionesARealizar());
            }
        return acciones;
    }

    public void addTarea(Elemento tarea){
        this.tareas.add(tarea);
    }

    @Override
    public double getCosto() {
        double sumaCosto = 0;
        for (Elemento tarea : tareas) {
            sumaCosto += tarea.getCosto();
        }
        return sumaCosto;        
    }
    @Override
    public int getTiempoEstimado() {
        int sumaMinutos= 0;
        for (Elemento tarea : tareas) {                        
            sumaMinutos += tarea.getTiempoEstimado() +tiempoEntreTareas;   //consultar el +10 cuenta todas las tareas         
        }
        return sumaMinutos;        
    }   
    public int getCantidaTareasSimples() {
        int sumaMinutos= 0;
        for (Elemento tarea : tareas) {                        
            sumaMinutos+=          
        }
        return sumaMinutos;        
    }   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public  int getTiempoEntreTareas() {
        return tiempoEntreTareas;
    }
    public void setTiempoEntreTareas(int tiempoEntreTareas) {
        this.tiempoEntreTareas = tiempoEntreTareas;
    }

}
