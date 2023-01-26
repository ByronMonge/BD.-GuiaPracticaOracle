package Modelo;

import java.util.Date;

public class Conduce {

    private int codigoCon;
    private Date fechaSalida;
    private Date fechaLlegada;
    private int codigoCam;
    private int codigoCmi;

    public Conduce() {
    }

    public Conduce(int codigoCon, Date fechaSalida, Date fechaLlegada, int codigoCam, int codigoCmi) {
        this.codigoCon = codigoCon;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.codigoCam = codigoCam;
        this.codigoCmi = codigoCmi;
    }

    public int getCodigoCon() {
        return codigoCon;
    }

    public void setCodigoCon(int codigoCon) {
        this.codigoCon = codigoCon;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCodigoCam() {
        return codigoCam;
    }

    public void setCodigoCam(int codigoCam) {
        this.codigoCam = codigoCam;
    }

    public int getCodigoCmi() {
        return codigoCmi;
    }

    public void setCodigoCmi(int codigoCmi) {
        this.codigoCmi = codigoCmi;
    }
}
