package Controlador;

import Modelo.Camion;
import Modelo.Camionero;
import Modelo.Conduce;
import Modelo.Modelo_Camion;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Conduce;
import Vista.VistaConduce;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        //cargarTablaTurnosDeConduccion();
        cargarTablaTurnosDeConduccion();
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnbuscarcamionero().addActionListener(l -> abrirjDialogCamionero());
        vista.getBtnbuscarcamion().addActionListener(l -> abrirjDialogCamion());
        vista.getBtncargarCamionero().addActionListener(l -> cargarDatosCamioneroEnTXT());
        vista.getBtncargarCamion().addActionListener(l -> cargarDatosCamionEnTXT());
        vista.getBtnguardar().addActionListener(l -> crearOModificarConduccion());
    }

    public void abrirDialogCrear() {
        vista.getjDlgConduce().setName("Crear nueva conduccion");
        vista.getjDlgConduce().setLocationRelativeTo(vista);
        vista.getjDlgConduce().setSize(876, 733);
        vista.getjDlgConduce().setTitle("Crear nueva conduccion");
        vista.getjDlgConduce().setVisible(true);
        limpiarDatosYDespacerCampos();
    }

    /*public void cargarTablaTurnosDeConduccion() {

        Modelo_Camionero modeloCamionero = new Modelo_Camionero();
        Modelo_Camion modeloCamion = new Modelo_Camion();

        vista.getTablaconduccion().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblcamionerosDlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Conduce> listacon = modelo.listaTurnosDeConduccion();
        List<Camionero> listacam = modeloCamionero.listaCamionerosTabla();
        List<Camion> listacmi = modeloCamion.listaCamiones();

        Holder<Integer> i = new Holder<>(0);

        listacon.stream().forEach(t -> {

            listacam.stream().forEach(c -> {

                if (t.getCodigoCam() == c.getCodigoCam()) {

                    estructuraTabla.addRow(new Object[8]);

                    vista.getTablaconduccion().setValueAt(t.getCodigoCon(), i.value, 0);
                    vista.getTablaconduccion().setValueAt(t.getFechaSalida(), i.value, 1);
                    vista.getTablaconduccion().setValueAt(t.getFechaLlegada(), i.value, 2);
                    vista.getTablaconduccion().setValueAt(t.getCodigoCam(), i.value, 3);
                    vista.getTablaconduccion().setValueAt(c.getPrinombre(), i.value, 4);
                    vista.getTablaconduccion().setValueAt(t.getCodigoCmi(), i.value, 5);

                    i.value++;
                }

            });

        });
    }*/
    public void cargarTablaTurnosDeConduccion() {

        Modelo_Camionero modeloCamionero = new Modelo_Camionero();
        Modelo_Camion modeloCamion = new Modelo_Camion();

        DefaultTableModel tabla = (DefaultTableModel) vista.getTablaconduccion().getModel();
        tabla.setNumRows(0);

        List<Conduce> listacon = modelo.listaTurnosDeConduccion();
        List<Camionero> listacam = modeloCamionero.listaCamionerosTabla();
        List<Camion> listacmi = modeloCamion.listaCamiones();

        listacon.stream().forEach(c -> {

            listacam.stream().forEach(ca -> {

                if (c.getCodigoCam() == ca.getCodigoCam()) {

                    listacmi.stream().forEach(ci -> {

                        if (c.getCodigoCmi() == ci.getCodigoCmi()) {
                            
                            String[] datos = {String.valueOf(c.getCodigoCon()), c.getFechaSalida(), c.getFechaLlegada(), String.valueOf(c.getCodigoCam()), ca.getPrinombre() + " " + ca.getApellidopat(), String.valueOf(c.getCodigoCmi()), ci.getPlaca()};
                            tabla.addRow(datos);
                        }
                    });
                }
            });
        });
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
            placa = vista.getTblcamionesDlg().getValueAt(fila, 1).toString();

            vista.getTxtcodigocamion().setText(codigo);
            vista.getTxtplaca().setText(placa);

            vista.getjDlgConduceCamion().dispose();//Cierro la ventana luego de cargar los datos
        }
    }

    public void crearOModificarConduccion() {

        if (vista.getjDlgConduce().getName().equals("Crear nueva conduccion")) { //CREAR

            if (validarDatos()) {

                int codigoCamionero = Integer.parseInt(vista.getTxtcodigocamionero().getText());
                int codigoCamion = Integer.parseInt(vista.getTxtcodigocamion().getText());
                Date fechainicio = vista.getjFechainicio().getDate(); //Obtengo la fecha del jDateChooser y la paso a date
                Date fechafin = vista.getjFechafin().getDate();

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Doy formato a la fecha
                String fechainicioTexto = formato.format(fechainicio); //La fecha tiene el formato indicado y es de tipo String
                String fechafinTexto = formato.format(fechafin);

                //Seteo los datos
                Modelo_Conduce conduce = new Modelo_Conduce();

                conduce.setCodigoCam(codigoCamionero);
                conduce.setCodigoCmi(codigoCamion);
                conduce.setFechaSalida(fechainicioTexto);
                conduce.setFechaLlegada(fechafinTexto);

                if (conduce.crearConduccion()) {
                    vista.getjDlgConduce().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Turno de conduccion Creado Satisfactoriamente");
                    cargarTablaTurnosDeConduccion();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear la el turno de conduccion");
                }
            } else {

                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar o estan llenados de forma incorrecta");
            }

        }
        /*else {//EDITAR 

            if (validarDatos()) {

                int codigo = Integer.valueOf(vista.getTxtcodigo().getText());
                String nombre = vista.getTxtnombre().getText();
                String region = vista.getTxtregion().getText();
                int cantones = Integer.parseInt(vista.getSpinnercantones().getValue().toString());

                Modelo_Provincia provincia = new Modelo_Provincia();
                provincia.setCodigoPro(codigo);
                provincia.setNombre(nombre);
                provincia.setRegion(region);
                provincia.setNumcanton(cantones);

                if (provincia.modificarProvincia()) {
                    vista.getjDlgprovincias().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Provincia Modificada Satisfactoriamente");
                    cargarTabla();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error: No se pudo modificar la provincia");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar o estan llenados de forma incorrecta");
            }

        }*/
    }

    public boolean validarDatos() {
        boolean validar = true;

        if (vista.getTxtcodigocamionero().getText().isEmpty()) {

            validar = false;
        }

        if (vista.getTxtcodigocamion().getText().isEmpty()) {
            validar = false;
        }

        if (vista.getjFechainicio().getDate() == null) {
            validar = false;
        }

        if (vista.getjFechafin().getDate() == null) {
            validar = false;
        }

        return validar;
    }

    public void limpiarDatosYDespacerCampos() {

        vista.getTxtcodigocamionero().setText("");
        vista.getTxtcodigocamion().setText("");
        vista.getjFechainicio().setDate(null);
        vista.getjFechafin().setDate(null);

        vista.getTxtcodigoconduce().setVisible(false);
        vista.getLblcodigoconduce().setVisible(false);
    }
}
