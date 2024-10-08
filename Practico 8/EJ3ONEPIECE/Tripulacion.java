package EJ3ONEPIECE;

import java.util.ArrayList;
/*Se desea organizar el universo de personajes de One Piece. En One Piece cada personaje
individual posee un nombre, una edad, un peso y fuerza. Asimismo cada personaje puede
haber ingerido una fruta especial que modifica su fuerza. Para algunas frutas la fuerza es un
valor fijo, en otros casos es el peso multiplicado por 10, e inclusos para algunas frutas es un
valor fijo más el peso multiplicado por 7; si el personaje no comió ninguna fruta tiene una
fuerza por defecto de 125, la cual puede cambiar en un futuro pero es el mismo valor para
todos los personajes. En el universo de personajes, los mismos se agrupan en tripulaciones
piratas o militares, que a su vez se pueden organizar en barcos o tripulaciones así como
personajes individuales. Cada tripulación/barco posee un nombre, y una fuerza que se
calcula como la suma de la fuerza de cada uno de sus componentes. El peso de una
tripulación/barco queda determinado por el peso del primero de sus componentes, mientras
que la edad es la mayor de las edades de sus componentes.
Implementar los servicios necesarios para:
 Obtener el nombre de un personaje/tripulación pirata o militar
 Obtener el peso de un personaje/tripulación pirata o militar
 Obtener la cantidad de personajes de una tripulación pirata o militar
 Obtener la edad de un personaje/tripulacion pirata o militar */
public class Tripulacion extends LaAbstracta{
    ArrayList<Personaje> tripulacion;

    public Tripulacion(String nombre) {
        super(nombre);
        this.tripulacion = new ArrayList<>();
    }
    public int getCantidadDePJ(){
        return this.tripulacion.size();
    }
    public void addPersonaje(Personaje pj){
        this.tripulacion.add(pj);
    }
    @Override
    public int getPeso() {
        if (this.tripulacion.get(0)!= null) {
            return this.tripulacion.get(0).getPeso();            
        }
        return 0;
    }

    @Override
    public int getFuerza() {
        int suma = 0;
        for (Personaje personaje : tripulacion) {
            suma += personaje.getFuerza();
        }
        return suma;
    }

    @Override
    public int getEdad() {
        int edadMayor = -1;
        for (Personaje personaje : tripulacion) {
            if (personaje.getEdad() > edadMayor) {
                edadMayor = personaje.getEdad();
            }
        }
        return edadMayor;
    }
}
