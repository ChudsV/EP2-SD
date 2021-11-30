/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.login;

import Interfaces.homePage.HomePage;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sopro
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * @return the homepageF
     */
    /**
     * @return the homePage
     */
    /**
     * @return the cliente
     */
    JSONObject jsonLogin = new JSONObject();
    JSONObject dataO = new JSONObject();
    JSONArray data = new JSONArray();
    byte hashBytes[];
    String senhaHash = null;
    MessageDigest messageDigest;
    public PrintStream out;
    public BufferedReader in;
    BufferedReader read;
    Boolean conectado = false;
    Boolean erroLogin = false;
    JSONObject jServidor = null;
    JSONObject jCliente = null;
    String jCliente_string;
    boolean loginControll;
    boolean logoutC;

    public Socket getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Socket cliente) {
        this.cliente = cliente;
    }
    private ConexaoPane conexao;
    private Socket cliente;

    /**
     * Creates new form LoginFrame1
     */
    
    private NovoUserPane user;
    private RecuperarSenhaPane userRecuperar;
    private HomePage homePage;
    
    public LoginFrame() {
        initComponents();
        this.conexao = new ConexaoPane(this, true);
        
        btCadastrar1.setEnabled(false);
        btnRecuperarSenha.setEnabled(false);
        emailText.setEnabled(false);
        senhaText.setEnabled(false);
        btEnviar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btEnviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        senhaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbLocalD = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbLocalS2 = new javax.swing.JLabel();
        lbStatusD = new javax.swing.JLabel();
        lbLocalS3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btConectLogin = new javax.swing.JButton();
        btDesconectLogin = new javax.swing.JButton();
        lbConexaoD = new javax.swing.JLabel();
        btnRecuperarSenha = new javax.swing.JButton();
        btCadastrar1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel4.setInheritsPopupMenu(true);

        btEnviar.setBackground(new java.awt.Color(0, 0, 0));
        btEnviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEnviar.setForeground(new java.awt.Color(51, 255, 51));
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("E-mail:");

        emailText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailText.setToolTipText("Informe o email");
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Senha:");

        senhaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaText.setToolTipText("Informe a senha");
        senhaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONECTAR");

        lbLocalD.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lbLocalS2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbLocalS2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLocalS2.setText("Status:");

        lbStatusD.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lbStatusD.setForeground(new java.awt.Color(255, 0, 0));
        lbStatusD.setText("OFFLINE");

        lbLocalS3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbLocalS3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLocalS3.setText("Conexão:");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LOGIN");

        btConectLogin.setBackground(new java.awt.Color(0, 0, 0));
        btConectLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btConectLogin.setForeground(new java.awt.Color(51, 255, 51));
        btConectLogin.setText("Conectar");
        btConectLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConectLoginActionPerformed(evt);
            }
        });

        btDesconectLogin.setBackground(new java.awt.Color(0, 0, 0));
        btDesconectLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDesconectLogin.setForeground(new java.awt.Color(255, 51, 51));
        btDesconectLogin.setText("Desconectar");
        btDesconectLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesconectLoginActionPerformed(evt);
            }
        });

        lbConexaoD.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        btnRecuperarSenha.setBackground(new java.awt.Color(0, 0, 0));
        btnRecuperarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRecuperarSenha.setForeground(new java.awt.Color(255, 255, 51));
        btnRecuperarSenha.setText("Recupera Senha");
        btnRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarSenhaActionPerformed(evt);
            }
        });

        btCadastrar1.setBackground(new java.awt.Color(0, 0, 0));
        btCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCadastrar1.setForeground(new java.awt.Color(51, 51, 255));
        btCadastrar1.setText("Cadastrar");
        btCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaText)
                    .addComponent(emailText)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbLocalS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbLocalD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbConexaoD)
                        .addGap(62, 62, 62))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecuperarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbLocalS2)
                                .addGap(30, 30, 30)
                                .addComponent(lbStatusD)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btConectLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDesconectLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btCadastrar1)
                    .addComponent(btnRecuperarSenha))
                .addGap(31, 31, 31)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusD)
                    .addComponent(lbLocalS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbLocalS3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLocalD))
                    .addComponent(lbConexaoD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConectLogin)
                    .addComponent(btDesconectLogin))
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed

        new Thread() {
            @Override
            public void run() {
                tratarConexao();
            }
        }.start();
    }//GEN-LAST:event_btEnviarActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void senhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextActionPerformed

    private void btConectLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectLoginActionPerformed
        // TODO add your handling code here:
        this.conexao.setVisible(true);
        if (conexao.getCliente() != null) {
            setCliente(conexao.getCliente());
            statusConexao(true);
            conectado = true;

        }

    }//GEN-LAST:event_btConectLoginActionPerformed

    private void statusConexao(boolean estado) {
        if (estado == true) {

            lbStatusD.setText("ONLINE");
            lbStatusD.setForeground(Color.green);

            try {
                lbConexaoD.setText(Inet4Address.getLocalHost().getHostAddress() + ":" + cliente.getLocalPort());
            } catch (UnknownHostException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            btConectLogin.setEnabled(false);
            btDesconectLogin.setEnabled(true);
            btEnviar.setEnabled(true);
            emailText.setEnabled(true);
            senhaText.setEnabled(true);
            btCadastrar1.setEnabled(true);
            btnRecuperarSenha.setEnabled(true);
        } else {

            lbStatusD.setText("OFFLINE");
            lbStatusD.setForeground(Color.red);
            lbConexaoD.setText("");
            btConectLogin.setEnabled(true);
            btDesconectLogin.setEnabled(false);

            btEnviar.setEnabled(false);
            emailText.setEnabled(false);
            senhaText.setEnabled(false);
        }
    }

    private void btDesconectLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesconectLoginActionPerformed
        this.conexao.setVisible(true);
        System.out.println(conexao.getCliente());
        if (conexao.getCliente() == null) {
            setCliente(null);
            statusConexao(false);
            conectado = false;
        }
    }//GEN-LAST:event_btDesconectLoginActionPerformed

    private void btnRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarSenhaActionPerformed
        this.userRecuperar = new RecuperarSenhaPane(this, true, getCliente());
        this.userRecuperar.setVisible(true);
    }//GEN-LAST:event_btnRecuperarSenhaActionPerformed

    private void btCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar1ActionPerformed
        // TODO add your handling code here:
        this.user = new NovoUserPane(this, true, getCliente());
        this.user.setVisible(true);
    }//GEN-LAST:event_btCadastrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar1;
    private javax.swing.JButton btConectLogin;
    private javax.swing.JButton btDesconectLogin;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btnRecuperarSenha;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbConexaoD;
    private javax.swing.JLabel lbLocalD;
    private javax.swing.JLabel lbLocalS2;
    private javax.swing.JLabel lbLocalS3;
    private javax.swing.JLabel lbStatusD;
    private javax.swing.JTextField senhaText;
    // End of variables declaration//GEN-END:variables

    private void tratarConexao() {
        new Thread() {
            @Override
            public void run() {

                System.out.println("jsonLogin: " + jsonLogin.toString());
                String email = emailText.getText();
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");

                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                String senha = senhaText.getText();
                byte hashBytes[] = messageDigest.digest(senha.getBytes(StandardCharsets.UTF_8));
                BigInteger noHash = new BigInteger(1, hashBytes);
                senhaHash = noHash.toString(16);

                System.out.println("Senha: " + senhaHash);
                jsonLogin.put("operacao", 1);
                dataO.put("email", email);
                dataO.put("senha", senhaHash);
                data.put("email");
                data.put(email);
                data.put("senha");
                data.put(senhaHash);
                jsonLogin.put("data", dataO);
                try {
                    out = new PrintStream(getCliente().getOutputStream());
                    out.println(jsonLogin.toString());
                    out.flush();
                    emailText.setText("");
                    senhaText.setText("");
                    jsonLogin.clear();

                } catch (IOException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                String resposta = esperaResposta();

                System.out.println("Resposta: " + resposta);
                jServidor = new JSONObject(resposta);
                if (jServidor.getBoolean("erro") == false) {
                    JSONArray msg = jServidor.getJSONArray("mensagem");
                    msg.get(0).toString();
                    System.out.println(msg.get(0).toString());
                    JOptionPane.showConfirmDialog(null, msg.get(0).toString(), "Login", JOptionPane.DEFAULT_OPTION);
                    btEnviar.setEnabled(false);
                    emailText.setEnabled(false);
                    senhaText.setEnabled(false);
                    btEnviar.setEnabled(false);
                    loginControll = true;
                    data.clear();
                    msg.clear();
                    
                   
                    homePage = new HomePage(getCliente(), email);
                    homePage.setVisible(true);
                    System.out.println(homePage.getConectado());

                    if (!homePage.getConectado()) {
                        System.out.println("Teste1");

                        statusConexao(false);
                    }
                } else {
                    JSONArray msg = jServidor.getJSONArray("mensagem");
                    System.out.println(msg.get(0).toString());
                    JOptionPane.showConfirmDialog(null, msg.get(0).toString(), "Login", JOptionPane.DEFAULT_OPTION);
                    msg.clear();
                    jsonLogin.clear();
                    data.clear();
                }
            }
        }.start();
    }

    private String esperaResposta() {
        String ln = null;
        try {
            read = new BufferedReader(new InputStreamReader(getCliente().getInputStream()));
            try {
                char[] cbuf = new char[2048];

                while ((read.read(cbuf)) != 0) {
                    ln = String.valueOf(cbuf);
                    cbuf = new char[2048];
                    PrintStream saida = null;
                    System.out.print(ln);
                    try {
                        saida = new PrintStream(getCliente().getOutputStream());
                    } catch (IOException ex) {
                        System.out.println("ERRO");
                    }
                    System.out.println("");
                    System.out.println("ln: " + ln);
                    return ln;
                }

            } catch (IOException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            System.out.println("Nao funcionou");
        }
        return ln;
    }

    private void mataConexao() {
        this.conexao.desconectar();
    }
}
