package Modelo;

public class Conduce {

    private int codigoCon;
    private String fechaSalida;
    private String fechaLlegada;
    private int codigoCam;
    private int codigoCmi;

    public Conduce() {
    }

    public Conduce(int codigoCon, String fechaSalida, String fechaLlegada, int codigoCam, int codigoCmi) {
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
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
