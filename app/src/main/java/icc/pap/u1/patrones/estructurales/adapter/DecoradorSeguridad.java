package icc.pap.u1.patrones.estructurales.adapter;

public class DecoradorSeguridad extends DecoradorCargador {
    protected boolean permitido;
    public DecoradorSeguridad(Cargador cargador,boolean permitido) {
        super(cargador);
        this.permitido=permitido;
    
    }
    @Override 
    public void cargarCelular(){
        System.out.println("Verificando seguridad...");
        if(this.permitido){
            super.cargarCelular();
        }else{
            System.out.println("Cargador bloqueado");
        }
    }

    

    
        
    
    
}
