
package Modelo;

public class Provincia {
    
    private int codigoPro;
    private String nombre;

    public Provincia() {
    }

    public Provincia(int codigoPro, String nombre) {
        this.codigoPro = codigoPro;
        this.nombre = nombre;
    }

    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
