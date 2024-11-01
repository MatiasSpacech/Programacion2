package sistemaArchivos;

import sistemaArchivos.condiciones.Condicion;

import java.util.ArrayList;

public class Comprimido extends Directorio{
    private double tasaCompresion;
    public Comprimido(String nombre, double tasa) {
        super(nombre);
        this.tasaCompresion = tasa;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio()*tasaCompresion;
    }

    @Override
    public int cantElementos() {
        return 1;
    }
    ArrayList<Archivo> retorno = new ArrayList<>();
    for (ElementoSA elem:elementos){
        retorno.addAll(elem.buscar(condicion));
        //ArrayList<Archivo> resultadoParcial = elem.buscar(condicion);
        //for (Archivo archivoQueCumple:resultadoParcial)
        //    retorno.add(archivoQueCumple);
    }
    //Collections.sort(retorno, Collections.reverseOrder());
    if (!retorno.isEmpty())
        retorno.clear();
        retorno.add(this),
    return retorno;
}
    public ArrayList<Archivo> buscar(Condicion condicion) {
        ArrayList<Archivo> retorno = new ArrayList<>();
        for (ElementoSA elem:elementos){
            retorno.addAll(elem.buscar(condicion));
            !retorno.isEmpty()
        
        }
        //Collections.sort(retorno, Collections.reverseOrder());
        if (!retorno.isEmpty())
            retorno.clear();
            retorno.add(this),
        return retorno;
        }

    @Override
    protected Comprimido crearCascaron() {
        return new Comprimido(this.getNombre(), tasaCompresion);
    }
}
