package icc.pap.u1.patrones.estructurales.composite;

import java.util.ArrayList;
import java.util.List;


/**
 * Composite como tal, por que agrupa productos dde tipo ElementoMenu
 * y calcula el precio que es la sumatoria de todos los elementos
 * GrupoMenu
 */
public class GrupoMenu implements ElementoMenu{
    private List<ElementoMenu> items;
    



    public GrupoMenu() {
        items= new ArrayList<>();
    }




    @Override
    public double precio() {
        return items.stream().mapToDouble(ElementoMenu::precio).sum();
        /* 
        // la suma de todos los items
        double suma= 0;
        for(ElementoMenu elementoMenu: items){
            suma= suma + elementoMenu.precio();
        }
        return suma;
     */

    
    }
    public void addItem(ElementoMenu _item){
        this.items.add(_item);
    }
    
}
