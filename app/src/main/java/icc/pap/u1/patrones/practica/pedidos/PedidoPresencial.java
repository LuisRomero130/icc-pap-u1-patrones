package icc.pap.u1.patrones.practica.pedidos;

public class PedidoPresencial extends Pedido {

    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante impreso entregado en caja. Pedido: " + codigo);
    }
}