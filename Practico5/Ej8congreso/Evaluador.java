package Ej8congreso;
import java.util.ArrayList;
/* 8 - //////////////////Congreso de Ciencias de la Computación///////////////////////////////////////////////
El comité organizador de un Congreso de Ciencias de la Computación necesita un sistema
que le ayude a asignar evaluadores de los trabajos enviados al congreso. Para esto cuenta con
un conjunto de evaluadores, calificados como “generales” cuando conocen temas generales
como algoritmos, lenguajes de programación, etc., o como evaluadores “expertos” cuando
conocen temas específicos como agentes, visualización, redes de comunicación, etc. El
sistema debe designar a un evaluador para cada uno de los distintos trabajos enviados al
congreso, existiendo diferentes categorías de trabajos: artículo, resumen y poster. Cada
trabajo posee un conjunto de palabras claves que definen los temas tratados en el trabajo.
Para asignar un evaluador a un trabajo, el sistema debe asegurarse que el evaluador es apto
para evaluar el trabajo. Para determinar si un evaluador es apto para evaluar un trabajo, éste
debe haber declarado conocimiento en todos los temas del trabajo, especificados en sus
palabras claves. Para el caso de los posters, basta que el evaluador tenga conocimiento en uno
de los temas del poster o sea en una de las palabras clave.
Implementar una solución orientada a objetos para este problema que permita determinar
1) qué evaluador puede asignarse a un determinado trabajo,
2) qué trabajos pueden asignarse un evaluador particular, y
3) cuántos trabajos tiene un evaluador determinado y
4) determinar si un evaluador dado es general o experto. */

public class Evaluador {
    private String nombre;
    private String categoria;
    ArrayList<String> conocimientos;
    ArrayList<Trabajo> trabajosAsignados;
    
    public Evaluador(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        conocimientos = new ArrayList<>();
        trabajosAsignados = new ArrayList<>();
    }

    
    


    //le paso un trabajo y me fijo si lo puede evaluar
    public boolean puedeEvaluar(Trabajo trabajo){
        if (trabajo.getCategoria()== "poster") {
           for (String palabraClave : trabajo.getPalabrasClave()) {
             if (conocimientos.contains(palabraClave)) {
                return true;             
            }
            } return false;
        }
        else {
            return conocimientos.containsAll(trabajo.getPalabrasClave());
        }  
    }

    public void agregarTrabajosAsignados (Trabajo trabajo){
        trabajosAsignados.add(trabajo);
    }

    public void agregarConocimientos(String palabra){
        this.conocimientos.add(palabra);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
