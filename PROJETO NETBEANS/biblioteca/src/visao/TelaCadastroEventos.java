
package visao;

import javax.swing.JOptionPane;
import modelo.Evento;


public class TelaCadastroEventos extends javax.swing.JInternalFrame {
  
    public TelaCadastroEventos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfRespEvt = new javax.swing.JTextField();
        lbFoneEvt = new javax.swing.JLabel();
        lbPublioEvt = new javax.swing.JLabel();
        tfPublicoEvt = new javax.swing.JTextField();
        lbTituloCadastroEvt = new javax.swing.JLabel();
        btSalvarEvt = new javax.swing.JButton();
        btLimparEvt = new javax.swing.JButton();
        btExcluirEvt = new javax.swing.JButton();
        tfDescEvt = new javax.swing.JTextField();
        lbDescEvt = new javax.swing.JLabel();
        lbDataEvt = new javax.swing.JLabel();
        lbHoraEvt = new javax.swing.JLabel();
        lbEspacoEvt = new javax.swing.JLabel();
        btBuscarEvt = new javax.swing.JButton();
        lbRespEvt = new javax.swing.JLabel();
        tfDataEvt = new javax.swing.JFormattedTextField();
        tfHoraEvt = new javax.swing.JFormattedTextField();
        tfFoneEvt = new javax.swing.JFormattedTextField();
        tfLocalEvt = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setTitle("Morais Library - Eventos");

        tfRespEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbFoneEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFoneEvt.setText("Fone");

        lbPublioEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPublioEvt.setText("Público Estimado");

        tfPublicoEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbTituloCadastroEvt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTituloCadastroEvt.setText("Cadastro de Eventos");

        btSalvarEvt.setBackground(new java.awt.Color(50, 150, 0));
        btSalvarEvt.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24_1.png"))); // NOI18N
        btSalvarEvt.setText("Salvar");
        btSalvarEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEvtActionPerformed(evt);
            }
        });

        btLimparEvt.setBackground(new java.awt.Color(255, 153, 0));
        btLimparEvt.setForeground(new java.awt.Color(255, 255, 255));
        btLimparEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh-24_1.png"))); // NOI18N
        btLimparEvt.setText("Limpar");
        btLimparEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEvtActionPerformed(evt);
            }
        });

        btExcluirEvt.setBackground(new java.awt.Color(255, 0, 0));
        btExcluirEvt.setForeground(new java.awt.Color(255, 255, 255));
        btExcluirEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24_1.png"))); // NOI18N
        btExcluirEvt.setText("Excluir");

        tfDescEvt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbDescEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDescEvt.setText("Descrição");

        lbDataEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDataEvt.setText("Data");

        lbHoraEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraEvt.setText("Hora");

        lbEspacoEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEspacoEvt.setText("Espaço");

        btBuscarEvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscarEvt.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarEvtActionPerformed(evt);
            }
        });

        lbRespEvt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRespEvt.setText("Responsável");

        try {
            tfDataEvt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfHoraEvt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfFoneEvt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFoneEvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFoneEvtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloCadastroEvt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDescEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDataEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDescEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscarEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfDataEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(lbHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(btSalvarEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLimparEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btExcluirEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbRespEvt)
                                .addComponent(lbEspacoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfRespEvt)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tfFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(lbPublioEvt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfPublicoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfLocalEvt)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbTituloCadastroEvt)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDescEvt)
                    .addComponent(btBuscarEvt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDescEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDataEvt)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbHoraEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfHoraEvt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tfDataEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEspacoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLocalEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRespEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRespEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublioEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPublicoEvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFoneEvt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvarEvt)
                    .addComponent(btLimparEvt)
                    .addComponent(btExcluirEvt))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 542, 421);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarEvtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarEvtActionPerformed

    private void btSalvarEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarEvtActionPerformed

        Evento evento = new Evento();

        evento.setDescEvento(tfDescEvt.getText());
        evento.setData(tfDataEvt.getText());
        evento.setHora(tfHoraEvt.getText());
        evento.setLocal(tfLocalEvt.getText());
        evento.setPublico (tfPublicoEvt.getText());
        evento.setResponsavel(tfRespEvt.getText());
        evento.setFone(tfFoneEvt.getText());
           
        JOptionPane.showMessageDialog(null, evento.salvar());
           
        tfDescEvt.setText("");
        tfDataEvt.setText("");
        tfHoraEvt.setText("");
        tfLocalEvt.setText("");     
        tfPublicoEvt.setText("");  
        tfRespEvt.setText("");
        tfFoneEvt.setText("");
        tfDescEvt.requestFocus();
    }//GEN-LAST:event_btSalvarEvtActionPerformed

    private void tfFoneEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFoneEvtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFoneEvtActionPerformed

    private void btLimparEvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparEvtActionPerformed
        // TODO add your handling code here:
        tfDescEvt.setText("");
        tfDataEvt.setText("");
        tfHoraEvt.setText("");
        tfLocalEvt.setText("");     
        tfPublicoEvt.setText("");  
        tfRespEvt.setText("");
        tfFoneEvt.setText("");
        tfDescEvt.requestFocus();
    }//GEN-LAST:event_btLimparEvtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarEvt;
    private javax.swing.JButton btExcluirEvt;
    private javax.swing.JButton btLimparEvt;
    private javax.swing.JButton btSalvarEvt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDataEvt;
    private javax.swing.JLabel lbDescEvt;
    private javax.swing.JLabel lbEspacoEvt;
    private javax.swing.JLabel lbFoneEvt;
    private javax.swing.JLabel lbHoraEvt;
    private javax.swing.JLabel lbPublioEvt;
    private javax.swing.JLabel lbRespEvt;
    private javax.swing.JLabel lbTituloCadastroEvt;
    private javax.swing.JFormattedTextField tfDataEvt;
    private javax.swing.JTextField tfDescEvt;
    private javax.swing.JFormattedTextField tfFoneEvt;
    private javax.swing.JFormattedTextField tfHoraEvt;
    private javax.swing.JTextField tfLocalEvt;
    private javax.swing.JTextField tfPublicoEvt;
    private javax.swing.JTextField tfRespEvt;
    // End of variables declaration//GEN-END:variables
}
