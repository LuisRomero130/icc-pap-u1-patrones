package icc.pap.u1.patrones.estructurales.adapter;

public abstract class DecoradorCargador implements Cargador{
    public Cargador cargador;
    

    public DecoradorCargador(Cargador cargador) {
        this.cargador = cargador;
    }


    @Override
    public void cargarCelular() {
        this.cargador.cargarCelular();
       
    }

    

    
} 
    

