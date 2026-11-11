package icc.pap.u1.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class Producto {
    private String codigo;
    private double precio;
    private String nombre;

    public final List<Consumer<CambioProducto>> observadores;

    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores= new ArrayList<>();
    }
    public void suscribir(Consumer<CambioProducto> observador){
        observadores.add(observador);
    }
    private void notifyAll(CambioProducto cambio){
        for (Consumer<CambioProducto> observador: observadores){
            observador.accept(cambio);

        }
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo){
        String codigoAntiguo= this.codigo;
        this.codigo=codigo;
        CambioProducto cP= new CambioProducto(this,"codigo",codigoAntiguo,codigo);
        notifyAll(cP);
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
        double precioAntiguo= this.precio;
        CambioProducto cPR= new CambioProducto(this, "presio", precioAntiguo, precio);
        notifyAll(cPR);

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        String nombreAntiguo= this.nombre;
        CambioProducto cN= new CambioProducto(this, "nombre", nombreAntiguo, nombre);
        notifyAll(cN);

    }
    public List<Consumer<CambioProducto>> getObservadores() {
        return observadores;
    }
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", precio=" + precio + ", nombre=" + nombre + "]";
    }

    
    


}

    