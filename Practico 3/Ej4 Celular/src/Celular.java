import java.util.ArrayList;

public class Celular {
    private String nombre;
    private ArrayList<Contacto> contactos;

    public Celular(String nombre) {
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
    }

    public void addContacto(Contacto contacto){
        this.contactos.add(contacto);
    };

    public void mostrarListaContactos(){
        System.out.println("Lista De contactos de "+ this.nombre);
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
    public ArrayList<Contacto> contactosMismoNumero(String numero){
        ArrayList<Contacto> aux = new ArrayList<Contacto>();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNumeroTelefonico()== numero ) {
                aux.add(contactos.get(i));                
            }            
        }
        return aux;
    } 

    public double promedioContactos (){
        double sumador = 0;
        for (int i = 0; i < contactos.size(); i++) {
            sumador += contactos.get(i).getEdad();            
        }
        return sumador / contactos.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

}
