package icc.pap.u1.patrones.creacionales.factoryMethod;


public class ImportadorPuntoComa extends Importador {
    @Override
    protected LecturaLine crearLector() {
        
        return new LectorPuntoComa();
    }
}
