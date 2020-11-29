
package visao;

import controle.GerenciadorEventos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuUsuCadastro = new javax.swing.JMenuItem();
        menuUsuImportar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuLivCadastro = new javax.swing.JMenuItem();
        menuLivFicha = new javax.swing.JMenuItem();
        menuSolicitarFicha = new javax.swing.JMenuItem();
        menuReservaLivro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuEvtCadastro = new javax.swing.JMenuItem();
        menuEvtImportar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuEspCadastro = new javax.swing.JMenuItem();
        menuEspReserva = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuRelAgenda = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morais Library - Principal");
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user-16.png"))); // NOI18N
        jMenu1.setText("Usuarios");

        menuUsuCadastro.setText("Cadastro");
        menuUsuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(menuUsuCadastro);

        menuUsuImportar.setText("Importar Usuário");
        jMenu1.add(menuUsuImportar);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book-16.png"))); // NOI18N
        jMenu4.setText("Livros");

        menuLivCadastro.setText("Cadastro de Livro");
        menuLivCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivCadastroActionPerformed(evt);
            }
        });
        jMenu4.add(menuLivCadastro);

        menuLivFicha.setText("Ficha Catalográfica");
        menuLivFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivFichaActionPerformed(evt);
            }
        });
        jMenu4.add(menuLivFicha);

        menuSolicitarFicha.setText("Solicitar Ficha Catalográfica");
        menuSolicitarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSolicitarFichaActionPerformed(evt);
            }
        });
        jMenu4.add(menuSolicitarFicha);

        menuReservaLivro.setText("Reservar Livro");
        menuReservaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservaLivroActionPerformed(evt);
            }
        });
        jMenu4.add(menuReservaLivro);

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/today-16.png"))); // NOI18N
        jMenu2.setText("Eventos");

        menuEvtCadastro.setText("Cadastro");
        menuEvtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEvtCadastroActionPerformed(evt);
            }
        });
        jMenu2.add(menuEvtCadastro);

        menuEvtImportar.setText("Importar Eventos");
        menuEvtImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEvtImportarActionPerformed(evt);
            }
        });
        jMenu2.add(menuEvtImportar);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map-marker-2-16.png"))); // NOI18N
        jMenu3.setText("Espaços");

        menuEspCadastro.setText("Cadastro");
        menuEspCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspCadastroActionPerformed(evt);
            }
        });
        jMenu3.add(menuEspCadastro);

        menuEspReserva.setText("Reserva Espaço");
        jMenu3.add(menuEspReserva);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer-16.png"))); // NOI18N
        jMenu5.setText("Relatórios");

        menuRelAgenda.setText("Agenda de Eventos");
        menuRelAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelAgendaActionPerformed(evt);
            }
        });
        jMenu5.add(menuRelAgenda);

        jMenuBar1.add(jMenu5);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/info-5-16.png"))); // NOI18N
        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuCadastroActionPerformed
        // TODO add your handling code here:
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_menuUsuCadastroActionPerformed

    private void menuEspCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspCadastroActionPerformed
        // TODO add your handling code here:
        TelaCadastroEspacos tlCadEsp = new TelaCadastroEspacos();
        painelPrincipal.add(tlCadEsp);
        tlCadEsp.setVisible(true);
    }//GEN-LAST:event_menuEspCadastroActionPerformed

    private void menuEvtImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEvtImportarActionPerformed
        // TODO add your handling code here:
        TelaImporteEventos tlImpEventos = new TelaImporteEventos();
        painelPrincipal.add(tlImpEventos);
        tlImpEventos.setVisible(true);
        
    }//GEN-LAST:event_menuEvtImportarActionPerformed

    private void menuRelAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelAgendaActionPerformed
        GerenciadorEventos gerenciadorEvt = GerenciadorEventos.getInstance();
        try {
            JOptionPane.showMessageDialog(null, gerenciadorEvt.relatorioEventos());

        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelAgendaActionPerformed

    private void menuEvtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEvtCadastroActionPerformed
        // TODO add your handling code here:
        
        TelaCadastroEventos tlCadEventos = new TelaCadastroEventos();
        painelPrincipal.add(tlCadEventos);
        tlCadEventos.setVisible(true);
        
        
        
    }//GEN-LAST:event_menuEvtCadastroActionPerformed

    private void menuLivCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivCadastroActionPerformed
        // TODO add your handling code here:
        TelaCadastroLivro tlCadLivros = new TelaCadastroLivro();
        painelPrincipal.add(tlCadLivros);
        tlCadLivros.setVisible(true);
        
    }//GEN-LAST:event_menuLivCadastroActionPerformed

    private void menuLivFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivFichaActionPerformed
        // TODO add your handling code here:
        TelaFicha tlFicha = new TelaFicha();
        painelPrincipal.add(tlFicha);
        tlFicha.setVisible(true);
        
        
    }//GEN-LAST:event_menuLivFichaActionPerformed

    private void menuSolicitarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSolicitarFichaActionPerformed
        // TODO add your handling code here:
        TelaSolicitaFicha tlSolFicha = new TelaSolicitaFicha();
        painelPrincipal.add(tlSolFicha);
        tlSolFicha.setVisible(true);
        
    }//GEN-LAST:event_menuSolicitarFichaActionPerformed

    private void menuReservaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservaLivroActionPerformed
        // TODO add your handling code here:
        TelaReservaLivro tlResLivro = new TelaReservaLivro();
        painelPrincipal.add(tlResLivro);
        tlResLivro.setVisible(true);
    }//GEN-LAST:event_menuReservaLivroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    private TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuEspCadastro;
    private javax.swing.JMenuItem menuEspReserva;
    private javax.swing.JMenuItem menuEvtCadastro;
    private javax.swing.JMenuItem menuEvtImportar;
    private javax.swing.JMenuItem menuLivCadastro;
    private javax.swing.JMenuItem menuLivFicha;
    private javax.swing.JMenuItem menuRelAgenda;
    private javax.swing.JMenuItem menuReservaLivro;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuSolicitarFicha;
    private javax.swing.JMenuItem menuUsuCadastro;
    private javax.swing.JMenuItem menuUsuImportar;
    private javax.swing.JDesktopPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
