package Ej2convertidorDeMedidas;
/*2 - El convertidor de medidas
Estamos desarrollando una aplicación que realiza conversiones de unidades de medida. El
sistema debe permitir convertir un valor de centímetro a pulgada y viceversa, de libra a
kilogramo y viceversa, de Galón a litro y viceversa.
Tener en cuenta que existe una escala de conversión por la cual una pulgada es igual a 2,54
centímetros, una libra es igual a 0,453592 kilos y por último un galón es igual a 3,78541
litros. Definir las constantes necesarias para poder realizar las conversiones y la clase que se
encargue de las conversiones no debe tener que instanciarse para poder usarse. */

public class ConvertidorDeMedidas {
    public static final double PULGADA = 2.54; //en centimetros
    public static final double LIBRA = 0.453592; //en kilos
    public static final double GALON = 3.78541; // en litros

    public static double deCmAPulgada(double centimetros){
        return centimetros/ PULGADA;
    }
    public static double dePulgadaACm(double pulgadas){
        return pulgadas*PULGADA;
    }
    public static double deKgALibra(double kilogramo){
        return kilogramo/LIBRA;
    }
    public static double deLibraAKg(double libra){
        return libra*LIBRA;
    }
    public static double DeLitroAGalon(double litros){
        return litros/GALON;
    }
    public static double DeGalonALitro(double galon){
        return galon*GALON;
    }

}
