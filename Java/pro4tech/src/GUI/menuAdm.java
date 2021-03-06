package GUI;

public class menuAdm extends javax.swing.JFrame {

    public menuAdm() {
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

        jPanel1 = new javax.swing.JPanel();
        botaoPerfil = new javax.swing.JButton();
        botaoProjetos = new javax.swing.JButton();
        botaoMensagens = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoMensagemIndividual = new javax.swing.JButton();
        botaoRelatório = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrador");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 451));

        botaoPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(255, 153, 51));
        botaoPerfil.setText("Perfil");
        botaoPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPerfil.setFocusPainted(false);
        botaoPerfil.setFocusable(false);
        botaoPerfil.setMaximumSize(new java.awt.Dimension(81, 17));
        botaoPerfil.setMinimumSize(new java.awt.Dimension(81, 17));
        botaoPerfil.setPreferredSize(new java.awt.Dimension(72, 26));
        botaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });

        botaoProjetos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoProjetos.setForeground(new java.awt.Color(255, 153, 51));
        botaoProjetos.setText("Projetos");
        botaoProjetos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoProjetos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoProjetos.setFocusPainted(false);
        botaoProjetos.setFocusable(false);
        botaoProjetos.setMaximumSize(new java.awt.Dimension(81, 17));
        botaoProjetos.setMinimumSize(new java.awt.Dimension(81, 17));
        botaoProjetos.setPreferredSize(new java.awt.Dimension(81, 17));
        botaoProjetos.setRequestFocusEnabled(false);
        botaoProjetos.setRolloverEnabled(false);
        botaoProjetos.setVerifyInputWhenFocusTarget(false);
        botaoProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProjetosActionPerformed(evt);
            }
        });

        botaoMensagens.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoMensagens.setForeground(new java.awt.Color(255, 153, 51));
        botaoMensagens.setText("Mensagens dos Projetos");
        botaoMensagens.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 203, 203), 1, true));
        botaoMensagens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoMensagens.setFocusPainted(false);
        botaoMensagens.setRequestFocusEnabled(false);
        botaoMensagens.setRolloverEnabled(false);
        botaoMensagens.setVerifyInputWhenFocusTarget(false);
        botaoMensagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagensActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoEsticada.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Usuários");
        jButton1.setPreferredSize(new java.awt.Dimension(280, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setMaximumSize(new java.awt.Dimension(40, 40));
        botaoSair.setMinimumSize(new java.awt.Dimension(40, 40));
        botaoSair.setPreferredSize(new java.awt.Dimension(50, 30));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoMensagemIndividual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoMensagemIndividual.setForeground(new java.awt.Color(255, 153, 51));
        botaoMensagemIndividual.setText("Mensagem Individual");
        botaoMensagemIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagemIndividualActionPerformed(evt);
            }
        });

        botaoRelatório.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoRelatório.setForeground(new java.awt.Color(255, 153, 51));
        botaoRelatório.setText("Relatório");
        botaoRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatórioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(botaoMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botaoMensagemIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMensagemIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerfilActionPerformed
        
        perfilUsuario perfil = new perfilUsuario();
        perfil.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoPerfilActionPerformed

    private void botaoProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProjetosActionPerformed
        
        telaProjetos projeto = new telaProjetos();
        projeto.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoProjetosActionPerformed

    private void botaoMensagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagensActionPerformed
       
        telaMensagemCliente mensagem = new telaMensagemCliente();
        mensagem.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoMensagensActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        telaDeUsuarios tela = new telaDeUsuarios();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        login sair = new login();
        sair.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatórioActionPerformed
        // TODO add your handling code here:

        telaRelatorio tela = new telaRelatorio();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoRelatórioActionPerformed

    private void botaoMensagemIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagemIndividualActionPerformed

        telaMensagemIndividual tela = new telaMensagemIndividual();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoMensagemIndividualActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMensagemIndividual;
    private javax.swing.JButton botaoMensagens;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoProjetos;
    private javax.swing.JButton botaoRelatório;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
