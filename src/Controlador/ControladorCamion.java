package Controlador;

import Modelo.Camion;
import Modelo.Camionero;
import Modelo.Modelo_Camion;
import Modelo.Validaciones;
import Vista.VistaCamion;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorCamion {

    Modelo_Camion modelo;
    VistaCamion vista;

    public ControladorCamion(Modelo_Camion modelo, VistaCamion vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        cargarTabla();
    }

    public void iniciarControl() {
        vista.getBtncrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnguardar().addActionListener(l -> crearOModificarCamion());
        vista.getBtnactualizar().addActionListener(l -> cargarTabla());
        vista.getBtnmodificar().addActionListener(l -> abrirYCargarDatosEnElDialog());
        vista.getBtneliminar().addActionListener(l -> eliminarCamionContr());
        buscarCamion();
    }

    public void abrirDialogCrear() {
        vista.getjDlgCamion().setName("Crear nuevo camion");
        vista.getjDlgCamion().setLocationRelativeTo(vista);
        vista.getjDlgCamion().setSize(463, 408);
        vista.getjDlgCamion().setTitle("Crear nuevo camion");
        vista.getjDlgCamion().setVisible(true);
        vista.getTxtplaca().setEditable(true); //Desbloqueo el campo de la placa
        limpiarDatos(); //Limpio el registro
    }

    public void cargarTabla() {
        vista.getTblCamiones().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblCamiones().getModel();
        estructuraTabla.setRowCount(0);

        List<Camion> listap = modelo.listaCamiones();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(persona -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblCamiones().setValueAt(persona.getPlaca(), i.value, 0);
            vista.getTblCamiones().setValueAt(persona.getMatricula(), i.value, 1);
            vista.getTblCamiones().setValueAt(persona.getModelo(), i.value, 2);
            vista.getTblCamiones().setValueAt(persona.getTipo(), i.value, 3);
            vista.getTblCamiones().setValueAt(persona.getPotencia(), i.value, 4);

            i.value++;
        });
    }

    public void abrirYCargarDatosEnElDialog() {

        int seleccion = vista.getTblCamiones().getSelectedRow();

        if (seleccion == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String placa = vista.getTblCamiones().getValueAt(seleccion, 0).toString();
            modelo.listaCamiones().forEach((pe) -> {
                if (pe.getPlaca().equals(placa)) {

                    //Abre el jDialog y carga los datos en el jDialog
                    vista.getjDlgCamion().setName("Editar");
                    vista.getjDlgCamion().setLocationRelativeTo(vista);
                    vista.getjDlgCamion().setSize(463, 408);
                    vista.getjDlgCamion().setTitle("Editar");
                    vista.getjDlgCamion().setVisible(true);
                    vista.getTxtplaca().setEditable(false); //Bloqueo el campo

                    //Seteo los datos en los campos de texto
                    vista.getTxtplaca().setText(pe.getPlaca());
                    vista.getTxtmatricula().setText(pe.getMatricula());
                    vista.getTxtmodelo().setText(pe.getModelo());
                    vista.getTxttipo().setText(pe.getTipo());
                    vista.getSpinnerpotencia().setValue(pe.getPotencia());
                }
            });
        }
    }

    public void crearOModificarCamion() {

        if (vista.getjDlgCamion().getName().equals("Crear nuevo camion")) { //CREAR

            if (modelo.validarRepetidosPlaca(vista.getTxtplaca().getText()) == 0) {
                if (modelo.validarRepetidosMatricula(vista.getTxtmatricula().getText()) == 0) {
                    if (validarDatos()) {
                        String placa = vista.getTxtplaca().getText();
                        String matricula = vista.getTxtmatricula().getText();
                        String modeloAut = vista.getTxtmodelo().getText();
                        String tipo = vista.getTxttipo().getText();
                        Double potencia = Double.parseDouble(vista.getSpinnerpotencia().getValue().toString());

                        Modelo_Camion camion = new Modelo_Camion();
                        camion.setPlaca(placa);
                        camion.setMatricula(matricula);
                        camion.setModelo(modeloAut);
                        camion.setTipo(tipo);
                        camion.setPotencia(potencia);

                        if (camion.crearCamion()) {
                            vista.getjDlgCamion().setVisible(false);
                            JOptionPane.showMessageDialog(vista, "Camion Creado Satisfactoriamente");
                            cargarTabla();
                        } else {
                            JOptionPane.showMessageDialog(vista, "No se pudo crear el camion");
                        }
                    } else {

                        JOptionPane.showMessageDialog(vista, "Faltan campos por llenar o estan llenados de forma incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "La matricula ya se encuentra registrada");
                }

            } else {
                JOptionPane.showMessageDialog(vista, "La placa ya se encuentra registrada");
            }
        } else {//EDITAR 

            if (validarDatos()) {
                String placa = vista.getTxtplaca().getText();
                String matricula = vista.getTxtmatricula().getText();
                String modeloAut = vista.getTxtmodelo().getText();
                String tipo = vista.getTxttipo().getText();
                Double potencia = Double.parseDouble(vista.getSpinnerpotencia().getValue().toString());

                Modelo_Camion camion = new Modelo_Camion();
                camion.setPlaca(placa);
                camion.setMatricula(matricula);
                camion.setModelo(modeloAut);
                camion.setTipo(tipo);
                camion.setPotencia(potencia);

                if (camion.modificarCamion()) {
                    vista.getjDlgCamion().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Camion Modificado Satisfactoriamente");
                    cargarTabla();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el camion");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar o estan llenados de forma incorrecta");
            }
        }
    }

    public void buscarCamion() {
        KeyListener eventoTeclado = new KeyListener() {//Crear un objeto de tipo keyListener(Es una interface) por lo tanto se debe implementar sus metodos abstractos

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                vista.getTblCamiones().setRowHeight(25);
                DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblCamiones().getModel();
                estructuraTabla.setRowCount(0);

                List<Camion> listap = modelo.listabuscarCamion(vista.getTxtbuscar().getText().toUpperCase());

                Holder<Integer> i = new Holder<>(0);

                listap.stream().forEach(persona -> {

                    estructuraTabla.addRow(new Object[8]);

                    vista.getTblCamiones().setValueAt(persona.getPlaca(), i.value, 0);
                    vista.getTblCamiones().setValueAt(persona.getMatricula(), i.value, 1);
                    vista.getTblCamiones().setValueAt(persona.getModelo(), i.value, 2);
                    vista.getTblCamiones().setValueAt(persona.getTipo(), i.value, 3);
                    vista.getTblCamiones().setValueAt(persona.getPotencia(), i.value, 4);

                    i.value++;
                });
            }
        };

        vista.getTxtbuscar().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    public void eliminarCamionContr() {
        int fila = vista.getTblCamiones().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                String placa;
                placa = vista.getTblCamiones().getValueAt(fila, 0).toString();

                if (modelo.eliminarCamion(placa)) {
                    JOptionPane.showMessageDialog(null, "El camion fue eliminado exitosamente");
                    cargarTabla();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El camion no se pudo eliminar");
                }
            }
        }
    }

    public boolean validarDatos() {
        Validaciones validacion = new Validaciones();

        boolean validar = true;
        if (vista.getTxtplaca().getText().isEmpty() || !validacion.validarPlaca(vista.getTxtplaca().getText())) {
            validar = false;
        }

        if (vista.getTxtmatricula().getText().isEmpty() || !validacion.validarMatricula(vista.getTxtmatricula().getText())) {
            validar = false;
        }

        if (vista.getTxtmodelo().getText().isEmpty() || !validacion.validarDireccion(vista.getTxtmodelo().getText())) {
            validar = false;
        }

        if (vista.getTxttipo().getText().isEmpty() || !validacion.validarTextoSinEspacio(vista.getTxttipo().getText())) {
            validar = false;
        }
        return validar;
    }

    public void limpiarDatos() {
        vista.getTxtplaca().setText("");
        vista.getTxtmatricula().setText("");
        vista.getTxtmodelo().setText("");
        vista.getTxttipo().setText("");
        vista.getSpinnerpotencia().setValue(1);
    }
}
