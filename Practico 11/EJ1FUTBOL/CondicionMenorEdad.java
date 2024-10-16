public class CondicionMenorEdad extends Condicion {
    private int edad;

    public CondicionMenorEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() <= this.edad;
    }
    
}
