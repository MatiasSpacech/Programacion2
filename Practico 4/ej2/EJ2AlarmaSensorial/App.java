public class App {
    public static void main(String[] args) {
        Alarma alarma1 = new Alarma();
        alarma1.agregarSensor("living");
        alarma1.agregarSensor("pieza1");
        alarma1.agregarSensor("pieza2");
        alarma1.agregarSensor("baño");
        alarma1.modificarEstadoSensor("baño");
        alarma1.modificarEstadoSensor("living");
        alarma1.comprobar();
        System.out.println("//////////////////ALARMA LUMINOSA///////////////////");
        Alarmaluminosa alarmaluminosa1 = new Alarmaluminosa();
        alarmaluminosa1.agregarSensor("patio");
        alarmaluminosa1.agregarSensor("pieza1");
        alarmaluminosa1.agregarSensor("pieza2");
        alarmaluminosa1.agregarSensor("baño");
        alarmaluminosa1.modificarEstadoSensor("baño");
        alarmaluminosa1.modificarEstadoSensor("patio");
        alarmaluminosa1.comprobar();

        


       
    }

}
