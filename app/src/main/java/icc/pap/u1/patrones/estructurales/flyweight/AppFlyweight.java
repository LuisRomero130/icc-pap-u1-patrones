package icc.pap.u1.patrones.estructurales.flyweight;

public class AppFlyweight {
    public static void main(String[] args) {
        CacheComponentes cache= new CacheComponentes();
        ComponenteVisual boton1= cache.get("boton", "azul","24px");
        ComponenteVisual boton2= cache.get("boton", "azul","24px");
        ComponenteVisual boton3= cache.get("card", "azul","12px");
        boton1.dibujar("guardar",10,20);
        boton2.dibujar("Cancelar",100,20);
        boton3.dibujar("Opciones",5,25);
        System.out.println(boton1== boton2);

    }
    
    




    
}
