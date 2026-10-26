package icc.pap.u1.patrones.prototype;

public class PlantillaEmail {
    private String asunto;
    private String mensaje;
    //C
    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    public PlantillaEmail clone(){
        return new PlantillaEmail(asunto, mensaje);
    }
    public void cambiarAsunto(String newAsunto){
        this.asunto= newAsunto;

    }
    @Override
    public String toString() {
        return asunto +": "+ mensaje; 
    }
    public String contenido (){
        return this.toString();
    }
    

    
    
}
