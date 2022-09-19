/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizPortal;

/**
 *
 * @author rishabh
 */
public class HOME extends javax.swing.JFrame {

    /**
     * Creates new form HOME
     */
    public HOME() {
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

        ADMINBTN = new javax.swing.JLabel();
        CLOSE = new javax.swing.JLabel();
        USERBTN = new javax.swing.JLabel();
        MINIMIZE = new javax.swing.JLabel();
        HOME = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADMINBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADMINBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINBTNMouseClicked(evt);
            }
        });
        getContentPane().add(ADMINBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 250, 50));

        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLOSEMouseClicked(evt);
            }
        });
        getContentPane().add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 30));

        USERBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        USERBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USERBTNMouseClicked(evt);
            }
        });
        getContentPane().add(USERBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 270, 70));

        MINIMIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZEMouseClicked(evt);
            }
        });
        getContentPane().add(MINIMIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 30));

        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/HOME.jpg"))); // NOI18N
        getContentPane().add(HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CLOSEMouseClicked

    private void MINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZEMouseClicked
       //this.State(HOME.ICONIFIED);


    }//GEN-LAST:event_MINIMIZEMouseClicked

    private void ADMINBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINBTNMouseClicked
       new ADMIN().setVisible(true); 
       dispose();
    }//GEN-LAST:event_ADMINBTNMouseClicked

    private void USERBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USERBTNMouseClicked
        new StudentLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_USERBTNMouseClicked

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
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINBTN;
    private javax.swing.JLabel CLOSE;
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JLabel USERBTN;
    // End of variables declaration//GEN-END:variables
}