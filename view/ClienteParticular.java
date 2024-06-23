
package view;

import controller.FileUtilsInmuebles;
import controller.SessionManager;
import javax.swing.table.DefaultTableModel;
import model.Inmueble;

public class ClienteParticular extends javax.swing.JFrame {

    public ClienteParticular() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCerrarSesion = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();
        jButtonBusquedaApartamento = new javax.swing.JButton();
        jButtonConsultarMisReservas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCerrarSesion.setBackground(new java.awt.Color(255, 204, 204));
        jButtonCerrarSesion.setText("CERRAR SESION");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Registro.setToolTipText("");
        Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Registro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RegistroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButtonBusquedaApartamento.setBackground(new java.awt.Color(218, 228, 234));
        jButtonBusquedaApartamento.setText("BUSQUEDA INMUEBLE");
        jButtonBusquedaApartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaApartamentoActionPerformed(evt);
            }
        });

        jButtonConsultarMisReservas.setBackground(new java.awt.Color(218, 228, 234));
        jButtonConsultarMisReservas.setText("CONSULTAR MIS RESERVAS");
        jButtonConsultarMisReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarMisReservasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setText("MODIFICAR DATOS PERSONALES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VER MIS RESEÑAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBusquedaApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultarMisReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBusquedaApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarMisReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        controller.FileUtils.guardarDatos();
        Login inicio = new Login();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    private void jButtonBusquedaApartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaApartamentoActionPerformed
        BuscarInmueble buscar = new BuscarInmueble();
        buscar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBusquedaApartamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModificarDatosCliente modificar = new ModificarDatosCliente();
        modificar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarMisReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarMisReservasActionPerformed
        ConsultaMisReservas consultar = new ConsultaMisReservas();
        consultar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonConsultarMisReservasActionPerformed

    private void RegistroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RegistroAncestorAdded
        String nombre = SessionManager.getInstance().getClienteActual().getNombre();
        nombre = nombre.toUpperCase(); // Convertir nombre a mayúsculas
        Registro.setText("BIENVENIDO " + nombre + "!");
    }//GEN-LAST:event_RegistroAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Cliente_MisReseñas reseñas = new Cliente_MisReseñas();
        reseñas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteParticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteParticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteParticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteParticular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteParticular().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBusquedaApartamento;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonConsultarMisReservas;
    // End of variables declaration//GEN-END:variables
}
