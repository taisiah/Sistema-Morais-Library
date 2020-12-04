
package visao;

import controle.GerenciadorReservaEspaco;
import controle.GerenciadorUsuarios;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import modelo.Usuario;


public class Telalogin extends javax.swing.JFrame {

    /**
     * Creates new form Telalogin
     */
    public Telalogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LBLogin = new javax.swing.JLabel();
        TFlogin = new javax.swing.JTextField();
        LBSenha = new javax.swing.JLabel();
        TFsenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library - Login");
        setResizable(false);

        jTextField2.setText("jTextField1");

        LBLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBLogin.setText("Login:");

        TFlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFloginActionPerformed(evt);
            }
        });

        LBSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LBSenha.setText("Senha:");

        TFsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsenhaActionPerformed(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(50, 150, 0));
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("OK");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 22)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_morais_1.png"))); // NOI18N
        lbTitulo.setToolTipText("");
        lbTitulo.setMaximumSize(new java.awt.Dimension(200, 25));
        lbTitulo.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBLogin)
                    .addComponent(LBSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TFlogin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btEntrar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFloginActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
        String email_login = TFlogin.getText();
        String senha_login = TFsenha.getText();
        GerenciadorUsuarios grUsuario = GerenciadorUsuarios.getInstance() ;
        Usuario user = grUsuario.login(email_login, senha_login);
        
        if( user != null) {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            JOptionPane.showMessageDialog(null, "Login feito com sucesso");
            if (user instanceof Funcionario){
                telaPrincipal.setVisible(true);
            }
            else {
               telaPrincipal.setVisible(true);
            }
            this.setVisible(false);
        }
            
        else {
            JOptionPane.showMessageDialog(null, "Login ou senha inválido!");
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void TFsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        GerenciadorUsuarios grUsuario = GerenciadorUsuarios.getInstance() ;
        //Funcionario u_inicial = new Funcionario("bibliotecario","123", "Taisia", "rua teste","taisia@taisia.com", "111111111","03/11/1989","11111111111");
        //grUsuario.addUsuario(u_inicial);
        grUsuario.importInicio();
        GerenciadorReservaEspaco gre = GerenciadorReservaEspaco.getInstance();
        gre.importarReservasEspacosInicio();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telalogin().setVisible(true);
            }
        });
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLogin;
    private javax.swing.JLabel LBSenha;
    private javax.swing.JTextField TFlogin;
    private javax.swing.JPasswordField TFsenha;
    private javax.swing.JButton btEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
