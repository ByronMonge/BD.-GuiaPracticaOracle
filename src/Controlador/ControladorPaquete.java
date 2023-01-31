package Controlador;

import Modelo.Camionero;
import Modelo.Cliente;
import Modelo.Destinatario;
import Modelo.Modelo_Camionero;
import Modelo.Modelo_Cliente;
import Modelo.Modelo_Destinatario;
import Modelo.Modelo_Paquete;
import Modelo.Modelo_Provincia;
import Modelo.Provincia;
import Vista.VistaPaquete;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorPaquete {

    Modelo_Paquete modelo;
    VistaPaquete vista;

    public ControladorPaquete(Modelo_Paquete modelo, VistaPaquete vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        //cargarTablaPaquetes();
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnbuscarcliente().addActionListener(l -> abrirjDialogCliente());
        vista.getBtnbuscarcamionero().addActionListener(l -> abrirjDialogCamionero());
        vista.getBtnbuscardestinatario().addActionListener(l -> abrirjDialogDestinatario());
        vista.getBtncargarCliente().addActionListener(l -> cargarDatosClienteEnTXT());
        vista.getBtncargarCamionero().addActionListener(l -> cargarDatosCamioneroEnTXT());
        vista.getBtncargarDestinatario().addActionListener(l -> cargarDatosDestinatarioEnTXT());
        vista.getCbxprovincia().addActionListener(l -> cargarDatosProvinciaEnTXT());

        //vista.getBtnbuscarcamion().addActionListener(l -> abrirjDialogCamion());
        //vista.getBtncargarCamionero().addActionListener(l -> cargarDatosCamioneroEnTXT());
        //vista.getBtncargarCamion().addActionListener(l -> cargarDatosCamionEnTXT());
        //vista.getBtnguardar().addActionListener(l -> crearOModificarConduccion());
    }

    public void abrirDialogCrear() {
        vista.getjDlgPaquetes().setName("Registrar nuevo Paquete");
        vista.getjDlgPaquetes().setLocationRelativeTo(vista);
        vista.getjDlgPaquetes().setSize(1017, 521);
        vista.getjDlgPaquetes().setTitle("Registrar nuevo Paquete");
        vista.getjDlgPaquetes().setVisible(true);
        //limpiarDatosYDespacerCampos();
        cargarProvinciasComboBox();
        setearFechaActual();
    }

//    public void cargarTablaPaquetes() {
//
//        Modelo_Camionero modeloCamionero = new Modelo_Camionero();
//        Modelo_Destinatario modeloDestinatario = new Modelo_Destinatario();
//        Modelo_Cliente modeloCliente = new Modelo_Cliente();
//        Modelo_Provincia modeloProvincia = new Modelo_Provincia();
//
//        DefaultTableModel tabla = (DefaultTableModel) vista.getTablapaquetes().getModel();
//        tabla.setNumRows(0);
//
//        List<Paquete> listapaq = modelo.listaPaquetes();
//        List<Camionero> listacam = modeloCamionero.listaCamionerosTabla();
//        List<Destinatario> listacmi = modeloDestinatario.listaDestinatariosTabla();
//        List<Cliente> listacli = modeloCliente.listaClientesTabla();
//        List<Provincia> listaprov = modeloProvincia.listaProvincias();
//   
//
//        listapaq.stream().forEach(c -> {
//
//            listacam.stream().forEach(ca -> {
//
//                if (c.getCodigoCam() == ca.getCodigoCam()) {
//
//                    listacmi.stream().forEach(ci -> {
//
//                        if (c.getCodigoCmi() == ci.getCodigoCmi()) {
//
//                            String[] datos = {String.valueOf(c.getCodigoCon()), fechaInicio, String.valueOf(c.getCodigoCam()), ca.getDni(), ca.getPrinombre() + " " + ca.getApellidopat(), String.valueOf(c.getCodigoCmi()), ci.getPlaca()};
//                            tabla.addRow(datos);
//                        }
//                    });
//                }
//            });
//        });
//    }
    //TODO SOBRE CLIENTE
    public void abrirjDialogCliente() {
        vista.getjDlgClientes().setLocationRelativeTo(vista);
        vista.getjDlgClientes().setSize(565, 324);
        vista.getjDlgClientes().setTitle("Seleccionar cliente");
        vista.getjDlgClientes().setVisible(true);
        cargarDatosDeClientes();
    }

    public void cargarDatosDeClientes() {

        Modelo_Cliente modeloCliente = new Modelo_Cliente();
        vista.getTblclientes().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblclientes().getModel();
        estructuraTabla.setRowCount(0);

        List<Cliente> listap = modeloCliente.listaClientesTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblclientes().setValueAt(persona.getCodigocli(), i.value, 0);
            vista.getTblclientes().setValueAt(persona.getDni(), i.value, 1);
            vista.getTblclientes().setValueAt(persona.getPrinombre(), i.value, 2);
            vista.getTblclientes().setValueAt(persona.getApellidopat(), i.value, 3);

            i.value++;
        });
    }

    public void cargarDatosClienteEnTXT() {
        int fila = vista.getTblclientes().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String cedula;
            String nombre;
            String apellido;

            codigo = vista.getTblclientes().getValueAt(fila, 0).toString();
            cedula = vista.getTblclientes().getValueAt(fila, 1).toString();
            nombre = vista.getTblclientes().getValueAt(fila, 2).toString();
            apellido = vista.getTblclientes().getValueAt(fila, 3).toString();

            vista.getTxtcodigoCliente().setText(codigo);
            vista.getTxtcedcliente().setText(cedula);
            vista.getTxtnomcliente().setText(nombre + " " + apellido);

            vista.getjDlgClientes().dispose();//Cierro la ventana luego de cargar los datos
        }
    }

    //TODO SOBRE EL DESTINATARIO
    public void abrirjDialogDestinatario() {
        vista.getjDlgDestinatario().setLocationRelativeTo(vista);
        vista.getjDlgDestinatario().setSize(565, 324);
        vista.getjDlgDestinatario().setTitle("Seleccionar destinatario");
        vista.getjDlgDestinatario().setVisible(true);
        cargarDatosDeDestinatario();
    }

    public void cargarDatosDeDestinatario() {

        Modelo_Destinatario modeloDestinatario = new Modelo_Destinatario();
        vista.getTbldestinatarios().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTbldestinatarios().getModel();
        estructuraTabla.setRowCount(0);

        List<Destinatario> listap = modeloDestinatario.listaDestinatariosTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTbldestinatarios().setValueAt(persona.getCodigodes(), i.value, 0);
            vista.getTbldestinatarios().setValueAt(persona.getDni(), i.value, 1);
            vista.getTbldestinatarios().setValueAt(persona.getPrinombre(), i.value, 2);
            vista.getTbldestinatarios().setValueAt(persona.getApellidopat(), i.value, 3);

            i.value++;
        });
    }

    public void cargarDatosDestinatarioEnTXT() {
        int fila = vista.getTbldestinatarios().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String cedula;
            String nombre;
            String apellido;

            codigo = vista.getTbldestinatarios().getValueAt(fila, 0).toString();
            cedula = vista.getTbldestinatarios().getValueAt(fila, 1).toString();
            nombre = vista.getTbldestinatarios().getValueAt(fila, 2).toString();
            apellido = vista.getTbldestinatarios().getValueAt(fila, 3).toString();

            vista.getTxtcodigoDestinatario().setText(codigo);
            vista.getTxtceddestinatario().setText(cedula);
            vista.getTxtnomdestinatario().setText(nombre + " " + apellido);

            vista.getjDlgDestinatario().dispose();//Cierro la ventana luego de cargar los datos
        }
    }

    //TODO SOBRE CAMIONERO
    public void abrirjDialogCamionero() {
        vista.getjDlgCamionero().setLocationRelativeTo(vista);
        vista.getjDlgCamionero().setSize(565, 324);
        vista.getjDlgCamionero().setTitle("Seleccionar camionero");
        vista.getjDlgCamionero().setVisible(true);
        cargarDatosDelCamionero();
    }

    public void cargarDatosDelCamionero() {

        Modelo_Camionero modeloCamionero = new Modelo_Camionero();
        vista.getTblcamioneros().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblcamioneros().getModel();
        estructuraTabla.setRowCount(0);

        List<Camionero> listap = modeloCamionero.listaCamionerosTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblcamioneros().setValueAt(persona.getCodigoCam(), i.value, 0);
            vista.getTblcamioneros().setValueAt(persona.getDni(), i.value, 1);
            vista.getTblcamioneros().setValueAt(persona.getPrinombre(), i.value, 2);
            vista.getTblcamioneros().setValueAt(persona.getApellidopat(), i.value, 3);

            i.value++;
        });
    }

    public void cargarDatosCamioneroEnTXT() {
        int fila = vista.getTblcamioneros().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String cedula;
            String nombre;
            String apellido;

            codigo = vista.getTblcamioneros().getValueAt(fila, 0).toString();
            cedula = vista.getTblcamioneros().getValueAt(fila, 1).toString();
            nombre = vista.getTblcamioneros().getValueAt(fila, 2).toString();
            apellido = vista.getTblcamioneros().getValueAt(fila, 3).toString();

            vista.getTxtcodigoCamionero().setText(codigo);
            vista.getTxtcedcamionero().setText(cedula);
            vista.getTxtnomcamionero().setText(nombre + " " + apellido);

            vista.getjDlgCamionero().dispose();//Cierro la ventana luego de cargar los datos
        }
    }

    //RELLENAR COMBOBOX DE PROVINCIAS
    public void cargarProvinciasComboBox() {
        Modelo_Provincia pro = new Modelo_Provincia();

        List<Provincia> listapro = pro.listaProvincias();

        for (int i = 0; i < listapro.size(); i++) {
            vista.getCbxprovincia().addItem(listapro.get(i).getNombre());
        }
    }

    public void cargarDatosProvinciaEnTXT() {
        Modelo_Provincia pro = new Modelo_Provincia();

        List<Provincia> listapro = pro.listaProvincias();

        listapro.stream().forEach(p -> {

            if (vista.getCbxprovincia().getSelectedItem().toString().equalsIgnoreCase(p.getNombre())) {
                vista.getTxtCodigoProvincia().setText(String.valueOf(p.getCodigoPro()));
            } else {
                if (vista.getCbxprovincia().getSelectedItem().toString().equalsIgnoreCase("Seleccionar")) {
                    vista.getTxtCodigoProvincia().setText(" ");
                }
            }
        });
    }
    
    public void setearFechaActual(){
        Date fecha = null;
        LocalDate ahora = LocalDate.now();

        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

        try {
            fecha = formatofecha.parse(ahora.toString());
        } catch (ParseException ex) {
            Logger.getLogger(ControladorPaquete.class.getName()).log(Level.SEVERE, null, ex);
        }
        vista.getJclfecharegistro().setDate(fecha);
        vista.getJclfecharegistro().setEnabled(false);
    }
}
