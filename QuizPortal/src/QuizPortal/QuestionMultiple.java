/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizPortal;

import static QuizPortal.Question.qcode;
import static QuizPortal.Question.socket;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author rishabh
 */
public class QuestionMultiple extends javax.swing.JFrame {

    /**
     * Creates new form Question
     */
    static Socket socket;
    static String qcode;
    public QuestionMultiple(Socket socket, String qcode) {
        initComponents();
        this.socket = socket;
        this.qcode = qcode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        D = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tquestion = new javax.swing.JTextArea();
        xyz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizPortal/finish-.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 140, 70));
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 790, 40));
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 790, 40));
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 790, 40));
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 790, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 6, 40, 40));
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 516, 60, 70));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 6, 50, 40));
        getContentPane().add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 70, 30));

        tquestion.setColumns(20);
        tquestion.setRows(5);
        jScrollPane1.setViewportView(tquestion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 790, 120));

        xyz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuizPortal/ADDAQUESTION.jpg"))); // NOI18N
        xyz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xyzMouseClicked(evt);
            }
        });
        getContentPane().add(xyz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Questions set!");
        new section(socket,"subject",qcode).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void xyzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xyzMouseClicked
        // TODO add your handling code here:
        String[] s={"multiple",qcode,"m",tquestion.getText(),A.getText(),B.getText(),C.getText(),D.getText(),answer.getText()};
        try{
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(s);
        }catch(IOException e){
            e.printStackTrace();
        }
        tquestion.setText("");
        A.setText("");
        B.setText("");
        C.setText("");
        D.setText("");
        answer.setText("");
    }//GEN-LAST:event_xyzMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         new section(socket,"subject",qcode).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(QuestionMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionMultiple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionMultiple(socket,qcode).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField D;
    private javax.swing.JTextField answer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel submit;
    private javax.swing.JTextArea tquestion;
    private javax.swing.JLabel xyz;
    // End of variables declaration//GEN-END:variables
}
