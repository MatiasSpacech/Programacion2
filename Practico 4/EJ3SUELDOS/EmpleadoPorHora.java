
public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    static int ValorHora = 100; //preguntarrrr

    public EmpleadoPorHora( String nombre, double sueldo,int horasTrabajadas){
        super(sueldo,nombre);
        this.horasTrabajadas= horasTrabajadas;
    }

    public double getSueldo(){
        return super.getSueldo()+ horasTrabajadas*ValorHora;
    }
    public static void setValorHora(int valorNuevo){
        ValorHora = valorNuevo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }




}
