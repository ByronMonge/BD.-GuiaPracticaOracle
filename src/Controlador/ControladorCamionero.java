package Controlador;

import Modelo.Camionero;
import Modelo.Modelo_Camionero;
import Vista.VistaCamionero;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorCamionero {

    Modelo_Camionero modelo;
    VistaCamionero vista;

    public ControladorCamionero(Modelo_Camionero modelo, VistaCamionero vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        cargarTabla2();
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnactualizar().addActionListener(l -> cargarTabla2());
    }

    public void abrirDialogCrear() {
        vista.getjDlgCamionero().setName("Crear nueva persona");
        vista.getjDlgCamionero().setLocationRelativeTo(vista);
        vista.getjDlgCamionero().setSize(1100, 500);
        vista.getjDlgCamionero().setTitle("Crear nueva persona");
        vista.getjDlgCamionero().setVisible(true);
    }

    public void cargarTabla2() {
        vista.getTablacamioneros().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTablacamioneros().getModel();
        estructuraTabla.setRowCount(0);

        List<Camionero> listap = modelo.listaPersonasTabla2();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {
            
                    estructuraTabla.addRow(new Object[8]);

                    vista.getTablacamioneros().setValueAt(persona.getCodigo(), i.value, 0);
                    vista.getTablacamioneros().setValueAt(persona.getPrinombre(), i.value, 1);

                    i.value++;
                });
    }

    /*public void cargarTabla1() {//SIRVE
        DefaultTableModel tabla = (DefaultTableModel) vista.getTablacamioneros().getModel();
        tabla.setNumRows(0);

        //System.out.println("llena datos");
        List<Camionero> cams = modelo.listaPersonasTabla();
        cams.stream().forEach(p -> {
            String[] datos = {p.getPrinombre()};
            tabla.addRow(datos);
        });
    }*/
}
