
import javax.swing.JOptionPane;


public class actionGenre extends javax.swing.JFrame {
    String[][] quiz = new String[11][8];
    public static int question = 0;
    public static int score = 0;
    public static int quizNum = 0;
    String[] choice = {"Yes, continue"};
    
    public actionGenre() {
        initComponents();
        Questions();
        Updates();
    }
    
    public void Updates(){
        checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/mystery.png")));
        jLabel3.setText(quiz[question][0]);
        
        quizNum++;
        numM.setText(""+quizNum);
        
            bA.setText(quiz[question][1]);
            bB.setText(quiz[question][2]);
            bC.setText(quiz[question][3]);
            bD.setText(quiz[question][4]);
            
            bA.setEnabled(true);
            bB.setEnabled(true);
            bC.setEnabled(true);
            bD.setEnabled(true);
    }
    
    public void UpdatesBack(){
        jLabel3.setText(quiz[question][0]);
        
        quizNum--;
        numM.setText(""+quizNum);
        
            bA.setText(quiz[question][1]);
            bB.setText(quiz[question][2]);
            bC.setText(quiz[question][3]);
            bD.setText(quiz[question][4]);
            
            bA.setEnabled(false);
            bB.setEnabled(false);
            bC.setEnabled(false);
            bD.setEnabled(false);
    }
    
    public void Questions(){
        quiz[0][0] = "In the movie The Matrix, what is the color of the pill that Neo took?";
            quiz[0][1] = "Blue pill";
            quiz[0][2] = "Yellow pill";
            quiz[0][3] = "Red pill";
            quiz[0][4] = "Green pill";
            quiz[0][5] = "3";
            
        quiz[1][0] = "<html><p>What is the name of the ultimate antagonist in the Netflix series: Stranger Things?</p></html>";
            quiz[1][1] = "The Mind Flayer";
            quiz[1][2] = "Dementors";
            quiz[1][3] = "Demogorgon";
            quiz[1][4] = "Skrulls";
            quiz[1][5] = "1";
            
        quiz[2][0] = "What year was the first Mortal Kombat movie released?";
            quiz[2][1] = "2000";
            quiz[2][2] = "1994";
            quiz[2][3] = "1998";
            quiz[2][4] = "1995";
            quiz[2][5] = "4";
            
        quiz[3][0] = "Slyvester Stallone plays what character in the Expendables movies?";
            quiz[3][1] = "Wesley Snipes";
            quiz[3][2] = "Barney Ross";
            quiz[3][3] = "The Brit";
            quiz[3][4] = "Gunnar Jensen";
            quiz[3][5] = "2";
            
         quiz[4][0] = "How many people does John Wick kill in the first movie?";
            quiz[4][1] = "54";
            quiz[4][2] = "77";
            quiz[4][3] = "80";
            quiz[4][4] = "97";
            quiz[4][5] = "2";
            
        quiz[5][0] = "In what movie did X24 kill Professor X?";
            quiz[5][1] = "Logan (2017)";
            quiz[5][2] = "X-Men 3:The Last Stand (2006)";
            quiz[5][3] = "The Wolverine (2013)";
            quiz[5][4] = "X-Men: Days of Future Past (2014)";
            quiz[5][5] = "1";
            
        quiz[6][0] = "John Rambo is a veteran of what war?";
            quiz[6][1] = "World War II";
            quiz[6][2] = "Korean War";
            quiz[6][3] = "Vietnam War";
            quiz[6][4] = "World War I";
            quiz[6][5] = "3";
            
        quiz[7][0] = "<html><p>What character does Heath Ledger play in the movie: The Dark Knight?</p><html>";
            quiz[7][1] = "The Riddler";
            quiz[7][2] = "Ra's al Ghul";
            quiz[7][3] = "Bane";
            quiz[7][4] = "The Joker";
            quiz[7][5] = "4";
            
        quiz[8][0] = "<html><p>In the marvel comics, what was John Walker called before taking up the mantle of Captain America?</p></html>";
            quiz[8][1] = "BattleStar";
            quiz[8][2] = "Super-Patriot";
            quiz[8][3] = "US Agent";
            quiz[8][4] = "Nomad";
            quiz[8][5] = "2";
            
       quiz[9][0] = "What is the current highest-grossing film of all time?";
            quiz[9][1] = "Avatar (2009)";
            quiz[9][2] = "Titanic (1997)";
            quiz[9][3] = "Avengers: Endgame (2019)";
            quiz[9][4] = "Jurassic World (2015)";
            quiz[9][5] = "1";
            
        quiz[10][0] = "------";
            quiz[10][1] = "-----";
            quiz[10][2] = "-----";
            quiz[10][3] = "-----";
            quiz[10][4] = "-----";
            quiz[10][5] = "Click here to see reults";
            quiz[10][6] = "5";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        backGroundPanel = new javax.swing.JPanel();
        botPanel = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        playerName = new javax.swing.JLabel();
        scoreDisp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numM = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        choicesPanels = new javax.swing.JPanel();
        bA = new javax.swing.JRadioButton();
        bB = new javax.swing.JRadioButton();
        bC = new javax.swing.JRadioButton();
        bD = new javax.swing.JRadioButton();
        bE = new javax.swing.JRadioButton();
        checker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZZit - Action");

        backGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFocusable(false);
        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        next.setForeground(new java.awt.Color(51, 51, 51));
        next.setText("Next>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        botPanel.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 10, 90, 50));

        back.setFocusable(false);
        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(51, 51, 51));
        back.setText("<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        botPanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/movieBB.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        botPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        backGroundPanel.add(botPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 800, 70));

        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 255, 255));
        playerName.setText("Player:");
        topPanel.add(playerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        scoreDisp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreDisp.setForeground(new java.awt.Color(255, 255, 255));
        scoreDisp.setText("Score:");
        topPanel.add(scoreDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Film Knowledge");
        topPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Action - 10 Questions");
        topPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Question #");
        topPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        numM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numM.setForeground(new java.awt.Color(255, 255, 255));
        topPanel.add(numM, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        nameLabel.setText(mainPage.NameF.getText());
        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        topPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        scoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("0");
        topPanel.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/jpn.png"))); // NOI18N
        topPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        backGroundPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        questionPanel.setBackground(new java.awt.Color(255, 255, 255));
        questionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("jLabel3");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        backGroundPanel.add(questionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 600, 90));

        choicesPanels.setBackground(new java.awt.Color(255, 255, 255));
        choicesPanels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        bA.setFocusable(false);
        bA.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bA);
        bA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bA.setForeground(new java.awt.Color(51, 51, 51));
        bA.setText("jRadioButton1");
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });

        bB.setFocusable(false);
        bB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bB);
        bB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bB.setForeground(new java.awt.Color(51, 51, 51));
        bB.setText("jRadioButton2");
        bB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBActionPerformed(evt);
            }
        });

        bC.setFocusable(false);
        bC.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bC);
        bC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bC.setForeground(new java.awt.Color(51, 51, 51));
        bC.setText("jRadioButton3");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bD.setFocusable(false);
        bD.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bD);
        bD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bD.setForeground(new java.awt.Color(51, 51, 51));
        bD.setText("jRadioButton4");
        bD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDActionPerformed(evt);
            }
        });

        bE.setVisible(false);
        bE.setFocusable(false);
        bE.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bE);
        bE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bE.setForeground(new java.awt.Color(51, 51, 51));
        bE.setText("Click here to see results");
        bE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choicesPanelsLayout = new javax.swing.GroupLayout(choicesPanels);
        choicesPanels.setLayout(choicesPanelsLayout);
        choicesPanelsLayout.setHorizontalGroup(
            choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicesPanelsLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choicesPanelsLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(bE))
                    .addGroup(choicesPanelsLayout.createSequentialGroup()
                        .addGroup(choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bB)
                            .addComponent(bA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 99, Short.MAX_VALUE)
                        .addGroup(choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bC)
                            .addComponent(bD))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        choicesPanelsLayout.setVerticalGroup(
            choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicesPanelsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bA)
                    .addComponent(bC))
                .addGap(53, 53, 53)
                .addGroup(choicesPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bB)
                    .addComponent(bD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        backGroundPanel.add(choicesPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 600, 210));

        checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/mystery.png"))); // NOI18N
        backGroundPanel.add(checker, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
        if(quiz[question][5] == "1"){
            score++;
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
            
        }
        scoreLabel.setText(""+score);
        
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        
    }//GEN-LAST:event_bAActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        question++;
        Updates();
        
        if(quiz[question][0] == quiz[10][0]){
            bE.setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void bBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBActionPerformed
        if(quiz[question][5] == "2"){
            score++;
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        scoreLabel.setText(""+score);
        
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
    }//GEN-LAST:event_bBActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        if(quiz[question][5] == "3"){
            score++;
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        scoreLabel.setText(""+score);
        
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
    }//GEN-LAST:event_bCActionPerformed

    private void bDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDActionPerformed
        if(quiz[question][5] == "4"){
            score++;
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
            checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        scoreLabel.setText(""+score);
        
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
    }//GEN-LAST:event_bDActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if(evt.getSource()==back){
            question--;
            UpdatesBack();
        }
    }//GEN-LAST:event_backActionPerformed

    private void bEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEActionPerformed
        if(evt.getSource()==bE){
            actionResults ar = new actionResults();
            ar.setVisible(true);
            ar.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_bEActionPerformed

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
            java.util.logging.Logger.getLogger(actionGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actionGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actionGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actionGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actionGenre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton bA;
    public static javax.swing.JRadioButton bB;
    public static javax.swing.JRadioButton bC;
    public static javax.swing.JRadioButton bD;
    public static javax.swing.JRadioButton bE;
    public static javax.swing.JButton back;
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.JPanel botPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel checker;
    private javax.swing.JPanel choicesPanels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel nameLabel;
    public static javax.swing.JButton next;
    private javax.swing.JLabel numM;
    private javax.swing.JLabel playerName;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JLabel scoreDisp;
    public static javax.swing.JLabel scoreLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
