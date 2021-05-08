
import javax.swing.JOptionPane;


public class mainPage extends javax.swing.JFrame {
    String[] Response1 = {"Let's Go!"};
    
    public mainPage() {
        initComponents();

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        firstPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        secondPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        NameF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MaleB = new javax.swing.JRadioButton();
        FemaleB = new javax.swing.JRadioButton();
        OtherB = new javax.swing.JRadioButton();
        AgeL = new javax.swing.JLabel();
        AgeSlider = new javax.swing.JSlider();
        ProceedB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZZit");

        firstPanel.setBackground(new java.awt.Color(51, 255, 255));
        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/myLogo3.PNG"))); // NOI18N
        firstPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        secondPanel.setBackground(new java.awt.Color(204, 204, 204));
        secondPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(51, 51, 51));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Log-in");
        secondPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        NameL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NameL.setForeground(new java.awt.Color(51, 51, 51));
        NameL.setText("Name:");
        secondPanel.add(NameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        secondPanel.add(NameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Age:");
        secondPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Gender:");
        secondPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        MaleB.setOpaque(false);
        buttonGroup1.add(MaleB);
        MaleB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MaleB.setForeground(new java.awt.Color(51, 51, 51));
        MaleB.setText("Male");
        MaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBActionPerformed(evt);
            }
        });
        secondPanel.add(MaleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        FemaleB.setOpaque(false);
        buttonGroup1.add(FemaleB);
        FemaleB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FemaleB.setForeground(new java.awt.Color(51, 51, 51));
        FemaleB.setText("Female");
        secondPanel.add(FemaleB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 30));

        OtherB.setOpaque(false);
        buttonGroup1.add(OtherB);
        OtherB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OtherB.setForeground(new java.awt.Color(51, 51, 51));
        OtherB.setText("Other");
        secondPanel.add(OtherB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 30));

        AgeL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgeL.setForeground(new java.awt.Color(51, 51, 51));
        AgeL.setText("0");
        secondPanel.add(AgeL, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 20, -1));

        AgeSlider.setOpaque(false);
        AgeSlider.setValue(0);
        AgeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AgeSliderStateChanged(evt);
            }
        });
        secondPanel.add(AgeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 150, 140, 30));

        ProceedB.setFocusable(false);
        ProceedB.setBackground(new java.awt.Color(204, 204, 204));
        ProceedB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProceedB.setForeground(new java.awt.Color(51, 51, 51));
        ProceedB.setText("Proceed");
        ProceedB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedBActionPerformed(evt);
            }
        });
        secondPanel.add(ProceedB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/jpn.png"))); // NOI18N
        secondPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        firstPanel.add(secondPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 270, 350));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("(MOVIES)");
        firstPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/myselfBack.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        firstPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleBActionPerformed

    private void AgeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AgeSliderStateChanged
        AgeL.setText(Integer.toString(AgeSlider.getValue()));
    }//GEN-LAST:event_AgeSliderStateChanged

    private void ProceedBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedBActionPerformed
        if(evt.getSource()==ProceedB){
            int answer = JOptionPane.showOptionDialog(
                    null, 
                    "Proceed to the game?", 
                    "QUIZZit", 
                    JOptionPane.YES_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    Response1, 
                    0);
            
            if(answer==0){
                Category cc = new Category();
                    cc.setVisible(true);
                    cc.setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_ProceedBActionPerformed
    
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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AgeL;
    public javax.swing.JSlider AgeSlider;
    public javax.swing.JRadioButton FemaleB;
    public javax.swing.JRadioButton MaleB;
    public static javax.swing.JTextField NameF;
    private javax.swing.JLabel NameL;
    public javax.swing.JRadioButton OtherB;
    public javax.swing.JButton ProceedB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel secondPanel;
    // End of variables declaration//GEN-END:variables
}
