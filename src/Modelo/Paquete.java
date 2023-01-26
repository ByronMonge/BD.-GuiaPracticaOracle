package Modelo;

public class Paquete {

    private int codigoPaq;
    private String descripcion;
    private String destinatario;
    private String direccionDestinatario;
    private int codigoCam;
    private int codigoPro;

    public Paquete() {
    }

    public Paquete(int codigoPaq, String descripcion, String destinatario, String direccionDestinatario, int codigoCam, int codigoPro) {
        this.codigoPaq = codigoPaq;
        this.descripcion = descripcion;
        this.destinatario = destinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.codigoCam = codigoCam;
        this.codigoPro = codigoPro;
    }

    public int getCodigoPaq() {
        return codigoPaq;
    }

    public void setCodigoPaq(int codigoPaq) {
        this.codigoPaq = codigoPaq;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public int getCodigoCam() {
        return codigoCam;
    }

    public void setCodigoCam(int codigoCam) {
        this.codigoCam = codigoCam;
    }

    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }
}
