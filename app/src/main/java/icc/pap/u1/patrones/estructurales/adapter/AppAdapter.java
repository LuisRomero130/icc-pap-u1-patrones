package icc.pap.u1.patrones.estructurales.adapter;

public class AppAdapter {public static void main(String[] args) {
    //CARGAR MI CELULAR CON UN CARGADOR 
    //PERO COMO AHORA TENGO UN CARGADOR ANTIGUO TENGO QUE CREAR UN ADAPTADOR
    CargadorInalambrico cIna= new CargadorInalambrico();
    CargadorAntiguo cAntiguo= new CargadorAntiguo();
    Cargador cargador1=  new AdaptadorCargador(cAntiguo);
    cargador1.cargarCelular();
    Cargador cargador2= new AdaptadorCargadorIna(cIna);
    cargador2.cargarCelular();
            
    };
        
}
    

