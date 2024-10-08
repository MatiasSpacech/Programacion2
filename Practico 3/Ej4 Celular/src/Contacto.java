/*4 Contactos de un celular
Se desean modelar los contactos de un celular. Para cada contacto se guarda su nombre
y apellido, fecha de nacimiento, número de teléfono, dirección y dirección de mail. El
celular muestra los contactos con su apellido y nombre, su edad y su número de
teléfono. También muestra la ciudad a la que pertenece el contacto. El celular muestra
información a modo de resumen donde se lista la totalidad de contactos, los contactos
repetidos y el promedio de edad de los contactos. Se considera un contacto repetido el
que posee mismo apellido y nombre, y número de teléfono. Asimismo, se debe poder
incorporar un listado de los contactos que poseen el mismo número de teléfono.
Consejo: Ver agenda personal e identificar similitudes y diferencias
Extra: ¿Quién se encarga de decidir si dos contactos son iguales? */

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String numeroTelefonico;
    private int edad;
    private String ciudad;

    
    public Contacto(String nombre, LocalDate fechaNacimiento, String numeroTelefonico, int edad, String ciudad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public Contacto( String name, String numero){
        this(name, LocalDate.of(2010,2,18),numero,24, "tandil");
    }
    public boolean equals (Object  obj){
        Contacto p1 = (Contacto) obj;
        return (p1.getNombre().equals(this.getNombre()) && p1.getNumeroTelefonico().equals(this.getNumeroTelefonico()));
    }
  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", numeroTelefonico="
                + numeroTelefonico + ", edad=" + edad + ", ciudad=" + ciudad + "]";
    }
    
}
