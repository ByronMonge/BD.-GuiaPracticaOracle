
package Vista;


public class VistaPaquete extends javax.swing.JInternalFrame {


    public VistaPaquete() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgPaquetes = new javax.swing.JDialog();
        pnlprincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblcodcliente = new javax.swing.JLabel();
        lblcedcliente = new javax.swing.JLabel();
        txtnomcliente = new javax.swing.JTextField();
        txtcedcliente = new javax.swing.JTextField();
        lblcliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblbuscarcliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblbuscardestinatario = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblcodprovincia = new javax.swing.JLabel();
        lblprovincia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        cbxprovincia = new javax.swing.JComboBox<>();
        lblpeso = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        lblsalidapro = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jclsalidapro = new com.toedter.calendar.JDateChooser();
        lblllegadapro = new javax.swing.JLabel();
        jclllegadapro = new com.toedter.calendar.JDateChooser();
        lblfecharegistro = new javax.swing.JLabel();
        jclfecharegistro = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        lblcoddestinatario = new javax.swing.JLabel();
        lblceddestinatario = new javax.swing.JLabel();
        lbldestinatario = new javax.swing.JLabel();
        txtnomdestinatario = new javax.swing.JTextField();
        txtceddestinatario = new javax.swing.JTextField();
        lblcodcamionero = new javax.swing.JLabel();
        txtnomcamionero = new javax.swing.JTextField();
        lbcedcamionero = new javax.swing.JLabel();
        txtcedcamionero = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        lblnomcamionero = new javax.swing.JLabel();
        lblbuscamionero = new javax.swing.JLabel();
        jDlgClientes = new javax.swing.JDialog();
        pnlprincipalcli = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblclientes = new javax.swing.JTable();
        lblcargarcliente = new javax.swing.JLabel();
        jDlgDestinatario = new javax.swing.JDialog();
        pblprincipaldes = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldestinatarios = new javax.swing.JTable();
        lblcargardestinatario = new javax.swing.JLabel();
        jDlgCamionero = new javax.swing.JDialog();
        pnlprincipalcam = new javax.swing.JPanel();
        lbltitulo2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblclientes2 = new javax.swing.JTable();
        lblcargarcamionero = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pnlprincipalframe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapaquetes = new javax.swing.JTable();

        pnlprincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlprincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Información del cliente");

        lblcodcliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcodcliente.setText("Codigo");

        lblcedcliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcedcliente.setText("Cédula:");

        lblcliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcliente.setText("Nombre y Apellido:");

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setText("Paquete");

        btnguardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnguardar.setText("Guardar");

        btncancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btncancelar.setText("Cancelar");

        lblbuscarcliente.setBackground(new java.awt.Color(255, 255, 255));
        lblbuscarcliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblbuscarcliente.setForeground(new java.awt.Color(255, 255, 255));
        lblbuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        lblbuscarcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblbuscarcliente.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("####");

        lblbuscardestinatario.setBackground(new java.awt.Color(255, 255, 255));
        lblbuscardestinatario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblbuscardestinatario.setForeground(new java.awt.Color(255, 255, 255));
        lblbuscardestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        lblbuscardestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblbuscardestinatario.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Información del destino");

        lblcodprovincia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcodprovincia.setText("Codigo");

        lblprovincia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblprovincia.setText("Provincia:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setText("Información del paquete");

        cbxprovincia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbxprovincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        lblpeso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblpeso.setText("Peso:");

        lblsalidapro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblsalidapro.setText("Salida programada:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Kg");

        lblllegadapro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblllegadapro.setText("Llegada programada:");

        lblfecharegistro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblfecharegistro.setText("Fecha registro:");

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("Información del destinatario");

        lblcoddestinatario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcoddestinatario.setText("Codigo");

        lblceddestinatario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblceddestinatario.setText("Cédula:");

        lbldestinatario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbldestinatario.setText("Nombre y Apellido:");

        lblcodcamionero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblcodcamionero.setText("Codigo");

        lbcedcamionero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbcedcamionero.setText("Cédula:");

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel27.setText("Información del camionero");

        lblnomcamionero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblnomcamionero.setText("Nombre y Apellido:");

        lblbuscamionero.setBackground(new java.awt.Color(255, 255, 255));
        lblbuscamionero.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblbuscamionero.setForeground(new java.awt.Color(255, 255, 255));
        lblbuscamionero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        lblbuscamionero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblbuscamionero.setOpaque(true);

        javax.swing.GroupLayout pnlprincipalLayout = new javax.swing.GroupLayout(pnlprincipal);
        pnlprincipal.setLayout(pnlprincipalLayout);
        pnlprincipalLayout.setHorizontalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel2)
                        .addGap(274, 274, 274)
                        .addComponent(jLabel8))
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(lblbuscarcliente))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblcodcliente))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblcedcliente)
                                .addGap(14, 14, 14)
                                .addComponent(txtcedcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblcliente)
                                .addGap(5, 5, 5)
                                .addComponent(txtnomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel21)
                                .addGap(9, 9, 9)
                                .addComponent(lblbuscardestinatario))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblcoddestinatario))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblceddestinatario)
                                .addGap(19, 19, 19)
                                .addComponent(txtceddestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addComponent(lbldestinatario)
                                .addGap(7, 7, 7)
                                .addComponent(txtnomdestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addComponent(lblcodprovincia)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addComponent(lblprovincia)
                                .addGap(36, 36, 36)
                                .addComponent(cbxprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblpeso)
                                .addGap(15, 15, 15)
                                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblsalidapro)
                                .addGap(20, 20, 20)
                                .addComponent(jclsalidapro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addComponent(lblllegadapro)
                                .addGap(13, 13, 13)
                                .addComponent(jclllegadapro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblfecharegistro)
                                .addGap(30, 30, 30)
                                .addComponent(jclfecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel27)
                                .addGap(19, 19, 19)
                                .addComponent(lblbuscamionero))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblcodcamionero))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lbcedcamionero)
                                .addGap(9, 9, 9)
                                .addComponent(txtcedcamionero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addComponent(lblnomcamionero)
                                .addGap(7, 7, 7)
                                .addComponent(txtnomcamionero, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnguardar)
                        .addGap(633, 633, 633)
                        .addComponent(btncancelar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlprincipalLayout.setVerticalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8)))
                .addGap(19, 19, 19)
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addComponent(lblbuscarcliente))
                        .addGap(11, 11, 11)
                        .addComponent(lblcodcliente)
                        .addGap(6, 6, 6)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblcedcliente))
                            .addComponent(txtcedcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblcliente))
                            .addComponent(txtnomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel21))
                            .addComponent(lblbuscardestinatario))
                        .addGap(13, 13, 13)
                        .addComponent(lblcoddestinatario)
                        .addGap(5, 5, 5)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblceddestinatario)
                            .addComponent(txtceddestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldestinatario)
                            .addComponent(txtnomdestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13)
                        .addGap(13, 13, 13)
                        .addComponent(lblcodprovincia)
                        .addGap(15, 15, 15)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprovincia)
                            .addComponent(cbxprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlprincipalLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel15)
                        .addGap(32, 32, 32)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblpeso))
                            .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(13, 13, 13)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblsalidapro))
                            .addComponent(jclsalidapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblllegadapro)
                            .addComponent(jclllegadapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfecharegistro)
                            .addComponent(jclfecharegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlprincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel27))
                            .addComponent(lblbuscamionero))
                        .addGap(13, 13, 13)
                        .addComponent(lblcodcamionero)
                        .addGap(5, 5, 5)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbcedcamionero)
                            .addComponent(txtcedcamionero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnomcamionero)
                            .addComponent(txtnomcamionero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDlgPaquetesLayout = new javax.swing.GroupLayout(jDlgPaquetes.getContentPane());
        jDlgPaquetes.getContentPane().setLayout(jDlgPaquetesLayout);
        jDlgPaquetesLayout.setHorizontalGroup(
            jDlgPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgPaquetesLayout.setVerticalGroup(
            jDlgPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgPaquetesLayout.createSequentialGroup()
                .addComponent(pnlprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlprincipalcli.setBackground(new java.awt.Color(255, 255, 255));

        lbltitulo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbltitulo.setText("Listado de Clientes");

        tblclientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód", "DNI", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(tblclientes);

        lblcargarcliente.setBackground(new java.awt.Color(255, 255, 255));
        lblcargarcliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblcargarcliente.setForeground(new java.awt.Color(255, 255, 255));
        lblcargarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/listo.png"))); // NOI18N
        lblcargarcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcargarcliente.setOpaque(true);

        javax.swing.GroupLayout pnlprincipalcliLayout = new javax.swing.GroupLayout(pnlprincipalcli);
        pnlprincipalcli.setLayout(pnlprincipalcliLayout);
        pnlprincipalcliLayout.setHorizontalGroup(
            pnlprincipalcliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalcliLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblcargarcliente)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlprincipalcliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitulo)
                .addGap(224, 224, 224))
        );
        pnlprincipalcliLayout.setVerticalGroup(
            pnlprincipalcliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalcliLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbltitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlprincipalcliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcargarcliente))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jDlgClientesLayout = new javax.swing.GroupLayout(jDlgClientes.getContentPane());
        jDlgClientes.getContentPane().setLayout(jDlgClientesLayout);
        jDlgClientesLayout.setHorizontalGroup(
            jDlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgClientesLayout.createSequentialGroup()
                .addComponent(pnlprincipalcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDlgClientesLayout.setVerticalGroup(
            jDlgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipalcli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pblprincipaldes.setBackground(new java.awt.Color(255, 255, 255));

        lbltitulo1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbltitulo1.setText("Listado de Destinatario");

        tbldestinatarios.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tbldestinatarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód", "DNI", "Nombre", "Apellido"
            }
        ));
        jScrollPane3.setViewportView(tbldestinatarios);

        lblcargardestinatario.setBackground(new java.awt.Color(255, 255, 255));
        lblcargardestinatario.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblcargardestinatario.setForeground(new java.awt.Color(255, 255, 255));
        lblcargardestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/listo.png"))); // NOI18N
        lblcargardestinatario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcargardestinatario.setOpaque(true);

        javax.swing.GroupLayout pblprincipaldesLayout = new javax.swing.GroupLayout(pblprincipaldes);
        pblprincipaldes.setLayout(pblprincipaldesLayout);
        pblprincipaldesLayout.setHorizontalGroup(
            pblprincipaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblprincipaldesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcargardestinatario)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblprincipaldesLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(lbltitulo1)
                .addGap(224, 224, 224))
        );
        pblprincipaldesLayout.setVerticalGroup(
            pblprincipaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblprincipaldesLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbltitulo1)
                .addGap(18, 18, 18)
                .addGroup(pblprincipaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcargardestinatario))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jDlgDestinatarioLayout = new javax.swing.GroupLayout(jDlgDestinatario.getContentPane());
        jDlgDestinatario.getContentPane().setLayout(jDlgDestinatarioLayout);
        jDlgDestinatarioLayout.setHorizontalGroup(
            jDlgDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgDestinatarioLayout.createSequentialGroup()
                .addComponent(pblprincipaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDlgDestinatarioLayout.setVerticalGroup(
            jDlgDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pblprincipaldes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlprincipalcam.setBackground(new java.awt.Color(255, 255, 255));

        lbltitulo2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lbltitulo2.setText("Listado de Camionero");

        tblclientes2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblclientes2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód", "DNI", "Nombre", "Apellido"
            }
        ));
        jScrollPane4.setViewportView(tblclientes2);

        lblcargarcamionero.setBackground(new java.awt.Color(255, 255, 255));
        lblcargarcamionero.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lblcargarcamionero.setForeground(new java.awt.Color(255, 255, 255));
        lblcargarcamionero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/listo.png"))); // NOI18N
        lblcargarcamionero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcargarcamionero.setOpaque(true);

        javax.swing.GroupLayout pnlprincipalcamLayout = new javax.swing.GroupLayout(pnlprincipalcam);
        pnlprincipalcam.setLayout(pnlprincipalcamLayout);
        pnlprincipalcamLayout.setHorizontalGroup(
            pnlprincipalcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalcamLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcargarcamionero)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlprincipalcamLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(lbltitulo2)
                .addGap(224, 224, 224))
        );
        pnlprincipalcamLayout.setVerticalGroup(
            pnlprincipalcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalcamLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbltitulo2)
                .addGap(18, 18, 18)
                .addGroup(pnlprincipalcamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcargarcamionero))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jDlgCamioneroLayout = new javax.swing.GroupLayout(jDlgCamionero.getContentPane());
        jDlgCamionero.getContentPane().setLayout(jDlgCamioneroLayout);
        jDlgCamioneroLayout.setHorizontalGroup(
            jDlgCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgCamioneroLayout.createSequentialGroup()
                .addComponent(pnlprincipalcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDlgCamioneroLayout.setVerticalGroup(
            jDlgCamioneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipalcam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlprincipalframe.setBackground(new java.awt.Color(200, 255, 255));

        jLabel1.setText("Buscar:");

        btncrear.setText("Crear");

        btnmodificar.setText("Modificar");

        btneliminar.setText("Eliminar");

        javax.swing.GroupLayout pnlprincipalframeLayout = new javax.swing.GroupLayout(pnlprincipalframe);
        pnlprincipalframe.setLayout(pnlprincipalframeLayout);
        pnlprincipalframeLayout.setHorizontalGroup(
            pnlprincipalframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalframeLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btneliminar)
                .addGap(29, 29, 29))
        );
        pnlprincipalframeLayout.setVerticalGroup(
            pnlprincipalframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalframeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlprincipalframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncrear)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tablapaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Destinatario", "Direccion destinatario", "Código del camionero", "Nombre y apellido", "Código de la provincia", "Nombre de la provincia"
            }
        ));
        jScrollPane1.setViewportView(tablapaquetes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(pnlprincipalframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlprincipalframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> cbxprovincia;
    private javax.swing.JDialog jDlgCamionero;
    private javax.swing.JDialog jDlgClientes;
    private javax.swing.JDialog jDlgDestinatario;
    private javax.swing.JDialog jDlgPaquetes;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jclfecharegistro;
    private com.toedter.calendar.JDateChooser jclllegadapro;
    private com.toedter.calendar.JDateChooser jclsalidapro;
    private javax.swing.JLabel lbcedcamionero;
    private javax.swing.JLabel lblbuscamionero;
    private javax.swing.JLabel lblbuscarcliente;
    private javax.swing.JLabel lblbuscardestinatario;
    private javax.swing.JLabel lblcargarcamionero;
    private javax.swing.JLabel lblcargarcliente;
    private javax.swing.JLabel lblcargardestinatario;
    private javax.swing.JLabel lblcedcliente;
    private javax.swing.JLabel lblceddestinatario;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lblcodcamionero;
    private javax.swing.JLabel lblcodcliente;
    private javax.swing.JLabel lblcoddestinatario;
    private javax.swing.JLabel lblcodprovincia;
    private javax.swing.JLabel lbldestinatario;
    private javax.swing.JLabel lblfecharegistro;
    private javax.swing.JLabel lblllegadapro;
    private javax.swing.JLabel lblnomcamionero;
    private javax.swing.JLabel lblpeso;
    private javax.swing.JLabel lblprovincia;
    private javax.swing.JLabel lblsalidapro;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JLabel lbltitulo2;
    private javax.swing.JPanel pblprincipaldes;
    private javax.swing.JPanel pnlprincipal;
    private javax.swing.JPanel pnlprincipalcam;
    private javax.swing.JPanel pnlprincipalcli;
    private javax.swing.JPanel pnlprincipalframe;
    private javax.swing.JTable tablapaquetes;
    private javax.swing.JTable tblclientes;
    private javax.swing.JTable tblclientes2;
    private javax.swing.JTable tbldestinatarios;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedcamionero;
    private javax.swing.JTextField txtcedcliente;
    private javax.swing.JTextField txtceddestinatario;
    private javax.swing.JTextField txtnomcamionero;
    private javax.swing.JTextField txtnomcliente;
    private javax.swing.JTextField txtnomdestinatario;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
