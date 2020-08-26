package ar.org.centro8.curso.java.gui;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Detalle;
import ar.org.centro8.curso.java.entidades.Ropa;
import ar.org.centro8.curso.java.enums.Color;
import ar.org.centro8.curso.java.enums.Estacion;
import ar.org.centro8.curso.java.enums.GeneroRopa;
import ar.org.centro8.curso.java.enums.Talle;
import ar.org.centro8.curso.java.repositories.interfaces.I_DetalleRepository;
import ar.org.centro8.curso.java.repositories.interfaces.I_RopaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.DetalleRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RopaRepository;
import ar.org.centro8.curso.java.utils.swing.Table;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalleCompra extends javax.swing.JInternalFrame {
    DefaultTableModel dtc=new DefaultTableModel();
    private I_RopaRepository r=new RopaRepository(Connector.getConnection());
    private I_DetalleRepository DC=new DetalleRepository(Connector.getConnection());
    public DetalleCompra() {
        super(
                "Detalle de Compra",        //title
                false,                          //resizable
                true,                           //closable
                false,                          //maximizable
                true                            //iconable
        );
        initComponents();
        cargarElementos();
        lblStock.setVisible(false);
        lblstockactual.setVisible(false);
        lblInfo.setVisible(true);
        cmbColor.setVisible(true);
        cmbEstacion.setVisible(false);
        cmbGeneroRopa.setVisible(false);
        cmbTalle.setVisible(false);
        lblnumerofacturaM.setVisible(false);
        lblletraM.setVisible(false);
        
        lblMonto.setOpaque(true);
        lblStock.setOpaque(true); lblLetraDC.setOpaque(true);
        lblNumero_facturaDC.setOpaque(true); lblPrecio.setOpaque(true);
        lblRopa.setOpaque(true); lblId_ropa.setOpaque(true);
//        String[] titulo=new String[]{"Codigo","Ropa","Precio","Cantidad","Monto"};
//        dtc.setColumnIdentifiers(titulo);
//        tblDetalles.setModel(dtc);
//         this.detalle=detalle;
    }
private void cargarElementos() {
     //cargar GeneroRopa
        cmbGeneroRopa.removeAllItems();
        for (GeneroRopa gr:GeneroRopa.values())cmbGeneroRopa.addItem(gr);
        
        //cargar cmbTalle
        cmbTalle.removeAllItems();
        for (Talle t:Talle.values())cmbTalle.addItem(t);
        
        //cargar cmbColor
        cmbColor.removeAllItems();
        for (Color cl:Color.values())cmbColor.addItem(cl);
        
        //cargar cmbEstacion
        cmbEstacion.removeAllItems();
        for (Estacion es:Estacion.values())cmbEstacion.addItem(es);
        
     //cargar TblRebaja
       new Table<Ropa>().cargar(tblRopa, r.getAll());
//      new Table<Detalle>().cargar(tblDetalles,DC.getLikeNumero(Integer.parseInt(lblNumero_facturaDC.getText())));
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRopa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarRopa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblId_ropa = new javax.swing.JLabel();
        lblRopa = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        txtCantidadVIEJA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnguardaCambio = new javax.swing.JButton();
        btnCargarItem = new javax.swing.JButton();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        lblLetraDC = new javax.swing.JLabel();
        lblNumero_facturaDC = new javax.swing.JLabel();
        lblstockactual = new javax.swing.JLabel();
        cmbTalle = new javax.swing.JComboBox<>();
        cmbGeneroRopa = new javax.swing.JComboBox<>();
        cmbEstacion = new javax.swing.JComboBox<>();
        lblStock = new javax.swing.JLabel();
        lblletraM = new javax.swing.JLabel();
        lblnumerofacturaM = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Detalle de compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Letra");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Numero");

        tblRopa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblRopa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRopa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRopaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRopa);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Buscar ropa");

        txtBuscarRopa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBuscarRopa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarRopaKeyReleased(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ropa");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Monto");

        lblId_ropa.setBackground(new java.awt.Color(255, 255, 255));
        lblId_ropa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblId_ropa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblRopa.setBackground(new java.awt.Color(255, 255, 255));
        lblRopa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRopa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblPrecio.setBackground(new java.awt.Color(255, 255, 255));
        lblPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblMonto.setBackground(new java.awt.Color(255, 255, 255));
        lblMonto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btncalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        txtCantidadVIEJA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCantidadVIEJA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadVIEJAKeyReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar item");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnguardaCambio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnguardaCambio.setText("Modificar Items");
        btnguardaCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardaCambioActionPerformed(evt);
            }
        });

        btnCargarItem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCargarItem.setText("Cargar compra");
        btnCargarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(btnCargarItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnguardaCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnguardaCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(6, 6, 6))
        );

        cmbColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Color");

        btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setMaximumSize(new java.awt.Dimension(103, 31));
        btnIngresar.setMinimumSize(new java.awt.Dimension(130, 31));
        btnIngresar.setPreferredSize(new java.awt.Dimension(103, 31));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId_ropa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVIEJA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRopa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId_ropa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCantidadVIEJA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addContainerGap())
        );

        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        tblDetalles.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetallesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDetalles);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblLetraDC.setBackground(new java.awt.Color(255, 255, 255));
        lblLetraDC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblLetraDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLetraDC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblNumero_facturaDC.setBackground(new java.awt.Color(255, 255, 255));
        lblNumero_facturaDC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNumero_facturaDC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        lblstockactual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLetraDC, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTalle, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGeneroRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cmbEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumero_facturaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblstockactual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblletraM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnumerofacturaM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLetraDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbGeneroRopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumero_facturaDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblletraM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBuscarRopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblstockactual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumerofacturaM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tblRopaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRopaMouseClicked
          // cargar cajas de texto
        var rec=DetalleCompra.tblRopa.getSelectedRow();
        this.lblId_ropa.setText(tblRopa.getValueAt(rec, 0).toString());
        this.lblRopa.setText(tblRopa.getValueAt(rec, 1).toString());
        cmbTalle.setSelectedItem(tblRopa.getValueAt(rec, 2));
        cmbColor.setSelectedItem(tblRopa.getValueAt(rec, 3));
        cmbGeneroRopa.setSelectedItem(tblRopa.getValueAt(rec, 4));
        cmbEstacion.setSelectedItem(tblRopa.getValueAt(rec, 5));
        this.lblStock.setText(tblRopa.getValueAt(rec,6).toString());
        this.lblPrecio.setText(tblRopa.getValueAt(rec,7).toString());
    }//GEN-LAST:event_tblRopaMouseClicked

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        Double precio,monto;
        int cantidad;
        precio=Double.parseDouble(lblPrecio.getText());
        cantidad=Integer.parseInt(txtCantidadVIEJA.getText());
        monto=precio*cantidad;
        lblMonto.setText(String.valueOf(monto)); 
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //ingreso de detalles de factura
        Detalle detalles=new Detalle(
        Integer.parseInt(lblNumero_facturaDC.getText()),
        lblLetraDC.getText(),
        Integer.parseInt(lblId_ropa.getText()),
        lblRopa.getText(),
        Double.parseDouble(lblPrecio.getText()),
        Integer.parseInt(txtCantidadVIEJA.getText()),        
        Double.parseDouble(lblMonto.getText())
        ); 
       DC.save(detalles);
       JOptionPane.showMessageDialog(null,"Se guardo detalle de compra de la factura N°"+detalles.getNumero_factura()+" correctamente");
       new Table<Detalle>().cargar(tblDetalles,DC.getLikeNumero(Integer.parseInt(lblNumero_facturaDC.getText())));
       
       
        int stockactual= 0;
        int stock =Integer.parseInt(lblStock.getText());
        int cantidad=Integer.parseInt(txtCantidadVIEJA.getText());
        
        stockactual=stock-cantidad;
        lblstockactual.setText(String.valueOf(stockactual));
        
        Ropa ropa;
        ropa = new Ropa(
            Integer.parseInt(lblId_ropa.getText()),
            lblRopa.getText(),
            cmbTalle.getItemAt(cmbTalle.getSelectedIndex()),
            cmbColor.getItemAt(cmbColor.getSelectedIndex()),
            cmbGeneroRopa.getItemAt(cmbGeneroRopa.getSelectedIndex()),
            cmbEstacion.getItemAt(cmbEstacion.getSelectedIndex()),
            Integer.parseInt(lblstockactual.getText()),
            Double.parseDouble(lblPrecio.getText())
        );
        r.update(ropa);
        lblInfo.setText("Se actualizo el stock de ropa N°: "+ropa.getId());
         new Table<Ropa>().cargar(tblRopa, r.getAll());
        
    }//GEN-LAST:event_btnIngresarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//         Evento Eliminar
        int fila=tblDetalles.getSelectedRow();
        if(fila==-1) return;
        int id_ropa=(int)tblDetalles.getValueAt(fila, 0);
        if(JOptionPane.showConfirmDialog(this, "Desea borrar esta prenda codigo"+id_ropa+"?")!=0) return;
        Detalle detalle=(Detalle)DC.getByNumero(id_ropa);
        DC.remove(detalle);
        lblInfo.setText("Se actualizo stock de la prenda N°:"+detalle.getId_ropa());
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarRopaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarRopaKeyReleased
       new Table().cargar(tblRopa, r.getLikeRopaD(txtBuscarRopa.getText()));
    }//GEN-LAST:event_txtBuscarRopaKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetallesMouseClicked
        int rec=tblDetalles.getSelectedRow();
        this.lblletraM.setText(tblDetalles.getValueAt(rec, 0).toString());
        this.lblnumerofacturaM.setText(tblDetalles.getValueAt(rec, 1).toString());
        this.lblId_ropa.setText(tblDetalles.getValueAt(rec, 2).toString());
        this.lblRopa.setText(tblDetalles.getValueAt(rec, 3).toString());
        this.lblPrecio.setText(tblDetalles.getValueAt(rec, 4).toString());
        this.txtCantidadVIEJA.setText(tblDetalles.getValueAt(rec, 5).toString());
        this.lblMonto.setText(tblDetalles.getValueAt(rec, 6).toString()); 
    }//GEN-LAST:event_tblDetallesMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Evento salir
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnguardaCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardaCambioActionPerformed
//mostrar();
Detalle detalles=new Detalle(
        Integer.parseInt(lblNumero_facturaDC.getText()),
        lblLetraDC.getText(),
        Integer.parseInt(lblId_ropa.getText()),
        lblRopa.getText(),
        Double.parseDouble(lblPrecio.getText()),
        Integer.parseInt(txtCantidadVIEJA.getText()),        
        Double.parseDouble(lblMonto.getText())
        ); 
       DC.update(detalles);
       JOptionPane.showMessageDialog(null,"Se modifico la cantidad de la ropa "+detalles.getNumero_factura()+" correctamente");
       agregar();
    }//GEN-LAST:event_btnguardaCambioActionPerformed

    private void btnCargarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarItemActionPerformed
        new Table<Detalle>().cargar(tblDetalles,DC.getLikeNumero(Integer.parseInt(lblNumero_facturaDC.getText())));
    }//GEN-LAST:event_btnCargarItemActionPerformed

    private void txtCantidadVIEJAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVIEJAKeyReleased
     int stockactual= 0;
        int stock =Integer.parseInt(lblStock.getText());
        int cantidad=Integer.parseInt(txtCantidadVIEJA.getText());
        if(stock!=0 && cantidad <=stock){
        stockactual=stock-cantidad;
        lblstockactual.setText(String.valueOf(stockactual));
        
//        Ropa ropa;
//        ropa = new Ropa(
//            Integer.parseInt(lblId_ropa.getText()),
//            lblRopa.getText(),
//            cmbTalle.getItemAt(cmbTalle.getSelectedIndex()),
//            cmbColor.getItemAt(cmbColor.getSelectedIndex()),
//            cmbGeneroRopa.getItemAt(cmbGeneroRopa.getSelectedIndex()),
//            cmbEstacion.getItemAt(cmbEstacion.getSelectedIndex()),
//            Integer.parseInt(lblstockactual.getText()),
//            Double.parseDouble(lblPrecio.getText())
//        );
//        r.update(ropa);
//        lblInfo.setText("Se actualizo el stock de ropa N°: "+ropa.getId());
        }
        else{
        JOptionPane.showMessageDialog(null,"no posee stock suficiente");
        }
    }//GEN-LAST:event_txtCantidadVIEJAKeyReleased
 
private void limpiar(){
        lblId_ropa.requestFocus();
        lblId_ropa.setText("");
        lblRopa.setText("");
        lblPrecio.setText("");
        cmbColor.setSelectedIndex(0);
        txtCantidadVIEJA.setText("");
        lblMonto.setText("");
    }
    
//private void eliminar(){
//      int fila=tblDetalles.getSelectedRow();
//      dtc.removeRow(fila);
//  }
private void agregar(){
    dtc.addRow(new Object[]{
     lblId_ropa.getText(),
     lblRopa.getText(),
     lblPrecio.getText(),
     txtCantidadVIEJA.getText(),
     lblMonto.getText()
 });
}
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarItem;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnguardaCambio;
    public static javax.swing.JComboBox<Color> cmbColor;
    public static javax.swing.JComboBox<Estacion> cmbEstacion;
    public static javax.swing.JComboBox<GeneroRopa> cmbGeneroRopa;
    public static javax.swing.JComboBox<Talle> cmbTalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId_ropa;
    public static javax.swing.JLabel lblInfo;
    public static javax.swing.JLabel lblLetraDC;
    public static javax.swing.JLabel lblMonto;
    public static javax.swing.JLabel lblNumero_facturaDC;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRopa;
    private javax.swing.JLabel lblStock;
    public static javax.swing.JLabel lblletraM;
    public static javax.swing.JLabel lblnumerofacturaM;
    private javax.swing.JLabel lblstockactual;
    public static javax.swing.JTable tblDetalles;
    public static javax.swing.JTable tblRopa;
    private javax.swing.JTextField txtBuscarRopa;
    private javax.swing.JTextField txtCantidadVIEJA;
    // End of variables declaration//GEN-END:variables
}
