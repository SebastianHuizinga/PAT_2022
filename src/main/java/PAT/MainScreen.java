/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PAT;

import backend.GatorQuestion;
import backend.ChatManager;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;

/**
 *
 * @author user-pc
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private int bar_value = 0;
    private int ans_val1 = 0;
    private int ans_val2 = 0;

    private ChatManager chatManager;
    private GatorQuestion currentQuestion;

    public MainScreen() {
        initComponents();

        chatManager = new ChatManager();

        setQuestionForId("Q1");

        loveBar.setOrientation(loveBar.VERTICAL);
        loveBar.setMinimum(0);
        loveBar.setMaximum(100);
        loveBar.setValue(0);
    }

    private void setQuestionForId(String questionId) {
        currentQuestion = chatManager.questions.get(questionId);
        if (currentQuestion != null) {
            dialogue_area.setText(currentQuestion.questionText);
            button1.setText(currentQuestion.options[0].optionText);
            button2.setText(currentQuestion.options[1].optionText);
            System.out.println(currentQuestion);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        dialogue_area = new javax.swing.JTextArea();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        loveBar = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dialogue_area.setEditable(false);
        dialogue_area.setColumns(20);
        dialogue_area.setRows(5);
        jScrollPane1.setViewportView(dialogue_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 820, 190));

        button1.setText("PLACEHOLDER");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 280, 90));

        button2.setText("PLACEHOLDER");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 280, 90));

        loveBar.setToolTipText("");
        getContentPane().add(loveBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 490));

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        handleButtonAction((JButton) evt.getSource());
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        handleButtonAction((JButton) evt.getSource());
        System.out.println("");
    }//GEN-LAST:event_button2ActionPerformed

    private void handleButtonAction(JButton target) {
        if (this.currentQuestion != null) {
            int selection = (target == this.button1) ? 0 : 1;
            setQuestionForId(this.currentQuestion.options[selection].nextQuestionID);

        }

        if (this.currentQuestion == null) {
            target.setBackground(Color.RED);
            dialogue_area.setText("Gator cannot find JSON question!!");
            target.setText("gator eats you");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LandingScreen home = new LandingScreen();
        home.setVisible(true);
        dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar loveBar;
    // End of variables declaration//GEN-END:variables
}