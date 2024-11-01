public class Pieza extends Elemento{
    
    private String color;
    private int tiempoImpresion;
    private int plasticoNecesario;
    public Pieza(String nombre, String descripcion, String color, int tiempoImpresion, int plasticoNecesario) {
        super(nombre, descripcion);
        this.color = color;
        this.tiempoImpresion = tiempoImpresion;
        this.plasticoNecesario = plasticoNecesario;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTiempoImpresion() {
        return tiempoImpresion;
    }
    public int cantidadPiezasSimples(){
        return 1;
    }
    public void setTiempoImpresion(int tiempoImpresion) {
        this.tiempoImpresion = tiempoImpresion;
    }
    public int getPlasticoNecesario() {
        return plasticoNecesario;
    }
    public void setPlasticoNecesario(int plasticoNecesario) {
        this.plasticoNecesario = plasticoNecesario;
    }

}
