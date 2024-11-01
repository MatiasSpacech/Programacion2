package EJ4ADMINISTRADORDETAREAS;

import java.util.ArrayList;

public class TareaSimple extends Elemento{
    private String accion;
    private double costo;
    private int tiempoEstimado; //en minutos
    

    public TareaSimple(String accion, double costo, int tiempoEstimado) {
        this.accion = accion;
        this.costo = costo;
        this.tiempoEstimado = tiempoEstimado;
    }

    
    public String getAccion() {
        return accion;
    }


    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getCantidaTareasSimples() {
        return 1;
    }

    public double getCosto() {
        return costo;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }


    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    public int cantidadDeTareas(){
        return 1;
    }


    @Override
    public ArrayList<String> accionesARealizar() {
        ArrayList<String> accion= new ArrayList<>();
        accion.add(this.getAccion());
        return accion;
    }
    
    


}
