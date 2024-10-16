import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class SistemaClub {
    private String nombreClub;
    private ArrayList<Socio> socios;
    public SistemaClub(String nombreClub) {
        this.nombreClub = nombreClub;
        this.socios = new ArrayList<>();
    }
    public String getNombreClub() {
        return nombreClub;
    }
    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }
    
    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }
    
    public void alquilar(int idCancha, double pago, String apellido, String nombre){
        Socio socio = encontrarSocio(apellido , nombre);
        if (socio.isTienePagoUltimoMes()&& socio!= null) {
            socio.addAlquiler(new Alquiler(idCancha, pago));
        }   
    }
    private Socio encontrarSocio(String apellido, String nombre){
        for (Socio socio : socios) {
            if (socio.getApellido().equals(apellido) && socio.getNombre().equals(nombre)) {
                return socio;
            }
        }
        return null;
    }
    public ArrayList<Socio> buscar (Condicion condicion){
        ArrayList<Socio> retorno= new ArrayList<>();
        for (Socio socio : retorno) {
            if (condicion.cumple(socio)) {
                retorno.add(socio);
            }
        }
        return retorno;
    }

    public ArrayList<Socio> buscarOrdenado(Condicion condicion, Comparator<Socio> orden){
        ArrayList<Socio> retorno = this.buscar(condicion);
        Collections.sort(retorno,orden);
        return retorno;
    }


}
