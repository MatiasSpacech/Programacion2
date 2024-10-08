package Ej8congreso;

import java.util.ArrayList;

public class Trabajo {
    private String nombre;
    private String categoria;
    ArrayList<String> palabrasClaves;
    
    public Trabajo(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        palabrasClaves = new ArrayList<>();
    }
    public void addPalabrasClave(String palabra){
        this.palabrasClaves.add(palabra);
    }
    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> temp = new ArrayList<>();
        for (String clave : palabrasClaves) {
            temp.add(clave);            
        }
        return temp;
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
