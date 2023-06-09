/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Mariana
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        controller = new LoginController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton_entrar = new javax.swing.JToggleButton();
        txt_password = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jLabel_login = new javax.swing.JLabel();
        jLabel_painel = new javax.swing.JLabel();
        jLabel_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton_entrar.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton_entrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton_entrar.setText("Entrar");
        jToggleButton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 290, 40));

        txt_password.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 290, 40));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 290, 40));

        jLabel_password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Senha");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, -1));

        jLabel_user.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_user.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_user.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user.setText("Usuário");
        getContentPane().add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel_login.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_login.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel_login.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_login.setText("Login");
        getContentPane().add(jLabel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel_painel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/painel-login.png"))); // NOI18N
        getContentPane().add(jLabel_painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_entrarActionPerformed
        //executa quando clico no botão
        controller.entrarNoSistema();

    }//GEN-LAST:event_jToggleButton_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_fundo;
    private javax.swing.JLabel jLabel_login;
    private javax.swing.JLabel jLabel_painel;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JToggleButton jToggleButton_entrar;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
       JOptionPane.showMessageDialog(null,mensagem);
    }

    public JPasswordField getTxt_password() {
        return txt_password;
    }

    public void setTxt_password(JPasswordField txt_password) {
        this.txt_password = txt_password;
    }

    public JTextField getTxt_user() {
        return txt_user;
    }

    public void setTxt_user(JTextField txt_user) {
        this.txt_user = txt_user;
    }

   
    
    
}
