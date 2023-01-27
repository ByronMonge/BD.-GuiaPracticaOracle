
package Modelo;

import java.util.Date;


public class Camionero extends Persona{
    
    private int codigoCam;
    private double salario;
    private String tipolicencia;
    private int aniosexperiencia;
    private char estado;

    public Camionero() {
    }

    public Camionero(int codigoCam, double salario, String tipolicencia, int aniosexperiencia, char estado) {
        this.codigoCam = codigoCam;
        this.salario = salario;
        this.tipolicencia = tipolicencia;
        this.aniosexperiencia = aniosexperiencia;
        this.estado = estado;
    }

    public Camionero(int codigoCam, double salario, String tipolicencia, int aniosexperiencia, char estado, int codigo, String dni, String prinombre, String segnombre, String apellidopat, String apellidomat, String direccion, String telefono, String email, Date fechanac, int edad, char genero) {
        super(codigo, dni, prinombre, segnombre, apellidopat, apellidomat, direccion, telefono, email, fechanac, edad, genero);
        this.codigoCam = codigoCam;
        this.salario = salario;
        this.tipolicencia = tipolicencia;
        this.aniosexperiencia = aniosexperiencia;
        this.estado = estado;
    }

    public int getCodigoCam() {
        return codigoCam;
    }

    public void setCodigoCam(int codigoCam) {
        this.codigoCam = codigoCam;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
