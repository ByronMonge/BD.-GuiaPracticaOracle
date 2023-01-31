package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    public JMenuBar getMnuCamioneros() {
        return MnuCamioneros;
    }

    public void setMnuCamioneros(JMenuBar MnuCamioneros) {
        this.MnuCamioneros = MnuCamioneros;
    }

    public JButton getBtnCamionero() {
        return btnCamionero;
    }

    public void setBtnCamionero(JButton btnCamionero) {
        this.btnCamionero = btnCamionero;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JButton getBtncamion() {
        return btncamion;
    }

    public void setBtncamion(JButton btncamion) {
        this.btncamion = btncamion;
    }

    public JButton getBtnprovincia() {
        return btnprovincia;
    }

    public void setBtnprovincia(JButton btnprovincia) {
        this.btnprovincia = btnprovincia;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public void setBtnCliente(JButton btnCliente) {
        this.btnCliente = btnCliente;
    }

    public JButton getBtndestinatario() {
        return btndestinatario;
    }

    public void setBtndestinatario(JButton btndestinatario) {
        this.btndestinatario = btndestinatario;
    }

    public JButton getBtnconduce() {
        return btnconduce;
    }

    public void setBtnconduce(JButton btnconduce) {
        this.btnconduce = btnconduce;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnCamionero = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btncamion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnprovincia = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnCliente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btndestinatario = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnconduce = new javax.swing.JButton();
        escritorio = new javax.swing.JDesktopPane();
        MnuCamioneros = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBackground(new java.awt.Color(153, 153, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btnCamionero.setBackground(new java.awt.Color(153, 153, 255));
        btnCamionero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conductor (1).png"))); // NOI18N
        btnCamionero.setToolTipText("Camioneros");
        btnCamionero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCamionero.setFocusable(false);
        btnCamionero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCamionero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCamionero);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator1);

        btncamion.setBackground(new java.awt.Color(153, 153, 255));
        btncamion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/semi.png"))); // NOI18N
        btncamion.setToolTipText("Camiones");
        btncamion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncamion.setFocusable(false);
        btncamion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncamion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btncamion);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator2);

        btnprovincia.setBackground(new java.awt.Color(153, 153, 255));
        btnprovincia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lugar_1.png"))); // NOI18N
        btnprovincia.setToolTipText("Provincias");
        btnprovincia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprovincia.setFocusable(false);
        btnprovincia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnprovincia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnprovincia);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator3);

        btnCliente.setBackground(new java.awt.Color(153, 153, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar-usuario_1.png"))); // NOI18N
        btnCliente.setToolTipText("Clientes");
        btnCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCliente.setFocusable(false);
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCliente);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator4);

        btndestinatario.setBackground(new java.awt.Color(153, 153, 255));
        btndestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/grupo_1.png"))); // NOI18N
        btndestinatario.setToolTipText("Destinatarios");
        btndestinatario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndestinatario.setFocusable(false);
        btndestinatario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndestinatario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btndestinatario);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator5);

        btnconduce.setBackground(new java.awt.Color(153, 153, 255));
        btnconduce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carnet-de-conducir_1.png"))); // NOI18N
        btnconduce.setToolTipText("Horarios de conduccion");
        btnconduce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnconduce.setFocusable(false);
        btnconduce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnconduce.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnconduce);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        MnuCamioneros.setBackground(new java.awt.Color(153, 153, 255));
        MnuCamioneros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setBackground(new java.awt.Color(153, 153, 255));
        jMenu1.setBorder(null);
        jMenu1.setText("Registros");
        MnuCamioneros.add(jMenu1);

        setJMenuBar(MnuCamioneros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MnuCamioneros;
    private javax.swing.JButton btnCamionero;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btncamion;
    private javax.swing.JButton btnconduce;
    private javax.swing.JButton btndestinatario;
    private javax.swing.JButton btnprovincia;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
