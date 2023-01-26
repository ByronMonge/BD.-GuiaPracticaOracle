package Controlador;

import Modelo.Modelo_Camion;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Provincia;
import Vista.VistaCamion;
import Vista.VistaCamionero;
import Vista.VistaPrincipal;
import Vista.VistaProvincia;

public class ControladorPrincipal {

    VistaPrincipal vistaPrincipal;

    public ControladorPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }

    public void iniciaControl() {

        vistaPrincipal.getBtnCamionero().addActionListener(l -> crudCamioneros());
        vistaPrincipal.getBtncamion().addActionListener(l-> crudCamiones());
        vistaPrincipal.getBtnprovincia().addActionListener(l-> crudProvincias());
    }

    private void crudCamioneros() {
        //Instancio las clases del Modelo y la Vista.
        VistaCamionero vista = new VistaCamionero();
        Modelo_Camionero modelo = new Modelo_Camionero();

        //Agregar VistaCamionero al Desktop Pane.
        vistaPrincipal.getEscritorio().add(vista);

        ControladorCamionero control = new ControladorCamionero(modelo, vista);
        control.iniciarControl();//Empezamos las escuchas a los eventos de la vista, Listeners.
    }

    private void crudCamiones() {
        VistaCamion vista = new VistaCamion();
        Modelo_Camion modelo = new Modelo_Camion();
        
        vistaPrincipal.getEscritorio().add(vista);

        ControladorCamion control = new ControladorCamion(modelo, vista);
        control.iniciarControl();
    }

    private void crudProvincias() {
        VistaProvincia vista = new VistaProvincia();
        Modelo_Provincia modelo = new Modelo_Provincia();

        vistaPrincipal.getEscritorio().add(vista);

        ControladorProvincia control = new ControladorProvincia(modelo, vista);
        control.iniciarControl();
    }
}
