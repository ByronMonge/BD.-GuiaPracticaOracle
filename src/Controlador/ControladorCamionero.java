package Controlador;

import Modelo.Camionero;
import Modelo.Modelo_Camionero;
import Vista.VistaCamionero;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControladorCamionero {

    Modelo_Camionero modelo;
    VistaCamionero vista;

    public ControladorCamionero(Modelo_Camionero modelo, VistaCamionero vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnactualizar().addActionListener(l -> cargarTabla());
    }

    public void abrirDialogCrear() {
        vista.getjDlgCamionero().setName("Crear nueva persona");
        vista.getjDlgCamionero().setLocationRelativeTo(vista);
        vista.getjDlgCamionero().setSize(1100, 500);
        vista.getjDlgCamionero().setTitle("Crear nueva persona");
        vista.getjDlgCamionero().setVisible(true);
    }
    
    public void cargarTabla() {
        DefaultTableModel tabla = (DefaultTableModel) vista.getTablacamioneros().getModel();
        tabla.setNumRows(0);

        //System.out.println("llena datos");
        List<Camionero> cams = modelo.listaPersonasTabla();
        cams.stream().forEach(p -> {
            String[] datos = {p.getDni(),p.getPrinombre(), p.getApellidopat(), String.valueOf(p.getEdad()), p.getGenero(), p.getTelefono(), String.valueOf(p.getSalario())};
            tabla.addRow(datos);
        });
    }
}
