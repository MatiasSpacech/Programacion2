package Ej3Pila;
/*3 - Pila de elementos
Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma. Es posible
consultar el tope de la pila sin eliminarlo utilizando el método top(). La mencionada
anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. Definir
también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos.
● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso. */

import java.util.ArrayList;

public class Pila {
    ArrayList<Object> pila;
    public Pila(){
        pila = new ArrayList<>();
    }
    public void push(Object elemento){
        this.pila.add(0,elemento);
    }
    public Object pop(){
        return this.pila.remove(0);
    }
    public Object tope(){
        return this.pila.get(0);
    }
    public int size(){
        return pila.size();
    }
    public ArrayList<Object> copy(){
        ArrayList<Object> copia = new ArrayList<>();
        for (Object object : pila) {
            copia.add(object);            
        }
        return copia;
    }
    public ArrayList<Object> reverse(){
        ArrayList<Object> copia = new ArrayList<>();
        for (int i = pila.size()-1; i >= 0; i--) {
            copia.add(pila.get(i));            
        }
        return copia;
    }


    public String toString(){
        String aux = "";
        for (Object object : pila) {
            aux+="|" +object + "|-";
        }
        return aux;
    }
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push("hola");
        pila.push("como");
        pila.push("estas");
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        System.out.println(pila.reverse().toString());
    }

}

