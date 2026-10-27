package icc.pap.u1.patrones.practica.creadores;

import icc.pap.u1.patrones.practica.pedidos.Pedido;

public abstract class CrearPedido {
    public abstract Pedido crearPedido(String codigo, String cliente, double subtotal);
}