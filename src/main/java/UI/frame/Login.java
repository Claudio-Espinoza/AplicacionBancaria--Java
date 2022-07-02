package UI.frame;

import control.controlador.Control;
import control.controlador.baseDeDatos;
import control.entidades.Notificable;

import javax.swing.JOptionPane;
import java.sql.SQLException;

/*
 * @author Claudio Espinoza
 */
public class Login extends javax.swing.JFrame implements Notificable {


    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_containerLogin = new javax.swing.JPanel();
        jLabel_titulo1PrincipalLogin = new javax.swing.JLabel();
        jLabel_titulo2PrincipalLogin = new javax.swing.JLabel();
        jLabel_tituloRutLogin = new javax.swing.JLabel();
        jSeparate_decoracion1Login = new javax.swing.JSeparator();
        JField_rutEnterLogin = new javax.swing.JTextField();
        jLabel_tituloPinLogin = new javax.swing.JLabel();
        jSeparate_decoracion2Login = new javax.swing.JSeparator();
        JField_pinEnterLogin = new javax.swing.JTextField();
        jLabel_iconSalirLogin = new javax.swing.JLabel();
        jPanel_registroLogin = new javax.swing.JPanel();
        jLabel_ingresarLogin = new javax.swing.JLabel();
        jLabel_registrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_containerLogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_titulo1PrincipalLogin.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel_titulo1PrincipalLogin.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_titulo1PrincipalLogin.setText("INICIAR");

        jLabel_titulo2PrincipalLogin.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel_titulo2PrincipalLogin.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_titulo2PrincipalLogin.setText("SESIÓN");

        jLabel_tituloRutLogin.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_tituloRutLogin.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_tituloRutLogin.setText("Usuario (Rut)");

        jSeparate_decoracion1Login.setForeground(new java.awt.Color(0, 0, 0));

        JField_rutEnterLogin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JField_rutEnterLogin.setForeground(new java.awt.Color(102, 102, 102));
        JField_rutEnterLogin.setBorder(null);
        JField_rutEnterLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JField_rutEnterLoginMousePressed(evt);
            }
        });

        jLabel_tituloPinLogin.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel_tituloPinLogin.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_tituloPinLogin.setText("Pin");

        jSeparate_decoracion2Login.setForeground(new java.awt.Color(0, 0, 0));

        JField_pinEnterLogin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JField_pinEnterLogin.setForeground(new java.awt.Color(102, 102, 102));
        JField_pinEnterLogin.setBorder(null);
        JField_pinEnterLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JField_pinEnterLoginMousePressed(evt);
            }
        });

        jLabel_iconSalirLogin.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel_iconSalirLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iconSalirLogin.setText("X");
        jLabel_iconSalirLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_iconSalirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_iconSalirLoginMouseClicked(evt);
            }
        });

        jPanel_registroLogin.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_registroLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_registroLoginMouseClicked(evt);
            }
        });

        jLabel_ingresarLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_ingresarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ingresarLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ingresarLogin.setText("Ingresar");

        javax.swing.GroupLayout jPanel_registroLoginLayout = new javax.swing.GroupLayout(jPanel_registroLogin);
        jPanel_registroLogin.setLayout(jPanel_registroLoginLayout);
        jPanel_registroLoginLayout.setHorizontalGroup(
                jPanel_registroLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addGroup(jPanel_registroLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_registroLoginLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel_ingresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel_registroLoginLayout.setVerticalGroup(
                jPanel_registroLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addGroup(jPanel_registroLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_registroLoginLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel_ingresarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        jLabel_registrarse.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel_registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_registrarse.setText("¿Desea registrarse?");
        jLabel_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_containerLoginLayout = new javax.swing.GroupLayout(jPanel_containerLogin);
        jPanel_containerLogin.setLayout(jPanel_containerLoginLayout);
        jPanel_containerLoginLayout.setHorizontalGroup(
                jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                                                .addComponent(jLabel_titulo1PrincipalLogin)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel_titulo2PrincipalLogin))
                                                        .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel_tituloPinLogin)
                                                                        .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jSeparate_decoracion2Login, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(JField_pinEnterLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                                                                        .addGap(73, 73, 73)
                                                                                        .addComponent(jPanel_registroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jLabel_registrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jSeparate_decoracion1Login)
                                                                        .addComponent(JField_rutEnterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel_tituloRutLogin, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addGap(0, 46, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLoginLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel_iconSalirLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel_containerLoginLayout.setVerticalGroup(
                jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_iconSalirLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_titulo1PrincipalLogin)
                                        .addComponent(jLabel_titulo2PrincipalLogin))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel_tituloRutLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JField_rutEnterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparate_decoracion1Login, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel_tituloPinLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel_containerLoginLayout.createSequentialGroup()
                                                .addComponent(JField_pinEnterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jSeparate_decoracion2Login, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55))
                                        .addComponent(jPanel_registroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_registrarse)
                                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_containerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_containerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JField_rutEnterLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JField_rutEnterLoginMousePressed

    }//GEN-LAST:event_JField_rutEnterLoginMousePressed

    private void JField_pinEnterLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JField_pinEnterLoginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JField_pinEnterLoginMousePressed

    private void jLabel_iconSalirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_iconSalirLoginMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_iconSalirLoginMouseClicked

    private void jPanel_registroLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_registroLoginMouseClicked
        Control control = new Control();
        //El dato que resives
        var pin = JField_pinEnterLogin.getText();

        var rut = JField_rutEnterLogin.getText();


        //Validacion
        try {

            if (control.comprobarAdministrador(rut, pin)) {
                new Admin().setVisible(true);
            } else if (baseDeDatos.comprobarLogueo(rut, pin)) {


                String nombre = baseDeDatos.retornarNombre(rut);
                String apellido = baseDeDatos.retornarApellido(rut);
                String apellido2 = baseDeDatos.retornarApellido2(rut);
                String correo = baseDeDatos.retornarCorreo(rut);
                String rutRetornado = baseDeDatos.retornarRut(rut);
                String numTarjeta = baseDeDatos.retornarNumTarjeta(rut);
                int fondo = baseDeDatos.retornarSaldo(numTarjeta);


                this.dispose();
                Dashboard menu = new Dashboard(nombre, apellido, apellido2, correo, rutRetornado, fondo);
                menu.setVisible(true);

            } else {
                mostrarProcesoFallido("Los datos no son correctos");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
//GEN-LAST:event_jPanel_registroLoginMouseClicked

    private void jLabel_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarseMouseClicked
        this.dispose();
        Registro registrarse = new Registro();
        registrarse.setVisible(true);
    }//GEN-LAST:event_jLabel_registrarseMouseClicked

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JField_pinEnterLogin;
    private javax.swing.JTextField JField_rutEnterLogin;
    private javax.swing.JLabel jLabel_iconSalirLogin;
    private javax.swing.JLabel jLabel_ingresarLogin;
    private javax.swing.JLabel jLabel_registrarse;
    private javax.swing.JLabel jLabel_titulo1PrincipalLogin;
    private javax.swing.JLabel jLabel_titulo2PrincipalLogin;
    private javax.swing.JLabel jLabel_tituloPinLogin;
    private javax.swing.JLabel jLabel_tituloRutLogin;
    private javax.swing.JPanel jPanel_containerLogin;
    private javax.swing.JPanel jPanel_registroLogin;
    private javax.swing.JSeparator jSeparate_decoracion1Login;
    private javax.swing.JSeparator jSeparate_decoracion2Login;


    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarProcesoFallido(String error) {
 NotificacionFail a = new NotificacionFail(error);
    }
}
