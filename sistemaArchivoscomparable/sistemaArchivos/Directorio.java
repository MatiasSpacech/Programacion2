package sistemaArchivos;

import sistemaArchivos.condiciones.Condicion;

import javax.swing.text.Element;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Directorio extends ElementoSA {
    protected ArrayList<ElementoSA> elementos;

    public Directorio(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA nuevo){
        this.elementos.add(nuevo);
    }

    public boolean tieneElemento(ElementoSA elem){
        return elementos.contains(elem);
    }

    public void removeElemento(ElementoSA aBorrar){
        this.elementos.remove(aBorrar);  //NO OLVIDAR EL EQUALS
    }

    public double getTamanio(){
        //return elementos.size(); MAL: solo recorre un niveld
        /*for (int i = 0; i < elementos.size(); i++) {
            ElementoSA elem = elementos.get(i);
            //hago algo con elem
        }*/
        double total = 0.0;
        for (ElementoSA elem:elementos) {
            //hago algo con elem
            total += elem.getTamanio();
        }
        return total;
    }

    public int cantElementos(){
        int total = 0;
        for (ElementoSA elem:elementos) {
            total += elem.cantElementos();
        }
        return total+1;
    }


    public ArrayList<Archivo> buscar(Condicion condicion){
        ArrayList<Archivo> retorno = new ArrayList<>();
        for (ElementoSA elem:elementos){
            retorno.addAll(elem.buscar(condicion));
            //ArrayList<Archivo> resultadoParcial = elem.buscar(condicion);
            //for (Archivo archivoQueCumple:resultadoParcial)
            //    retorno.add(archivoQueCumple);
        }
        //Collections.sort(retorno, Collections.reverseOrder());
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    //Template Method
    @Override
    public ElementoSA getCopia() {
        Directorio copia = crearCascaron();
        for (ElementoSA hijo:elementos){
            copia.addElemento(hijo.getCopia());
        }
        return copia;
    }

    //Factory Method
    protected Directorio crearCascaron() {
        return new Directorio(this.getNombre());
    }
}
