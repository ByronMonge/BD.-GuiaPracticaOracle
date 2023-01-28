package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_Persona extends Persona {

    ConectOC conoc = new ConectOC();

    public Modelo_Persona() {
    }

    public Modelo_Persona(int codigo, String dni, String prinombre, String segnombre, String apellidopat, String apellidomat, String direccion, String telefono, String email, String fechanac, int edad, String genero) {
        super(codigo, dni, prinombre, segnombre, apellidopat, apellidomat, direccion, telefono, email, fechanac, edad, genero);
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
