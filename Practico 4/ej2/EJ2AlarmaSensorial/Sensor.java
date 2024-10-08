/*2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto (pueden ser más de una) */
public class Sensor {
    String zona;
    String tipo;
    boolean estado;
    public Sensor(String zona, String tipo, boolean estado) {
        this.zona = zona;
        this.tipo = tipo;
        this.estado = estado;
    }
    public Sensor(String zona){
        this(zona, "movimiento", false);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sensor other = (Sensor) obj;
        if (zona == null) {
            if (other.zona != null)
                return false;
        } else if (!zona.equals(other.zona))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (estado != other.estado)
            return false;
        return true;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
