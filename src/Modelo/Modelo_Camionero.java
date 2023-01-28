package Modelo;

import java.io.IOException;
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

    public List<Camionero> listaCamioneros() {
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

    public List<Camionero> obtenerpersonas() {
        conoc.getCon();

        List<Camionero> listaPersonas = new ArrayList<>();
        String sql = "select * from persona,camionero where per_codigo = cam_percodigo;";//select cam_codigo from camionero
        ResultSet rs = conoc.consulta(sql);
        try {
            while (rs.next()) {
                 Camionero camionero = new Camionero();
                //cam.setCodigo(rs.getInt(1));
                
                
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

                //listaPersonas.add(cam);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Camionero.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Camionero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPersonas;
    }

    public List<Camionero> listaPersonasTabla() { //SIRVE
        try {
            //Me retorna un "List" de "persona"
            List<Camionero> lista = new ArrayList<>();

            String sql = "select per_prinombre from persona";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Camionero cam = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                cam.setPrinombre(rs.getString("per_prinombre"));

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
    }
    
    public List<Camionero> listaPersonasTabla2() { //SIRVE
        try {
            //Me retorna un "List" de "persona"
            List<Camionero> lista = new ArrayList<>();

            String sql = "select per_codigo, per_prinombre, cam_salario from persona p,camionero c where p.per_codigo = c.cam_percodigo ";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Camionero cam = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                cam.setCodigo(rs.getInt("per_codigo"));
                cam.setPrinombre(rs.getString("per_prinombre"));

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
    }
}
