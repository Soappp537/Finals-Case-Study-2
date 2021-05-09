
public class scifiGenre extends javax.swing.JFrame {
    String[][] questions = new String[11][7];
    public static int question = 0;
    public static int numQ = 0;
    public static int score = 0;

    public scifiGenre() {
        initComponents();
        Question();
        Update();
    }
    
    public void Update(){
         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/mystery.png")));
        qSection.setText(questions[question][0]);
        
        numQ++;
        QuestionDisp.setText(""+numQ);
        
        Next.setVisible(false);
        
            ButtA.setText(questions[question][1]);
            ButtB.setText(questions[question][2]);
            ButtC.setText(questions[question][3]);
            ButtD.setText(questions[question][4]);
            
            ButtA.setEnabled(true);
            ButtB.setEnabled(true);
            ButtC.setEnabled(true);
            ButtD.setEnabled(true);
            
    }
    
    public void goBack(){
        qSection.setText(questions[question][0]);
        
        numQ--;
        QuestionDisp.setText(""+numQ);
        
        if(questions[question][0] == questions[question][0]){
            Back.setVisible(false);
        }else if (questions[question][0] != questions[question][0]){
            Back.setVisible(true);
        }
        
            ButtA.setText(questions[question][1]);
            ButtB.setText(questions[question][2]);
            ButtC.setText(questions[question][3]);
            ButtD.setText(questions[question][4]);
            
            ButtA.setEnabled(false);
            ButtB.setEnabled(false);
            ButtC.setEnabled(false);
            ButtD.setEnabled(false);
    }
    
    public void Question(){
        questions[0][0] = "What was the first science fiction film?";
            questions[0][1] = "The Lost World";
            questions[0][2] = "Metropolis";
            questions[0][3] = "Trip to the Moon";
            questions[0][4] = "20,000 Leagues Under the Sea";
            questions[0][5] = "3";
            
        questions[1][0] = "<html><p>In which Lord of the rings movie did Ian McKellen play the character Gandalf the Gray?</p></html>";
            questions[1][1] = "<html><p>Lord of the Rings: The Fellowship Of The Ring</p></htmll>";
            questions[1][2] = "<html><p>Lord of the Rings: The Goblet of Fire</p></html>";
            questions[1][3] = "<html><p>Lord of the Rings: The Desolation of smog</p></html>";
            questions[1][4] = "<html><p>Lord of the Rings: An Unexpected Journey</p></html>";
            questions[1][5] = "1";
            
        questions[2][0] = "What are the good guys called in the Transformers movies?";
            questions[2][1] = "DinoBots";
            questions[2][2] = "Autobots";
            questions[2][3] = "Primes";
            questions[2][4] = "Decepticons";
            questions[2][5] = "2";
            
        questions[3][0] = "In the 2007 film \"Meet the Robinsons\", who does Lewis look for?";
            questions[3][1] = "His Father";
            questions[3][2] = "His Brother";
            questions[3][3] = "His Grandmother";
            questions[3][4] = "His Mother";
            questions[3][5] = "4";
            
        questions[4][0] = "<html><p>In \"The Matrix\", which character says \"Neo, no one has ever done anything like this\"?</p></html>";
            questions[4][1] = "Agent Smith";
            questions[4][2] = "Belluci";
            questions[4][3] = "Morpheus";
            questions[4][4] = "Trinity";
            questions[4][5] = "4";
            
        questions[5][0] = "<html><p>In the movie \"Guardians of the Galaxy\", which group raised Peter Quill a.k.a. Starlord when he was a kid?</p></html>";
            questions[5][1] = "The Ravegers";
            questions[5][2] = "The Revengers";
            questions[5][3] = "Eternals";
            questions[5][4] = "Sentinels";
            questions[5][5] = "1";
            
         questions[6][0] = "<html><p>What NASA probe does Mark Watney hack in 'The Martian'?</p></html>";
            questions[6][1] = "Mars Oportunity";
            questions[6][2] = "Mars Spirit";
            questions[6][3] = "Mars Pathfinder";
            questions[6][4] = "Mars Curiosity";
            questions[6][5] = "3";
            
          questions[7][0] = "";
            questions[7][1] = "";
            questions[7][2] = "";
            questions[7][3] = "";
            questions[7][4] = "";
            questions[7][5] = "3";
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        qSection = new javax.swing.JLabel();
        ButtA = new javax.swing.JButton();
        ButtB = new javax.swing.JButton();
        ButtC = new javax.swing.JButton();
        ButtD = new javax.swing.JButton();
        Next = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        QuestionDisp = new javax.swing.JLabel();
        ScoreDisp = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZZit - Sci-Fi");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qSection.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qSection.setForeground(new java.awt.Color(255, 255, 255));
        qSection.setText("jLabel1");
        qSection.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(qSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 90));

        BackGroundPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 590, 110));

        ButtA.setFocusable(false);
        ButtA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtA.setText("jButton1");
        ButtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtAActionPerformed(evt);
            }
        });
        BackGroundPanel.add(ButtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, 70));

        ButtB.setFocusable(false);
        ButtB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtB.setText("jButton2");
        ButtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtBActionPerformed(evt);
            }
        });
        BackGroundPanel.add(ButtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 190, 70));

        ButtC.setFocusable(false);
        ButtC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtC.setText("jButton3");
        ButtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtCActionPerformed(evt);
            }
        });
        BackGroundPanel.add(ButtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 190, 70));

        ButtD.setFocusable(false);
        ButtD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtD.setText("jButton4");
        ButtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtDActionPerformed(evt);
            }
        });
        BackGroundPanel.add(ButtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, 70));

        Next.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Next>");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        BackGroundPanel.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        Back.setVisible(false);
        Back.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        BackGroundPanel.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        playerLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playerLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerLabel.setText("Player:");
        BackGroundPanel.add(playerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score:");
        BackGroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Question #");
        BackGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Film Knowledge");
        BackGroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 190, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sci-Fi - 7 Questions");
        BackGroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        QuestionDisp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        QuestionDisp.setForeground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.add(QuestionDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        ScoreDisp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ScoreDisp.setForeground(new java.awt.Color(255, 255, 255));
        ScoreDisp.setText("0");
        BackGroundPanel.add(ScoreDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        nameL.setText(mainPage.NameF.getText());
        nameL.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nameL.setForeground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.add(nameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jButton1.setVisible(false);
        jButton1.setFocusable(false);
        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Results");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BackGroundPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/mystery.png"))); // NOI18N
        BackGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, -1, -1));

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/scifiB.png"))); // NOI18N
        BackGroundPanel.add(BackGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(BackGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 476));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtAActionPerformed
        if(questions[question][5] == "1"){
            score++;
            ScoreDisp.setText(""+score);
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        Next.setVisible(true);
        
        ButtA.setEnabled(false);
        ButtB.setEnabled(false);
        ButtC.setEnabled(false);
        ButtD.setEnabled(false);
    }//GEN-LAST:event_ButtAActionPerformed

    private void ButtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtBActionPerformed
        if(questions[question][5] == "2"){
            score++;
            ScoreDisp.setText(""+score);
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        Next.setVisible(true);
        
        ButtA.setEnabled(false);
        ButtB.setEnabled(false);
        ButtC.setEnabled(false);
        ButtD.setEnabled(false);
    }//GEN-LAST:event_ButtBActionPerformed

    private void ButtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtCActionPerformed
        if(questions[question][5] == "3"){
            score++;
            ScoreDisp.setText(""+score);
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
        Next.setVisible(true);
        
        ButtA.setEnabled(false);
        ButtB.setEnabled(false);
        ButtC.setEnabled(false);
        ButtD.setEnabled(false);
    }//GEN-LAST:event_ButtCActionPerformed

    private void ButtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtDActionPerformed
        if(questions[question][5] == "4"){
            score++;
              ScoreDisp.setText(""+score);
               jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/correct2.png")));
        }else{
             jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/wrong2.png")));
        }
      Next.setVisible(true);
        
        ButtA.setEnabled(false);
        ButtB.setEnabled(false);
        ButtC.setEnabled(false);
        ButtD.setEnabled(false);
    }//GEN-LAST:event_ButtDActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        question++;
        Update();
        if(questions[question][0] == questions[7][0]){
            jButton1.setVisible(true);
            QuestionDisp.setText("7");
            qSection.setEnabled(false);
            ButtA.setEnabled(false);
            ButtB.setEnabled(false);
            ButtC.setEnabled(false);
            ButtD.setEnabled(false);
        }
    }//GEN-LAST:event_NextMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        question--;
        goBack();
    }//GEN-LAST:event_BackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(evt.getSource()==jButton1){
            scifiResults sfr = new scifiResults();
            sfr.setVisible(true);
            sfr.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(scifiGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scifiGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scifiGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scifiGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scifiGenre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Back;
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel BackGroundPanel;
    public javax.swing.JButton ButtA;
    public javax.swing.JButton ButtB;
    public javax.swing.JButton ButtC;
    public javax.swing.JButton ButtD;
    public javax.swing.JLabel Next;
    private javax.swing.JLabel QuestionDisp;
    public static javax.swing.JLabel ScoreDisp;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nameL;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel qSection;
    // End of variables declaration//GEN-END:variables
}
