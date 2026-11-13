package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

// Observer 4
public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if (!cambio.atributo().equals("estado")) {
            return;
        }

        String anterior = String.valueOf(cambio.anterior());
        String nuevo = String.valueOf(cambio.actual());

        switch (nuevo) {
            case "SUSPENDIDO" ->
                System.out.println("[MATRICULA] Estudiante suspendido: " + cambio.estIn());
            case "RETIRADO" ->
                System.out.println("[MATRICULA] Estudiante retirado: " + cambio.estIn());
            case "ACTIVO" -> {
                
                if (anterior.equals("SUSPENDIDO") || anterior.equals("RETIRADO")) {
                    System.out.println("[MATRICULA] Estudiante reactivado: " + cambio.estIn());
                }
            }
            default -> { }
        }
    }
}