package icc.pap.u1.patrones.estructurales.adapter;

public class AppAdapter {public static void main(String[] args) {
    //CARGAR MI CELULAR CON UN CARGADOR 
    //PERO COMO AHORA TENGO UN CARGADOR ANTIGUO TENGO QUE CREAR UN ADAPTADOR
    //CargadorInalambrico cIna= new CargadorInalambrico();
    //CargadorAntiguo cAntiguo= new CargadorAntiguo();
    //Cargador cargador1=  new AdaptadorCargador(cAntiguo);
    //cargador1.cargarCelular();
    //Cargador cargador2= new AdaptadorCargadorIna(cIna);
    //cargador2.cargarCelular();
    System.out.println("Caso 1. Cargador antiguo con registro");
    CargadorAntiguo cargador= new CargadorAntiguo();
    Cargador cargadorA= new AdaptadorCargador(cargador);
    Cargador c1 = new DecoradorRegistro(cargadorA);
    c1.cargarCelular();
    System.out.println("Caso 2. Cargador inalámbrico con seguridad permitida" );
    CargadorInalambrico cargador2= new CargadorInalambrico();
    Cargador cargadorA2= new AdaptadorCargadorIna(cargador2);
    Cargador c2= new DecoradorSeguridad(cargadorA2,true);
    c2.cargarCelular();
    System.out.println("Caso 3. Cargador antiguo con seguridad bloqueada");
    Cargador c3= new DecoradorSeguridad(cargadorA2, false);
    c3.cargarCelular();
    System.out.println("Caso 4. Cargador inalámbrico con dos decoradores");
    Cargador c4= new DecoradorSeguridad(new DecoradorRegistro(cargadorA2), true);
    c4.cargarCelular();
    }
            
}
    

