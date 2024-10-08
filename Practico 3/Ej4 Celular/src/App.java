
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Contacto c1 = new Contacto("matias","2494669323");
        Contacto c2 = new Contacto("eduardo","249777777");
        Contacto c3 = new Contacto("matias","2494669323");
        c3.setEdad(10);
        Celular cel1 = new Celular("nokia");
        cel1.addContacto(c1);
        cel1.addContacto(c2);
        cel1.addContacto(c3);
        System.out.println("El promedio de edad de todos los contactos es "+ cel1.promedioContactos());
        ArrayList<Contacto> mismoNumero = cel1.contactosMismoNumero("2494669323");
        for (Contacto contacto : mismoNumero) {
            System.out.println(contacto);            
        }
        
        cel1.mostrarListaContactos();

        System.out.println(c1.equals(c2));



    }
}
