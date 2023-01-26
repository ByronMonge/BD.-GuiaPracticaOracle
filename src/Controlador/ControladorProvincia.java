package Controlador;

import Modelo.Modelo_Provincia;
import Vista.VistaProvincia;

public class ControladorProvincia {

    Modelo.Modelo_Provincia modelo;
    Vista.VistaProvincia vista;

    public ControladorProvincia(Modelo_Provincia modelo, VistaProvincia vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
    }

    public void abrirDialogCrear() {
        vista.getjDlgprovincias().setName("Crear nueva persona");
        vista.getjDlgprovincias().setLocationRelativeTo(vista);
        vista.getjDlgprovincias().setSize(1100, 500);
        vista.getjDlgprovincias().setTitle("Crear nueva persona");
        vista.getjDlgprovincias().setVisible(true);
    }
}
