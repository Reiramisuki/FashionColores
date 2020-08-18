package ar.org.centro8.curso.java.gui;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Factura;
import ar.org.centro8.curso.java.repositories.interfaces.I_FacturaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.FacturaRepository;
import ar.org.centro8.curso.java.utils.swing.Table;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CierredeCaja extends javax.swing.JInternalFrame implements Printable{
    private I_FacturaRepository fc=new FacturaRepository(Connector.getConnection());
    public CierredeCaja() {
        initComponents();
//        PANELIMPRIMIR.setVisible(false);
        btnLimpiar.setEnabled(false);
        btnImprimir.setEnabled(false);
        Btncargarfacturas.setEnabled(false);
        Btncargarfecha.setEnabled(false);
        btnIngresarGastos.setEnabled(false);
        btncalculartotal.setEnabled(false);
        txtobservacionesdegastos.setVisible(false);
        lbltitulogastos.setVisible(false);
        lblGastos.setVisible(false);
        txtGastoRealizados.setVisible(false);
        txtFechaInicio.setEnabled(false);
        txtfechaFin.setEnabled(false);
        txtTotaldeCaja.setEnabled(false);
        txtGastoRealizados.setEnabled(false);
        txtTotaldeCaja.setEnabled(false);
        lblbtotalFacturado.setEnabled(false);
        btncalcularfacturado.setEnabled(false);
//        cargarElementos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpiar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnIngresarGastos = new javax.swing.JButton();
        btncalculartotal = new javax.swing.JButton();
        PANELIMPRIMIR = new javax.swing.JPanel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tblaFactura = new javax.swing.JTable();
        lblGastos = new javax.swing.JLabel();
        txtGastoRealizados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotaldeCaja = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtfechaFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblbtotalFacturado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtobservacionesdegastos = new javax.swing.JTextField();
        lbltitulogastos = new javax.swing.JLabel();
        btnNuevoCierre = new javax.swing.JButton();
        Btncargarfecha = new javax.swing.JButton();
        Btncargarfacturas = new javax.swing.JButton();
        btncalcularfacturado = new javax.swing.JButton();

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnIngresarGastos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresarGastos.setText("Agregar Gastos");
        btnIngresarGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarGastosActionPerformed(evt);
            }
        });

        btncalculartotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncalculartotal.setText("Calcular Total");
        btncalculartotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculartotalActionPerformed(evt);
            }
        });

        PANELIMPRIMIR.setBackground(new java.awt.Color(255, 255, 255));

        txtFechaInicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFechaInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cierre de caja ");

        tblaFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tblaFactura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblaFactura.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblaFactura.setAutoscrolls(false);
        tblaFactura.setEnabled(false);
        tblaFactura.setGridColor(new java.awt.Color(204, 204, 204));

        lblGastos.setBackground(new java.awt.Color(255, 255, 255));
        lblGastos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblGastos.setText("Gastos Realizados");

        txtGastoRealizados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGastoRealizados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGastoRealizados.setText("0");
        txtGastoRealizados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Total del cierre de caja");

        txtTotaldeCaja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTotaldeCaja.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotaldeCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Fecha ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Fecha ");

        txtfechaFin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtfechaFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Total Facturado");

        lblbtotalFacturado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblbtotalFacturado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblbtotalFacturado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Factura N°");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Letra");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("fecha");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("monto");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("medio de pago");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("descuento");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Id.cliente");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("id_rebaja");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbltitulogastos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbltitulogastos.setText("Observaciones de gastos/pagos realizados");

        javax.swing.GroupLayout PANELIMPRIMIRLayout = new javax.swing.GroupLayout(PANELIMPRIMIR);
        PANELIMPRIMIR.setLayout(PANELIMPRIMIRLayout);
        PANELIMPRIMIRLayout.setHorizontalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELIMPRIMIRLayout.createSequentialGroup()
                                .addGap(420, 420, 420)
                                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGastos)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGastoRealizados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotaldeCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(lblbtotalFacturado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtobservacionesdegastos))
                .addContainerGap())
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulogastos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELIMPRIMIRLayout.setVerticalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblaFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbtotalFacturado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lbltitulogastos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtobservacionesdegastos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGastoRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotaldeCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnNuevoCierre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNuevoCierre.setText("Realizar nuevo cierre de caja");
        btnNuevoCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCierreActionPerformed(evt);
            }
        });

        Btncargarfecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btncargarfecha.setText("Cargar Fechas");
        Btncargarfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargarfechaActionPerformed(evt);
            }
        });

        Btncargarfacturas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btncargarfacturas.setText("Cargar Facturación");
        Btncargarfacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargarfacturasActionPerformed(evt);
            }
        });

        btncalcularfacturado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncalcularfacturado.setText("Calcular Facturado");
        btncalcularfacturado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularfacturadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btncargarfacturas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresarGastos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoCierre, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(btncalculartotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncalcularfacturado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btncargarfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNuevoCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Btncargarfacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btncargarfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncalcularfacturado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresarGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncalculartotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtncargarfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargarfechaActionPerformed
        Fechas cf=new Fechas();
        Tienda.desktop.add(cf);
        cf.toFront();
        cf.setVisible(true);
    }//GEN-LAST:event_BtncargarfechaActionPerformed

    private void btnNuevoCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCierreActionPerformed
//        PANELIMPRIMIR.setVisible(true); 
      // botones
        Btncargarfacturas.setEnabled(true);
        Btncargarfecha.setEnabled(true);
        btnIngresarGastos.setEnabled(true);
        btncalculartotal.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnImprimir.setEnabled(true);
        
        //gastos
        lbltitulogastos.setVisible(false);
        txtobservacionesdegastos.setVisible(false);
        lblGastos.setVisible(false);
        txtGastoRealizados.setVisible(false);
        txtGastoRealizados.setEnabled(false);
        
        //txt
        txtFechaInicio.setEnabled(true);
        txtfechaFin.setEnabled(true);
        lblbtotalFacturado.setEnabled(true);
        txtTotaldeCaja.setEnabled(true);
        btncalcularfacturado.setEnabled(true);
    }//GEN-LAST:event_btnNuevoCierreActionPerformed

    private void btnIngresarGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarGastosActionPerformed
        lbltitulogastos.setVisible(true);
        txtobservacionesdegastos.setVisible(true);
        lblGastos.setVisible(true);
        txtGastoRealizados.setVisible(true);
        txtGastoRealizados.setEnabled(true);
    }//GEN-LAST:event_btnIngresarGastosActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         Limpiar();
          //gastos
        lbltitulogastos.setVisible(false);
        txtobservacionesdegastos.setVisible(false);
        lblGastos.setVisible(false);
        txtGastoRealizados.setVisible(false);
        txtGastoRealizados.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void BtncargarfacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargarfacturasActionPerformed
        String fechaInicio=txtFechaInicio.getText();
        String fechaFin=txtfechaFin.getText();
        // new Table<Factura>().cargar(tblaFactura,fc.getLikeFecha(fechaInicio,fechaFin));
        if (txtFechaInicio.getText().length()==0&&txtFechaInicio.getText().length()==0) {
            new Table<Factura>().cargar(tblaFactura,fc.getAllFecha());
        } else {
              new Table<Factura>().cargar(tblaFactura,fc.getLikeFecha(fechaInicio,fechaFin));
        }
    }//GEN-LAST:event_BtncargarfacturasActionPerformed
 
    public void suma(){
        double t=0;
        double p=0;
        if(tblaFactura.getRowCount()>0){
            for (int i = 0; i< tblaFactura.getRowCount() ; i++) {
                p=Double.parseDouble(tblaFactura.getValueAt(i,8).toString());
                t +=p;
            }
            lblbtotalFacturado.setText(String.valueOf(t));
        }}
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncalculartotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculartotalActionPerformed
     Double n,totalFacturado,Gastos;
     totalFacturado=Double.parseDouble(lblbtotalFacturado.getText());
     Gastos=Double.parseDouble(txtGastoRealizados.getText());
//     txtTotaldeCaja.setText(String.valueOf(n));
     if (Gastos !=0) { 
             n=totalFacturado-Gastos;
             txtTotaldeCaja.setText(String.valueOf(n));
            } else {
            n=totalFacturado;
            txtTotaldeCaja.setText(String.valueOf(n));
     }
    }//GEN-LAST:event_btncalculartotalActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
//             Open printer dialog and pass JPanel to print
                PrinterJob job =PrinterJob.getPrinterJob();
                job.setPrintable(this);
                if (job.printDialog()) job.print();
        } catch (PrinterException ex) {
            Logger.getLogger(CierredeCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btncalcularfacturadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularfacturadoActionPerformed
        suma();
    }//GEN-LAST:event_btncalcularfacturadoActionPerformed
 private void Limpiar(){
    txtFechaInicio.setText("");
    txtfechaFin.setText("");
    txtTotaldeCaja.setText("");
    txtobservacionesdegastos.setText("");
    txtGastoRealizados.setText("");
    lblbtotalFacturado.setText("");
    new Table<Factura>().cargar(tblaFactura,fc.getAllFecha());
}
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        PANELIMPRIMIR.printAll(graphics);
        return PAGE_EXISTS;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btncargarfacturas;
    private javax.swing.JButton Btncargarfecha;
    private javax.swing.JPanel PANELIMPRIMIR;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIngresarGastos;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevoCierre;
    private javax.swing.JButton btncalcularfacturado;
    private javax.swing.JButton btncalculartotal;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JTextField lblbtotalFacturado;
    private javax.swing.JLabel lbltitulogastos;
    private javax.swing.JTable tblaFactura;
    public static javax.swing.JTextField txtFechaInicio;
    public static javax.swing.JTextField txtGastoRealizados;
    public static javax.swing.JLabel txtTotaldeCaja;
    public static javax.swing.JTextField txtfechaFin;
    private javax.swing.JTextField txtobservacionesdegastos;
    // End of variables declaration//GEN-END:variables
}
