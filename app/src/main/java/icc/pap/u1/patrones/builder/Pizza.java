package icc.pap.u1.patrones.builder;
import java.util.List;
/*
*
*Pizza clase inmutable
*
*representa una pizza ya configurada
*/
public final class Pizza {
    private final String tamanio;
    private final List<String> ingredientes;
    public Pizza(String tamanio, List<String> ingredientes) {
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;

    }
    public String descripcion(){
        return "Pizza "+ tamanio + "con: "+ ingredientes;
    }

    
}
