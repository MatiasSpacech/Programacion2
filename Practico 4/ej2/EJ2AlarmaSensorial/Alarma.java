/*2- Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se
cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de
la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen
nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por
pantalla el nombre de la zona en conflicto (pueden ser más de una)*/

import java.util.ArrayList;

public class Alarma {
    ArrayList<Sensor> sensores;
    Timbre timbre;
    public Alarma() {
        this.sensores = new ArrayList<Sensor>();
        this.timbre = new Timbre();
    }
    public void agregarSensor(String zona){  /////+preguntar
        this.sensores.add(new Sensor(zona));
    }
    public void modificarEstadoSensor(String zona){
        for (Sensor sensor : sensores) {
            if (sensor.getZona() == zona){
                sensor.setEstado(true);
            }
        }
    }
    public boolean comprobar(){
        boolean hayEvento = false;
        for (Sensor sensor : sensores) {
            if (sensor.getEstado()){
                System.out.println("Hay algo raro en la zona del "+sensor.getZona()+"!!!!!");
                timbre.hacerSonar();
                hayEvento= true;                
            }
        }
        return hayEvento;
    }
    
}

