package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.Estudiante;

// Observer 5
public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        String atributo = cambio.atributo();

        
        if (!atributo.equals("promedio")
                && !atributo.equals("inasistencias")
                && !atributo.equals("estado")) {
            return;
        }

        Estudiante e = cambio.estIn();

    
        double promedio = e.getPromedioAcademico();
        int inasistencias = e.getNumeroInacistencias();
        String estado = String.valueOf(e.getEstado());

        
        double promedioAntes = promedio;
        int inasistenciasAntes = inasistencias;
        String estadoAntes = estado;

        switch (atributo) {
            case "promedio" -> promedioAntes = (double) cambio.anterior();
            case "inasistencias" -> inasistenciasAntes = (Integer) cambio.anterior();
            case "estado" -> estadoAntes = String.valueOf(cambio.anterior());
            default -> { }
        }

        boolean riesgoAntes = enRiesgo(promedioAntes, inasistenciasAntes, estadoAntes);
        boolean riesgoAhora = enRiesgo(promedio, inasistencias, estado);

        if (!riesgoAntes && riesgoAhora) {
            System.out.println("[INTEGRAL] ¡ALERTA DE RIESGO INTEGRAL! " + e
                    + " -> promedio " + promedio
                    + ", inasistencias " + inasistencias
                    + ", estado " + estado);
        }
    }

    private boolean enRiesgo(double promedio,int inasistencias, String estado) {
        return promedio < 7.0 && inasistencias>=6 && estado.equals("ACTIVO");
    }
}