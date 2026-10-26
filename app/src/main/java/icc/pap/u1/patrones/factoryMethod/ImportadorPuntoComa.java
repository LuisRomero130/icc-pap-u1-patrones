package icc.pap.u1.patrones.factoryMethod;


public class ImportadorPuntoComa extends Importador {
    @Override
    protected LecturaLine crearLector() {
        
        return new LectorPuntoComa();
    }
}
