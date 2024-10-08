/*4 - Selección de fútbol
El contingente de la selección de fútbol de un país está formado tanto por futbolistas como
por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de
pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o
derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la
federación a la que pertenecen y los masajistas el título que poseen y la cantidad de años de
experiencia.
El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”,
“En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
el país de origen y no está concentrando para un partido.
Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede
ser futbolista, ni masajista. */
public class Persona {
    private String nombre;
    private String apellido;
    private String pasaporte;
    private boolean enElPais;  //opciones:  true esta en el pais--false esta viajando
    private boolean concentrado;
    public Persona(String nombre, String apellido, String pasaporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.enElPais = true;
        this.concentrado = false;

    }
    public Persona(String pasap){
        this("carlos","tevez",pasap);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPasaporte() {
        return pasaporte;
    }
    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
    public boolean isEnElPais() {
        return enElPais;
    }
    public void setEnElPais(boolean enElPais) {
        this.enElPais = enElPais;
    }
    public boolean isConcentrado() {
        return concentrado;
    }
    public void setConcentrado(boolean concentrado) {
        this.concentrado = concentrado;
    }
    


}
