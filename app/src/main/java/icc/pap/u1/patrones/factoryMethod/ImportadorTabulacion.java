package icc.pap.u1.patrones.factoryMethod;



public class ImportadorTabulacion extends Importador {
    @Override
    protected LecturaLine crearLector() {
        return new LecturaTabulacion();
    }
}
