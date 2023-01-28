package Controlador;

import Modelo.Camionero;
import Modelo.Modelo_Camionero;
import Vista.VistaCamionero;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorCamionero {

    Modelo_Camionero modelo;
    VistaCamionero vista;

    public ControladorCamionero(Modelo_Camionero modelo, VistaCamionero vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        cargarTabla();
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnactualizar().addActionListener(l -> cargarTabla());
        vista.getBtnguardar().addActionListener(l -> crearPersonaContr());
    }

    public void abrirDialogCrear() {
        vista.getjDlgCamionero().setName("Crear nueva persona");
        vista.getjDlgCamionero().setLocationRelativeTo(vista);
        vista.getjDlgCamionero().setSize(1100, 500);
        vista.getjDlgCamionero().setTitle("Crear nueva persona");
        vista.getjDlgCamionero().setVisible(true);
    }

    public void cargarTabla() {
        vista.getTablacamioneros().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTablacamioneros().getModel();
        estructuraTabla.setRowCount(0);

        List<Camionero> listap = modelo.listaPersonasTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTablacamioneros().setValueAt(persona.getDni(), i.value, 0);
            vista.getTablacamioneros().setValueAt(persona.getPrinombre(), i.value, 1);
            vista.getTablacamioneros().setValueAt(persona.getApellidopat(), i.value, 2);
            vista.getTablacamioneros().setValueAt(persona.getEdad(), i.value, 3);
            vista.getTablacamioneros().setValueAt(persona.getGenero(), i.value, 4);
            vista.getTablacamioneros().setValueAt(persona.getTelefono(), i.value, 5);
            vista.getTablacamioneros().setValueAt(persona.getSalario(), i.value, 6);

            i.value++;
        });
    }

    public void crearPersonaContr() {
        String dni = vista.getTxtdni().getText();
        String prinombre = vista.getTxtprinombre().getText();
        String segnombre = vista.getTxtsegnombre().getText();
        String priapellido = vista.getTxtpriapellido().getText();
        String segapellido = vista.getTxtsegapellido().getText();
        String direccion = vista.getTxtdireccion().getText();
        String telefono = vista.getTxttelefono().getText();
        String email = vista.getTxtemail().getText();
        String tipodelicencia = vista.getTxttipodelicencia().getText();
        int edad = Integer.parseInt(vista.getSpinneredad().getValue().toString());
        double salario = Double.parseDouble(vista.getSpinnerSalario().getValue().toString());
        int aniosexperiencia = Integer.parseInt(vista.getSpinneraniosexperiencia().getValue().toString());
        Date fecha = vista.getJfechanacimiento().getDate();

        Modelo_Camionero camionero = new Modelo_Camionero();
        camionero.setDni(dni);
        camionero.setPrinombre(prinombre);
        camionero.setSegnombre(segnombre);
        camionero.setApellidopat(priapellido);
        camionero.setApellidomat(segapellido);
        camionero.setDireccion(direccion);
        camionero.setTelefono(telefono);
        camionero.setEmail(email);
        camionero.setTipolicencia(tipodelicencia);
        camionero.setEdad(edad);
        camionero.setSalario(salario);
        camionero.setAniosexperiencia(aniosexperiencia);
        camionero.setFechanac(fecha);

        String genero = "";
        if (vista.getMasculino().isSelected()) {
            genero = "M";
        } else {
            if (vista.getFemenino().isSelected()) {
                genero = "F";
            }
        }

        camionero.setGenero(genero);

        if (modelo.crearCamionero()) {
            vista.getjDlgCamionero().setVisible(false);
            JOptionPane.showMessageDialog(vista, "Persona Creada Satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo crear la persona");
        }
    }
}
