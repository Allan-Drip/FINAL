
package br.edu.login.view;


public class Cadastrar extends javax.swing.JFrame {

    
    public Cadastrar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        confiSenha = new javax.swing.JPasswordField();
        senha = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Avancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 320, 50));

        confiSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confiSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(confiSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 310, 40));

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 320, 40));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/login/images/usUario_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Avancar.setContentAreaFilled(false);
        Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvancarActionPerformed(evt);
            }
        });
        getContentPane().add(Avancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
 
    }//GEN-LAST:event_UsuarioActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
       
    }//GEN-LAST:event_emailActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
       
    }//GEN-LAST:event_senhaActionPerformed

    private void AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvancarActionPerformed
       LoginView telaLoginC = new LoginView();
       telaLoginC.setVisible(true);
    }//GEN-LAST:event_AvancarActionPerformed

    private void confiSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confiSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confiSenhaActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avancar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPasswordField confiSenha;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
