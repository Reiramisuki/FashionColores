package ar.org.centro8.curso.java.gui;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Cliente;
import ar.org.centro8.curso.java.repositories.interfaces.I_ClienteRepository;
import ar.org.centro8.curso.java.repositories.jdbc.ClienteRepository;
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

public class ReportedeClientes extends javax.swing.JInternalFrame implements Printable{
 private I_ClienteRepository c=new ClienteRepository(Connector.getConnection());
    public ReportedeClientes() {
        initComponents();
        cargarElementos();
    }
//PANELIMPRIMIR
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANELIMPRIMIR = new javax.swing.JPanel();
        tblCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarnombre = new javax.swing.JTextField();
        txtbuscarDNI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnBuscarNombre = new javax.swing.JButton();
        btnBuscarDni = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnMostrarFacturas = new javax.swing.JButton();
        txtBuscarIdCliente = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnClienteid = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de Clientes");

        PANELIMPRIMIR.setBackground(new java.awt.Color(255, 255, 255));

        tblCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tblCliente.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCliente.setFocusable(false);
        tblCliente.setGridColor(new java.awt.Color(204, 204, 204));
        tblCliente.setSelectionBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Lista de clientes");

        jLabel2.setText("Numero");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("DNI");

        jLabel6.setText("Telefono");

        jLabel8.setText("genero");

        jLabel7.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PANELIMPRIMIRLayout = new javax.swing.GroupLayout(PANELIMPRIMIR);
        PANELIMPRIMIR.setLayout(PANELIMPRIMIRLayout);
        PANELIMPRIMIRLayout.setHorizontalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1))
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PANELIMPRIMIRLayout.setVerticalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscarNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarNombre.setText("Buscar nombre");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        btnBuscarDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarDni.setText("Buscar DNI");
        btnBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDniActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Imprimir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnMostrarFacturas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMostrarFacturas.setText("Mostrar compras de cliente N°");
        btnMostrarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFacturasActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnClienteid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClienteid.setText("Buscar Cliente Numero");
        btnClienteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBuscarnombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbuscarDNI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarIdCliente)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClienteid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtbuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClienteid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
//             Open printer dialog and pass JPanel to print
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(this);
               
                if(job.printDialog()) job.print();
                
        } catch (PrinterException ex) {
            Logger.getLogger(ReportedeClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnMostrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFacturasActionPerformed
        int fila=tblCliente.getSelectedRow();
        if(fila==-1) return;
        int id=(int)tblCliente.getValueAt(fila, 0);
        Cliente cliente=c.getById(id);
        ComprasdelClienteN comcli= new ComprasdelClienteN(cliente);
        this.getParent().add(comcli);
        comcli.setVisible(true);
    }//GEN-LAST:event_btnMostrarFacturasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        new Table<Cliente>().cargar(tblCliente,c.getAll());
        txtbuscarDNI.setText("");
        txtBuscarIdCliente.setText("");
        txtBuscarnombre.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
     new Table().cargar(tblCliente, c.getLikeNombre(txtBuscarnombre.getText()));
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void btnBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDniActionPerformed
       new Table().cargar(tblCliente, c.getLikeDni(Integer.parseInt(txtbuscarDNI.getText())));
    }//GEN-LAST:event_btnBuscarDniActionPerformed

    private void btnClienteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteidActionPerformed
        new Table().cargar(tblCliente, c.getLikeId(Integer.parseInt(txtBuscarIdCliente.getText()))); // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Evento Salir
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
 private void cargarElementos() {
//        new Table<Cliente>().cargar(tblCliente,c.getAll());
       new Table<Cliente>().cargar(tblCliente,c.getAll()); 
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
    private javax.swing.JPanel PANELIMPRIMIR;
    private javax.swing.JButton btnBuscarDni;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnClienteid;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarFacturas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBuscarIdCliente;
    private javax.swing.JTextField txtBuscarnombre;
    private javax.swing.JTextField txtbuscarDNI;
    // End of variables declaration//GEN-END:variables
}
