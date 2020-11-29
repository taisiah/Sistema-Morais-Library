package visao;

import controle.GerenciadorLivros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Livro;



public class TelaCadastroLivro extends javax.swing.JInternalFrame {


    public TelaCadastroLivro() {
        initComponents();
        
        this.cbxCategoria.removeAllItems();
        this.cbxTematica.removeAllItems();
        this.cbxCategoria.addItem("...");
        this.cbxTematica.addItem("...");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAutor2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbRetirada = new javax.swing.JLabel();
        lbAluguelLivro = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        tfTitulo = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        btBuscarLivro = new javax.swing.JButton();
        tfAno = new javax.swing.JTextField();
        lbEdicao = new javax.swing.JLabel();
        tfEdicao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbAutor = new javax.swing.JLabel();
        tfSnAutor = new javax.swing.JTextField();
        lbAutor3 = new javax.swing.JLabel();
        tfPnAutor = new javax.swing.JTextField();
        ckbDisponivel = new javax.swing.JCheckBox();
        btExcluir1 = new javax.swing.JButton();
        lbIsbn = new javax.swing.JLabel();
        tfIsbn = new javax.swing.JTextField();
        lbEditora1 = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        tfEditora = new javax.swing.JTextField();
        tfUF = new javax.swing.JTextField();
        lbRetirada1 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxTematica = new javax.swing.JComboBox<>();

        lbAutor2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor2.setText("Sobrenome:");

        setBorder(null);
        setClosable(true);

        lbRetirada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada.setText("Categoria:");

        lbAluguelLivro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAluguelLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book-16.png"))); // NOI18N
        lbAluguelLivro.setText("Cadastrar Publicação");

        btSalvar.setBackground(new java.awt.Color(50, 150, 0));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-24_1.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 153, 0));
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

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCidade.setText("Cidade:");

        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAno.setText("Ano:");

        btBuscarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-12-16_1.png"))); // NOI18N
        btBuscarLivro.setPreferredSize(new java.awt.Dimension(23, 23));
        btBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarLivroActionPerformed(evt);
            }
        });

        tfAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbEdicao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEdicao.setText("Edição:");

        tfEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEdicaoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Autor"));

        lbAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor.setText("Sobrenome:");

        tfSnAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAutor3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor3.setText("Primeiro nome:");

        tfPnAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbAutor3)
                .addGap(18, 18, 18)
                .addComponent(tfPnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ckbDisponivel.setText("Disponível para locação");
        ckbDisponivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbDisponivelActionPerformed(evt);
            }
        });

        btExcluir1.setBackground(new java.awt.Color(255, 0, 51));
        btExcluir1.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-24_1.png"))); // NOI18N
        btExcluir1.setText("Excluir");
        btExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir1ActionPerformed(evt);
            }
        });

        lbIsbn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbIsbn.setText("ISBN:");

        tfIsbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIsbnActionPerformed(evt);
            }
        });

        lbEditora1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEditora1.setText("Editora:");

        lbUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUF.setText("UF:");

        tfEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbRetirada1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRetirada1.setText("Temática:");

        cbxCategoria.setAutoscrolls(true);
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        cbxTematica.setAutoscrolls(true);
        cbxTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTematicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAluguelLivro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbRetirada1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbUF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(ckbDisponivel)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAluguelLivro)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTitulo)
                            .addComponent(btBuscarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEditora1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRetirada1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbDisponivel)
                            .addComponent(lbEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false);    
        tfTitulo.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEdicaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        
        String titulo = tfTitulo.getText();
        if(titulo.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar título da publicação");
            return;
        }
        
        String snautor = tfSnAutor.getText().toUpperCase();
        if(snautor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar sobrenome do autor");
            return;
        }
        
        String pnautor = tfPnAutor.getText();
        if(pnautor.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar primeiro nome do autor");
            return;
        }
        
        String editora = tfEditora.getText();
        if(editora.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar Editora");
            return;
        }
        
        String cidade = tfCidade.getText();
        if(cidade.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar Cidade");
            return;
        }
        
        String uf = tfUF.getText().toUpperCase();
        if(uf.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar UF");
            return;
        }
        
        String categoria = cbxCategoria.getSelectedItem().toString();
        if(categoria.equals("...")) {
            JOptionPane.showMessageDialog(null,"Escolher categoria");
            return;
        }
        
        String tematica = cbxTematica.getSelectedItem().toString();
        if(tematica.equals("...")) {
            JOptionPane.showMessageDialog(null,"Escolher temática");
            return;
        }
        
        String isbn = tfIsbn.getText();
        if(isbn.length() == 0) {
            JOptionPane.showMessageDialog(null,"Digitar ISBN");
            return;
        }
        
        int edicao = Integer.parseInt(tfEdicao.getText());
        if(edicao == 0) {
            JOptionPane.showMessageDialog(null,"Digitar edição  da publicação");
            return;
        }
        
        int ano = Integer.parseInt(tfAno.getText());
        if(ano == 0) {
            JOptionPane.showMessageDialog(null,"Digitar ano da publicação");
            return;
        }
        
        boolean disponivel = ckbDisponivel.isSelected();
                
        Livro livro = new Livro(titulo,snautor+","+pnautor,editora,cidade,uf,ano,edicao,isbn,categoria,tematica, disponivel);
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        JOptionPane.showMessageDialog(null,gerenciadorLiv.adicionarLivro(livro));
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false);   
        tfTitulo.requestFocus();
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void ckbDisponivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbDisponivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbDisponivelActionPerformed

    private void btBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarLivroActionPerformed
        // TODO add your handling code here:]
        
        String titulo = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        Livro liv = gerenciadorLiv.buscarLivro(titulo);      

        if (liv == null){
            JOptionPane.showMessageDialog(null,"Livro não encontrado!");
            
        } else{
            
            tfTitulo.setText(liv.getTitulo());        
            String[] nomes = liv.getAutor().split(",");
            tfSnAutor.setText(nomes[0]);
            tfPnAutor.setText(nomes[1]);
            tfEditora.setText(liv.getEditora());
            tfCidade.setText(liv.getCidade());
            tfUF.setText(liv.getUf());           
            tfAno.setText(Integer.toString(liv.getAno()));     
            tfEdicao.setText(Integer.toString(liv.getEdicao()));
            tfIsbn.setText(liv.getIsbn());
            cbxCategoria.setSelectedItem(liv.getCategoria());
            cbxTematica.setSelectedItem(liv.getTematica());
            ckbDisponivel.setSelected(liv.isDisponivel());
            
        }  
                
    }//GEN-LAST:event_btBuscarLivroActionPerformed

    private void btExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir1ActionPerformed
        // TODO add your handling code here:
        String titLivro = tfTitulo.getText();
        GerenciadorLivros gerenciadorLiv = GerenciadorLivros.getInstance();
        boolean tituloRemover= gerenciadorLiv.removerLivro(titLivro);
        if ( tituloRemover==false){
            JOptionPane.showMessageDialog(null,"Publicação não encontrado!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Publicação removida com sucesso!");
        }
        
        tfTitulo.setText("");
        tfSnAutor.setText("");
        tfPnAutor.setText("");
        tfEditora.setText("");
        tfCidade.setText("");
        tfUF.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfIsbn.setText("");
        cbxCategoria.setSelectedItem("...");
        cbxTematica.setSelectedItem("...");
        ckbDisponivel.setSelected(false);   
        tfTitulo.requestFocus();
        
        
    }//GEN-LAST:event_btExcluir1ActionPerformed

    private void tfIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIsbnActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
  
        FileReader acessaArq;
        try {
            acessaArq = new FileReader("categorias.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            while (linha != null){
                this.cbxCategoria.addItem(linha);
                linha = leiaArq.readLine();
            }
    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTematicaActionPerformed
        // TODO add your handling code here:
        FileReader acessaArq;
        try {
            acessaArq = new FileReader("tematicas.txt");
            BufferedReader leiaArq = new BufferedReader(acessaArq);
            String linha = leiaArq.readLine();
            while (linha != null){
                this.cbxTematica.addItem(linha);
                linha = leiaArq.readLine();
            }
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxTematicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarLivro;
    private javax.swing.JButton btExcluir1;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxTematica;
    private javax.swing.JCheckBox ckbDisponivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAluguelLivro;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbAutor2;
    private javax.swing.JLabel lbAutor3;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbEdicao;
    private javax.swing.JLabel lbEditora1;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JLabel lbRetirada;
    private javax.swing.JLabel lbRetirada1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfIsbn;
    private javax.swing.JTextField tfPnAutor;
    private javax.swing.JTextField tfSnAutor;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables
}
