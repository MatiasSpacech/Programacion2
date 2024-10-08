package EJ4ADMINISTRADORDETAREAS;

import java.util.ArrayList;

public abstract class Elemento {
    public abstract double getCosto();
    public abstract int getTiempoEstimado();
    public abstract ArrayList<String> accionesARealizar();
    public abstract int cantidadDeTareas();
}
