package EJ4ADMINISTRADORDETAREAS;

public class app {
    public static void main(String[] args) {
        TareaSimple t1 = new TareaSimple("Ordenar", 100, 20);
        TareaSimple t2 = new TareaSimple("Batir", 100, 20);
        TareaSimple t3 = new TareaSimple("Dejar descansar", 100, 20);
        //TareaSimple t4 = new TareaSimple("hornear", 100, 20);
        TareaCompuestaRepetitiva tc1 = new TareaCompuestaRepetitiva("Cocinar",10, 3);
        TareaCompuesta tc2 = new TareaCompuesta("Finalizar",10);
        tc2.addTarea(t3);
        tc1.addTarea(t1);
        tc1.addTarea(t2);
        tc1.addTarea(tc2);

        System.out.println(tc1.accionesARealizar());
        System.out.println(tc1.getCosto());
        System.out.println(tc1.getTiempoEstimado());
        System.out.println(tc1.cantidadDeTareas());


    }

}
