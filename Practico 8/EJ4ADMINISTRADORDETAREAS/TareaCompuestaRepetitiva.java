package EJ4ADMINISTRADORDETAREAS;

import java.util.ArrayList;

public class TareaCompuestaRepetitiva extends TareaCompuesta{
    private int repeticiones;

    public TareaCompuestaRepetitiva(String especialidad,int tiempoEntreTareas, int repeticiones) {
        super(especialidad,tiempoEntreTareas);
        this.repeticiones = repeticiones;
    }
    @Override
    public double getCosto(){
        return super.getCosto()* this.repeticiones;
    }
    public int getTiempoEstimado(){
        return super.getTiempoEstimado()* this.repeticiones;
    }
    public ArrayList<String> accionesARealizar(){
        ArrayList<String> resultado = new ArrayList<>();
        ArrayList<String> acciones = super.accionesARealizar();
        for (int i = 0; i < this.repeticiones; i++) {
            for (String accion : acciones) {
                resultado.add(accion);
            }
        }
        return resultado;
    }
}
