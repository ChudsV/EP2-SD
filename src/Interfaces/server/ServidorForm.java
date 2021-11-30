/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.server;

import Interfaces.login.LoginFrame;
import Usuario.Usuario;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sopro
 */
public class ServidorForm extends javax.swing.JFrame {

    /**
     * @return the ctSocket
     */
    public Socket getCtSocket() {
        return ctSocket;
    }

    /**
     * @param ctSocket the ctSocket to set
     */
    public void setCtSocket(Socket ctSocket) {
        this.ctSocket = ctSocket;
    }

    /**
     * @return the login
     */
    public Boolean getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(Boolean login) {
        this.login = login;
    }

    String emailF = "teste@teste.com";
    String senhaF = "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";

    Thread thMain;
    boolean conectado = false;
    private ServerSocket sSocket = null;
    private Socket ctSocket;
    public PrintStream out;
    public BufferedReader in;
    private Boolean login = false;
    BufferedReader read;
    Boolean readControl = false;
    ArrayList<Usuario> listaUsuario;

    /**
     * Creates new form ServidorJPane
     */
    public ServidorForm() {
        this.listaUsuario = new ArrayList<>();
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
        jLabel1 = new javax.swing.JLabel();
        portaText = new javax.swing.JTextField();
        btIniciarServer = new javax.swing.JButton();
        btDesconectar = new javax.swing.JButton();
        lbStatusD = new javax.swing.JLabel();
        lbLocalS = new javax.swing.JLabel();
        lbLocalD = new javax.swing.JLabel();
        lbLocalS1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Porta:");

        portaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portaText.setToolTipText("Informe o email");
        portaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaTextActionPerformed(evt);
            }
        });

        btIniciarServer.setBackground(new java.awt.Color(0, 0, 0));
        btIniciarServer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btIniciarServer.setForeground(new java.awt.Color(51, 255, 51));
        btIniciarServer.setText("Iniciar Servidor");
        btIniciarServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarServerActionPerformed(evt);
            }
        });

        btDesconectar.setBackground(new java.awt.Color(0, 0, 0));
        btDesconectar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDesconectar.setForeground(new java.awt.Color(255, 51, 51));
        btDesconectar.setText("Desconectar");
        btDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesconectarActionPerformed(evt);
            }
        });

        lbStatusD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbStatusD.setForeground(new java.awt.Color(255, 0, 0));
        lbStatusD.setText("OFFLINE");

        lbLocalS.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lbLocalS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLocalS.setText("Conexão:");

        lbLocalD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbLocalS1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lbLocalS1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLocalS1.setText("Status:");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SERVIDOR");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(portaText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(btIniciarServer, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLocalS)
                                    .addComponent(lbLocalS1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbStatusD)
                                    .addComponent(lbLocalD))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIniciarServer)
                    .addComponent(portaText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusD)
                    .addComponent(lbLocalS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocalS)
                    .addComponent(lbLocalD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDesconectar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portaTextActionPerformed

    private void btIniciarServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarServerActionPerformed
        btIniciarServer.setEnabled(false);
        btDesconectar.setEnabled(false);

        thMain = new Thread() {
            @Override
            public void run() {
                try {
                    comecaServer();
                } catch (IOException ex) {
                    System.out.println("Eerro thread");
                }
            }
        };
        thMain.start();
        btIniciarServer.setEnabled(true);
        btDesconectar.setEnabled(true);
    }//GEN-LAST:event_btIniciarServerActionPerformed

    private void btDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesconectarActionPerformed
        try {
            ServidorOff();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ServidorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        JOptionPane.showConfirmDialog(null, "Servidor desconectado com sucesso", "Desconectado", JOptionPane.DEFAULT_OPTION);
        btIniciarServer.setEnabled(true);
        btDesconectar.setEnabled(false);
        portaText.setEnabled(true);
        lbStatusD.setText("OFFLINE");
        lbStatusD.setForeground(Color.red);
        lbLocalD.setText("");
    }//GEN-LAST:event_btDesconectarActionPerformed

    private void comecaServer() throws IOException {

        try {
            sSocket = new ServerSocket(Integer.parseInt(portaText.getText()));
        } catch (IOException ex) {
            System.out.println("Erro no socket");
        }
        JOptionPane.showConfirmDialog(null, "Conexão estabelecida com sucesso " + "\n" + "Servidor iniciado em: " + Inet4Address.getLocalHost().getHostAddress() + ":" + sSocket.getLocalPort(), "Conexão Criada", JOptionPane.DEFAULT_OPTION);
        lbStatusD.setText("ONLINE");
        lbStatusD.setForeground(Color.green);
        lbLocalD.setText(sSocket.getInetAddress().getHostAddress() + ":" + sSocket.getLocalPort());
        conectado = true;
        while (conectado == true) {
            btIniciarServer.setEnabled(false);
            portaText.setEnabled(false);
            try {
                setCtSocket(sSocket.accept());
                new Thread() {
                    @Override
                    public void run() {
                        System.out.println("Server:\nCliente conectado com sucesso! " + "\n" + "Conectado em: " + getCtSocket().getInetAddress().getHostAddress() + ":" + getCtSocket().getLocalPort());
                        String ln;
                        try {
                            while (conectado == true) {
                                ln = esperaResposta();
                                JSONObject jServidor = new JSONObject(ln);
                                JSONObject jCliente = new JSONObject();
                                System.out.println("\nRecebido: " + ln);
                                Integer operacao = jServidor.getInt("operacao");
                                if (operacao.equals(1)) {
                                    System.out.println("Entrei1");
                                    JSONObject data = new JSONObject();
                                    data = jServidor.optJSONObject("data", data);
                                    String email = data.getString("email");
                                    String senha = data.optString("senha");
                                    out = new PrintStream(getCtSocket().getOutputStream());
                                    out.flush();
                                    int controll = 0;
                                    for (int i = 0; i < listaUsuario.size(); i++) {

                                        if (email.equals(listaUsuario.get(i).getEmail()) && senha.equals(listaUsuario.get(i).getSenha())) {
                                            listaUsuario.get(i).setSocket(ctSocket);
                                            System.out.println(listaUsuario.get(i).getSocket());
                                            controll = 1;
                                            break;
                                        }
                                    }

                                    if (controll == 1) {
                                        System.out.println("Entrei2");
                                        JSONArray msg = new JSONArray();
                                        jCliente.put("operacao", 1);
                                        jCliente.put("erro", false);
                                        msg.put("Login realizado com sucesso!");
                                        jCliente.put("mensagem", msg);
                                        System.out.println(jCliente.toString());

                                        out.println(jCliente.toString());
                                        out.flush();
                                        msg.clear();
                                        jCliente.clear();
                                    } else {
                                        System.out.println("Entrei3");
                                        jCliente.put("operacao", 1);
                                        jCliente.put("erro", true);
                                        JSONArray msg = new JSONArray();
                                        msg.put("Email/Senha incorreto!");
                                        System.out.println("Mensagem final: " + jCliente.toString());
                                        jCliente.put("mensagem", msg);
                                        readControl = true;

                                        out.println(jCliente.toString());
                                        out.flush();
                                        msg.clear();
                                        jCliente.clear();
                                    }
                                } else if (operacao.equals(8)) {
                                    jCliente.put("operacao", 8);
                                    jCliente.put("erro", false);
                                    JSONArray msg = new JSONArray();
                                    msg.put("Logout realizado com sucesso!");
                                    jCliente.put("mensagem", msg);
                                    System.out.println(jCliente.toString());
                                    out.println(jCliente.toString());
                                    out.flush();
                                    getCtSocket().close();
                                    jCliente.clear();
                                } else if (operacao.equals(5)) {

                                    System.out.println("Entrei 5");
                                    JSONObject data = new JSONObject();
                                    data = jServidor.optJSONObject("data", data);
                                    String email = data.getString("email");
                                    String senha = data.getString("senha");
                                    String nome = data.getString("nome");
                                    int controll = 1;
                                    for (int i = 0; i < listaUsuario.size(); i++) {
                                        if (email.equals(listaUsuario.get(i).getEmail())) {
                                            controll = 0;
                                            break;
                                        }
                                    }
                                    JSONArray msg = new JSONArray();
                                    jCliente.put("operacao", 5);
                                    if (controll == 1) {
                                        Usuario novoUsuario = new Usuario(email, senha, nome);
                                        int id = listaUsuario.size() + 1;
                                        novoUsuario.setId(id);
                                        novoUsuario.setSocket(null);
                                        listaUsuario.add(novoUsuario);
                                        jCliente.put("erro", false);
                                        msg.put("Cadastro realizado com sucesso!");
                                        jCliente.put("mensagem", msg);
                                    } else {
                                        jCliente.put("erro", true);
                                        msg.put("Email duplicado!");
                                        msg.put("Cadastro inválido!");
                                        jCliente.put("mensagem", msg);
                                    }
                                    try {
                                        out = new PrintStream(getCtSocket().getOutputStream());
                                        out.println(jCliente.toString());
                                        System.out.println(jCliente.toString());
                                        out.flush();
                                        jCliente.clear();
                                        msg.clear();
                                    } catch (IOException ex) {
                                        System.out.println("Erro ao enviar para o cliente");
                                    }

                                } else if (operacao.equals(7)) {
                                    JSONObject data = new JSONObject();
                                    data = jServidor.optJSONObject("data", data);
                                    String email = data.getString("email");
                                    int controll = 0;
                                    for (int i = 0; i < listaUsuario.size(); i++) {
                                        if (email.equals(listaUsuario.get(i).getEmail())) {
                                            controll = 1;
                                            break;
                                        }
                                    }
                                    jCliente.put("operacao", 7);
                                    JSONArray msg = new JSONArray();
                                    if (controll == 1) {
                                        jCliente.put("erro", false);
                                        msg.put("Email válido!");
                                        msg.put("Email Enviado com sucesso.");
                                        jCliente.put("mensagem", msg);
                                    } else {
                                        jCliente.put("erro", true);
                                        msg.put("Email inválido!");
                                        jCliente.put("mensagem", msg);
                                    }

                                    try {
                                        out = new PrintStream(getCtSocket().getOutputStream());
                                        out.println(jCliente.toString());
                                        System.out.println(jCliente.toString());
                                        out.flush();
                                        jCliente.clear();
                                        msg.clear();
                                    } catch (IOException ex) {
                                        System.out.println("Erro ao enviar para o cliente");
                                    }

                                } else if (operacao.equals(10)) {

                                    JSONObject data = new JSONObject();
                                    data = jServidor.optJSONObject("data", data);
                                    String email = data.getString("email");
                                    String senha = data.getString("senha");
                                    String nome = data.getString("nome");

                                    int controll = 0;
                                    for (int i = 0; i < listaUsuario.size(); i++) {
                                        //System.out.println(i+": "+ctSocket+" "+listaUsuario.get(i).getSocket());
                                        if (ctSocket.equals(listaUsuario.get(i).getSocket())) {
                                            System.out.println();
                                            listaUsuario.get(i).setEmail(email);
                                            listaUsuario.get(i).setNome(nome);
                                            listaUsuario.get(i).setSenha(senha);
                                            controll = 1;
                                            break;
                                        }
                                    }

                                    JSONArray msg = new JSONArray();
                                    jCliente.put("operacao", 10);
                                    if (controll == 1) {
                                        jCliente.put("erro", false);
                                        msg.put("Usuário atualizado com sucesso!");
                                        jCliente.put("mensagem", msg);
                                    } else {
                                        jCliente.put("erro", true);
                                        msg.put("Não foi possível alterar o usuário");
                                        jCliente.put("mensagem", msg);
                                    }
                                    try {
                                        out = new PrintStream(getCtSocket().getOutputStream());
                                        out.println(jCliente.toString());
                                        System.out.println(jCliente.toString());
                                        out.flush();
                                        jCliente.clear();
                                        msg.clear();
                                    } catch (IOException ex) {
                                        System.out.println("Erro ao enviar para o cliente");
                                    }
                                } else if (operacao.equals(13)) {
                                    int controll = 0;
                                    for (int i = 0; i < listaUsuario.size(); i++) {
                                        //System.out.println(i+": "+ctSocket+" "+listaUsuario.get(i).getSocket());
                                        if (ctSocket.equals(listaUsuario.get(i).getSocket())) {
                                            listaUsuario.remove(i);
                                            controll = 1;
                                            break;
                                        }
                                    }

                                    imprimeLista();
                                    JSONArray msg = new JSONArray();
                                    jCliente.put("operacao", 13);
                                    if(controll==1){
                                        jCliente.put("erro",false);
                                        msg.put("Usuário removido com sucesso!");
                                        jCliente.put("mensagem",msg);
                                    }else{
                                        jCliente.put("erro",true);
                                        msg.put("Usuário não removido!");
                                        jCliente.put("mensagem",msg);
                                    }
                                    
                                    try {
                                        out = new PrintStream(getCtSocket().getOutputStream());
                                        out.println(jCliente.toString());
                                        System.out.println(jCliente.toString());
                                        out.flush();
                                        jCliente.clear();
                                        msg.clear();
                                    } catch (IOException ex) {
                                        System.out.println("Erro ao enviar para o cliente");
                                    }

                                }
                            }

                        } catch (IOException ex) {
                            java.util.logging.Logger.getLogger(ServidorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                    }
                }.start();
            } catch (SocketException e) {
                break;
            }

        }
    }

    private String esperaResposta() {
        String ln = null;
        try {
            read = new BufferedReader(new InputStreamReader(getCtSocket().getInputStream()));
            try {
                char[] cbuf = new char[2048];
                while ((read.read(cbuf)) != 0) {
                    ln = String.valueOf(cbuf);
                    cbuf = new char[2048];
                    PrintStream saida = null;
                    System.out.print(ln);
                    try {
                        saida = new PrintStream(getCtSocket().getOutputStream());
                    } catch (IOException ex) {
                        System.out.println("ERRO");
                    }
                    System.out.println("");
                    System.out.println("ln: " + ln);
                    return ln;
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            System.out.println("Nao funcionou");
        }
        return ln;
    }

    private void ServidorOff() throws IOException {
        sSocket.close();
        conectado = false;
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
            java.util.logging.Logger.getLogger(ServidorForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServidorForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServidorForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServidorForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServidorForm().setVisible(true);

            }
        });
    }

    void imprimeLista() {
        System.out.println("Lista usuario: ");
        for (int i = 0; i < this.listaUsuario.size(); i++) {
            System.out.println("("+i+")"+" Nome: "+this.listaUsuario.get(i).getNome()+" Email: "+this.listaUsuario.get(i).getEmail()+" Senha: "+this.listaUsuario.get(i).getSenha());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDesconectar;
    private javax.swing.JButton btIniciarServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLocalD;
    private javax.swing.JLabel lbLocalS;
    private javax.swing.JLabel lbLocalS1;
    private javax.swing.JLabel lbStatusD;
    private javax.swing.JTextField portaText;
    // End of variables declaration//GEN-END:variables
}
