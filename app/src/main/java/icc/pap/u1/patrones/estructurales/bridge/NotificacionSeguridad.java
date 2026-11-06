package icc.pap.u1.patrones.estructurales.bridge;

public class NotificacionSeguridad extends Notificacion{

    public NotificacionSeguridad(CanalEnvio canalEnvio) {
        super(canalEnvio);
      
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Not seguridad: " + mensaje);
        
       
    }
    
}
