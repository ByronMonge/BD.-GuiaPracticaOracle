package Controlador;

import Modelo.Camion;
import Modelo.Camionero;
import Modelo.Modelo_Camion;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Conduce;
import Vista.VistaConduce;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorConduce {

    Modelo_Conduce modelo;
    VistaConduce vista;

    public ControladorConduce(Modelo_Conduce modelo, VistaConduce vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnbuscarcamionero().addActionListener(l -> abrirjDialogCamionero());
    }

    public void abrirDialogCrear() {
        vista.getjDlgConduce().setName("Crear nueva conduccion");
        vista.getjDlgConduce().setLocationRelativeTo(vista);
        vista.getjDlgConduce().setSize(876, 733);
        vista.getjDlgConduce().setTitle("Crear nueva conduccion");
        vista.getjDlgConduce().setVisible(true);
    }

    public void abrirjDialogCamionero() {
        vista.getjDlgConduceCamionero().setLocationRelativeTo(vista);
        vista.getjDlgConduceCamionero().setSize(536, 247);
        vista.getjDlgConduceCamionero().setTitle("Seleccionar camionero");
        vista.getjDlgConduceCamionero().setVisible(true);
        cargarDatosDelCamionero();
    }

    public void abrirjDialogCamion() {
        vista.getjDlgConduceCamion().setLocationRelativeTo(vista);
        vista.getjDlgConduceCamion().setSize(536, 247);
        vista.getjDlgConduceCamion().setTitle("Seleccionar camion");
        vista.getjDlgConduceCamion().setVisible(true);
        //cargarDatosDelCamionero();
    }

    public void cargarDatosDelCamionero() {

        Modelo_Camionero modeloCamionero = new Modelo_Camionero();
        vista.getTblcamionerosDlg().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblcamionerosDlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Camionero> listap = modeloCamionero.listaCamionerosTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblcamionerosDlg().setValueAt(persona.getCodigoCam(), i.value, 0);
            vista.getTblcamionerosDlg().setValueAt(persona.getDni(), i.value, 1);
            vista.getTblcamionerosDlg().setValueAt(persona.getPrinombre(), i.value, 2);
            vista.getTblcamionerosDlg().setValueAt(persona.getApellidopat(), i.value, 3);

            i.value++;
        });
    }

    public void cargarDatosDelCamion() {

        Modelo_Camion modeloCamion = new Modelo_Camion();
        vista.getTblcamionesDlg().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblcamionesDlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Camion> listap = modeloCamion.listaCamiones();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblcamionesDlg().setValueAt(persona.getCodigoCmi(), i.value, 0);
            vista.getTblcamionesDlg().setValueAt(persona.getPlaca(), i.value, 1);

            i.value++;
        });
    }
}
