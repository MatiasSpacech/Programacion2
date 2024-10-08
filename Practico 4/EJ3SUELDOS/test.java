public class test {
    public static void main(String[] args) {
        LiquidacionSueldos sueldosliq = new LiquidacionSueldos();
        Empleado e1 = new Empleado(3000, "tomas");
        sueldosliq.agregarEmpleado(e1);
        EmpleadoPorHora.setValorHora(500);
        EmpleadoPorHora eHoras = new EmpleadoPorHora("mateo", 1000, 20);
        sueldosliq.agregarEmpleado(eHoras);
        System.out.println(sueldosliq.pagoDeSueldo("tomas"));
        System.out.println(sueldosliq.pagoDeSueldo("mateo"));
        EmpleadoAComision eComi = new EmpleadoAComision(500, "carlos", 40);
        sueldosliq.agregarEmpleado(eComi);
        System.out.println(sueldosliq.pagoDeSueldo("carlos"));
    /* 
    Empleado em1 = new Empleado(20000, "pepito");
    EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("carlos", 20000, 40);
    System.out.println(empleadoPorHora.getSueldo());
    EmpleadoPorHora.setValorHora(3000);
    System.out.println(empleadoPorHora.getSueldo());
*/
    }

}
