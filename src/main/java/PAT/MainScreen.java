/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PAT;

import backend.GatorQuestion;
import backend.GameMethods;
import backend.ChatManager;
import backend.GameStateManager;
import backend.UserManager;
import javax.swing.JButton;
import backend.GatorOption;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author user-pc
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private boolean hasPuzzled = false;

    //variable setup
    private GameMethods gameMethods;
    private UserManager userManager;
    private ChatManager chatManager;
    private GatorQuestion currentQuestion;
    private GatorOption currentOption;
    private boolean hasResponded;
    private boolean hasBirded;

    public MainScreen() {
        initComponents();
        // set up and initlize backend stuff
        setLocationRelativeTo(null);
        dialogue_area.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

        gameMethods = GameStateManager.getGameMethods();
        userManager = GameStateManager.getUserManager();
        chatManager = new ChatManager();
        hasBirded = false;
        hasResponded = false;
        hasResponded = true;

        //set question id to 1
        setQuestionForId("Q1");

        //love bar setup
        loveBar.setOrientation(loveBar.VERTICAL);
        loveBar.setMinimum(0);
        loveBar.setMaximum(100);
        loveBar.setValue(0);
    }

    private void setQuestionForId(String questionId) {
        //gets questions and options etc
        currentQuestion = chatManager.questions.get(questionId);
        //System.out.println(currentQuestion.toString());
        if (currentQuestion != null) {
            dialogue_area.setText(currentQuestion.questionText);
            button1.setText(currentQuestion.options[0].optionText);
            button2.setText(currentQuestion.options[1].optionText);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogue_area = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        loveBar = new javax.swing.JProgressBar();
        nameplace = new javax.swing.JLabel();
        picplace = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagearea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dialogue_area.setEditable(false);
        dialogue_area.setColumns(20);
        dialogue_area.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        dialogue_area.setLineWrap(true);
        dialogue_area.setRows(5);
        dialogue_area.setBorder(null);
        dialogue_area.setOpaque(false);
        getContentPane().add(dialogue_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 840, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barfull.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barneut.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barang.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparentTest1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 840, 190));

        button1.setText("PLACEHOLDER");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 430, 90));

        button2.setText("PLACEHOLDER");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 430, 90));

        loveBar.setToolTipText("");
        getContentPane().add(loveBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 450));

        nameplace.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        getContentPane().add(nameplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        getContentPane().add(picplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 210, 190, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quit.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 50, 50));

        imagearea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatordoorclosed.png"))); // NOI18N
        getContentPane().add(imagearea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1315, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        //redirect to button method
        handleButtonAction((JButton) evt.getSource());

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        //redirect to button method
        handleButtonAction((JButton) evt.getSource());

    }//GEN-LAST:event_button2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //bring back home
        LandingScreen land = new LandingScreen();
        land.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    //handles all buttons
    private void handleButtonAction(JButton target) {
        if (this.currentQuestion == null) {

            //debugging
            dialogue_area.setText("BUG ALERT");
            return;
        }
        //if response has happened
        hasResponded = !hasResponded;

        button2.setVisible(hasResponded);

        //if response has not happened
        if (!hasResponded) {

            //gets responses and updates accordingly
            currentOption = (target == this.button1) ? currentQuestion.options[0] : currentQuestion.options[1];
            dialogue_area.setText(currentOption.response);
            button1.setText("Next");
            ImageIcon icon = new ImageIcon(currentOption.optionImage);
            imagearea.setIcon(icon);

            int barValue = gameMethods.adjustBarValue(Integer.parseInt(currentOption.barvalue));

            //makes pic stuff hidden if not happening
            if (currentOption.pic == null) {
                picplace.setVisible(false);
                nameplace.setVisible(false);
                //if pic true queues event
            } else if (currentOption.pic.equals("true")) {

                gameMethods.getVacationPicture(userManager.getUserPicNumber(), nameplace, picplace);
                picplace.setVisible(true);
                nameplace.setVisible(true);
            }
            //if endtrue queues event
            if (currentOption.nextQuestionID.equals("END")) {
                EndingScreen end = new EndingScreen();
                end.setVisible(true);
                dispose();
            }
            loveBar.setValue(barValue);

        } else {

            setQuestionForId(currentOption.nextQuestionID);
            //sets question image
            if (currentQuestion.questionImage != "") {
                ImageIcon icon2 = new ImageIcon(currentQuestion.questionImage);
                imagearea.setIcon(icon2);

                if (currentQuestion.puzzleGame == null) {
                    //if bird true and hasnt happened queues event
                } else if (currentQuestion.puzzleGame.equals("true") && hasPuzzled == false) {
                    PuzzleGame passport = new PuzzleGame();
                    passport.setVisible(true);
                    hasPuzzled = true;
                }
                //if bird true and hasnt happened queues event
                if (currentQuestion.birdGame == null) {
                } else if (currentQuestion.birdGame.equals("true") && hasBirded == false) {
                    BirdMiniGame birdgame = new BirdMiniGame();
                    birdgame.setVisible(true);
                    hasBirded = true;
                } else {
                }

            }

        }
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JTextArea dialogue_area;
    private javax.swing.JLabel imagearea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar loveBar;
    private javax.swing.JLabel nameplace;
    private javax.swing.JLabel picplace;
    // End of variables declaration//GEN-END:variables
}
