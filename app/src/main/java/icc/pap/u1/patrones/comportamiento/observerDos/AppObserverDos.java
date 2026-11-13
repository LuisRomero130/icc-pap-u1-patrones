package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.observers.ControlAsistencias;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.ControlMatricula;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguiminetoAcademico;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverDos {
    public static void main(String[] args) {

        Estudiante ana = new Estudiante("Est001", "Ana Torres", 8.5, 1, EstadoMatricula.ACTIVO);
        Estudiante luis = new Estudiante("Est002", "Luis Perez", 7.2, 4, EstadoMatricula.ACTIVO);
        Estudiante maria = new Estudiante("Est003", "Maria Lopez", 9.1, 0, EstadoMatricula.ACTIVO);

        Consumer<CambioEstudiante> auditoria = cambio -> {
            System.out.printf("[AUDITORIA] %s | %s: %s -> %s%n",
                    cambio.estIn(), cambio.atributo(), cambio.anterior(), cambio.actual());
        };

        ana.suscribir(auditoria);
        luis.suscribir(auditoria);
        maria.suscribir(auditoria);

        SeguiminetoAcademico obAcademico = new SeguiminetoAcademico();

        ana.suscribir(obAcademico);
        luis.suscribir(obAcademico);
        maria.suscribir(obAcademico);

        ControlAsistencias obAsistencia = new ControlAsistencias();

        ana.suscribir(obAsistencia);
        luis.suscribir(obAsistencia);
        maria.suscribir(obAsistencia);

        ControlMatricula obMatricula = new ControlMatricula();

        ana.suscribir(obMatricula);
        luis.suscribir(obMatricula);
        maria.suscribir(obMatricula);

        SeguimientoIntegral obIntegral = new SeguimientoIntegral();

        ana.suscribir(obIntegral);
        luis.suscribir(obIntegral);
        maria.suscribir(obIntegral);

        System.out.println("\n--- Caso 1 ---");
        ana.setPromedioAcademico(6.5);

        System.out.println("\n--- Caso 2 ---");
        ana.setPromedioAcademico(7.8);

        System.out.println("\n--- Caso 3 ---");
        luis.setNumeroInacistencias(7);

        System.out.println("\n--- Caso 4 ---");
        maria.setEstado(EstadoMatricula.SUSPENDIDO);
        maria.setEstado(EstadoMatricula.ACTIVO);

        System.out.println("\n--- Caso 5 ---");
        luis.setPromedioAcademico(6.4);

        System.out.println("\n--- Caso 6 ---");
        maria.setPromedioAcademico(9.1);
        maria.setNumeroInacistencias(0);
        maria.setEstado(EstadoMatricula.ACTIVO);

        System.out.println("\n--- Caso 7 ---");
        ana.setNumeroInacistencias(3);
        maria.setPromedioAcademico(6.8);
        luis.setPromedioAcademico(6.1);

        System.out.println("\n--- Caso 8 ---");
        Consumer<CambioEstudiante> notificadorRepresentante = cambio -> {
            switch (cambio.atributo()) {
                case "promedio" -> {
                    double anterior = (double) cambio.anterior();
                    double nuevo = (double) cambio.actual();
                    if (anterior >= 6.0 && nuevo < 6.0) {
                        System.out.println("[REPRESENTANTE] Promedio inferior a 6.0: " + cambio.estIn());
                    }
                }
                case "inasistencias" -> {
                    int anterior = (int) cambio.anterior();
                    int nuevo = (int) cambio.actual();
                    if (anterior < 8 && nuevo >= 8) {
                        System.out.println("[REPRESENTANTE] 8 o mas inasistencias: " + cambio.estIn());
                    }
                }
                case "estado" -> {
                    if (String.valueOf(cambio.actual()).equals("SUSPENDIDO")) {
                        System.out.println("[REPRESENTANTE] Matricula suspendida: " + cambio.estIn());
                    }
                }
                default -> { }
            }
        };

        ana.suscribir(notificadorRepresentante);
        luis.suscribir(notificadorRepresentante);

        luis.setPromedioAcademico(5.8);
        luis.setNumeroInacistencias(8);
        ana.setEstado(EstadoMatricula.SUSPENDIDO);
        maria.setPromedioAcademico(5.5);
    }
}