package Controlador;

import Modelo.Camion;
import Modelo.Camionero;
import Modelo.Modelo_Camion;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Conduce;
import Vista.VistaConduce;
import java.util.List;
import javax.swing.JOptionPane;
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
        vista.getBtnbuscarcamion().addActionListener(l -> abrirjDialogCamion());
        vista.getBtncargarCamionero().addActionListener(l -> cargarDatosCamioneroEnTXT());
        vista.getBtncargarCamion().addActionListener(l-> cargarDatosCamionEnTXT());
    }

    public void abrirDialogCrear() {
        vista.getjDlgConduce().setName("Crear nueva conduccion");
        vista.getjDlgConduce().setLocationRelativeTo(vista);
        vista.getjDlgConduce().setSize(876, 733);
        vista.getjDlgConduce().setTitle("Crear nueva conduccion");
        vista.getjDlgConduce().setVisible(true);
    }

    //TODO SOBRE CAMIONERO
    public void abrirjDialogCamionero() {
        vista.getjDlgConduceCamionero().setLocationRelativeTo(vista);
        vista.getjDlgConduceCamionero().setSize(565, 324);
        vista.getjDlgConduceCamionero().setTitle("Seleccionar camionero");
        vista.getjDlgConduceCamionero().setVisible(true);
        cargarDatosDelCamionero();
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

    public void cargarDatosCamioneroEnTXT() {
        int fila = vista.getTblcamionerosDlg().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String cedula;
            String nombre;
            String apellido;

            codigo = vista.getTblcamionerosDlg().getValueAt(fila, 0).toString();
            cedula = vista.getTblcamionerosDlg().getValueAt(fila, 1).toString();
            nombre = vista.getTblcamionerosDlg().getValueAt(fila, 2).toString();
            apellido = vista.getTblcamionerosDlg().getValueAt(fila, 3).toString();

            vista.getTxtcodigocamionero().setText(codigo);
            vista.getTxtcedula().setText(cedula);
            vista.getTxtnombreyapellido().setText(nombre + " " + apellido);

            vista.getjDlgConduceCamionero().dispose();//Cierro la ventana luego de cargar los datos
        }
    }

    //TODO SOBRE CAMION
    public void abrirjDialogCamion() {
        vista.getjDlgConduceCamion().setLocationRelativeTo(vista);
        vista.getjDlgConduceCamion().setSize(536, 247);
        vista.getjDlgConduceCamion().setTitle("Seleccionar camion");
        vista.getjDlgConduceCamion().setVisible(true);
        cargarDatosDelCamion();
    }

    public void cargarDatosDelCamion() {

        Modelo_Camion modeloCamion = new Modelo_Camion();

        vista.getTblcamionesDlg().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblcamionesDlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Camion> listap = modeloCamion.listaCamiones();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(c -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblcamionesDlg().setValueAt(c.getCodigoCmi(), i.value, 0);
            vista.getTblcamionesDlg().setValueAt(c.getPlaca(), i.value, 1);

            i.value++;
        });
    }

    public void cargarDatosCamionEnTXT() {
        int fila = vista.getTblcamionesDlg().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String placa;

            codigo = vista.getTblcamionesDlg().getValueAt(fila, 0).toString();
            placa= vista.getTblcamionesDlg().getValueAt(fila, 1).toString();

            vista.getTxtcodigocamion().setText(codigo);
            vista.getTxtplaca().setText(placa);

            vista.getjDlgConduceCamion().dispose();//Cierro la ventana luego de cargar los datos
        }
    }
}
