package Controlador;

import Modelo.Modelo_Conduce;
import Vista.VistaConduce;

public class ControladorConduce {

    Modelo_Conduce modelo;
    VistaConduce vista;

    public ControladorConduce(Modelo_Conduce modelo, VistaConduce vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {

    }
}
