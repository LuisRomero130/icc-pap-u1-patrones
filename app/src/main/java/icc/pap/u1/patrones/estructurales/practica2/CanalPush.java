package icc.pap.u1.patrones.estructurales.practica2;

public class CanalPush implements CanalEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[PUSH] Notificacion push para el usuario " + destinatario + " | Mensaje: " + mensaje);
    }
}