/*
 * 1 Persona
Implementar una clase llamada Persona con las siguientes características:
Atributos: nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura
Valores por defecto:
● El DNI es un valor obligatorio, no posee valor por defecto.
● En caso de la fecha de nacimiento será el 1 de enero de 2000.
● Sexo será Femenino por defecto.
● El nombre por defecto es N y el apellido es N.
● El peso y la altura son 1 por defecto.
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y
apellido, con DNI nombre apellido y Fecha de nacimiento…..
La responsabilidad de la clase es la siguiente:
● Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice
de masa corporal el cual es peso / altura2
● Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
● Saber si está cumpliendo años.
● Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años
● Métodos set de cada parámetro, excepto de DNI.
● Saber si puede votar. Es necesario ser mayor de 16 años.
● Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
● Mostrar toda la información del objeto. Es decir devolver un String con la
información del mismo.
*/
import java.time.LocalDate;
import java.time.Period;
public class Persona {
    int dni;
    String nombre;
    String apellido;
    int edad;
    LocalDate fechaNacimiento;
    String sexo;
    double peso;
    double altura;
    //constructores**********************************
    public Persona(int dni) {
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.sexo = "Femenino";
        this.fechaNacimiento = LocalDate.of(2000,1,1);
        this.edad = establecerEdad();
        this.peso = 1;
        this.altura = 1;

    }

    //metodos****************************************
    
    
    public String getFechaNacimiento(){
        return "Año: " + fechaNacimiento.getYear();
    }

//metodos privados
    private int establecerEdad(){
        LocalDate hoyDate = LocalDate.now();
        Period periodoEdad = Period.between(fechaNacimiento,hoyDate);
        return periodoEdad.getYears();
    }
/***Setters******************************************************************************* */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = establecerEdad();
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
//Geters*****************************************************
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
//*******Metodos************************************/
    public double calcularImc(){
        double alturaEnMetros = this.altura/100;
        return (this.peso/ (alturaEnMetros * alturaEnMetros) );
    }

    public boolean estaEnForma (){
        double imc = calcularImc();
        if ((imc >= 18.5) && (imc <= 25))
            return true;
        return false;
    }
    public boolean esCumple () {
        LocalDate fechaHoy = LocalDate.now();
        if ((fechaHoy.getDayOfMonth() == this.fechaNacimiento.getDayOfMonth()) 
                        && (fechaHoy.getMonthValue() == this.fechaNacimiento.getMonthValue()))          
            return true;
        return false;
    }
    public boolean puedeVotar(){
        return (this.edad >= 16);
    }


    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
                + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura
                + "]";
    }
}
