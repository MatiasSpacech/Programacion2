public class Alarmaluminosa extends Alarma {
    Luz luces;
    public Alarmaluminosa(){
        super();
        luces= new Luz();
    }
    @Override
    public boolean comprobar() {
        if (super.comprobar()){
            luces.encender();
            return true;
        };
        return false;
    }
    public Luz getLuces() {
        return luces;
    }
    public void setLuces(Luz luces) {
        this.luces = luces;
    }
}
