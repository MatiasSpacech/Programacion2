import java.time.LocalDate;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("matias");
        Cliente c2 = new Cliente("eduardo");
        Cliente c3 = new Cliente("cacho");

        Producto peli1 = new Pelicula(10, "los banieros locos");
        Pelicula peli2 = new Pelicula(20, "tiburon 2");
        Pelicula peli3 = new Pelicula(50, "los cazafantasmas");

        Producto auto1 = new Vehiculo("ford", 10000, "aaa123");
        Producto auto2 = new Vehiculo("nissan", 500000, "ddd123");
        Producto auto3 = new Vehiculo("mercedes", 500, "jjj123");

        VideoAutoClub comercio = new VideoAutoClub();
        comercio.AgregarCliente(c1);
        comercio.AgregarCliente(c2);
        comercio.AgregarCliente(c3);
        comercio.agregarProducto(auto1);
        comercio.agregarProducto(auto2);
        comercio.agregarProducto(auto3);
        comercio.agregarProducto(peli1);
        comercio.agregarProducto(peli2);
        comercio.agregarProducto(peli3);
        //comercio.alquilar(1, "matias", LocalDate.of(2022, 9, 30));
        //comercio.alquilar(2, "matias", LocalDate.of(2020, 8, 30));
        comercio.alquilar(2, "eduardo", LocalDate.of(2021, 5, 30));
        //System.out.println(c1.tieneAlquilerVencido());




        ArrayList<Cliente> deudores = comercio.clientesConAlquireresVencidos();
        System.out.println(deudores.size());
        
        /*for (Cliente cliente : deudores) {
            System.out.println("---"+cliente.getNombre()+"---");
        }*/
        System.out.println(comercio.buscarCliente("eduardo").alquileres.size());
        //Alquiler alq1 = new Alquiler(auto3, LocalDate.of(2024, 5, 30));
        //System.out.println(alq1.esVencidoElAlquiler());
        //System.out.println(c1);
    }
}
