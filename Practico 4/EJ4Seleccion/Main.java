public class Main {
    public static void main(String[] args) {
        Equipo boca = new Equipo();
        Futbolista cacho = new Futbolista("delantero", "derecho", "aa001");
        cacho.setNombre("cacho");
        boca.addIntegrante(cacho);
        Futbolista jose = new Futbolista("delantero", "derecho", "aa002");
        jose.setNombre("jose");
        boca.addIntegrante(jose);
        jose.setEnElPais(false);
        boca.isDisponible("aa001");
        boca.isDisponible("aa002");


    }

}
