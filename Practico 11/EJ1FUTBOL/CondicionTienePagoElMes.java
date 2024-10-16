public class CondicionTienePagoElMes extends Condicion{
    @Override
    public boolean cumple(Socio socio) {
        return socio.isTienePagoUltimoMes();
    }

}
