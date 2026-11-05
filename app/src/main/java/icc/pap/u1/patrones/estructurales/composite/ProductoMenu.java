package icc.pap.u1.patrones.estructurales.composite;

public class ProductoMenu implements ElementoMenu{
    private final String nombre;
    private final double precio;
    

    public ProductoMenu(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public double precio(){
        return this.precio;

        
    }


    @Override
    public String toString() {
        return nombre;
    }
    
    
}
