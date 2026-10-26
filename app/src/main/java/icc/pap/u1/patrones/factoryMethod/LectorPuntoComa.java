package icc.pap.u1.patrones.factoryMethod;

public class LectorPuntoComa implements LecturaLine {
    @Override
    public Lectura leer(String linea) {
        //dividir la linea por el separador ;
        //devolver una instancia de lectura
        String[] partes = linea.split(";");
        return new Lectura(partes[0], Double.parseDouble(partes[1]), partes[2]);
        
    }
        
    
    
}
