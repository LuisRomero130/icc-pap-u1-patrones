package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

// Observer 3
public class ControlAsistencias implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("inasistencias")) {
            return;
        }

        int anterior = (int) cambio.anterior();
        int nuevo = (int) cambio.actual();

        String nivelAnterior = nivel(anterior);
        String nivelNuevo = nivel(nuevo);

        if (nivelAnterior.equals(nivelNuevo)) {
            return;
        }

        System.out.println("[ASISTENCIA] " + cambio.estIn()
                + " pasó de " + nivelAnterior + " a " + nivelNuevo
                + " (" + nuevo + " inasistencias)");

        if (nivelNuevo.equals("CRITICO")) {
            System.out.println("[ASISTENCIA] ¡ALERTA! Nivel crítico: " + cambio.estIn());
        }
    }

    private String nivel(int inasistencias) {
        if (inasistencias >= 6) return "CRITICO";
        if (inasistencias >= 3) return "ADVERTENCIA";
        return "NORMAL";
    }
}