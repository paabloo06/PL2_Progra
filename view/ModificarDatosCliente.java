
package view;

import controller.FileUtils;
import java.util.ArrayList;
import model.ClienteBase;

/**
 *
 * @author pablo
 */
public class ModificarDatosCliente extends javax.swing.JFrame {
    
    private ClienteBase cliente;
    
    public ModificarDatosCliente() {
        initComponents();
        FileUtils.cargarDatos();
    }
    public ModificarDatosCliente(ClienteBase cliente){
        initComponents();
        this.cliente = cliente;
        this.rellenarDatos();
    }
    public void rellenarDatos() {
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegister = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelDniCif = new javax.swing.JLabel();
        Rellenar_Dni = new javax.swing.JTextField();
        Tarjeta = new javax.swing.JLabel();
        Rellenar_tarjeta = new javax.swing.JTextField();
        jDateChooser_Caducidad = new com.toedter.calendar.JDateChooser();
        Registro = new javax.swing.JLabel();
        Caducidad = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Titular = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Rellenar_Titular = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        Repita_la_clave = new javax.swing.JLabel();
        Rellenar_Contrasena = new javax.swing.JPasswordField();
        Repita_Contrasena = new javax.swing.JPasswordField();
        Rellenar_Correo = new javax.swing.JTextField();
        Rellenar_Telefono = new javax.swing.JTextField();
        Rellenar_Nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRegister.setBackground(new java.awt.Color(196, 238, 179));
        jButtonRegister.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("MODIFICAR");
        jButtonRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(255, 153, 153));
        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonBack.setText("Atrás");
        jButtonBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelDniCif.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDniCif.setText("DNI:");

        Rellenar_Dni.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Tarjeta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tarjeta.setText("Tarjeta");

        Rellenar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar_tarjetaActionPerformed(evt);
            }
        });

        jDateChooser_Caducidad.setPreferredSize(new java.awt.Dimension(89, 27));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Registro.setText("MODIFICAR DATOS");
        Registro.setToolTipText("");
        Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Caducidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Caducidad.setText("Caducidad");

        Nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nombre.setText("Nombre: ");

        Titular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Titular.setText("Titular");

        Telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Telefono.setText("Telefono:");

        Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Correo.setText("Correo:");

        Clave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Clave.setText("Clave:");

        Repita_la_clave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Repita_la_clave.setText("Repita la Clave:");

        Rellenar_Contrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Repita_Contrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rellenar_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar_NombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Repita_la_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDniCif)
                    .addComponent(Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Repita_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                    .addComponent(Rellenar_Contrasena)
                                    .addComponent(Rellenar_Correo)
                                    .addComponent(Rellenar_Telefono)
                                    .addComponent(Rellenar_Nombre)
                                    .addComponent(Rellenar_Dni))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Rellenar_tarjeta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(Rellenar_Titular, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(141, 141, 141))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Repita_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Repita_la_clave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rellenar_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDniCif))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tarjeta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caducidad))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonRegister)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        ArrayList<ClienteBase> clientes = FileUtils.getClienteBase();
        
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        ClienteParticular cliente = new ClienteParticular();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void Rellenar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rellenar_tarjetaActionPerformed

    private void Rellenar_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rellenar_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarDatosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caducidad;
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Registro;
    private javax.swing.JPasswordField Rellenar_Contrasena;
    private javax.swing.JTextField Rellenar_Correo;
    private javax.swing.JTextField Rellenar_Dni;
    private javax.swing.JTextField Rellenar_Nombre;
    private javax.swing.JTextField Rellenar_Telefono;
    private javax.swing.JTextField Rellenar_Titular;
    private javax.swing.JTextField Rellenar_tarjeta;
    private javax.swing.JPasswordField Repita_Contrasena;
    private javax.swing.JLabel Repita_la_clave;
    private javax.swing.JLabel Tarjeta;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Titular;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegister;
    private com.toedter.calendar.JDateChooser jDateChooser_Caducidad;
    private javax.swing.JLabel jLabelDniCif;
    // End of variables declaration//GEN-END:variables
}
