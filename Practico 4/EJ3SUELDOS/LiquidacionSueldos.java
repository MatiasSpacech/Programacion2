import java.util.ArrayList;

public class LiquidacionSueldos {
    ArrayList<Empleado> empleados;

    public LiquidacionSueldos(){
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado e1){
        this.empleados.add(e1);
    }
    public double pagoDeSueldo(String name){
        for (Empleado empleado : empleados) {
            if (empleado.getNombre() == name){
                return empleado.getSueldo();
            }            
        }
        return -1;
    } 
}
