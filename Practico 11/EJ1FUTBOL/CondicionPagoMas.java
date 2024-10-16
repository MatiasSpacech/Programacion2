public class CondicionPagoMas extends Condicion{
    private double monto;
    
    public CondicionPagoMas(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoMasDe(monto);
    }

}
