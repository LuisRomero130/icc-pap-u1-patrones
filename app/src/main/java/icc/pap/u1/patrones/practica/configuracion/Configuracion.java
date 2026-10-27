package icc.pap.u1.patrones.practica.configuracion;

public class Configuracion {
    private static Configuracion global;
    private double impuestos;

    private Configuracion(double impuestos) {
        this.impuestos = impuestos;
    }

    public static synchronized Configuracion getGlobal() {
        if (global == null) {
            global = new Configuracion(15.0);
        }
        return global;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
}