/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.login;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Inet4Address;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author sopro
 */
public class ConexaoPane extends javax.swing.JDialog {

    /**
     * @return the conectado
     */
    public boolean isConectado() {
        return conectado;
    }

    /**
     * @param conectado the conectado to set
     */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    /**
     * @return the cliente
     */
    public Socket getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Socket cliente) {
        this.cliente = cliente;
    }
    private boolean conectado;
    Thread thMain;
    private Socket cliente;

    /**
     * Creates new form ConexaoPane
     */
    public ConexaoPane(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel4 = new javax.swing.JPanel();
        btConectar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hostText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        portaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbLocalD = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btDesconect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel4.setInheritsPopupMenu(true);

        btConectar.setBackground(new java.awt.Color(0, 0, 0));
        btConectar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btConectar.setForeground(new java.awt.Color(51, 255, 51));
        btConectar.setText("Conectar");
        btConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConectarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Host:");

        hostText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hostText.setToolTipText("Informe o email");
        hostText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Porta:");

        portaText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portaText.setToolTipText("Informe a senha");
        portaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONECTAR");

        lbLocalD.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btDesconect.setBackground(new java.awt.Color(0, 0, 0));
        btDesconect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDesconect.setForeground(new java.awt.Color(255, 51, 51));
        btDesconect.setText("Desconectar");
        btDesconect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesconectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(portaText)
                    .addComponent(hostText)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(lbLocalD)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btDesconect)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConectar)
                    .addComponent(btDesconect))
                .addGap(45, 45, 45)
                .addComponent(lbLocalD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectarActionPerformed

        thMain = new Thread() {
            @Override
            public void run() {
                try {
                    comecaConexao();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        };
        thMain.start();
        btDesconect.setEnabled(true);

    }//GEN-LAST:event_btConectarActionPerformed

    private void hostTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostTextActionPerformed

    private void portaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portaTextActionPerformed

    private void btDesconectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesconectActionPerformed
        desconectar();
    }//GEN-LAST:event_btDesconectActionPerformed

    public void desconectar() {
        try {
            this.cliente.close();
            setCliente(null);
            btConectar.setEnabled(true);
            btDesconect.setEnabled(false);
            JOptionPane.showConfirmDialog(null, "Desconectado!", "Desconectado", JOptionPane.DEFAULT_OPTION);
            this.dispose();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void comecaConexao() throws IOException {

        int porta;
        String host;
        porta = Integer.parseInt(portaText.getText());
        host = hostText.getText();
        setCliente(new Socket(host, porta));
        //btDesconectar.setEnabled(true);

        System.out.println("Conex??o estabelecida com sucesso " + "\n" + "Cliente iniciado em: " + Inet4Address.getLocalHost().getHostAddress() + ":" + getCliente().getLocalPort());
        try {
            btConectar.setEnabled(false);
            JOptionPane.showConfirmDialog(null, "Conex??o estabelecida com sucesso " + "\n" + "Cliente iniciado em: " + Inet4Address.getLocalHost().getHostAddress() + ":" + getCliente().getLocalPort(), "Conex??o Criada", JOptionPane.DEFAULT_OPTION);
            setConectado(true);
        } catch (IOException ex) {
            System.out.println("Problema com o cliente: ");
            System.out.println("Erro: " + ex.getMessage());
        }
        this.dispose();
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
            java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConexaoPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConexaoPane dialog = new ConexaoPane(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConectar;
    private javax.swing.JButton btDesconect;
    private javax.swing.JTextField hostText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLocalD;
    private javax.swing.JTextField portaText;
    // End of variables declaration//GEN-END:variables
}
