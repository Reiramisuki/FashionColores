package ar.org.centro8.curso.java.gui;
public class Calculadora extends javax.swing.JInternalFrame {
    public float primernumero;
    public float segundonumero;
    public String operador;
    
    public Calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSeis = new javax.swing.JButton();
        bntCinco = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        bntCero = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorraNumero = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        lblPantalla = new javax.swing.JLabel();

        setClosable(true);
        setForeground(new java.awt.Color(204, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnSeis.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnSeis.setPreferredSize(new java.awt.Dimension(73, 45));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        bntCinco.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        bntCinco.setText("5");
        bntCinco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        bntCinco.setPreferredSize(new java.awt.Dimension(73, 45));
        bntCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCincoActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(73, 45));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnDividir.setPreferredSize(new java.awt.Dimension(73, 45));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnIgual.setPreferredSize(new java.awt.Dimension(73, 45));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnNueve.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnNueve.setText("9");
        btnNueve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnNueve.setPreferredSize(new java.awt.Dimension(73, 45));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnUno.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnUno.setText("1");
        btnUno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnUno.setPreferredSize(new java.awt.Dimension(73, 45));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnSumar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnSumar.setText("+");
        btnSumar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnSumar.setPreferredSize(new java.awt.Dimension(73, 45));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        bntCero.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        bntCero.setText("0");
        bntCero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        bntCero.setPreferredSize(new java.awt.Dimension(73, 45));
        bntCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCeroActionPerformed(evt);
            }
        });

        btnOcho.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnOcho.setText("8");
        btnOcho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnOcho.setPreferredSize(new java.awt.Dimension(73, 45));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnDos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnDos.setText("2");
        btnDos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnDos.setPreferredSize(new java.awt.Dimension(73, 45));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnPunto.setPreferredSize(new java.awt.Dimension(73, 45));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnTres.setPreferredSize(new java.awt.Dimension(73, 45));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnSiete.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnSiete.setText("7");
        btnSiete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnSiete.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSiete.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSiete.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnCuatro.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnCuatro.setPreferredSize(new java.awt.Dimension(73, 45));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnBorrarTodo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnBorrarTodo.setText("C");
        btnBorrarTodo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnBorraNumero.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btnBorraNumero.setText("←");
        btnBorraNumero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnBorraNumero.setPreferredSize(new java.awt.Dimension(73, 45));
        btnBorraNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraNumeroActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(102, 255, 204)));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        lblPantalla.setBackground(new java.awt.Color(255, 255, 255));
        lblPantalla.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        lblPantalla.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCuatro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntCero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBorrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorraNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorraNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntCero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCeroActionPerformed
       this.lblPantalla.setText(this.lblPantalla.getText()+"0");
    }//GEN-LAST:event_bntCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        this.lblPantalla.setText(this.lblPantalla.getText()+"1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       this.lblPantalla.setText(this.lblPantalla.getText()+"2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
     this.lblPantalla.setText(this.lblPantalla.getText()+"3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
       this.lblPantalla.setText(this.lblPantalla.getText()+"4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void bntCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCincoActionPerformed
      this.lblPantalla.setText(this.lblPantalla.getText()+"5");
    }//GEN-LAST:event_bntCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
     this.lblPantalla.setText(this.lblPantalla.getText()+"6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
      this.lblPantalla.setText(this.lblPantalla.getText()+"7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
      this.lblPantalla.setText(this.lblPantalla.getText()+"8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
       this.lblPantalla.setText(this.lblPantalla.getText()+"9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        if(!(this.lblPantalla.getText().contains("."))){
        this.lblPantalla.setText(this.lblPantalla.getText()+".");
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        this.segundonumero=Float.parseFloat(this.lblPantalla.getText());
        switch(this.operador){
            case"+":this.lblPantalla.setText(sincero(this.primernumero+this.segundonumero));
            break;
             case"-":this.lblPantalla.setText(sincero(this.primernumero-this.segundonumero));
            break;
            case"*":this.lblPantalla.setText(sincero(this.primernumero*this.segundonumero));
            break;
            case"%":this.lblPantalla.setText(sincero((this.primernumero*this.segundonumero)/100));
            break;
            case"/":if(this.segundonumero==0){
                this.lblPantalla.setText("no se divide entre cero");}
            else{
                this.lblPantalla.setText(sincero(this.primernumero/this.segundonumero));
                };break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        this.primernumero=Float.parseFloat(this.lblPantalla.getText());
        this.operador="+";
        this.lblPantalla.setText("");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        this.primernumero=Float.parseFloat(this.lblPantalla.getText());
        this.operador="*";
        this.lblPantalla.setText("");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        this.primernumero=Float.parseFloat(this.lblPantalla.getText());
        this.operador="/";
        this.lblPantalla.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        this.primernumero=Float.parseFloat(this.lblPantalla.getText());
        this.operador="-";
        this.lblPantalla.setText("");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        lblPantalla.setText("");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorraNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraNumeroActionPerformed
     lblPantalla.setText(lblPantalla.getText().substring(0,lblPantalla.getText().length()-1));
    }//GEN-LAST:event_btnBorraNumeroActionPerformed
public String sincero(float resultado){
    String retorno = "";
    retorno=Float.toString(resultado);
    if(resultado%1==0){
        retorno=retorno.substring(0,retorno.length()-2);
    }
    return retorno;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCero;
    private javax.swing.JButton bntCinco;
    private javax.swing.JButton btnBorraNumero;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPantalla;
    // End of variables declaration//GEN-END:variables
}
