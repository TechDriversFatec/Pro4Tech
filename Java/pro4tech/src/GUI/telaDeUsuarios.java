/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.UsuarioDAO;
import modelo.*;
import Principal.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author icaro
 */
public class telaDeUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form telaDeUsuarios
     */
    public telaDeUsuarios() {
        initComponents();
        carregaUsuarios();
        usuarioId.setText("0");
        usuarioId.setVisible(false);

        labelNome.setVisible(false);
        labelEmail.setVisible(false);
        labelEmpresa.setVisible(false);
        labelFuncao.setVisible(false);
        labelTelefone.setVisible(false);
        labelLogin.setVisible(false);
        labelSenha.setVisible(false);
        labelPerfil.setVisible(false);

        campoNome.setVisible(false);
        campoEmail.setVisible(false);
        campoEmpresa.setVisible(false);
        campoFuncao.setVisible(false);
        campoTelefone.setVisible(false);
        campoLogin.setVisible(false);
        campoSenha.setVisible(false);
        caixaPerfil.setVisible(false);

        labelSelecione.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        botaoVoltar = new javax.swing.JButton();
        botaoExcluirUsuario = new javax.swing.JButton();
        botaoEditarUsuario = new javax.swing.JButton();
        usuarioId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        labelSelecione = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoNovoFuncionario = new javax.swing.JButton();
        botaoNovoCliente = new javax.swing.JButton();
        labelEmpresa = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        caixaPerfil = new javax.swing.JComboBox<>();
        labelPerfil = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        campoFuncao = new javax.swing.JTextField();
        campoEmpresa = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaUsuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Nome", "Função", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);
        if (tabelaUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelaUsuarios.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 314, 313));

        botaoVoltar.setBackground(new java.awt.Color(102, 102, 102));
        botaoVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        botaoExcluirUsuario.setBackground(new java.awt.Color(255, 153, 51));
        botaoExcluirUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoExcluirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirUsuario.setText("Excluir Usuário");
        botaoExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 160, 30));

        botaoEditarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoEditarUsuario.setForeground(new java.awt.Color(255, 153, 51));
        botaoEditarUsuario.setText("Salvar Alterações");
        botaoEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 160, 30));

        usuarioId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioIdActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 37, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Usuários");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 794, -1));

        labelSelecione.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelSelecione.setForeground(new java.awt.Color(255, 153, 51));
        labelSelecione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSelecione.setText("Selecione um usuário");
        getContentPane().add(labelSelecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 410, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(812, 463));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        botaoNovoFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoNovoFuncionario.setForeground(new java.awt.Color(255, 153, 51));
        botaoNovoFuncionario.setText("+ Funcionário");
        botaoNovoFuncionario.setMaximumSize(new java.awt.Dimension(92, 23));
        botaoNovoFuncionario.setMinimumSize(new java.awt.Dimension(92, 23));
        botaoNovoFuncionario.setPreferredSize(new java.awt.Dimension(250, 30));
        botaoNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoFuncionarioActionPerformed(evt);
            }
        });

        botaoNovoCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoNovoCliente.setForeground(new java.awt.Color(255, 153, 51));
        botaoNovoCliente.setText("+ Cliente");
        botaoNovoCliente.setPreferredSize(new java.awt.Dimension(250, 30));
        botaoNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoClienteActionPerformed(evt);
            }
        });

        labelEmpresa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmpresa.setText("Empresa:");

        labelFuncao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelFuncao.setText("Funçao:");

        labelTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTelefone.setText("Telefone:");

        campoLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        labelLogin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelLogin.setText("Login:");

        labelSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelSenha.setText("Senha:");

        campoSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        caixaPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        caixaPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Suporte", "Administrador" }));
        caixaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaPerfilActionPerformed(evt);
            }
        });

        labelPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPerfil.setText("Perfil:");

        labelEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEmail.setText("Email:");

        labelNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNome.setText("Nome:");

        campoTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        campoFuncao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFuncaoActionPerformed(evt);
            }
        });

        campoEmpresa.setFont(campoEmpresa.getFont().deriveFont((campoEmpresa.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, 14));

        campoEmail.setFont(campoEmail.getFont().deriveFont((campoEmail.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, 14));

        campoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(botaoNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(406, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogin)
                    .addComponent(labelTelefone)
                    .addComponent(labelFuncao)
                    .addComponent(labelEmpresa)
                    .addComponent(labelEmail)
                    .addComponent(labelNome)
                    .addComponent(labelSenha)
                    .addComponent(labelPerfil))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(campoNome)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoFuncao)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(campoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelFuncao))
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelTelefone))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelLogin)))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelSenha)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caixaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPerfil)))
                .addGap(147, 147, 147))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        
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
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoFuncionarioActionPerformed
       
        telaCadastroAdministrador funcionario = new telaCadastroAdministrador();
        funcionario.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoNovoFuncionarioActionPerformed
    
    private void botaoEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarUsuarioActionPerformed
        
        Usuario usuario;
        UsuarioDAO dao = new UsuarioDAO();
        int index = tabelaUsuarios.getSelectedRow();

        usuario = dao.ListarUsuarios().get(index);
        
        usuario.setNomeUsuario(campoNome.getText());
        usuario.setEmpresaUsuario(campoEmpresa.getText());
        usuario.setFuncaoUsuario(campoFuncao.getText());
        usuario.setTelefoneUsuario(campoTelefone.getText());
        usuario.setEmailUsuario(campoEmail.getText());
        usuario.setPerfilUsuario(caixaPerfil.getSelectedIndex());
        usuario.setSenha(campoSenha.getText());
        usuario.setLoginUsuario(campoLogin.getText());


        System.out.println(usuario.getPerfilUsuario());
        dao.editarUsuario(usuario);
        carregaUsuarios();
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                        
    }//GEN-LAST:event_botaoEditarUsuarioActionPerformed

    private void usuarioIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioIdActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        selecionaUsuario();
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void caixaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaPerfilActionPerformed

    private void botaoNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoClienteActionPerformed

        telaCadastroCliente tela = new telaCadastroCliente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoNovoClienteActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        //carregaUsuarios();
    }//GEN-LAST:event_jPanel1MouseEntered

    private void botaoExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirUsuarioActionPerformed

        Usuario usuario;
        UsuarioDAO dao = new UsuarioDAO();

        int index = tabelaUsuarios.getSelectedRow();

        usuario = dao.ListarUsuarios().get(index);

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir usuário selecionado?", "Confirmação",
            JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            dao.excluirUsuario(usuario);
            carregaUsuarios();

            labelNome.setVisible(false);
            labelEmail.setVisible(false);
            labelEmpresa.setVisible(false);
            labelFuncao.setVisible(false);
            labelTelefone.setVisible(false);
            labelLogin.setVisible(false);
            labelSenha.setVisible(false);
            labelPerfil.setVisible(false);

            campoNome.setVisible(false);
            campoEmail.setVisible(false);
            campoEmpresa.setVisible(false);
            campoFuncao.setVisible(false);
            campoTelefone.setVisible(false);
            campoLogin.setVisible(false);
            campoSenha.setVisible(false);
            caixaPerfil.setVisible(false);

            labelSelecione.setVisible(true);
        }
    }//GEN-LAST:event_botaoExcluirUsuarioActionPerformed

    private void campoFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFuncaoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    
    private void selecionaUsuario() {

        Usuario usuario;
        UsuarioDAO dao = new UsuarioDAO();
        int index = tabelaUsuarios.getSelectedRow();

        usuario = dao.ListarUsuarios().get(index);

        usuarioId.setText(String.valueOf(usuario.getUsuarioId()));

        labelNome.setVisible(true);
        labelEmail.setVisible(true);
        labelEmpresa.setVisible(true);
        labelFuncao.setVisible(true);
        labelTelefone.setVisible(true);
        labelLogin.setVisible(true);
        labelSenha.setVisible(true);
        labelPerfil.setVisible(true);
        
        campoNome.setVisible(true);
        campoEmail.setVisible(true);
        campoEmpresa.setVisible(true);
        campoFuncao.setVisible(true);
        campoTelefone.setVisible(true);
        campoLogin.setVisible(true);
        campoSenha.setVisible(true);
        caixaPerfil.setVisible(true);

        labelSelecione.setVisible(false);

        campoNome.setText(usuario.getNomeUsuario());
        campoEmail.setText(usuario.getEmailUsuario());
        campoEmpresa.setText(usuario.getEmpresaUsuario());
        campoFuncao.setText(usuario.getFuncaoUsuario());
        campoTelefone.setText(usuario.getTelefoneUsuario());
        campoLogin.setText(usuario.getLoginUsuario());
        campoSenha.setText(usuario.getSenha());
        caixaPerfil.setSelectedIndex(usuario.getPerfilUsuario());

    }
    
     public void carregaUsuarios() {
        String sql = "SELECT usuarioId, nomeUsuario, funcaoUsuario, empresaUsuario FROM usuario;";
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuarios.getModel();
        modelo.setNumRows(0);

        try(PreparedStatement stmt = Principal.conexao.prepareStatement(sql)) {
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                
                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela " + erro);
        }
    }
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
            java.util.logging.Logger.getLogger(telaDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarUsuario;
    private javax.swing.JButton botaoExcluirUsuario;
    private javax.swing.JButton botaoNovoCliente;
    private javax.swing.JButton botaoNovoFuncionario;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> caixaPerfil;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEmpresa;
    private javax.swing.JTextField campoFuncao;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEmpresa;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPerfil;
    private javax.swing.JLabel labelSelecione;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField usuarioId;
    // End of variables declaration//GEN-END:variables
}
