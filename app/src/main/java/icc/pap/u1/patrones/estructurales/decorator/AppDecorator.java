package icc.pap.u1.patrones.estructurales.decorator;

public class AppDecorator {
    public static void main(String[] args) {
        Bebida bebida= new CafeSimple();// Bebida -> como cafe simple
        Bebida bebidaL= new Leche(bebida);
        Bebida bebidaL2= new Leche(new CafeSimple());

        System.out.println(bebida.descripcion()+ "$"+bebida.precio());
        System.out.println(bebidaL.descripcion()+ "$"+bebidaL.precio());
        System.out.println(bebidaL2.descripcion()+ "$"+ bebidaL2.precio());

    
        Bebida bebidaC= new Chocolate(bebida);
        System.out.println(bebidaC.descripcion()+ " $"+ bebidaC.precio());
        Bebida bebidaLC= new Chocolate(new Leche(bebida));
        System.out.println(bebidaLC.descripcion()+ "$"+ bebidaLC.precio());
        Bebida bebidaCL=new Leche(new Chocolate(bebida));
        System.out.println(bebidaCL.descripcion()+ "$"+ bebidaCL.precio());
        
        Bebida bebidaCCL= new Leche(new Chocolate(new Chocolate(bebida)));
        System.out.println(bebidaCCL.descripcion()+ "$"+ bebidaCCL.precio());


        
    }
    
}
