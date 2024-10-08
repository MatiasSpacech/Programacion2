/*1 - El Jardín privado
Se desea implementar un sistema de gestión de plantas para un Jardín privado, de cada planta
se guarda su nombre científico, su nombre común, país de origen, fecha de compra y un
identificador único. Cada vez que se crea una planta nueva para la colección, se debe asignar
un número nuevo de forma automática e incremental.
 */

import java.util.ArrayList;

public class Jardin {
    protected ArrayList<Planta> plantas;
    private String nombre;
    public Jardin(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public void addPlanta(Planta plant){
        this.plantas.add(plant);
    }
    public void listarPlantas(){
        System.out.println(plantas.toString());    
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
