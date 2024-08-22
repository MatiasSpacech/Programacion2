/*1 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementar en Java.
● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
● Obtener el total episodios vistos de una temporada particular.
● Obtener el total de episodios vistos de una serie.
● Obtener el promedio de las calificaciones dadas para una temporada particular.
● Obtener el promedio de las calificaciones dadas para una serie.
● Determinar si se vio todos los episodios de la serie.
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos */

import java.util.ArrayList;

public class Serie {
    ArrayList<Temporada> temporadas;
    String titulo;
    String descripcion;
    String creador;
    String genero;
    public Serie(String titulo){
        this.titulo = titulo;
        this.descripcion = "test";
        this.descripcion = "test";
        this.descripcion = "test";
    }
public static void main(String[] args) {
    Serie lost = new Serie( "lost");
    lost.temporadas.get(0)
    System.out.println(lost.temporadas);
}
}
