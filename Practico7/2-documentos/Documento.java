/*Un historiador desea digitalizar sus documentos y organizarlos de acuerdo a palabras clave. Un
documento tiene un título, una lista de autores, un contenido textual y una lista de palabras
clave. El historiador necesita poder encontrar fácilmente documentos en su colección de
acuerdo a diferentes criterios, por ejemplo:
a) Todos los documentos cuyo título sea exactamente igual a un título dado.
b) Todos los documentos cuyo título contenga una palabra o frase dada.
c) Todos los documentos que contengan una palabra clave dada.
d) Todos los documentos que no contengan ninguna palabra clave.
e) Todos los documentos de un autor determinado.
f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
h) Cualquier combinación lógica de las formas anteriores */

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private String contenido;
    private ArrayList<String> autores;    
    private ArrayList<String> palabrasClave;
    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void addAutor(String autor){
        if (!this.autores.contains(autor)) {
            this.autores.add(autor);            
        }
    }

    public void addPalabraClave(String palabra){
        if (!this.palabrasClave.contains(palabra)) {
            this.palabrasClave.add(palabra);            
        }
    }
    public boolean contienePalabraclave(String palabra){
        return this.palabrasClave.contains(palabra);

    }
    public boolean contieneAutor(String autor){
        return this.autores.contains(autor);
    }


    @Override
    public boolean equals(Object obj) {  
        try {
            Documento other = (Documento) obj;
            return titulo.equals(other.titulo);                       
        } catch (Exception e) {
            return false;
        } 
            
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + "]";
    }
    
    

}
