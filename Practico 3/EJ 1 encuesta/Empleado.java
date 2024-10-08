public class Empleado {
    private Persona empleado;
    private int legajo;
    private int EncuestasRealizadas;
    
    public Empleado(Persona empleado, int legajo) {
        this.empleado = empleado;
        this.legajo = legajo;
        this.EncuestasRealizadas = 0;
    }
    public Persona getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Persona empleado) {
        this.empleado = empleado;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public int getEncuestasRealizadas() {
        return EncuestasRealizadas;
    }
    public void setEncuestasRealizadas() {
        this.EncuestasRealizadas++;
    }
    


}
