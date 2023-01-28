package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Persona extends Persona {

    ConectOC conoc = new ConectOC();

    public Modelo_Persona() {
    }

    public Modelo_Persona(int codigo, String dni, String prinombre, String segnombre, String apellidopat, String apellidomat, String direccion, String telefono, String email, Date fechanac, int edad, String genero) {
        super(codigo, dni, prinombre, segnombre, apellidopat, apellidomat, direccion, telefono, email, fechanac, edad, genero);
    }

    public boolean crearPersona() {
        //String sql = "insert into persona (per_dni, per_prinombre, per_segnombre, per_apellidopat, per_apellidomat, per_direccion, per_telefono, per_email, per_fechanac, per_edad, per_genero) values ('" + getDni() + "','" + getPrinombre() + "','" + getSegnombre() + "','" + getApellidopat() + "','" + getApellidomat() + "','" + getDireccion() + "','" + getTelefono() + "','" + getEmail() + "'," + getFechanac() + "," + getEdad() + ",'" + getGenero() + "')";

        String sql = "insert into persona (per_dni, per_prinombre, per_segnombre, per_apellidopat, per_apellidomat, per_direccion, per_telefono, per_email, per_fechanac, per_edad, per_genero) values ('4444444444','Pedro','Samuel','Aldaz','Coronel','Cuenca','0967342523','victor46@gmail.com','21/08/2003',19,'H')";
        return conoc.accion(sql);
    }

    public int traerCodigoDePersona() {
        int codigo = 0;
        try {

            String sql = "select max(per_codigo) from persona";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                codigo = rs.getInt("max(per_codigo)"); //Trae el codigo de la persona recien creada

            }

            //Cierro la conexion a la BD
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Camionero.class.getName()).log(Level.SEVERE, null, ex);

        }

        return codigo;
    }
}
