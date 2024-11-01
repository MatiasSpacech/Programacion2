/*3 - Sitio Web de Noticias
Se desea modelar un administrador de contenidos de un sitio web de noticias. Los contenidos
del sitio están agrupados en categorías y dentro de cada categoría se dividen en secciones.
Asimismo, es posible que una sección se sub-divida nuevamente en otras sub secciones, y así
sucesivamente. Cada categoría, posee una descripción y una imagen asociada, lo mismo para
las secciones.
Una noticia puede estar asociada a una categoría, sección o sub-sección, 
>>>>>>>>>>>>posee un título, un listado de palabras claves, una introducción, el texto, el autor, y un link asociado.
El modelo presentado debe proveer servicios que permitan obtener la cantidad de noticias que
contiene una categoría, y la cantidad de noticias que contiene una sección, sub-sección, etc.
Se debe proveer un mecanismo mediante el cual el administrador de contenidos pueda
restringirse a un tópico determinado, es decir ingresando una palabra clave se genera una
nueva interfaz en donde sólo las noticias que contienen esta palabra clave se muestran (es
importante que se respete la organización de las mismas, es decir categoría, sección, sub-
sección y así sucesivamente).
La nueva estructura obtenida es una copia de la existente, si se introduce un cambio en esta,
el mismo NO se refleja en la estructura original.*/

import java.util.ArrayList;

public class Categoria extends Elemento{
    private ArrayList<Elemento> elementos;
    private String descripcion;
    public Categoria(String descripcion) {
        this.elementos = new ArrayList<>();
        this.descripcion = descripcion;
    }

    public void addElemento(Elemento elemento){
        elementos.add(elemento);
    }    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int getCantidadNoticias() {
       int suma = 0;
       for(Elemento elemento: elementos){
            suma += elemento.getCantidadNoticias();
       }        
       return suma;
    }

    

    
}
