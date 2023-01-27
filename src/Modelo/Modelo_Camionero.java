package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Camionero extends Camionero {

    ConectOC conoc = new ConectOC();

    public Modelo_Camionero() {
    }

    public List<Camionero> listaPersonasTabla() {
        try {
            List<Camionero> listacam = new ArrayList<>();

            String sql = "select * from persona,camionero where per_codigo = cam_percodigo;";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {

                Camionero camionero = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                camionero.setCodigo(rs.getInt(1));
                camionero.setDni(rs.getString(2));
                camionero.setPrinombre(rs.getString(3));
                camionero.setSegnombre(rs.getString(4));
                camionero.setApellidopat(rs.getString(5));
                camionero.setApellidomat(rs.getString(6));
                camionero.setDireccion(rs.getString(7));
                camionero.setTelefono(rs.getString(8));
                camionero.setEmail(rs.getString(9));
                camionero.setFechanac(rs.getDate(10));
                camionero.setEdad(rs.getInt(11));
                camionero.setGenero(rs.getString(12));
                camionero.setCodigoCam(rs.getInt(13));
                camionero.setCodigo(rs.getInt(14)); //Otra vez es el codigo de persona
                camionero.setSalario(rs.getDouble(15));
                camionero.setTipolicencia(rs.getString(16));
                camionero.setAniosexperiencia(rs.getInt(17));
                camionero.setEstado(rs.getString(18));
                

                listacam.add(camionero); //Agrego los datos a la lista
            }

            //Cierro la conexion a la BD
            rs.close();
            //Retorno la lista
            return listacam;

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Camionero.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
