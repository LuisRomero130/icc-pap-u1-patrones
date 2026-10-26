package icc.pap.u1.patrones.factoryMethod;
import java.util.ArrayList;
import java.util.List;
//mantener el proceso de importacion y delegar la creacion
public abstract class Importador {
    //Factory Method
    protected abstract LecturaLine crearLector();
    

    public final List<Lectura> importacion(List<String> lecturas){
        LecturaLine lector= crearLector();//Polimorfismo
        // impPc -> ImportadorPuntoComa -> crearLector() -> LectorPuntoComa
        List<Lectura> resultado= new ArrayList<>();
        for (String lectura : lecturas){
            if(lectura.isBlank())
                continue;
            try{
                resultado.add(lector.leer(lectura));
            }catch (Exception e){
                throw new IllegalArgumentException("linea mal formada: "+lectura);
            }
        }
        return resultado;


    }
    
}
