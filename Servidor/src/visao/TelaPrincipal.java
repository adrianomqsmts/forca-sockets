package visao;

import java.awt.Color;
import servidor.Servidor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    private Servidor servidor;
    public TelaPrincipal(Servidor servidor) {
        this.servidor = servidor;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new java.awt.Label();
        labelStatus = new java.awt.Label();
        labelPorta = new java.awt.Label();
        tfPorta = new javax.swing.JTextField();
        labelSolicitaPorta = new javax.swing.JLabel();
        buttonOnOff = new javax.swing.JButton();
        labelIP = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor do JOGO DA FORCA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelTitulo.setAlignment(java.awt.Label.CENTER);
        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 72)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        labelTitulo.setText("SERVIDOR ");

        labelStatus.setAlignment(java.awt.Label.CENTER);
        labelStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelStatus.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setName(""); // NOI18N
        labelStatus.setText("Status: Offline");

        labelPorta.setAlignment(java.awt.Label.CENTER);
        labelPorta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelPorta.setForeground(new java.awt.Color(255, 255, 255));

        tfPorta.setText("12345");
        tfPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPortaActionPerformed(evt);
            }
        });

        labelSolicitaPorta.setForeground(new java.awt.Color(254, 247, 247));
        labelSolicitaPorta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSolicitaPorta.setText("Digite a porta para estabelecer servidor:");

        buttonOnOff.setText("Conectar");
        buttonOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOnOffActionPerformed(evt);
            }
        });

        labelIP.setAlignment(java.awt.Label.CENTER);
        labelIP.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelIP.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(tfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(buttonOnOff)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSolicitaPorta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(labelPorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelSolicitaPorta)
                .addGap(21, 21, 21)
                .addComponent(tfPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonOnOff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(labelIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void tfPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPortaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPortaActionPerformed

    private void buttonOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOnOffActionPerformed
        // TODO add your handling code here:
        int porta = Integer.parseInt(tfPorta.getText());
        if((!servidor.isBound())){
            try {
                servidor.criarConexao(porta);
                labelStatus.setText("Status: Online");
                //labelStatus.setForeground(Color.blue);
                labelIP.setText("IP: "+ InetAddress.getLocalHost().getHostAddress());
                labelIP.setForeground(Color.white);
                labelPorta.setText("Porta: "+ porta);
                labelPorta.setForeground(Color.white);
                tfPorta.setVisible(false);
                labelSolicitaPorta.setVisible(false);
                buttonOnOff.setVisible(false);
                servidor.esperarConexao();
                while (true) {
                    if (servidor.getSocket1().isConnected()) {
                        servidor.tratarConexao(servidor.getSocket1());
                        if (servidor.getSocket2().isConnected()) {
                            servidor.tratarConexao(servidor.getSocket2());
                        } else {
                            JOptionPane.showMessageDialog(null, "Partida Encerrada... Servidor Finalizado");
                            servidor.close();
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Partida Encerrada... Servidor Finalizado");
                        servidor.close();
                        break;
                    }
                }
            } catch (IOException ex) {
                labelStatus.setText("Erro ao ligar servidor!");
                labelStatus.setForeground(Color.red);
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            try {
                servidor.close();
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            labelStatus.setText("Status: Offline");
            //labelStatus.setForeground(Color.white);
            tfPorta.setVisible(true);
            labelSolicitaPorta.setVisible(true);
            labelPorta.setVisible(false);
            labelIP.setVisible(false);
            //buttonOnOff.setText("Conectar");
        }
    }//GEN-LAST:event_buttonOnOffActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        Servidor servidor = new Servidor();
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal(servidor).setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOnOff;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label labelIP;
    private java.awt.Label labelPorta;
    private javax.swing.JLabel labelSolicitaPorta;
    private java.awt.Label labelStatus;
    private java.awt.Label labelTitulo;
    private javax.swing.JTextField tfPorta;
    // End of variables declaration//GEN-END:variables
}
