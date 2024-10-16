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
public class Carta extends ElementoPostal{
    
    private String destinatario;
    private String remitente;
    private String direccion;
    private boolean enSucursal;
    private int peso;
    public Carta(int numeroTraking, String destinatario, String remitente,String direccion, boolean enSucursal, int peso) {
        super(numeroTraking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.direccion = direccion;
        this.enSucursal = enSucursal;
        this.peso = peso;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getRemitente() {
        return remitente;
    }
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    public boolean isEnSucursal() {
        return enSucursal;
    }
    public void setEnSucursal(boolean enSucursal) {
        this.enSucursal = enSucursal;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setNumeroTraking(int numeroTraking ){
        super.numeroTraking = numeroTraking;
    }
    
    
    

}
