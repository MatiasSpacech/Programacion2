
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

public class Noticia extends Elemento{
    private String titulo;
    private String introduccion;
    private String texto;
    private String autor;
    private ArrayList<String> palabrasClave;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIntroduccion() {
        return introduccion;
    }
    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void addPalabraClave(String palabra) {
        if(!palabrasClave.contains(palabra))
            palabrasClave.add(palabra);
    }
    public boolean contienePalabraClave(String palabra){
        return palabrasClave.contains(palabra);
    }
    @Override
    public int getCantidadNoticias() {
        return 1;
    }
    @Override
    public Elemento copiaCondicionada(Condicion condicion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copiaCondicionada'");
    }
}