
package Modelo;


public class Camion {
    
    private int codigoCmi;
    private String placa;
    private String matricula;
    private String modelo;
    private String potencia;
    private String tipo;

    public Camion() {
    }

    public Camion(int codigoCmi, String matricula, String modelo, String potencia, String tipo, String placa) {
        this.codigoCmi = codigoCmi;
        this.matricula = matricula;
        this.placa = placa;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getCodigoCmi() {
        return codigoCmi;
    }

    public void setCodigoCmi(int codigoCmi) {
        this.codigoCmi = codigoCmi;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
