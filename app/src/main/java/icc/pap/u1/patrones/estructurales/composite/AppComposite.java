package icc.pap.u1.patrones.estructurales.composite;

public class AppComposite {
    public static void main(String[] args) {
        GrupoMenu combo= new GrupoMenu();
        GrupoMenu hamburguesa= new GrupoMenu();
        hamburguesa.addItem(new ProductoMenu("queso", 0.50));
        hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
        hamburguesa.addItem(new ProductoMenu("Pan", 0.50));
        hamburguesa.addItem(new ProductoMenu("Lechuga", 0.25));

        ProductoMenu bebida= new ProductoMenu("Cocacola", 1.35);

        combo.addItem(hamburguesa);
        combo.addItem(bebida);

        System.out.println("Total del combo $" + combo.precio());
    }
    
}
