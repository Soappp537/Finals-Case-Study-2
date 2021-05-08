
import javax.swing.JOptionPane;

public class Category extends javax.swing.JFrame {
    String[] answer2 = {"yes", "go back"};
    
    public Category() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sifiB = new javax.swing.JButton();
        ActionB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Congratss = new javax.swing.JButton();
        BackGroundLabell = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuItem = new javax.swing.JMenu();
        menuSub1 = new javax.swing.JMenuItem();
        HelpItem = new javax.swing.JMenu();
        menuSub2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZZit");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGroundPanel.setBackground(new java.awt.Color(102, 102, 255));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pick a genre:");
        BackGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        sifiB.setFocusable(false);
        sifiB.setEnabled(false);
        sifiB.setBackground(new java.awt.Color(204, 204, 204));
        sifiB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sifiB.setForeground(new java.awt.Color(51, 51, 51));
        sifiB.setText("Sci-Fi");
        sifiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifiBActionPerformed(evt);
            }
        });
        BackGroundPanel.add(sifiB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 50));

        ActionB.setFocusable(false);
        ActionB.setBackground(new java.awt.Color(204, 204, 204));
        ActionB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ActionB.setForeground(new java.awt.Color(51, 51, 51));
        ActionB.setText("Action");
        ActionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionBActionPerformed(evt);
            }
        });
        BackGroundPanel.add(ActionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        BackGroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setText(mainPage.NameF.getText());
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("~Our genres for today~");
        BackGroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel6.setText(mainPage.AgeL.getText());
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Congratss.setFocusable(false);
        Congratss.setVisible(false);
        Congratss.setBackground(new java.awt.Color(204, 204, 204));
        Congratss.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Congratss.setForeground(new java.awt.Color(51, 51, 51));
        Congratss.setText("Click here");
        Congratss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongratssActionPerformed(evt);
            }
        });
        BackGroundPanel.add(Congratss, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 120, 40));

        BackGroundLabell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/grad1.jpg"))); // NOI18N
        BackGroundPanel.add(BackGroundLabell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 370));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));

        MenuItem.setForeground(new java.awt.Color(255, 255, 255));
        MenuItem.setText("Menu");

        menuSub1.setBackground(new java.awt.Color(51, 51, 51));
        menuSub1.setForeground(new java.awt.Color(255, 255, 255));
        menuSub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/goBack3.png"))); // NOI18N
        menuSub1.setText("Login page");
        menuSub1.setToolTipText("");
        menuSub1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSub1MouseClicked(evt);
            }
        });
        menuSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSub1ActionPerformed(evt);
            }
        });
        MenuItem.add(menuSub1);

        jMenuBar1.add(MenuItem);

        HelpItem.setForeground(new java.awt.Color(255, 255, 255));
        HelpItem.setText("Help");

        menuSub2.setBackground(new java.awt.Color(51, 51, 51));
        menuSub2.setForeground(new java.awt.Color(255, 255, 255));
        menuSub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Qmark1.png"))); // NOI18N
        menuSub2.setText("About us");
        menuSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSub2ActionPerformed(evt);
            }
        });
        HelpItem.add(menuSub2);

        jMenuBar1.add(HelpItem);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSub1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSub1MouseClicked
        
    }//GEN-LAST:event_menuSub1MouseClicked

    private void menuSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSub1ActionPerformed
        if(evt.getSource()==menuSub1){
            int response2 =JOptionPane.showOptionDialog(
                    null, 
                    "Go back to Login page?", 
                    "QUIZZit", 
                    JOptionPane.YES_NO_CANCEL_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    answer2, 
                    0);
            
            if(response2 == 0){
                 mainPage cc = new mainPage();
                cc.setVisible(true);
                cc.setLocationRelativeTo(null);
                this.dispose();
            }else if(response2==1){
                new Category();
            }
        }
    }//GEN-LAST:event_menuSub1ActionPerformed

    private void menuSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSub2ActionPerformed
         if(evt.getSource()==menuSub2){
           AboutUs aua = new AboutUs();
           aua.setVisible(true);
           aua.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_menuSub2ActionPerformed

    private void ActionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionBActionPerformed
        if(evt.getSource()==ActionB){
            actionGenre ac = new actionGenre();
            ac.setVisible(true);
            ac.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_ActionBActionPerformed

    private void sifiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifiBActionPerformed
        if(evt.getSource()==sifiB){
            scifiGenre sf = new scifiGenre();
            sf.setVisible(true);
            sf.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_sifiBActionPerformed

    private void CongratssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongratssActionPerformed
        if(evt.getSource()==Congratss){
            thankYouPage typ = new thankYouPage();
            typ.setVisible(true);
            typ.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_CongratssActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ActionB;
    private javax.swing.JLabel BackGroundLabell;
    private javax.swing.JPanel BackGroundPanel;
    public javax.swing.JButton Congratss;
    private javax.swing.JMenu HelpItem;
    public javax.swing.JMenu MenuItem;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem menuSub1;
    private javax.swing.JMenuItem menuSub2;
    public javax.swing.JButton sifiB;
    // End of variables declaration//GEN-END:variables
}
