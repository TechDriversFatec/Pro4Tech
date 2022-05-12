/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Victoria
 */
public class menuSuporte extends javax.swing.JFrame {

    /**
     * Creates new form menuInicial
     */
    public menuSuporte() {
        initComponents();
        //cadastroUsuario.setVisible(false);
        //relatorios.setVisible(false);
        
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
        jPanel2 = new javax.swing.JPanel();
        botaoPerfil = new javax.swing.JButton();
        botaoMensagem = new javax.swing.JButton();
        botaoProjeto = new javax.swing.JButton();
        botaoCadastrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pro4tech");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        botaoPerfil.setBackground(new java.awt.Color(255, 153, 51));
        botaoPerfil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        botaoPerfil.setText("Perfil");
        botaoPerfil.setBorder(null);
        botaoPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPerfil.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                botaoPerfilComponentResized(evt);
            }
        });
        botaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });

        botaoMensagem.setBackground(new java.awt.Color(255, 153, 51));
        botaoMensagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoMensagem.setForeground(new java.awt.Color(255, 255, 255));
        botaoMensagem.setText("Mensagens ");
        botaoMensagem.setBorder(null);
        botaoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagemActionPerformed(evt);
            }
        });

        botaoProjeto.setBackground(new java.awt.Color(255, 153, 51));
        botaoProjeto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoProjeto.setForeground(new java.awt.Color(255, 255, 255));
        botaoProjeto.setText("Projetos");
        botaoProjeto.setBorder(null);
        botaoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProjetoActionPerformed(evt);
            }
        });

        botaoCadastrarCliente.setBackground(new java.awt.Color(255, 153, 51));
        botaoCadastrarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrarCliente.setText("Cadastrar Cliente");
        botaoCadastrarCliente.setBorder(null);
        botaoCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrarCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                botaoCadastrarClienteComponentResized(evt);
            }
        });
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPerfilActionPerformed
//        telaDadosUsuarios usuarios = new telaDadosUsuarios();
//        usuarios.setVisible(true);
//        dispose();
    }//GEN-LAST:event_botaoPerfilActionPerformed

    private void botaoMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagemActionPerformed
  
        telaMensagemSuporte inserir = new telaMensagemSuporte();
        inserir.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoMensagemActionPerformed

    private void botaoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProjetoActionPerformed
        
        telaProjetos projetos = new telaProjetos();
        projetos.setVisible(true);
        dispose();

    }//GEN-LAST:event_botaoProjetoActionPerformed

    private void botaoPerfilComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_botaoPerfilComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPerfilComponentResized

    private void botaoCadastrarClienteComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarClienteComponentResized

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed

        telaCadastroCliente cliente = new telaCadastroCliente();
        cliente.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed
    
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
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuSuporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoMensagem;
    private javax.swing.JButton botaoPerfil;
    private javax.swing.JButton botaoProjeto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
