/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.myquiz.quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Fahim
 */
public class Easy extends javax.swing.JFrame {

    /**
     * Creates new form Easy
     */
    public Easy() {
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

        q1Ans = new javax.swing.ButtonGroup();
        q2Ans = new javax.swing.ButtonGroup();
        q3Ans = new javax.swing.ButtonGroup();
        q1 = new javax.swing.JLabel();
        q1op4 = new javax.swing.JRadioButton();
        q1op2 = new javax.swing.JRadioButton();
        q1op3 = new javax.swing.JRadioButton();
        q1op1 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JLabel();
        q2op1 = new javax.swing.JRadioButton();
        q2op2 = new javax.swing.JRadioButton();
        q2op3 = new javax.swing.JRadioButton();
        q2op4 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JLabel();
        q3op1 = new javax.swing.JRadioButton();
        q3op2 = new javax.swing.JRadioButton();
        q3op3 = new javax.swing.JRadioButton();
        q3op4 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(202, 229, 166));
        q1.setText("2. What is the color of a yellow banana ?");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        q1Ans.add(q1op4);
        q1op4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q1op4.setForeground(new java.awt.Color(202, 229, 166));
        q1op4.setText("7");
        q1op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1op4ActionPerformed(evt);
            }
        });
        getContentPane().add(q1op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        q1Ans.add(q1op2);
        q1op2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q1op2.setForeground(new java.awt.Color(202, 229, 166));
        q1op2.setText("2");
        q1op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1op2ActionPerformed(evt);
            }
        });
        getContentPane().add(q1op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        q1Ans.add(q1op3);
        q1op3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q1op3.setForeground(new java.awt.Color(202, 229, 166));
        q1op3.setText("4");
        q1op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1op3ActionPerformed(evt);
            }
        });
        getContentPane().add(q1op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        q1Ans.add(q1op1);
        q1op1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q1op1.setForeground(new java.awt.Color(202, 229, 166));
        q1op1.setText("3");
        q1op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1op1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        q2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(202, 229, 166));
        q2.setText("1. What is the 2 + 2 = ?");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 40));

        q2Ans.add(q2op1);
        q2op1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q2op1.setForeground(new java.awt.Color(202, 229, 166));
        q2op1.setText("Red");
        q2op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2op1ActionPerformed(evt);
            }
        });
        getContentPane().add(q2op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        q2Ans.add(q2op2);
        q2op2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q2op2.setForeground(new java.awt.Color(202, 229, 166));
        q2op2.setText("Yellow");
        q2op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2op2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        q2Ans.add(q2op3);
        q2op3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q2op3.setForeground(new java.awt.Color(202, 229, 166));
        q2op3.setText("Cyan");
        q2op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2op3ActionPerformed(evt);
            }
        });
        getContentPane().add(q2op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        q2Ans.add(q2op4);
        q2op4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q2op4.setForeground(new java.awt.Color(202, 229, 166));
        q2op4.setText("Magenta");
        q2op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2op4ActionPerformed(evt);
            }
        });
        getContentPane().add(q2op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        q3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(202, 229, 166));
        q3.setText("3. How tall is Eiffel Tower");
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        q3Ans.add(q3op1);
        q3op1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q3op1.setForeground(new java.awt.Color(202, 229, 166));
        q3op1.setText("200");
        q3op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3op1ActionPerformed(evt);
            }
        });
        getContentPane().add(q3op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        q3Ans.add(q3op2);
        q3op2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q3op2.setForeground(new java.awt.Color(202, 229, 166));
        q3op2.setText("500");
        q3op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3op2ActionPerformed(evt);
            }
        });
        getContentPane().add(q3op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        q3Ans.add(q3op3);
        q3op3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q3op3.setForeground(new java.awt.Color(202, 229, 166));
        q3op3.setText("400");
        q3op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3op3ActionPerformed(evt);
            }
        });
        getContentPane().add(q3op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        q3Ans.add(q3op4);
        q3op4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        q3op4.setForeground(new java.awt.Color(202, 229, 166));
        q3op4.setText("300");
        q3op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3op4ActionPerformed(evt);
            }
        });
        getContentPane().add(q3op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        submit.setBackground(new java.awt.Color(202, 229, 166));
        submit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(1, 1, 1));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        Title.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(202, 229, 166));
        Title.setText("Easy");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 50));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallhaven-exrqrr_1920x1080.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int corr = 0;
    private void q1op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1op4ActionPerformed

    private void q1op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1op2ActionPerformed

    private void q1op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1op3ActionPerformed
        // TODO add your handling code here:
        if (q1op3.isSelected()) {
            corr++;
        }
        
    }//GEN-LAST:event_q1op3ActionPerformed

    private void q1op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1op1ActionPerformed

    private void q2op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2op1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_q2op1ActionPerformed

    private void q2op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2op2ActionPerformed
        // TODO add your handling code here:
        if(q2op2.isSelected())
        {
            corr++;
        }
    }//GEN-LAST:event_q2op2ActionPerformed

    private void q2op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2op3ActionPerformed

    private void q2op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2op4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2op4ActionPerformed

    private void q3op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3op1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3op1ActionPerformed

    private void q3op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3op2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3op2ActionPerformed

    private void q3op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3op3ActionPerformed

    private void q3op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3op4ActionPerformed
        // TODO add your handling code here:
        if(q3op4.isSelected())
        {
            corr++;
        }
    }//GEN-LAST:event_q3op4ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(Easy.this, "You got " + corr + " / 3 Correct");
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Easy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel q1;
    private javax.swing.ButtonGroup q1Ans;
    private javax.swing.JRadioButton q1op1;
    private javax.swing.JRadioButton q1op2;
    private javax.swing.JRadioButton q1op3;
    private javax.swing.JRadioButton q1op4;
    private javax.swing.JLabel q2;
    private javax.swing.ButtonGroup q2Ans;
    private javax.swing.JRadioButton q2op1;
    private javax.swing.JRadioButton q2op2;
    private javax.swing.JRadioButton q2op3;
    private javax.swing.JRadioButton q2op4;
    private javax.swing.JLabel q3;
    private javax.swing.ButtonGroup q3Ans;
    private javax.swing.JRadioButton q3op1;
    private javax.swing.JRadioButton q3op2;
    private javax.swing.JRadioButton q3op3;
    private javax.swing.JRadioButton q3op4;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}