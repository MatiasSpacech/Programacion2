import java.time.LocalDate;
import java.util.ArrayList;

public class VideoAutoClub {
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public VideoAutoClub (){
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    public void alquilar (int id, String nombreCliente, LocalDate fechaDevolucion){
        Cliente cliente = buscarCliente(nombreCliente);
        Producto producto = buscarProducto(id);
        if (cliente != null && producto !=null) {
            Alquiler alquiler = new Alquiler(producto, fechaDevolucion);
            cliente.agregarAlquiler(alquiler);
            producto.alquilar();            
        }
    }
    public ArrayList<Cliente> clientesConAlquireresVencidos (){
        ArrayList<Cliente> deudores= new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.tieneAlquilerVencido()) {
                deudores.add(cliente);
            }            
        }return deudores;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void AgregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Cliente buscarCliente(String nombre){
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;                
            }
            
        }
        return null;
    } 
    public Producto buscarProducto(int id){
        for (Producto producto : productos) {
            if (producto.getId()== id) {
                return producto;                
            }            
        }
        return null;
    }

}
