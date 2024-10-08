/*4 - Selección de fútbol
El contingente de la selección de fútbol de un país está formado tanto por futbolistas como
por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de
pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o
derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la
federación a la que pertenecen y los masajistas el título que poseen y la cantidad de años de
experiencia.
El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”,
“En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
el país de origen y no está concentrando para un partido.
Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede
ser futbolista, ni masajista. */
import java.util.ArrayList;

public class Equipo {
    ArrayList<Persona> equipo;

    public Equipo() {
        this.equipo = new ArrayList<>();
    }
    public void addIntegrante(Persona persona){
        this.equipo.add(persona);
    }

   /*  public boolean isDisponible(String pasaport){
        for (Persona persona : equipo) {
            if (persona.getPasaporte() == pasaport) 
            {
                if (!persona.isConcentrado()&& persona.isEnElPais()) {
                    return true;                    
                }                
            }
            
        }return false;           
            
        }  */
        public void isDisponible(String pasaport){
            
            for (Persona persona : equipo) {  
                       
                if (persona.getPasaporte() == pasaport) 
                {
                    //System.out.println(persona.getPasaporte());
                    if (!persona.isConcentrado()&& persona.isEnElPais()) {
                        System.out.println("La persona "+persona.getNombre()+" esta disponible");                   
                    }else {
                    System.out.println("La persona "+persona.getNombre()+" NO esta disponible");  
                    } 

                }
                
            }        
                
       }
}



