package icc.pap.u1.patrones.estructurales.practica2;

public class AppNotificaciones {

    public static void main(String[] args) {

        System.out.println("--- Caso 1 ---");
        new NotificacionAcademica(new CanalCorreo())
                .notificar("estudiante@universidad.edu", "Tus calificaciones estan disponibles.");

        System.out.println("--- Caso 2 ---");
        new NotificacionAdministrativa(new CanalSMS())
                .notificar("0991234567", "Tienes un tramite pendiente.");

        System.out.println("--- Caso 3 ---");
        new NotificacionSeguridad(new ProxyCanalEnvio(new CanalPush(), true))
                .notificar("usuario123", "Inicio de sesion sospechoso.");

        System.out.println("--- Caso 4 ---");
        new NotificacionAcademica(new ProxyCanalEnvio(new CanalSMS(), false))
                .notificar("0987654321", "Tu matricula fue actualizada.");

        System.out.println("--- Caso 5 ---");
        CanalEnvio correo = new CanalCorreo();
        new NotificacionAcademica(correo).notificar("estudiante@universidad.edu", "Entrega del proyecto final.");
        new NotificacionAdministrativa(correo).notificar("estudiante@universidad.edu", "Actualiza tus datos.");

        System.out.println("--- Caso 6 ---");
        new NotificacionSeguridad(new ProxyCanalEnvio(new CanalCorreo(), true))
                .notificar("estudiante@universidad.edu", "Tu contrasena fue cambiada.");
        new NotificacionSeguridad(new ProxyCanalEnvio(new CanalSMS(), false))
                .notificar("0991234567", "Tu contrasena fue cambiada.");
    }
}