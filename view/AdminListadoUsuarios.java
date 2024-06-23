
package view;

import controller.FileUtils;
import controller.SessionManager;
import java.io.Serial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClienteBase;
import model.UsuarioBase;

public class AdminListadoUsuarios extends javax.swing.JFrame {
    
    @Serial
    private static final long serialVersionUID = 8451922881217311400L;
    private PanelDatos panel;

    public AdminListadoUsuarios() {
        initComponents();
        FileUtils.cargarDatos();
        this.panel = panel;
    }


    public javax.swing.JTable getjTable1() {
        return jTable1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atras.setBackground(new java.awt.Color(255, 204, 204));
        atras.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorRemoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("VER DATOS DE USUARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR USUARIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HACER VIP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("ACCEDER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        dispose();// tabla no editable
        
    }//GEN-LAST:event_atrasActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown

    }//GEN-LAST:event_jTable1ComponentShown

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
        DefaultTableModel modelo = new DefaultTableModel() {
            @Serial
            private static final long serialVersionUID = 1504682983015592689L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Rol");
        // cargar datos
        ArrayList<ClienteBase> usuarios = FileUtils.getClienteBase();
        // filtrar por rol particular o empresa
        for (ClienteBase usuario : usuarios) {
            if (usuario.getRol().equals(UsuarioBase.Rol.Particular) || usuario.getRol().equals(UsuarioBase.Rol.Anfitrion)) {
                modelo.addRow(new Object[]{usuario.getNombre(), usuario.getDni(),usuario.getCorreo(), usuario.getContrasena(), usuario.getRol()});
            }
        }
        jTable1.setModel(modelo);
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String dni = modelo.getValueAt(filaSeleccionada, 1).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            ClienteBase cliente = FileUtils.consultaClienteBasePorDni(dni);
            // Cerrar esta ventana
            System.out.println(cliente.toString());
            this.setVisible(false);
            PanelDatos datos = new PanelDatos(cliente, this);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String dni = modelo.getValueAt(filaSeleccionada, 1).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            ClienteBase cliente = FileUtils.consultaClienteBasePorDni(dni);
            // Cerrar esta ventana
            System.out.println(cliente.toString());
            // Damos de Baja al cliente
            FileUtils.bajaClienteBase(cliente);
            FileUtils.guardarDatos();
            dispose();
            AdminListadoUsuarios admin1 = new AdminListadoUsuarios();
            admin1.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String dni = modelo.getValueAt(filaSeleccionada, 1).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            ClienteBase cliente = FileUtils.consultaClienteBasePorDni(dni);
            FileUtils.guardarDatos();
            dispose();
            AdminListadoUsuarios admin1 = new AdminListadoUsuarios();
            admin1.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        ArrayList<ClienteBase> clientes = FileUtils.getClienteBase();
        
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String correo = modelo.getValueAt(filaSeleccionada, 2).toString();
            String clave = modelo.getValueAt(filaSeleccionada, 3).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            for (ClienteBase cliente : clientes) {
                if (cliente.getCorreo().equals(correo) && cliente.getContrasena().equals(clave)) {
                    
                    // Mostrar la ventana correspondiente al rol del usuario
                    if (cliente.getRol() == UsuarioBase.Rol.Particular) {
                        ClienteParticular clientep = new ClienteParticular();
                        clientep.setVisible(true);
                        SessionManager.getInstance().setClienteActual(cliente);
                    } else if (cliente.getRol() == UsuarioBase.Rol.Anfitrion) {
                        Anfitrion anfitrion = new Anfitrion();
                        anfitrion.setVisible(true);
                        SessionManager.getInstance().setClienteActual(cliente);
                    } else {
                        JOptionPane.showMessageDialog(null, "Rol desconocido");
                    }
                    dispose();
                    return; // Salir del método después de encontrar al usuario
                }
            }
        }
         
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminListadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminListadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminListadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminListadoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminListadoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
