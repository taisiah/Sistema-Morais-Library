package visao;


import controle.GerenciadorLivros;
import controle.GerenciadorMovimentaEstoque;
import controle.GerenciadorUsuarios;
import javax.swing.JOptionPane;
import modelo.Livro;
import modelo.MovimentaEstoque;
import modelo.Usuario;


public class TelaAlugaLivro extends javax.swing.JInternalFrame {

    public TelaAlugaLivro() {
        initComponents();
        GerenciadorUsuarios gr = GerenciadorUsuarios.getInstance();
        Usuario usuario = gr.getUsuarioLogado();
        tfEmailFavorecido.setText(usuario.getEmail());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbqtDisponivel = new javax.swing.JLabel();
        lbAluguelLivro = new javax.swing.JLabel();
        btAlugar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfTitulo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        lbAutor = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        btBuscarLivro = new javax.swing.JButton();
        tfAno = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        tfQtDisponivel = new javax.swing.JTextField();
        tfEmailFavorecido = new javax.swing.JTextField();
        lbFavorecido1 = new javax.swing.JLabel();
        lbFavorecido2 = new javax.swing.JLabel();
        tfDataAluguel = new javax.swing.JFormattedTextField();
        lbData = new javax.swing.JLabel();

        setClosable(true);

        lbqtDisponivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbqtDisponivel.setText("Qtde Disponível:");

        lbAluguelLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAluguelLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book-16.png"))); // NOI18N
        lbAluguelLivro.setText("Alugar livro");

        btAlugar.setBackground(new java.awt.Color(255, 153, 0));
        btAlugar.setForeground(new java.awt.Color(255, 255, 255));
        btAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/today-24.png"))); // NOI18N
        btAlugar.setText("Alugar");
        btAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlugarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(51, 102, 255));
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh-24_1.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tfTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTitulo.setText("Título:");

        tfAutor.setEditable(false);
        tfAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor.setText("Autor:");

        lbEditora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEditora.setText("Editora:");

        tfEditora.setEditable(false);
        tfEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAno.setText("Ano:");

        btBuscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscarLivro.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLivroActionPerformed(evt);
            }
        });

        tfAno.setEditable(false);
        tfAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbEdicao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEdicao.setText("Edição:");

        tfEdicao.setEditable(false);
        tfEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdicaoActionPerformed(evt);
            }
        });

        tfQtDisponivel.setEditable(false);

        tfEmailFavorecido.setEditable(false);
        tfEmailFavorecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailFavorecidoActionPerformed(evt);
            }
        });

        lbFavorecido1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFavorecido1.setText("(e-mail):");

        lbFavorecido2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFavorecido2.setText("Usuário");

        try {
            tfDataAluguel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbData.setText("Data da Aluguel:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAluguelLivro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbFavorecido1)
                            .addComponent(lbFavorecido2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfEmailFavorecido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbqtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfQtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbData)
                                .addGap(18, 18, 18)
                                .addComponent(tfDataAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfEditora)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfAno)
                            .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlugar)
                .addGap(37, 37, 37)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAluguelLivro)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfEmailFavorecido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbFavorecido2)
                        .addGap(3, 3, 3)
                        .addComponent(lbFavorecido1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTitulo)
                    .addComponent(btBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbqtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQtDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDataAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbData))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAno, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(tfEditora)
                            .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btAlugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlugarActionPerformed
        // TODO add your handling code here:

        //String emailFav = tfEmailFavorecido.getText();
        String emailFav = "teste@mail.com";
        GerenciadorUsuarios gerenciadorUsu = GerenciadorUsuarios.getInstance();
        Usuario favorecido = gerenciadorUsu.buscarUsuario(emailFav);
        
        String titLivro = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        String aluga = gerenciadorLiv.alugarLivro(titLivro);

        if (aluga.equals("Aluguel efetuado com sucesso!")){
            String data = tfDataAluguel.getText();
            GerenciadorMovimentaEstoque gerenciadorMov = GerenciadorMovimentaEstoque.getInstance();
            MovimentaEstoque movimentacao = new MovimentaEstoque(emailFav,data,titLivro,"Aluguel");
            gerenciadorMov.adicionarMovimentacao(movimentacao);
        }
        

        JOptionPane.showMessageDialog(null,aluga);

        tfEmailFavorecido.setText("");
        tfTitulo.setText("");
        tfEditora.setText("");
        tfAno.setText("");
        tfAutor.setText("");
        tfEdicao.setText("");
        tfQtDisponivel.setText("");
        tfDataAluguel.setText("");
        tfTitulo.requestFocus();

    }//GEN-LAST:event_btAlugarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        tfEmailFavorecido.setText("");
        tfTitulo.setText("");
        tfEditora.setText("");
        tfAno.setText("");
        tfAutor.setText("");
        tfEdicao.setText("");
        tfQtDisponivel.setText("");
        tfDataAluguel.setText("");
        tfTitulo.requestFocus();

    }//GEN-LAST:event_btLimparActionPerformed

    private void btBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLivroActionPerformed
        // TODO add your handling code here:
        String titulo = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        Livro liv = gerenciadorLiv.buscarLivro(titulo);

        if (liv == null){
            JOptionPane.showMessageDialog(null,"Livro não encontrado!");

        } else{
            int qtDisponivel = 0;
            int qtE = liv.getQtEstoque();
            int qtA = liv.getQtAlugada();
            int qtR = liv.getQtReservada();
            qtDisponivel = qtE + qtA + qtR - (qtA + qtR) ;

            tfTitulo.setText(liv.getTitulo());
            tfAutor.setText(liv.getAutor());
            tfEditora.setText(liv.getEditora());
            tfAno.setText(Integer.toString(liv.getAno()));
            tfEdicao.setText(Integer.toString(liv.getEdicao()));
            tfQtDisponivel.setText(Integer.toString(qtDisponivel));
        }
    }//GEN-LAST:event_btBuscarLivroActionPerformed

    private void tfEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdicaoActionPerformed

    private void tfEmailFavorecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailFavorecidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailFavorecidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlugar;
    private javax.swing.JButton btBuscarLivro;
    private javax.swing.JButton btLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAluguelLivro;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbFavorecido1;
    private javax.swing.JLabel lbFavorecido2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbqtDisponivel;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JFormattedTextField tfDataAluguel;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfEmailFavorecido;
    private javax.swing.JTextField tfQtDisponivel;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}