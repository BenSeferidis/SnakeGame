public class GameOver extends javax.swing.JFrame {
    public GameOver() {
        initComponents(); 
    }
    
    int score;
    
    GameOver(int applesEaten){
        this.setTitle("Snake");
        score=applesEaten;
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SCORE = new javax.swing.JTextField();
        NUMBER = new javax.swing.JTextField();
        GAMEOVER = new javax.swing.JTextField();
        PLAYAGAIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        SCORE.setEditable(false);
        SCORE.setBackground(new java.awt.Color(0, 0, 0));
        SCORE.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        SCORE.setForeground(new java.awt.Color(255, 0, 0));
        SCORE.setText(" SCORE :");
        SCORE.setBorder(null);
        SCORE.setCaretColor(new java.awt.Color(255, 51, 51));
        SCORE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCOREActionPerformed(evt);
            }
        });

        NUMBER.setText("" + score);
        NUMBER.setEditable(false);
        NUMBER.setBackground(new java.awt.Color(0, 0, 0));
        NUMBER.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        NUMBER.setForeground(new java.awt.Color(255, 0, 0));
        NUMBER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NUMBER.setBorder(null);
        NUMBER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMBERActionPerformed(evt);
            }
        });

        GAMEOVER.setEditable(false);
        GAMEOVER.setBackground(new java.awt.Color(0, 0, 0));
        GAMEOVER.setFont(new java.awt.Font("Ink Free", 1, 36)); // NOI18N
        GAMEOVER.setForeground(new java.awt.Color(255, 0, 0));
        GAMEOVER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GAMEOVER.setText("GAME OVER");
        GAMEOVER.setBorder(null);
        GAMEOVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEOVERActionPerformed(evt);
            }
        });

        PLAYAGAIN.setText("PLAY AGAIN");
        PLAYAGAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYAGAINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PLAYAGAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SCORE, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(GAMEOVER, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(GAMEOVER, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCORE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(PLAYAGAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SCOREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCOREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCOREActionPerformed

    private void NUMBERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMBERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMBERActionPerformed

    private void PLAYAGAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYAGAINActionPerformed
        new GameFrame();

        // TODO add your handling code here:
    }//GEN-LAST:event_PLAYAGAINActionPerformed

    private void GAMEOVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEOVERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GAMEOVERActionPerformed

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
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GAMEOVER;
    private javax.swing.JTextField NUMBER;
    private javax.swing.JButton PLAYAGAIN;
    private javax.swing.JTextField SCORE;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
