package icc.pap.u1.patrones.practica.creadores;

import icc.pap.u1.patrones.practica.pedidos.Pedido;
import icc.pap.u1.patrones.practica.pedidos.PedidoPresencial;

public class CreadorPresencial extends CrearPedido {

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoPresencial(codigo, cliente, subtotal);
    }
}
    

