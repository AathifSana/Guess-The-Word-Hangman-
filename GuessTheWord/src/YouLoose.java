
public class YouLoose extends javax.swing.JFrame {

    public YouLoose() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblyouloose3 = new javax.swing.JLabel();
        youlooseinfo3 = new javax.swing.JLabel();
        lblcorrectword3 = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("You Loose");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        lblyouloose3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lblyouloose3.setForeground(new java.awt.Color(255, 0, 0));
        lblyouloose3.setText("You Loose!!!");

        youlooseinfo3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        youlooseinfo3.setText("<html>\nSorry !!!<br><br>\n\nBut you lost the game<br><br>\n\nBetter luck next time\n</html>");

        lblcorrectword3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblcorrectword3.setText("The Correct Word was");

        btnRestart.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnRestart.setText("Play Again");
        btnRestart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(youlooseinfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcorrectword3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblyouloose3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblyouloose3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(youlooseinfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblcorrectword3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRestart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        dispose();  // Disposing the current window
        GuessTheWord game1 = new GuessTheWord();   //Refering the Main JFrame as an object called game1
        game1.dispose();                        // Disposing the main JFrame
        new GuessTheWord().setVisible(true);        // Creating a new Game
    }//GEN-LAST:event_btnRestartActionPerformed

    public void setLabelText(String text) {
        lblcorrectword3.setText(text);      // Setting the hiddenWord to the appropriate label
    }

    /*
    Setting the Text of the label.
    Parameter is String text, which will act as the Text given to show the hiddenWord when the user looses.
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YouLoose().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestart;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblcorrectword3;
    private javax.swing.JLabel lblyouloose3;
    private javax.swing.JLabel youlooseinfo3;
    // End of variables declaration//GEN-END:variables
}
