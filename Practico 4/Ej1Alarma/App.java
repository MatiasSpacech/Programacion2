public class App {
    public static void main(String[] args) {
        Alarma alarma1 = new Alarma();

        alarma1.setMovimiento(true);
        System.out.println("//////////////////ALARMA (SONORA)////////////////////////////");
        alarma1.comprobar();
        alarma1.setMovimiento(false);
        alarma1.comprobar();
        System.out.println("//////////////////ALARMA LUMINOSA////////////////////////////");
        Alarmaluminosa alarma2 = new Alarmaluminosa();
        alarma2.comprobar();
        alarma2.setRomnpioVidrio(true);
        alarma2.comprobar();
    }

}
