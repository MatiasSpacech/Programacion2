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

public class App {
    public static void main(String[] args) throws Exception {
        Persona matias = new Persona(30680186);
        System.out.println(matias.getFechaNacimiento());
        System.out.println(matias.edad);
        matias.setFechaNacimiento(LocalDate.of(2007, 8, 18 ));
        System.out.println(matias.toString());
        matias.setPeso(65);
        matias.setAltura(178);
        System.out.println(matias.calcularImc());
        System.err.println("Esta en forma? "+ matias.estaEnForma());
        System.err.println("Es el cumpleanios? "+ matias.esCumple());
        System.err.println("puede votar? "+matias.puedeVotar());
    }
}
