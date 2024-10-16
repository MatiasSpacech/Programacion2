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

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int idCancha;
    private double pago;
    public Alquiler(int idCancha, double pago) {
        this.fecha = LocalDate.now();
        this.idCancha = idCancha;
        this.pago = pago;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getIdCancha() {
        return idCancha;
    }
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }
    public double getPago() {
        return pago;
    }
    public void setPago(double pago) {
        this.pago = pago;
    }
    

}
