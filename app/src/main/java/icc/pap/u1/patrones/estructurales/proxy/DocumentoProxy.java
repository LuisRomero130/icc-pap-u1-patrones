package icc.pap.u1.patrones.estructurales.proxy;
/**
 * Proxy que postpone la creacion de un documento real hasta que se lo necesite
 * DocumentoProxy
 */
public class DocumentoProxy implements Documento{
    private final String path;
    private DocumentoReal documento;
    

    public DocumentoProxy(String path) {
        this.path = path;
    }


    @Override
    public void mostrar() {
        if(documento == null){
            documento= new DocumentoReal(path);

        }else{
            documento.mostrar();
        }

       
    }

    
}
