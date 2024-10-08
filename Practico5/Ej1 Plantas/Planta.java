/*1 - El Jardín privado
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de cada planta
se guarda su nombre científico, su nombre común, país de origen, fecha de compra y un
identificador único. Cada vez que se crea una planta nueva para la colección, se debe asignar
un número nuevo de forma automática e incremental.
 */

import java.time.LocalDate;

public class Planta {
    private String nombreCientifico;
    private String nombre;
    private String pais;
    private int id;
    private LocalDate fechaCompra;
    private static int ultimoId =0;
    public Planta(String nombreCientifico, String nombre, String pais) {
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.pais = pais;
        this.id = ultimoId;
        fechaCompra= LocalDate.now();
        ultimoId++;
                
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public static int getUltimoId() {
        return ultimoId;
    }
    public static void setUltimoId(int ultimoId) {
        Planta.ultimoId = ultimoId;
    }
    @Override
    public String toString() {
        return "[nombreCientifico=" + nombreCientifico + ", nombre=" + nombre + ", pais=" + pais + ", id=" + id
                + ", fechaCompra=" + fechaCompra + "]";
    }


    

}
