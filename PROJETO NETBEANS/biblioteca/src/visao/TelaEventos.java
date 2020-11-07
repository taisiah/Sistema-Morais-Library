
package visao;


public class TelaEventos extends javax.swing.JFrame {

   public TelaEventos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        tfDescEvt = new javax.swing.JTextField();
        lbDescEvt = new javax.swing.JLabel();
        tfDataEvt = new javax.swing.JTextField();
        lbDataEvt = new javax.swing.JLabel();
        lbHoraEvt = new javax.swing.JLabel();
        tfHoraEvt = new javax.swing.JTextField();
        lbEspacoEvt = new javax.swing.JLabel();
        cbEspacoEvt = new javax.swing.JComboBox<>();
        lbRespEvt = new javax.swing.JLabel();
        tfRespEvt = new javax.swing.JTextField();
        lbFoneEvt = new javax.swing.JLabel();
        tfFoneEvt = new javax.swing.JTextField();
        lbPublioEvt = new javax.swing.JLabel();
        tfPublicoEvt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbTituloPg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbTituloCadastroEvt = new javax.swing.JLabel();
        btSalvarEvt = new javax.swing.JButton();
        btLimparEvt = new javax.swing.JButton();
        btExcluirEvt = new javax.swing.JButton();
        btBuscarEvt = new javax.swing.JButton();

        jTextField3.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        tfDescEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbDescEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDescEvt.setText("Descrição");

        tfDataEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbDataEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDataEvt.setText("Data");

        lbHoraEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraEvt.setText("Hora");

        tfHoraEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbEspacoEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEspacoEvt.setText("Espaço");

        cbEspacoEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEspacoEvt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbRespEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRespEvt.setText("Responsável");

        tfRespEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbFoneEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFoneEvt.setText("Fone");

        tfFoneEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbPublioEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPublioEvt.setText("Público Estimado");

        tfPublicoEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloPg.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbTituloPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/morais-16.png"))); // NOI18N
        lbTituloPg.setText(" Morais Library");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloPg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbTituloPg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
        );

        lbTituloCadastroEvt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTituloCadastroEvt.setText("Cadastro de Eventos");

        btSalvarEvt.setBackground(new java.awt.Color(50, 150, 0));
        btSalvarEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24.png"))); // NOI18N
        btSalvarEvt.setText("Salvar");

        btLimparEvt.setBackground(new java.awt.Color(255, 153, 51));
        btLimparEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh-24.png"))); // NOI18N
        btLimparEvt.setText("Limpar");

        btExcluirEvt.setBackground(new java.awt.Color(255, 0, 0));
        btExcluirEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24.png"))); // NOI18N
        btExcluirEvt.setText("Excluir");

        btBuscarEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/search-12-16.png"))); // NOI18N
        btBuscarEvt.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEvtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloCadastroEvt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDescEvt, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(lbDataEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfDataEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(lbHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfDescEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btBuscarEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRespEvt)
                                    .addComponent(lbEspacoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfRespEvt)
                                    .addComponent(cbEspacoEvt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(lbPublioEvt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPublicoEvt, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btSalvarEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTituloCadastroEvt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDescEvt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btBuscarEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDescEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDataEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDataEvt)
                        .addComponent(tfHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspacoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspacoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRespEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRespEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublioEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPublicoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarEvt)
                    .addComponent(btLimparEvt)
                    .addComponent(btExcluirEvt))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btBuscarEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEvtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarEvtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEvt;
    private javax.swing.JButton btExcluirEvt;
    private javax.swing.JButton btLimparEvt;
    private javax.swing.JButton btSalvarEvt;
    private javax.swing.JComboBox<String> cbEspacoEvt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbDataEvt;
    private javax.swing.JLabel lbDescEvt;
    private javax.swing.JLabel lbEspacoEvt;
    private javax.swing.JLabel lbFoneEvt;
    private javax.swing.JLabel lbHoraEvt;
    private javax.swing.JLabel lbPublioEvt;
    private javax.swing.JLabel lbRespEvt;
    private javax.swing.JLabel lbTituloCadastroEvt;
    private javax.swing.JLabel lbTituloPg;
    private javax.swing.JTextField tfDataEvt;
    private javax.swing.JTextField tfDescEvt;
    private javax.swing.JTextField tfFoneEvt;
    private javax.swing.JTextField tfHoraEvt;
    private javax.swing.JTextField tfPublicoEvt;
    private javax.swing.JTextField tfRespEvt;
    // End of variables declaration//GEN-END:variables
}
