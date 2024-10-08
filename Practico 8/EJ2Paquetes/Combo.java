package EJ2Paquetes;
/*
 * Una compañía de envíos posee distintos tipos de servicios de envíos, entre los mismos se
encuentran:
● Envío de paquetes y cartas, una carta/paquete posee un destinatario con su dirección,
un remitente con su dirección, si la retiran en la sucursal de destino o la envían a
domicilio, y su peso.
● Combo Postal, es una modalidad por la cual se agrupa un conjunto de envíos
(cualquier tipo de envío). Todos los envíos incluidos en un combo postal deben tener
la misma ciudad de destino.
Todos los envíos poseen un único número de tracking que permite hacer su seguimiento. En
los combos el tracking es el mismo para todos los elementos que contiene, y cuando un
elemento se agrega a un combo se le cambia el tracking del elemento poniendo el del combo.
Si el elemento agregado era un combo, este debe cambiar también el tracking de todos sus
elementos para adecuarse al nuevo valor.
El peso de los combos es la suma de todos los elementos que este contiene. El destinatario,
remitente y la dirección de un combo es el valor del primer elemento que ellos poseen (no se
tiene en cuenta el resto de los elementos)
 */

import java.util.ArrayList;

public class Combo extends ElementoPostal{
    private ArrayList<ElementoPostal> elementos;

    public Combo(int numeroTraking) {
        super(numeroTraking);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoPostal elemento){
        elemento.setNumeroTraking(this.getNumeroTraking());
        elementos.add(elemento);
    }

    @Override
    public int getPeso() {
        int suma = 0;
        for (ElementoPostal elementoPostal : elementos) {
            suma += elementoPostal.getPeso();
        }
        return suma;
    }

    @Override
    public String getDestinatario() {
        return this.elementos.get(0).getDestinatario();
    }

    @Override
    public String getRemitente() {
        return this.elementos.get(0).getRemitente()
    }

    @Override
    public String getDireccion() {
        return this.elementos.get(0).getDireccion();
    }
    
    
}
