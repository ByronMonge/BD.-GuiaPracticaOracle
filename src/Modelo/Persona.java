
package Modelo;

import java.util.Date;

public class Persona {
    
    private int codigo;
    private String dni;
    private String prinombre;
    private String segnombre;
    private String apellidopat;
    private String apellidomat;
    private String direccion;
    private String telefono;
    private String email;
    private Date fechanac;
    private int edad;
    private char genero;

    public Persona() {
    }

    public Persona(int codigo, String dni, String prinombre, String segnombre, String apellidopat, String apellidomat, String direccion, String telefono, String email, Date fechanac, int edad, char genero) {
        this.codigo = codigo;
        this.dni = dni;
        this.prinombre = prinombre;
        this.segnombre = segnombre;
        this.apellidopat = apellidopat;
        this.apellidomat = apellidomat;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechanac = fechanac;
        this.edad = edad;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPrinombre() {
        return prinombre;
    }

    public void setPrinombre(String prinombre) {
        this.prinombre = prinombre;
    }

    public String getSegnombre() {
        return segnombre;
    }

    public void setSegnombre(String segnombre) {
        this.segnombre = segnombre;
    }

    public String getApellidopat() {
        return apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        this.apellidopat = apellidopat;
    }

    public String getApellidomat() {
        return apellidomat;
    }

    public void setApellidomat(String apellidomat) {
        this.apellidomat = apellidomat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
