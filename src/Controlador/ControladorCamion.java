package Controlador;

import Modelo.Modelo_Camion;
import Vista.VistaCamion;

public class ControladorCamion {

    Modelo_Camion modelo;
    VistaCamion vista;

    public ControladorCamion(Modelo_Camion modelo, VistaCamion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
    }

    public void abrirDialogCrear() {
        vista.getjDlgCamion().setName("Crear nuevo camion");
        vista.getjDlgCamion().setLocationRelativeTo(vista);
        vista.getjDlgCamion().setSize(1100, 500);
        vista.getjDlgCamion().setTitle("Crear nuevo camion");
        vista.getjDlgCamion().setVisible(true);
    }
}
