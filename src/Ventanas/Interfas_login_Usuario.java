/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author lzJonathanHz
 */
public class Interfas_login_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Interfas_login_Usuario
     */
    public Interfas_login_Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField_Clave = new javax.swing.JPasswordField();
        jButton_Ingresar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Imagenes/user.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("INICIAR SESION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jTextField_Usuario.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsuarioActionPerformed(evt);
            }
        });
        jTextField_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_UsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(jTextField_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLAVE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 262, 80, 30));

        jPasswordField_Clave.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField_Clave.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ClaveActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField_Clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 210, 30));

        jButton_Ingresar.setBackground(new java.awt.Color(51, 51, 255));
        jButton_Ingresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Ingresar.setText("INGRESAR");
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, 50));

        jButton_Salir.setBackground(new java.awt.Color(0, 102, 204));
        jButton_Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salir.setText("SALIR");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jTextField_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsuarioActionPerformed

    private void jPasswordField_ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ClaveActionPerformed

    private void jTextField_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UsuarioKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
           getToolkit().beep();
           evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Letras");
        }
    }//GEN-LAST:event_jTextField_UsuarioKeyTyped

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
            java.util.logging.Logger.getLogger(Interfas_login_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfas_login_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfas_login_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfas_login_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfas_login_Usuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Clave;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
