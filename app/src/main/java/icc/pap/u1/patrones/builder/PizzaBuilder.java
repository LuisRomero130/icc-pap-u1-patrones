package icc.pap.u1.patrones.builder;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
* ObjBuilder
*PizzaBuilder acumular las opciones de una pizza
*y creara el producto (Objeto(Pizza)) cuando se le pida
*al metodo construir(build)
*/
public final class PizzaBuilder {

    private String tamanio;
    
    private List<String> ingredientes= new ArrayList<>();
    public PizzaBuilder(){
        this.tamanio="mediana";
        this.ingredientes.add("queso");
    }

    public PizzaBuilder setTamanio(String tamanio){
        this.tamanio=tamanio;
        return this;
    }
    public PizzaBuilder addIngredientes(String ing){
        boolean contain= ingredientes.contains(ing);
        if (contain)
            return this;
        this.ingredientes.add(ing);
        return this;
    }
    //Metodo build
    //Devuelve el producto
    public Pizza build(){
        return new Pizza(tamanio,ingredientes);
    }
    //Creamos metodos acumuladores para alimentar el builder y tener el profucto listo




    
}
