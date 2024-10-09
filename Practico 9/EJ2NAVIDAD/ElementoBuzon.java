public abstract class ElementoBuzon {
    public abstract int cantidadCartasrecibidas();
    public abstract int cantidadDeCartasporRegalo(String regalo);
    public double porcentajeCartasXRegalo(String regalo){
        int totalCartas = cantidadCartasrecibidas();
        int cartasPorRegalo = cantidadDeCartasporRegalo(regalo);
        return (double) (cartasPorRegalo/totalCartas)*100;
    }


}
