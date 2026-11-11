package icc.pap.u1.patrones.comportamiento.observer;

public class AppObserver {
    public static void main(String[] args) {
        Producto p= new Producto("001",20.50, "Pizza");

        p.suscribir(cp ->{
            System.out.println("Se modifico el "+ cp.atributo());
            System.out.println("Old: "+ cp.anterior()+ "| New: "+ cp.nuevo());

        });
        System.out.println("Cambiar precio");
        p.setPrecio(15.50);
        System.out.println("Cambiar nombre");
        p.setNombre("PIZZA");
        System.out.println("Cambiar en el codigo");
        p.setCodigo("010");
    }
}
        
        


       