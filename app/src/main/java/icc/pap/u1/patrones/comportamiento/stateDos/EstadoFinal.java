package icc.pap.u1.patrones.comportamiento.stateDos;

public abstract class EstadoFinal implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Estado no permitido");
    }
        

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Estado no permitido");
     
    
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Estado no permitido");
     
    
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Estado no permitido");
        
    
    }

    @Override
    public String nombre() {
        return "Estado no permitido";
    
    
    }
    
}
