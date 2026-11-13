package icc.pap.u1.patrones.comportamiento.stateDos;

public class Pendiente implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pago realizado");
        pedido.changeState(new Pagado());

      
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Debes pagar primero");
      
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no ha sido enviado");
       
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.changeState(new Cancelado());
      
    }

    @Override
    public String nombre() {
        return "PENDIENTE";
    }
    
}
