public class App {
    public static void main(String[] args) {
        Documento d1 = new Documento("la vida es bella", "Un hombre construye una elaborada fantasía para proteger a su hijo en un campo de concentración nazi.");
        d1.addPalabraClave("vida");
        d1.addPalabraClave("bella");
        d1.addAutor("jon");
        d1.addAutor("manuel");
        Documento d2 = new Documento("moby dick", "Moby Dick​ es una novela del escritor Herman Melville publicada en 1851. Narra la travesía del barco ballenero Pequod, comandado por el capitán Ahab, junto a Ismael y el arponero Queequeg en la obsesiva y autodestructiva persecución de un gran cachalote blanco");
        d1.addPalabraClave("moby");
        d1.addPalabraClave("ballena");
        d1.addAutor("herman");
        d1.addAutor("melviele");
        Documento d3 = new Documento("lo que el viento se llevo", "Este drama épico de la Guerra Civil se centra en la vida de la petulante belleza sureña Scarlett O'Hara. Desde la idílica hospitalidad de su gran plantación, la película narra su supervivencia a través de la historia trágica del Sur durante la Guerra Civil y la Reconstrucción, y sus enredados amorosos con Ashley Wilkes y Rhett Butler.");
        d1.addPalabraClave("viento");
        d1.addPalabraClave("guerra");
        d1.addAutor("victor");
        d1.addAutor("fleming");
        Historiador h1 = new Historiador("cacho");
        h1.addDocumento(d1);
        h1.addDocumento(d2);
        h1.addDocumento(d3);
        //System.out.println(h1.buscarDocumentos(new FiltroOr(new FiltroNombreParcial("vida"),new FiltroNombreParcial("viento"))));
        System.out.println(h1.buscarDocumentos(new FiltroNot(new FiltroNombreParcial("vida"))));
    }
}
