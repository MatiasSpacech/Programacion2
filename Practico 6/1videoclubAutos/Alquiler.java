import java.time.LocalDate;

public class Alquiler {
    protected Producto producto;
    LocalDate fechaDevolucion;
    public Alquiler(Producto producto, LocalDate fechaDevolucion) {
        this.producto = producto;
        this.fechaDevolucion = fechaDevolucion;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public boolean esVencidoElAlquiler (){
        return LocalDate.now().isAfter(this.fechaDevolucion);
    }    

}
