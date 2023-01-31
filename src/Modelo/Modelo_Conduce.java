
package Modelo;

public class Modelo_Conduce extends Conduce{
    
    ConectOC conoc = new ConectOC();

    public Modelo_Conduce() {
    }

    public Modelo_Conduce(int codigoCon, String fechaSalida, String fechaLlegada, int codigoCam, int codigoCmi) {
        super(codigoCon, fechaSalida, fechaLlegada, codigoCam, codigoCmi);
    }
    
    public boolean crearConduccion() {

        String sql = "insert into conduce (con_codcamionero, con_codcamion, con_fechainicio, con_fechafin) values (" + getCodigoCam() + "," + getCodigoCmi() + ",'" + getFechaSalida() + "','" + getFechaLlegada() + "')";
        return conoc.accion(sql);
    }
}
