/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno
 */
public class particula extends javax.swing.JFrame {

    /**
     * Creates new form particula
     */
    public particula() {
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

        exit8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fm = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        i = new javax.swing.JTextField();
        l = new javax.swing.JTextField();
        sen = new javax.swing.JTextField();
        send8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        resposta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exit8.setText("Sair");
        exit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Meiryo", 3, 18)); // NOI18N
        jLabel1.setText("Fm = B . i . l . sen(θ)");

        jLabel2.setText("Fm:");

        jLabel3.setText("B:");

        jLabel4.setText("i:");

        jLabel5.setText("l:");

        jLabel6.setText("sen(θ):");

        Fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FmActionPerformed(evt);
            }
        });
        Fm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FmKeyReleased(evt);
            }
        });

        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BKeyReleased(evt);
            }
        });

        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iKeyReleased(evt);
            }
        });

        l.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lKeyReleased(evt);
            }
        });

        sen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senKeyReleased(evt);
            }
        });

        send8.setText("Enviar");
        send8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send8ActionPerformed(evt);
            }
        });

        jLabel7.setText("Resposta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(send8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit8)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(resposta)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Fm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit8)
                    .addComponent(send8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit8ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exit8ActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iActionPerformed

    private void FmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FmActionPerformed

    private void FmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FmKeyReleased
        Fm.setText(Fm.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_FmKeyReleased

    private void BKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyReleased
        B.setText(B.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_BKeyReleased

    private void iKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iKeyReleased
        i.setText(i.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_iKeyReleased

    private void lKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lKeyReleased
        l.setText(l.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_lKeyReleased

    private void senKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senKeyReleased
        sen.setText(sen.getText().replaceAll("[^0-9 | ^.]" , ""));        // TODO add your handling code here:
    }//GEN-LAST:event_senKeyReleased

    private void send8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send8ActionPerformed
        if(Fm.getText().isEmpty()){
            double _B, _i, _l, _sen, res;
            String result;            
            _B = Double.parseDouble(B.getText());
            _i = Double.parseDouble(i.getText());
            _l = Double.parseDouble(l.getText());
            _sen = Double.parseDouble(sen.getText());
            res = _B * _i * _l * Math.sin(_sen);
            result = Double.toString(res);
            resposta.setText(result);
        }
        else if(B.getText().isEmpty()){
            double _Fm, _i, _l, _sen, res;
            String result;            
            _Fm = Double.parseDouble(Fm.getText());
            _i = Double.parseDouble(i.getText());
            _l = Double.parseDouble(l.getText());
            _sen = Double.parseDouble(sen.getText());
            res = _Fm/(_i * _l * Math.sin(_sen));
            result = Double.toString(res);
            resposta.setText(result);
        }
        else if(i.getText().isEmpty()){
            double _Fm, _B, _l, _sen, res;
            String result;            
            _Fm = Double.parseDouble(Fm.getText());
            _B = Double.parseDouble(B.getText());
            _l = Double.parseDouble(l.getText());
            _sen = Double.parseDouble(sen.getText());
            res = _Fm/(_B * _l * Math.sin(_sen));
            result = Double.toString(res);
            resposta.setText(result);
        }
        else if(l.getText().isEmpty()){
            double _Fm, _B, _i, _sen, res;
            String result;            
            _Fm = Double.parseDouble(Fm.getText());
            _B = Double.parseDouble(B.getText());
            _i = Double.parseDouble(i.getText());
            _sen = Double.parseDouble(sen.getText());
            res = _Fm/(_B * _i * Math.sin(_sen));
            result = Double.toString(res);
            resposta.setText(result);
        }
        else if(sen.getText().isEmpty()){
            double _Fm, _B, _l, _i, res;
            String result;            
            _Fm = Double.parseDouble(Fm.getText());
            _B = Double.parseDouble(B.getText());
            _l = Double.parseDouble(l.getText());
            _i = Double.parseDouble(i.getText());
            res = _Fm/(_B * _l * _i);
            result = Double.toString(res);
            resposta.setText(result);
        }
        
    }//GEN-LAST:event_send8ActionPerformed

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
            java.util.logging.Logger.getLogger(particula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(particula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(particula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(particula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new particula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B;
    private javax.swing.JTextField Fm;
    private javax.swing.JButton exit8;
    private javax.swing.JTextField i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField l;
    private javax.swing.JTextField resposta;
    private javax.swing.JTextField sen;
    private javax.swing.JButton send8;
    // End of variables declaration//GEN-END:variables
}
