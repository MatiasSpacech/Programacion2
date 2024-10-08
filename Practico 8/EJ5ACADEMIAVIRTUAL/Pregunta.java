package EJ5ACADEMIAVIRTUAL;
/*Se desea informatizar las evaluaciones virtuales de una academia de cursos online. Las
evaluaciones tienen preguntas, la cual tiene un enunciado, un puntaje, un tiempo estimado y
una lista de conceptos que se evalúan. Las preguntas se pueden organizar en unidades de
evaluación, que al mismo tiempo pueden tener sub-unidades o preguntas. Las unidades/sub-
unidades de evaluación se dividen en dos tipos de unidades: las secuenciales y las optativas.
En las secuenciales el alumno debe responder todas las partes que la componen y por ende el
puntaje se calcula como la suma de los puntajes de sus partes, lo mismo para el tiempo
estimado. En las unidades optativas el alumno puede optar por responder solo una de las
partes, con lo cual el puntaje se calcula como el mayor de los puntajes de sus elementos, y el
tiempo estimado es el mayor de los tiempos. En ambos tipos de unidades los conceptos
abordados quedan determinados como la unión sin repetidos de los conceptos de todas sus
partes. A partir de lo anterior implementar los siguientes servicios :
Programación 2
Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas
Práctica Nº 8
 Obtener el puntaje de una pregunta/unidad/subunidad
 Obtener el tiempo estimado de una pregunta/unidad/subunidad
 Obtener el listado de conceptos de una pregunta/unidad/subunidad */

import java.util.ArrayList;

public class Pregunta {
    private String enunciado;
    private double puntaje;
    private int tiempoEstimado; //en minutos
    private ArrayList<String> conceptos;
    
}
