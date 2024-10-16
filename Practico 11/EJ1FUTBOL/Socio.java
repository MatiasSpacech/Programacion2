/* Un club de fútbol 5 necesita un sistema que le permita llevar control de sus socios y
alquileres de canchas. Cada socio posee un nombre y apellido, una edad, si tiene paga la
última cuota y una lista que contiene información de los alquileres de canchas que ha
realizado. Cuando un socio alquila una cancha, se registra la fecha, el ID de la cancha que
alquiló y cuánto pagó por el alquiler.
Cuando el dueño del club arriba al predio, le pide a los que administran el sistema, diferentes
listados, para comprobar cómo está funcionando el club:
a) Todas los socios con cuota impaga, ordenados alfabéticamente (primero por
apellido, y si hay varios con el mismo apellido por nombre)
b) Todos los socios menores de edad, ordenados por edad
c) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad
total de alquileres de esa cancha.
d) Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando
primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los
morosos, también ordenados alfabéticamente.
e) Cualquier combinación lógica de búsquedas.*/

import java.util.ArrayList;

public class Socio implements Comparable<Socio>{
    private String apellido;
    private String nombre;
    private int edad;
    private boolean tienePagoUltimoMes;
    private ArrayList<Alquiler> alquileres;
    public Socio(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.tienePagoUltimoMes = true;
        this.alquileres = new ArrayList<>();
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isTienePagoUltimoMes() {
        return tienePagoUltimoMes;
    }
    public void setTienePagoUltimoMes(boolean tienePagoUltimoMes) {
        this.tienePagoUltimoMes = tienePagoUltimoMes;
    }    
    
    public void addAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }
    public boolean alquiloCancha(int idCancha){
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getIdCancha()== idCancha) {
                return true;                
            }
        }
        return false;
    }
    public int cantidadAlquileresCancha(int cancha){
        int suma = 0;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getIdCancha() == cancha) {
                suma++;
            }
        }
        return suma;
    }

    public boolean pagoMasDe(double valor){
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getPago()> valor) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int compareTo(Socio o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
