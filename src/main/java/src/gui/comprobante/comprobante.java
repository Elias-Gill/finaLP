/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bankServer.regsYcomprobs.DatosComprobante;

/**
 * @author Andres Moises
 */
public class comprobante extends javax.swing.JFrame {
    private javax.swing.JLabel Comprobante;
    private javax.swing.JLabel Concepto;
    private javax.swing.JLabel CuentaDestino;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Monto;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel datosConcepto;
    private javax.swing.JLabel datosCuentaDestino;
    private javax.swing.JLabel datosFecha;
    private javax.swing.JLabel datosMonto;
    private javax.swing.JLabel datosNumero;
    private javax.swing.JButton jButton1;

    /** Creates new form comprobante */
    public comprobante(DatosComprobante Datos) {
        initComponents();
        datosFecha.setText(Datos.fecha.toString());
        datosCuentaDestino.setText(Datos.cuentaDestino.toString());
        datosMonto.setText(Datos.monto.toString());
        datosNumero.setText(Datos.id.toString());
        datosConcepto.setText(Datos.concepto);
    }

    // componentes creados con netbeans
    private void initComponents() {

        Comprobante = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        CuentaDestino = new javax.swing.JLabel();
        Concepto = new javax.swing.JLabel();
        Monto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        datosFecha = new javax.swing.JLabel();
        datosCuentaDestino = new javax.swing.JLabel();
        datosConcepto = new javax.swing.JLabel();
        datosMonto = new javax.swing.JLabel();
        datosNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Comprobante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Comprobante.setText("Comprobante");

        Numero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Numero.setText("Fecha: ");

        Fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fecha.setText("Cuenta De Destino: ");

        CuentaDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CuentaDestino.setText("Numero: ");

        Concepto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Concepto.setText("Monto: ");

        Monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Monto.setText("Concepto:");

        // boton de aceptar
        jButton1.setText("Aceptar");
        jButton1.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

        // layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(191, 191, 191)
                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(
                                                                                                Numero)
                                                                                        .addComponent(
                                                                                                Fecha)
                                                                                        .addComponent(
                                                                                                Concepto)
                                                                                        .addComponent(
                                                                                                Monto)
                                                                                        .addComponent(
                                                                                                CuentaDestino))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(
                                                                                                datosFecha,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                299,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                datosCuentaDestino,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                299,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                datosConcepto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                299,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                datosMonto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                299,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                datosNumero,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                299,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(347, 347, 347)
                                                                        .addComponent(
                                                                                Comprobante,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                132,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(193, Short.MAX_VALUE))
                        .addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(87, 87, 87)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(
                                                Comprobante,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                27,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                CuentaDestino,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(
                                                                datosNumero,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(
                                                                                                layout.createSequentialGroup()
                                                                                                        .addGroup(
                                                                                                                layout.createParallelGroup(
                                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                        .addGroup(
                                                                                                                                layout.createSequentialGroup()
                                                                                                                                        .addGroup(
                                                                                                                                                layout.createParallelGroup(
                                                                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                        .addComponent(
                                                                                                                                                                Numero,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                30,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                        .addComponent(
                                                                                                                                                                datosFecha,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                30,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                        .addGap(
                                                                                                                                                40,
                                                                                                                                                40,
                                                                                                                                                40)
                                                                                                                                        .addComponent(
                                                                                                                                                Fecha,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                30,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                        .addComponent(
                                                                                                                                datosCuentaDestino,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGap(
                                                                                                                37,
                                                                                                                37,
                                                                                                                37)
                                                                                                        .addComponent(
                                                                                                                Monto,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(
                                                                                                datosConcepto,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(
                                                                                Concepto,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(
                                                                datosMonto,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addContainerGap(53, Short.MAX_VALUE)));

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(
            java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    } // GEN-LAST:event_jButton1ActionPerformed

    public void mostrarComprobante() {
        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        setVisible(true);
                    }
                });
    }

    /* EJEMPLO DE USO DE COMPROBANTE
        comprobante c = new comprobante(new DatosComprobante());
        c.mostrarComprobante();
    */
}