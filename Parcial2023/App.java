public class App {
    public static void main(String[] args) {
        Pieza p1 = new Pieza("manoizq", "mano","Blanco" , 10, 10);
        Pieza p2 = new Pieza("manoder", "mano","Blanco" , 10, 10); 
        Pieza p3 = new Pieza("cuerpo", "mano","Blanco" , 10, 10); 
        Pieza p4 = new Pieza("cabeza", "mano","Blanco" , 10, 10);  
        PiezaCompuesta pc1= new PiezaCompuesta("muñeco", "para niños");
        PiezaCompuesta pc2= new PiezaCompuesta("manosmuñeco", "manossssssss");
        PiezaCompuesta pc3= new PiezaCompuesta("cabezas", "cabezassssssssss");
        pc2.addElemento(p1);
        pc2.addElemento(p2);
        pc3.addElemento(p4);
        pc2.addElemento(pc3);
        pc1.addElemento(p3);
        pc1.addElemento(pc2);

        System.out.println(pc1.cantidadPiezasSimples());
        System.out.println(pc1.getTiempoImpresion());

    }
}
