/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package src.gui.formulario;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import src.gui.comprobante.Comprobante;
import src.gui.intercambiarPaneles.IntercambiarPaneles;
import src.mediador.Mediador;

/**
 * @author Abeld
 */
public class FormularioPagarServicios extends javax.swing.JPanel {

    Mediador m;
    String metodo;

    /**
     * Creates new form FormularioPagarServicios
     */
    public FormularioPagarServicios(Mediador m) {
        initComponents();
        btnSaldo.setActionCommand("Cuenta");
        btnTarjeta.setActionCommand("Tarjeta");
        botones.add(btn1);
        botones.add(btn2);
        this.m = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        btnSaldo = new javax.swing.JRadioButton();
        btnTarjeta = new javax.swing.JRadioButton();
        lblMonto = new javax.swing.JLabel();
        jTextMonto = new javax.swing.JTextField();
        lblPin = new javax.swing.JLabel();
        jPassPintTransaccion = new javax.swing.JPasswordField();
        btnPagar1 = new javax.swing.JButton();
        lblInvalido = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(591, 444));
        setPreferredSize(new java.awt.Dimension(591, 444));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        comboBox.setBackground(new java.awt.Color(102, 102, 102));
        comboBox.setForeground(new java.awt.Color(255, 255, 255));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FPUNA", "ANDE", "CLARO", "TIGO" }));

        btnSaldo.setForeground(new java.awt.Color(102, 102, 102));
        btnSaldo.setText("Saldo de Cuenta");
        btnSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaldoMouseClicked(evt);
            }
        });

        btnTarjeta.setForeground(new java.awt.Color(102, 102, 102));
        btnTarjeta.setText("Tarjeta de Crédito");
        btnTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarjetaMouseClicked(evt);
            }
        });

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(102, 102, 102));
        lblMonto.setText("Monto");

        jTextMonto.setBackground(new java.awt.Color(255, 255, 255));
        jTextMonto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMonto.setForeground(new java.awt.Color(80, 80, 80));
        jTextMonto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 219, 228)));

        lblPin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPin.setForeground(new java.awt.Color(102, 102, 102));
        lblPin.setText("Pin de Transaccion");

        jPassPintTransaccion.setBackground(new java.awt.Color(255, 255, 255));
        jPassPintTransaccion.setForeground(new java.awt.Color(80, 80, 80));
        jPassPintTransaccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 219, 228)));

        btnPagar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPagar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar1.setText("Pagar");
        btnPagar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPagar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagar1MouseClicked(evt);
            }
        });

        lblInvalido.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
                panelPrincipalLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                panelPrincipalLayout
                                        .createSequentialGroup()
                                        .addGroup(
                                                panelPrincipalLayout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                panelPrincipalLayout
                                                                        .createSequentialGroup()
                                                                        .addGap(66, 66, 66)
                                                                        .addGroup(
                                                                                panelPrincipalLayout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                lblPinTransaccion)
                                                                                        .addComponent(
                                                                                                lblMonto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                97,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                jPassPintTransaccion,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                330,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(
                                                                                                panelPrincipalLayout
                                                                                                        .createSequentialGroup()
                                                                                                        .addGap(
                                                                                                                105,
                                                                                                                105,
                                                                                                                105)
                                                                                                        .addComponent(
                                                                                                                btnPagar1))
                                                                                        .addGroup(
                                                                                                panelPrincipalLayout
                                                                                                        .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                        .addGroup(
                                                                                                                panelPrincipalLayout
                                                                                                                        .createSequentialGroup()
                                                                                                                        .addComponent(
                                                                                                                                comboBox,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                        .addGroup(
                                                                                                                                panelPrincipalLayout
                                                                                                                                        .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                        .addComponent(
                                                                                                                                                btn1)
                                                                                                                                        .addComponent(
                                                                                                                                                btn2)))
                                                                                                        .addComponent(
                                                                                                                jTextMonto,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                330,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(
                                                                panelPrincipalLayout
                                                                        .createSequentialGroup()
                                                                        .addGap(155, 155, 155)
                                                                        .addComponent(
                                                                                lblInvalido,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(195, Short.MAX_VALUE)));
        panelPrincipalLayout.setVerticalGroup(
                panelPrincipalLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                panelPrincipalLayout
                                        .createSequentialGroup()
                                        .addContainerGap(92, Short.MAX_VALUE)
                                        .addGroup(
                                                panelPrincipalLayout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                comboBox,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(
                                                                panelPrincipalLayout
                                                                        .createSequentialGroup()
                                                                        .addComponent(btn1)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btn2)))
                                        .addGap(61, 61, 61)
                                        .addComponent(lblMonto)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(
                                                jTextMonto,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lblPinTransaccion)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(
                                                jPassPintTransaccion,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(
                                                lblInvalido,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                20,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPagar1)
                                        .addGap(70, 70, 70)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarjetaMouseClicked
        lblPin.setText("Pin de Tarjeta");
    }//GEN-LAST:event_btnTarjetaMouseClicked

    private void btnSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseClicked
        lblPin.setText("Pin de Transacción");
    }//GEN-LAST:event_btnSaldoMouseClicked

    private void btnPagar1MouseClicked(java.awt.event.MouseEvent evt) {
        transaccionar();

    } // GEN-LAST:event_btnPagar1MouseClicked

    private void transaccionar() {
        try {
            // parsear datos
            int monto = Integer.parseInt(jTextMonto.getText());
            int pin = Integer.parseInt(String.valueOf(jPassPintTransaccion.getPassword()));
            String servicio = comboBox.getItemAt(comboBox.getSelectedIndex());
            String metodo = botones.getSelection().toString();
            int eleccion = JOptionPane.showConfirmDialog(this, "Desea seguir con el Pago?",
                    "Confirmación de Pago", YES_NO_OPTION);
            // Si
            if (eleccion == JOptionPane.YES_OPTION) {
                // realizar la transaccion
                Comprobante comp = m.PagarServicio(pin, servicio, monto, metodo);
                IntercambiarPaneles intercambiar = new IntercambiarPaneles();
                intercambiar.modificarPanel(comp, panelPrincipal);
            }
        } catch (Exception e) {
            lblInvalido.setText("Datos Inválidos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.JButton btnPagar1;
    private javax.swing.JRadioButton btnSaldo;
    private javax.swing.JRadioButton btnTarjeta;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPasswordField jPassPintTransaccion;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JLabel lblInvalido;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblPin;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
