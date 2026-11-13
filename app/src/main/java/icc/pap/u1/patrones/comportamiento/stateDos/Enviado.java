package icc.pap.u1.patrones.comportamiento.stateDos;

public class Enviado implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Ya esta pagado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya esta enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
       System.out.println("Pedido entregado");
       pedido.changeState( new Entregado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("No se puede cancelar");
       
    }

    @Override
    public String nombre() {
        return "ENVIADO";
     
    }

    
}
