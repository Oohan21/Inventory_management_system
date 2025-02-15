
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author kasso
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);
        if (role.equals("Admin")) {
            btnuser.setVisible(false);
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

        btnuser = new javax.swing.JButton();
        btncat = new javax.swing.JButton();
        btnpro = new javax.swing.JButton();
        btncus = new javax.swing.JButton();
        btnor = new javax.swing.JButton();
        btnvw = new javax.swing.JButton();
        btnlo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnuser.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        btnuser.setText("User");
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });
        getContentPane().add(btnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        btncat.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btncat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btncat.setText("Category");
        btncat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncatActionPerformed(evt);
            }
        });
        getContentPane().add(btncat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnpro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        btnpro.setText("Product");
        btnpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproActionPerformed(evt);
            }
        });
        getContentPane().add(btnpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        btncus.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btncus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
        btncus.setText("Customer");
        btncus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncusActionPerformed(evt);
            }
        });
        getContentPane().add(btncus, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        btnor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orders.png"))); // NOI18N
        btnor.setText("Order");
        btnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorActionPerformed(evt);
            }
        });
        getContentPane().add(btnor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        btnvw.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnvw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-orders.png"))); // NOI18N
        btnvw.setText("View order");
        btnvw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvwActionPerformed(evt);
            }
        });
        getContentPane().add(btnvw, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, -1, -1));

        btnlo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btnlo.setText("Logout");
        btnlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloActionPerformed(evt);
            }
        });
        getContentPane().add(btnlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnuserActionPerformed

    private void btnloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnloActionPerformed

    private void btncatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncatActionPerformed
        // TODO add your handling code here:
        new manageCategory().setVisible(true);
    }//GEN-LAST:event_btncatActionPerformed

    private void btnproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnproActionPerformed

    private void btncusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncusActionPerformed
        // TODO add your handling code here:
        new manageCustomer().setVisible(true);
    }//GEN-LAST:event_btncusActionPerformed

    private void btnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnorActionPerformed

    private void btnvwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvwActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnvwActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncat;
    private javax.swing.JButton btncus;
    private javax.swing.JButton btnlo;
    private javax.swing.JButton btnor;
    private javax.swing.JButton btnpro;
    private javax.swing.JButton btnuser;
    private javax.swing.JButton btnvw;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
