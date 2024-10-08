public abstract class Producto {
    protected static int idcontador= 0;
    private boolean disponible;
    private int id;
    public Producto() {
        this.disponible = true;
        this.id++;
    }
    public abstract void alquilar(); ////abstractos
    public abstract void devolver (); ////abstractos

    
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public int getId() {
        return id;
    }
    
    

}
