package icc.pap.u1.patrones.creacionales;

public class FactoryDemo {
    public interface Notificacion {
        void enviar(String mensaje);
    }

    public static class NotificacionEmail implements Notificacion {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando email: " + mensaje);
        }
    }

    public static class NotificacionSMS implements Notificacion {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando SMS: " + mensaje);
        }
    }

    public static class NotificacionPush implements Notificacion {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Enviando notificación push: " + mensaje);
        }
    }

    public static class NotificacionFactory {
        public static Notificacion crearNotificacion(String tipo) {
            if (tipo == null || tipo.isEmpty()) {
                return null;
            }

            switch (tipo.toUpperCase()) {
                case "EMAIL":
                    return new NotificacionEmail();
                case "SMS":
                    return new NotificacionSMS();
                case "PUSH":
                    return new NotificacionPush();
                default:
                    throw new IllegalArgumentException("Tipo de notificación no soportado: " + tipo);
            }
        }
    }
}
        
            
        
    
    
    
    

