/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PAT;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;

/**
 *
 * @author Sebastianh
 */
public final class BirdMiniGame extends javax.swing.JFrame {

    Timer stopwatch;
    int count = 0;
    int delay = 1000;

    public int startTimer(int countpassed) {

        ActionListener action_listen = (ActionEvent e) -> {
            if (count == 0) {
                stopwatch.stop();

                BirdLossScreen loss = new BirdLossScreen();
                System.out.println("Lose");
                Timer.setText("out of time");
                loss.setVisible(true);
                dispose();

            } else {
                Timer.setText(" " + count + "seconds");
                count--;

            }
        };

        stopwatch = new Timer(delay, action_listen);
        stopwatch.setInitialDelay(0);
        stopwatch.start();
        count = countpassed;

        return count;

    }

    private int x_width = 0;
    private int y_height = 0;
    private double x_size, y_size;

    private int birds_hit = 0;
    private int x_btn = 0;
    private int y_btn = 0;

    public BirdMiniGame() {
        initComponents();
        cursor.setVisible(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x_size = screenSize.getWidth();
        y_size = screenSize.getHeight();

        x_width = getWidth();
        y_height = getHeight();

        setExtendedState(MAXIMIZED_BOTH);
        this.setCursor(this.getToolkit().createCustomCursor(
                new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB),
                new Point(),
                null));

        int timerX = clock_icon.getX() + clock_icon.getWidth() / 2 + Timer.getWidth() / 2;
        int timerY = clock_icon.getY() + clock_icon.getHeight() / 2 + Timer.getHeight() / 2;

        Timer.setLocation(timerX, timerY);
        clock_icon.setLocation(Timer.getLocation());

        //clock_icon.setLocation(Timer.getLocation());
        startTimer(90);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        cursor = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        birdo = new javax.swing.JLabel();
        clock_icon = new javax.swing.JLabel();
        birdo1 = new javax.swing.JLabel();
        birdo2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(null);

        cursor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gator_hand3.png"))); // NOI18N
        getContentPane().add(cursor);
        cursor.setBounds(440, 410, 200, 220);

        Timer.setFont(new java.awt.Font("MV Boli", 0, 34)); // NOI18N
        getContentPane().add(Timer);
        Timer.setBounds(430, 10, 190, 90);
        getContentPane().add(score);
        score.setBounds(30, 100, 560, 70);

        birdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birdohat.png"))); // NOI18N
        birdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdoMouseClicked(evt);
            }
        });
        getContentPane().add(birdo);
        birdo.setBounds(740, 160, 150, 150);

        clock_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clock.png"))); // NOI18N
        getContentPane().add(clock_icon);
        clock_icon.setBounds(460, 50, 200, 90);

        birdo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birdoknight.png"))); // NOI18N
        birdo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdo1MouseClicked(evt);
            }
        });
        getContentPane().add(birdo1);
        birdo1.setBounds(230, 130, 150, 150);

        birdo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/el birdo.png"))); // NOI18N
        birdo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdo2MouseClicked(evt);
            }
        });
        getContentPane().add(birdo2);
        birdo2.setBounds(460, 230, 150, 150);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

        // TODO add your handling code here:d
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        Point mouse_pos = getMousePosition();
        cursor.setVisible(true);
        cursor.setLocation(mouse_pos);

    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void birdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdoMouseClicked
        x_btn = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        y_btn = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn2 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn2 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn3 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn3 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        birdo.setLocation(x_btn, y_btn);
        birdo1.setLocation(x_btn2, y_btn2);
        birdo2.setLocation(x_btn3, y_btn3);
        birds_hit += 1;
        if (birds_hit > 0 && birds_hit < 5) {
            score.setText("GET IT! " + birds_hit + " HITS!");
        } else if (birds_hit >= 5 && birds_hit < 10) {
            score.setText("KEEP GOING! " + birds_hit + " HITS!");
        } else if (birds_hit >= 10 && birds_hit < 20) {
            score.setText("ALMOST THERE! " + birds_hit + " HITS!");
        } else if (birds_hit >= 20 && birds_hit < 29) {
            score.setText("THE TIME IS COMINGGG! " + birds_hit + " HITS!");
        } else if (birds_hit == 29) {
            score.setText("ONE MORE! " + birds_hit + " HITS!");
        } else if (birds_hit == 30) {
            score.setText("WOWEOWEOWEOWEOW");
            BirdWinScreen gw = new BirdWinScreen();
            gw.setVisible(true);
            dispose();

    }//GEN-LAST:event_birdoMouseClicked
    }

    private void birdo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdo1MouseClicked
        // TODO add your handling code here:
        x_btn = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        y_btn = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn2 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn2 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn3 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn3 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        birdo.setLocation(x_btn, y_btn);
        birdo1.setLocation(x_btn2, y_btn2);
        birdo2.setLocation(x_btn3, y_btn3);
        birds_hit += 1;
        if (birds_hit > 0 && birds_hit < 5) {
            score.setText("GET IT! " + birds_hit + " HITS!");
        } else if (birds_hit >= 5 && birds_hit < 10) {
            score.setText("KEEP GOING! " + birds_hit + " HITS!");
        } else if (birds_hit >= 10 && birds_hit < 20) {
            score.setText("ALMOST THERE! " + birds_hit + " HITS!");
        } else if (birds_hit >= 20 && birds_hit < 29) {
            score.setText("THE TIME IS COMINGGG! " + birds_hit + " HITS!");
        } else if (birds_hit == 29) {
            score.setText("ONE MORE! " + birds_hit + " HITS!");
        } else if (birds_hit == 30) {
            score.setText("WOWEOWEOWEOWEOW");
            BirdWinScreen gw = new BirdWinScreen();
            gw.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_birdo1MouseClicked

    private void birdo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdo2MouseClicked
        // TODO add your handling code here:
        x_btn = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        y_btn = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn2 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn2 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        int x_btn3 = (int) (Math.random() * ((x_size - 50) - 0) + 0);
        int y_btn3 = (int) (Math.random() * ((y_size - 50) - 0) + 0);
        birdo.setLocation(x_btn, y_btn);
        birdo1.setLocation(x_btn2, y_btn2);
        birdo2.setLocation(x_btn3, y_btn3);
        birds_hit += 1;
        if (birds_hit > 0 && birds_hit < 5) {
            score.setText("GET IT! " + birds_hit + " HITS!");
        } else if (birds_hit >= 5 && birds_hit < 10) {
            score.setText("KEEP GOING! " + birds_hit + " HITS!");
        } else if (birds_hit >= 10 && birds_hit < 20) {
            score.setText("ALMOST THERE! " + birds_hit + " HITS!");
        } else if (birds_hit >= 20 && birds_hit < 29) {
            score.setText("THE TIME IS COMINGGG! " + birds_hit + " HITS!");
        } else if (birds_hit == 29) {
            score.setText("ONE MORE! " + birds_hit + " HITS!");
        } else if (birds_hit == 30) {
            score.setText("WOWEOWEOWEOWEOW");
            BirdWinScreen gw = new BirdWinScreen();
            gw.setVisible(true);
            dispose();

    }//GEN-LAST:event_birdo2MouseClicked
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
            java.util.logging.Logger.getLogger(BirdMiniGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirdMiniGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirdMiniGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirdMiniGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirdMiniGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel birdo;
    private javax.swing.JLabel birdo1;
    private javax.swing.JLabel birdo2;
    private javax.swing.JLabel clock_icon;
    private javax.swing.JLabel cursor;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
