package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Conduce extends Conduce {

    ConectOC conoc = new ConectOC();

    public Modelo_Conduce() {
    }

    public Modelo_Conduce(int codigoCon, String fechaSalida, String fechaLlegada, int codigoCam, int codigoCmi) {
        super(codigoCon, fechaSalida, fechaLlegada, codigoCam, codigoCmi);
    }

    public boolean crearConduccion() {

        String sql = "insert into conduce (con_codcamionero, con_codcamion, con_fechaini, con_fechafin) values (" + getCodigoCam() + "," + getCodigoCmi() + ",'" + getFechaSalida() + "','" + getFechaLlegada() + "')";
        return conoc.accion(sql);
    }

    /*public List<Conduce> listaTurnosDeConduccion() {
        try {
            //Me retorna un "List" de "persona"
            List<Conduce> lista = new ArrayList<>();

            String sql = "select cam_codigo, per_dni,per_prinombre,per_segnombre,per_apellidopat,per_apellidomat,per_direccion,per_telefono,per_email,per_fechanac,per_edad,per_genero,cam_salario,cam_tipolicencia,cam_aniosexperi from persona p, camionero c where p.per_codigo = c.cam_percodigo and c.cam_estado = 'A'";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Camionero cam = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                cam.setCodigoCam(rs.getInt("cam_codigo"));
                cam.setDni(rs.getString("per_dni"));
                cam.setPrinombre(rs.getString("per_prinombre"));
                cam.setSegnombre(rs.getString("per_segnombre"));
                cam.setApellidopat(rs.getString("per_apellidopat"));
                cam.setApellidomat(rs.getString("per_apellidomat"));
                cam.setDireccion(rs.getString("per_direccion"));
                cam.setTelefono(rs.getString("per_telefono"));
                cam.setEmail(rs.getString("per_email"));
                cam.setFechanac(rs.getString("per_fechanac"));
                cam.setEdad(rs.getInt("per_edad"));
                cam.setGenero(rs.getString("per_genero"));
                cam.setSalario(rs.getDouble("cam_salario"));
                cam.setTipolicencia(rs.getString("cam_tipolicencia"));
                cam.setAniosexperiencia(rs.getInt("cam_aniosexperi"));

                lista.add(cam); //Agrego los datos a la lista
            }

            //Cierro la conexion a la BD
            rs.close();
            //Retorno la lista
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Camionero.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }*/
}
