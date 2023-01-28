package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Camionero extends Camionero {

    ConectOC conoc = new ConectOC();

    Modelo_Persona mipersona = new Modelo_Persona(); //Creo un objeto de modelo_persona para usar sus metodos

    public Modelo_Camionero() {
    }

    public Modelo_Camionero(int codigoCam, double salario, String tipolicencia, int aniosexperiencia, String estado) {
        super(codigoCam, salario, tipolicencia, aniosexperiencia, estado);
    }

    public Modelo_Camionero(int codigoCam, double salario, String tipolicencia, int aniosexperiencia, String estado, int codigo, String dni, String prinombre, String segnombre, String apellidopat, String apellidomat, String direccion, String telefono, String email, Date fechanac, int edad, String genero) {
        super(codigoCam, salario, tipolicencia, aniosexperiencia, estado, codigo, dni, prinombre, segnombre, apellidopat, apellidomat, direccion, telefono, email, fechanac, edad, genero);
    }

    public boolean crearCamionero() {

        if (mipersona.crearPersona()) {
            //String sql = "insert into camionero (cam_percodigo, cam_salario, cam_tipolicencia, cam_aniosexperi, cam_estado) values (" + mipersona.traerCodigoDePersona() + "," + getSalario() + ",'" + getTipolicencia() + "'," + getAniosexperiencia() + ",'A')";

            String sql = "insert into camionero (cam_percodigo, cam_salario, cam_tipolicencia, cam_aniosexperi, cam_estado) values (4,400,'C',1,'A')";
            return conoc.accion(sql);
        } else {
            return false;
        }
    }

    public List<Camionero> listaPersonasTabla() {
        try {
            //Me retorna un "List" de "persona"
            List<Camionero> lista = new ArrayList<>();

            //String sql = "select per_codigo,per_prinombre,per_apellidopat,per_edad,per_genero,per_telefono from persona";SENTENCIA QUE SIRVE
            String sql = "select per_dni,per_prinombre,per_apellidopat,per_edad,per_genero,per_telefono, cam_salario from persona p, camionero c where p.per_codigo = c.cam_percodigo";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Camionero cam = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                cam.setDni(rs.getString("per_dni"));
                cam.setPrinombre(rs.getString("per_prinombre"));
                cam.setApellidopat(rs.getString("per_apellidopat"));
                cam.setEdad(rs.getInt("per_edad"));
                cam.setGenero(rs.getString("per_genero"));
                cam.setTelefono(rs.getString("per_telefono"));
                cam.setSalario(rs.getDouble("cam_salario"));

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
