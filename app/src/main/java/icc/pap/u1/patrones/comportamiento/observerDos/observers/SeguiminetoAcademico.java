package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

// Observer 2
// Consumer es una interface
public class SeguiminetoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {
        if(!cambio.atributo().equals("promedio")){
            return ;
        }
        double anterior= (double)cambio.anterior();
        double nuevo= (double ) cambio.actual();
        if(anterior>=7.0 && nuevo<7.0){
            System.out.println("[ACADEMICO] Bajo rendimento "+ cambio.estIn());
        }

        if (anterior <7.0 && nuevo >= 7.0){
            System.out.println("[ACADEMICO] Recuperacion academica: "+ cambio.estIn());

        }

        
    }
    
}
