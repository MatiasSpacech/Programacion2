
/*
 * 2 Electrodomésticos
Crear una clase Electrodoméstico con las siguientes características:
Atributos son nombre, precio base, color, consumo energético y peso.
Valores por defecto:
● El color por defecto es gris plata.
● El consumo energético 10 Kw.
● Precio base 100 pesos.
● El peso es 2 kg.
Implementar todos los constructores.
La funcionalidad de la clase es la siguiente:
● Todos los métodos get y set.
● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
● Indicar si un producto es de alta gama, el balance es mayor que 3
 */

public class electrodomestico {
    String nombre;
    double precioBase;
    String color;
    int consumoElectrico;
    int peso; 


    //constructores**********************************************************
    public electrodomestico(String name){
        nombre = name;
        precioBase = 100;
        color = "gris plata";
        consumoElectrico = 10;
        peso = 2;
    }
    

    public electrodomestico(String nombre, double precioBase, String color, int consumoElectrico, int peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(int consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //Metodos*************************************************
    //● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
    boolean esBajoConsumo(){
        return (this.consumoElectrico < 45);
    }

    //● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
    double balance(){
        return (this.precioBase / this.peso);
    }
    //● Indicar si un producto es de alta gama, el balance es mayor que 3
    boolean esAltaGama(){
        return balance() > 3;
    }

}
