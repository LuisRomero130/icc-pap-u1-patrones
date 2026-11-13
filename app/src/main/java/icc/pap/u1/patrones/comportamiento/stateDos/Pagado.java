package icc.pap.u1.patrones.comportamiento.stateDos;

public class Pagado implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Ya esta pagado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado");
        pedido.changeState(new Enviado());
        
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("debe enviarse primero");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("No se puede cancelar un pedido pagado");
    }
        

    @Override
    public String nombre() {
        return "PAGADO";
           
    }

    
}
