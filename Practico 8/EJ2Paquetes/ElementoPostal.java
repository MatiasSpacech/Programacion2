package EJ2Paquetes;

public abstract class ElementoPostal {
    private int numeroTraking;

    public ElementoPostal(int numeroTraking) {
        this.numeroTraking = numeroTraking;
    }

    public abstract int getPeso();
    public abstract String getDestinatario();
    public abstract String getRemitente();
    public abstract String getDireccion();

    public int getNumeroTraking() {
        return numeroTraking;
    }
    public abstract void setNumeroTraking(int numeroTraking);
        
    
    
}
