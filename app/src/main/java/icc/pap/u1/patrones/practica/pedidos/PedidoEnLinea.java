package icc.pap.u1.patrones.practica.pedidos;

public class PedidoEnLinea extends Pedido {

    public PedidoEnLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante electrónico enviado por correo. Pedido: " + codigo);
    }
}