package icc.pap.u1.patrones.estructurales.decorator;
/**
 * 
 * Chocolate decorador que agrega "Chocolate a la descripcion"
 * agrega 0.75 al precio
 * -> Cafe con chocolate y chocolate y leche
 */
public class Chocolate implements Bebida{

    protected final Bebida bebida;
    

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {

        return bebida.descripcion() + " con chocolate";
        
    }

    @Override
    public double precio() {

        return bebida.precio() + 0.75;
        
    }

    
}
