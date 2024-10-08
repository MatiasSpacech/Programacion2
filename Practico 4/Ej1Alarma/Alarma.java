/*1 - Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender(). */

public class Alarma {
    boolean romnpioVidrio;
    boolean abrioPuertaVentana;
    boolean movimiento;
    Timbre timbre;
    
    public Alarma() {
        this.romnpioVidrio = false;
        this.abrioPuertaVentana = false;
        this.movimiento = false;
        timbre = new Timbre();
    }
    /*public void comprobar(){    PREGUNTARRRRRRRRRRRRRRRRRRR
        if ((romnpioVidrio== true)||(abrioPuertaVentana== true)||(movimiento== true)) {
            this.timbre.hacerSonar();                        
        }
    }*/
    public boolean comprobar(){
        if ((romnpioVidrio== true)||(abrioPuertaVentana== true)||(movimiento== true)){
            this.timbre.hacerSonar();
            return true;
        }
        return false;
    }
    
    public boolean isRomnpioVidrio() {
        return romnpioVidrio;
    }

    public void setRomnpioVidrio(boolean romnpioVidrio) {
        this.romnpioVidrio = romnpioVidrio;
    }

    public boolean isAbrioPuertaVentana() {
        return abrioPuertaVentana;
    }

    public void setAbrioPuertaVentana(boolean abrioPuertaVentana) {
        this.abrioPuertaVentana = abrioPuertaVentana;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }

    
}

