/*3 - Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados
reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados
por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada.
Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la
cantidad de ventas realizadas.
Implementar un sistema que permita saber cuánto se le debe pagar a un empleado al finalizar
la semana. */

public class Empleado {
    private double sueldo;
    private String nombre;
    public Empleado(double sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
