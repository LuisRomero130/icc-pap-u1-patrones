package icc.pap.u1.patrones.creacionales.factoryMethod;



public class ImportadorTabulacion extends Importador {
    @Override
    protected LecturaLine crearLector() {
        return new LecturaTabulacion();
    }
}
