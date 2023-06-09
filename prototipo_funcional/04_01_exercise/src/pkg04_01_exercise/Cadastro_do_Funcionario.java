package pkg04_01_exercise;



import pkg04_01_exercise.Cadastro_do_Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Cadastro_do_Funcionario extends javax.swing.JFrame {

    private PreparedStatement statement;

    /**
     * Creates new form Cadastro_Funcionario
     */
    public Cadastro_do_Funcionario() {
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

        name_user = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bt_Voltar_Para_Login = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name_user1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date_user = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cpf_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        name_user5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Combo_Sexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        email_user = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Combo_estado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cep_user = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estado_user = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bairro_user = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        num_user = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        telefone_user = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        Bt_Salvar_CadastroFuncionario = new javax.swing.JButton();
        export = new javax.swing.JButton();
        Bt_Entrar_Funcionario = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        name_user2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        senha_funcionario = new javax.swing.JPasswordField();

        name_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_userActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                Open(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 237, 248));
        jLabel1.setText("CADASTRO DO FUNCIONÁRIO");

        Bt_Voltar_Para_Login.setBackground(new java.awt.Color(17, 69, 139));
        Bt_Voltar_Para_Login.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Bt_Voltar_Para_Login.setForeground(new java.awt.Color(255, 255, 255));
        Bt_Voltar_Para_Login.setText("<");
        Bt_Voltar_Para_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Voltar_Para_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Bt_Voltar_Para_Login)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_Voltar_Para_Login)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Nome");

        name_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_user1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Data Nascimento");

        date_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        date_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_userActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("CPF");

        cpf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpf_userActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("RG");

        name_user5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_user5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Sexo");

        Combo_Sexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Combo_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Masculino", "Feminino" }));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("E-mail");

        email_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_userActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Estado Civil");

        Combo_estado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Solteiro(a)", "Casado(a)" }));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("CEP");

        cep_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_userActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Estado");

        estado_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_userActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("Rua / Bairro");

        bairro_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairro_userActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel13.setText("N°");

        num_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_userActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel14.setText("Telefone");

        telefone_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_userActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        Bt_Salvar_CadastroFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Bt_Salvar_CadastroFuncionario.setText("Salvar");
        Bt_Salvar_CadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Salvar_CadastroFuncionarioActionPerformed(evt);
            }
        });

        export.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        export.setText("Export");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        Bt_Entrar_Funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Bt_Entrar_Funcionario.setText("Entrar");
        Bt_Entrar_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Entrar_FuncionarioActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setText("Senha");

        name_user2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_user2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Sobrenome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_user, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(name_user1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cpf_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_user5)
                                            .addComponent(name_user2)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(bairro_user, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Combo_estado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Combo_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel13)
                                    .addComponent(num_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel8))
                                .addGap(158, 158, 158)
                                .addComponent(jLabel15)))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telefone_user, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cep_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(estado_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(export)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bt_Entrar_Funcionario)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(excluir)
                                        .addGap(59, 59, 59)
                                        .addComponent(Bt_Salvar_CadastroFuncionario))))
                            .addComponent(senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(310, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Combo_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name_user1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_user2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_user5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cep_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairro_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Salvar_CadastroFuncionario)
                    .addComponent(excluir)
                    .addComponent(export))
                .addGap(28, 28, 28)
                .addComponent(Bt_Entrar_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_userActionPerformed

    private void name_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_user1ActionPerformed

    private void date_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_userActionPerformed

    private void cpf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpf_userActionPerformed

    private void name_user5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_user5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_user5ActionPerformed

    private void email_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_userActionPerformed

    private void cep_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_userActionPerformed

    private void estado_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_userActionPerformed

    private void bairro_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairro_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairro_userActionPerformed

    private void num_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_userActionPerformed

    private void telefone_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_userActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        name_user1.setText("");
        name_user2.setText("");
        date_user.setText("");
        cpf_user.setText("");
        name_user5.setText("");
        email_user.setText("");
        cep_user.setText("");
        estado_user.setText("");
        bairro_user.setText("");
        num_user.setText("");
        telefone_user.setText("");
        senha_funcionario.setText("");
    }//GEN-LAST:event_excluirActionPerformed

    private void Bt_Voltar_Para_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Voltar_Para_LoginActionPerformed
        // TODO add your handling code here:
        Cadastro_do_Funcionario.this.dispose();
        Opcoes_de_Conta opcoesConta = new Opcoes_de_Conta();
        opcoesConta.setVisible(true);
    }//GEN-LAST:event_Bt_Voltar_Para_LoginActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
         try{
        FileWriter arq = new FileWriter ("C:\\Users\\aluno\\Desktop\\cadastro_funcionario.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.println("+---------CADASTRO USUÁRIO--------+");
        gravarArq.println("Nome: " + name_user.getText());
        gravarArq.println("Sobrenome: " + name_user2.getText());
        gravarArq.println("Data Completo: " + date_user.getText());
        gravarArq.println("Telefone: " + telefone_user.getText());
        gravarArq.println("CPF: " + cpf_user.getText());
        gravarArq.println("E-mail: " + email_user.getText());
        gravarArq.println("Estado: " + estado_user.getText());
        gravarArq.println("Bairro: " + bairro_user.getText());
        gravarArq.println("N°: " + num_user.getText());
        gravarArq.println("CEP: " + cep_user.getText());
        gravarArq.println("+---------------------------+");
        
        
        gravarArq.close();
        
        } catch (IOException ex) {
            Logger.getLogger(Cadastro_do_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_exportActionPerformed

    private void Bt_Entrar_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Entrar_FuncionarioActionPerformed
        // TODO add your handling code here:
        Cadastro_do_Funcionario.this.dispose();
        Comercial comercial = new Comercial();
        comercial.setVisible(true);
        
    }//GEN-LAST:event_Bt_Entrar_FuncionarioActionPerformed

    private void Bt_Salvar_CadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Salvar_CadastroFuncionarioActionPerformed
        // TODO add your handling code here:
          Connection conexao = null;
           
            
            String url = "jdbc:mysql://localhost:3307/fashion_foot";
            String usuario =  "ff_layson";
            String senha = "123456";
        
        try {
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql = "insert into funcionario (nome,sobrenome,data_nascimento,sexo,cpf,rg,estado_civil,email,cep,estado,bairro,numero,telefone,senha) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
            statement = conexao.prepareStatement(sql);
            statement.setString(1, name_user1.getText());
            statement.setString(2, name_user2.getText());
            statement.setString(3, date_user.getText());
            statement.setString(4, Combo_Sexo.getSelectedItem().toString());
            statement.setString(5, cpf_user.getText());
            statement.setString(6, name_user5.getText());
            statement.setString(7, Combo_estado.getSelectedItem().toString());
            statement.setString(8, email_user.getText());
            statement.setString(9, cep_user.getText());
            statement.setString(10, estado_user.getText());
            statement.setString(11, bairro_user.getText());
            statement.setString(12, num_user.getText());
            statement.setString(13, telefone_user.getText());
            statement.setString(14, new String (senha_funcionario.getPassword()));
            
            int linhasAfetadas = statement.executeUpdate();
            
            if (linhasAfetadas > 0) {
                 JOptionPane.showMessageDialog(rootPane,"Dados inseridos com sucesso!");
                 Bt_Entrar_Funcionario.setEnabled(true);
                
            } else {
                 JOptionPane.showMessageDialog(rootPane,"Nenhum dado inserido.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_de_Produto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             try {
                if (statement != null) {
                    statement.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
                } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao fechar conexão: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_Bt_Salvar_CadastroFuncionarioActionPerformed

    private void name_user2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_user2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_user2ActionPerformed

    private void Open(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Open
        // TODO add your handling code here:
        Bt_Entrar_Funcionario.setEnabled(false);
    }//GEN-LAST:event_Open

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
            java.util.logging.Logger.getLogger(Cadastro_do_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_do_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_do_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Entrar_Funcionario;
    private javax.swing.JButton Bt_Salvar_CadastroFuncionario;
    private javax.swing.JButton Bt_Voltar_Para_Login;
    private javax.swing.JComboBox<String> Combo_Sexo;
    private javax.swing.JComboBox<String> Combo_estado;
    private javax.swing.JTextField bairro_user;
    private javax.swing.JTextField cep_user;
    private javax.swing.JTextField cpf_user;
    private javax.swing.JTextField date_user;
    private javax.swing.JTextField email_user;
    private javax.swing.JTextField estado_user;
    private javax.swing.JButton excluir;
    private javax.swing.JButton export;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name_user;
    private javax.swing.JTextField name_user1;
    private javax.swing.JTextField name_user2;
    private javax.swing.JTextField name_user5;
    private javax.swing.JTextField num_user;
    private javax.swing.JPasswordField senha_funcionario;
    private javax.swing.JTextField telefone_user;
    // End of variables declaration//GEN-END:variables
}