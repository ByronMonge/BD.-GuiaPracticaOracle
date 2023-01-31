
package Modelo;

public class Modelo_Paquete extends Paquete {
    
    ConectOC conoc = new ConectOC();

    public Modelo_Paquete() {
    }

    public Modelo_Paquete(int codigoPaq, int codcliente, int codprovincia, int coddestina, int codcamionero, String salidaproga, String llegadaprogra, double peso, String fecharegistro) {
        super(codigoPaq, codcliente, codprovincia, coddestina, codcamionero, salidaproga, llegadaprogra, peso, fecharegistro);
    }
    
    
    
}
