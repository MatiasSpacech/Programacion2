public class EmpleadoAComision extends Empleado{
    private double cantidadVentas;
    static double premioPorVenta = 100;

    public EmpleadoAComision(double sueldo, String nombre, int cantidadVentas) {
        super(sueldo, nombre);
        this.cantidadVentas = cantidadVentas;
    }
    
    public double getSueldo(){
        return super.getSueldo() + premioPorVenta*cantidadVentas;
    }
    

}
