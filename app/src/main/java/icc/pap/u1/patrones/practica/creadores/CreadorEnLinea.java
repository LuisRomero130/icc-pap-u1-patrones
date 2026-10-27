package icc.pap.u1.patrones.practica.creadores;

import icc.pap.u1.patrones.practica.pedidos.Pedido;
import icc.pap.u1.patrones.practica.pedidos.PedidoEnLinea;

public class CreadorEnLinea extends CrearPedido {

    @Override
    public Pedido crearPedido(String codigo, String cliente, double subtotal) {
        return new PedidoEnLinea(codigo, cliente, subtotal);
    }
}