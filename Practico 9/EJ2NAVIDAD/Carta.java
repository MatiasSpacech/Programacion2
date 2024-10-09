import java.util.ArrayList;

public class Carta {
    private int DniRemitente;
    ArrayList<String> regalos;
    public Carta(int dniRemitente) {
        DniRemitente = dniRemitente;
        this.regalos = new ArrayList<>();
    }
    public int getDniRemitente() {
        return DniRemitente;
    }
   
    public void addRegalo(String regalo) {
        this.regalos.add(regalo);    
    }
    public boolean contieneRegalo(String regalo){
        return this.regalos.contains(regalo);
    }

    public void setCarbonOn(){
        this.regalos.clear();
        this.regalos.add("Trozo de carbon");

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + DniRemitente;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        try {
            Carta otro = (Carta) obj;
            if (this.DniRemitente == otro.getDniRemitente())
                return true;
            return false;    
        } catch (Exception e) {
            return false;
        }
        
    }
}
