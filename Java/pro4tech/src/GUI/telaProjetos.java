package GUI;

import DAO.ProjetoDAO;
import Principal.*;
import modelo.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class telaProjetos extends javax.swing.JFrame {
   
    public telaProjetos() {
        initComponents();
        
        codProjeto.setVisible(false);
        
       
        carregaTabela();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProjeto = new javax.swing.JTable();
        campoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnNovoProj = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        codProjeto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoProjeto = new javax.swing.JTextField();
        campoEmpresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projetos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 451));

        tabelaProjeto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "Nome do Projeto", "Nome da Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProjeto.setSelectionBackground(new java.awt.Color(255, 204, 153));
        tabelaProjeto.getTableHeader().setReorderingAllowed(false);
        tabelaProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProjetoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProjeto);
        if (tabelaProjeto.getColumnModel().getColumnCount() > 0) {
            tabelaProjeto.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaProjeto.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaProjeto.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaProjeto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProjeto.getColumnModel().getColumn(2).setResizable(false);
        }

        campoPesquisa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)));
        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnNovoProj.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNovoProj.setForeground(new java.awt.Color(255, 153, 51));
        btnNovoProj.setText(" + Projeto");
        btnNovoProj.setPreferredSize(new java.awt.Dimension(150, 30));
        btnNovoProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProjActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 153, 51));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar Projeto");
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 153, 51));
        btnExcluir.setText("Excluir Projeto");
        btnExcluir.setPreferredSize(new java.awt.Dimension(150, 30));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        codProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProjetoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Projeto");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Nome da Empresa");

        campoProjeto.setMinimumSize(new java.awt.Dimension(64, 30));
        campoProjeto.setPreferredSize(new java.awt.Dimension(64, 25));
        campoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProjetoActionPerformed(evt);
            }
        });

        campoEmpresa.setMinimumSize(new java.awt.Dimension(64, 30));
        campoEmpresa.setPreferredSize(new java.awt.Dimension(64, 25));
        campoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovoProj, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(campoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnNovoProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
    
        DefaultTableModel table = (DefaultTableModel)tabelaProjeto.getModel();
        
        String busca = campoPesquisa.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        
        tabelaProjeto.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(busca));
        
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(Principal.usuarioLogado.getPerfilUsuario() == FuncaoUsuario.CLIENTE.getId()){
            new menuCliente().setVisible(true);
        }
        if(Principal.usuarioLogado.getPerfilUsuario() == FuncaoUsuario.SUPORTE.getId()){
            new menuSuporte().setVisible(true);
        }
        if(Principal.usuarioLogado.getPerfilUsuario() == FuncaoUsuario.ADMINISTRADOR.getId()){
            new menuAdm().setVisible(true);
        }
        
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNovoProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjActionPerformed
        
        telaCadastroProjeto cadastro = new telaCadastroProjeto();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoProjActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Projeto projeto;
        ProjetoDAO dao = new ProjetoDAO();
        
        int index = tabelaProjeto.getSelectedRow();
        
        projeto = dao.ListarProjetos().get(index);
        
        projeto.setNomeProjeto(campoProjeto.getText());
        projeto.setEmpresaProjeto(campoEmpresa.getText());
        
        dao.editar(projeto);
        carregaTabela();
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void codProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProjetoActionPerformed

    private void tabelaProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProjetoMouseClicked
        
        Projeto projeto;
                
        int index = tabelaProjeto.getSelectedRow();
        
        projeto = Principal.daoProjeto.ListarProjetos().get(index);
        
        campoProjeto.setText(projeto.getNomeProjeto());
        campoEmpresa.setText(projeto.getEmpresaProjeto());
        codProjeto.setText(String.valueOf(projeto.getCodProjeto()));
    }//GEN-LAST:event_tabelaProjetoMouseClicked

    private void campoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProjetoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Projeto projeto;
        ProjetoDAO dao = new ProjetoDAO();
        
        int index = tabelaProjeto.getSelectedRow();
        projeto = dao.ListarProjetos().get(index);
        
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir projeto selecionado?", "Confirmação",
            JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            
            dao.excluirProjeto(projeto);
            carregaTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void campoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmpresaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void carregaTabela() {
        String sqlTabela = "SELECT * FROM projeto;";
        DefaultTableModel modelo = (DefaultTableModel) tabelaProjeto.getModel();
        modelo.setNumRows(0);

        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sqlTabela)) {
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela " + erro);
        }
    }
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
            java.util.logging.Logger.getLogger(telaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProjetos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProjetos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoProj;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoEmpresa;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoProjeto;
    private javax.swing.JTextField codProjeto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProjeto;
    // End of variables declaration//GEN-END:variables
}
