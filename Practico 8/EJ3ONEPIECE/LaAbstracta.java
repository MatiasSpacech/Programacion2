package EJ3ONEPIECE;

public abstract class LaAbstracta {
    public String nombre;
    public LaAbstracta(String nombre) {
        this.nombre = nombre;
    }
    public abstract int getPeso();
    public abstract int getFuerza();
    public abstract int getEdad();
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
