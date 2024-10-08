import java.util.ArrayList;

public class Cultivo {
    String nombre;
    ArrayList<Enfermedad> enfermedades;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addEnfermedad(Enfermedad enfermedad){
        this.enfermedades.add(enfermedad);
    }   
/*Asimismo, dado un producto químico, los cultivos son capaces de decir si en algún momento
puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus enfermedades
frecuentes y no se desaconseja su uso en el cultivo. Se considera que el agroquímico trata una
enfermedad si todos los estados patológicos de la enfermedad están contenidos por las acciones
del producto químico. */
    public boolean esDeUtilidadElQuimico(Agroquimico quimico){
        for (Enfermedad enfermedad : enfermedades) {
            if (quimico.existePatologias(enfermedad.getEstadosPatologicos()) && true) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(Object obj) {
        try {
            Cultivo otro = (Cultivo) obj;
            return this.nombre.equals(otro.nombre)
        } catch (Exception e) {
            return false;
        }        
    }
       

}
