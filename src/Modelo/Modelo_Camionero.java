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

    public Modelo_Camionero(int codigoCam, String dni, String nombre, String apellido, String telefono, String direccion, String poblacion, double salario) {
        super(codigoCam, dni, nombre, apellido, telefono, direccion, poblacion, salario);
    }

    public List<Camionero> listaPersonasTabla() {
        try {
            //Me retorna un "List" de "persona"
            List<Camionero> lista = new ArrayList<>();

            String sql = "select nombre from persona";

            ResultSet rs = conoc.consulta(sql); //La consulta nos devuelve un "ResultSet"
            byte[] bytea;

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de las personas
                Camionero persona = new Camionero();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                persona.setNombre(rs.getString("nombre"));

                lista.add(persona); //Agrego los datos a la lista
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
