
package view;

import controller.FileUtils;
import controller.FileUtilsInmuebles;
import java.io.Serial;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ClienteBase;
import model.Inmueble;
import model.Puntuacion;
import model.UsuarioBase;

public class AdminListaInmuebles extends javax.swing.JFrame {

    public AdminListaInmuebles() {
        initComponents();
        FileUtilsInmuebles.cargarDatosInmuebles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
            }
        });
        jScrollPane2.setViewportView(jTable1);

        eliminar.setText("ELIMINAR INMUEBLE");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jButton1.setText("VER RESEÑAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Admin admin = new Admin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
        DefaultTableModel modelo = new DefaultTableModel() {
            @Serial
            private static final long serialVersionUID = 1504682983015592689L;

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Servicios");
        // cargar datos
        ArrayList<Inmueble> inmuebles = FileUtilsInmuebles.getInmueble();
        // filtrar por rol particular o empresa
        for (Inmueble inmueble : inmuebles) {
          
            modelo.addRow(new Object[]{inmueble.getTitulo(), inmueble.getPrecioPorNoche(), inmueble.getServicios()});
        }
        jTable1.setModel(modelo);
    }//GEN-LAST:event_jTable1AncestorAdded

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String titulo = modelo.getValueAt(filaSeleccionada, 0).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            Inmueble inmueble = FileUtilsInmuebles.buscarInmueblePorTitulo(titulo);
            // Cerrar esta ventana
            System.out.println(inmueble.toString());
            // Damos de Baja al cliente
            FileUtilsInmuebles.bajaInmueble(inmueble);
            FileUtils.guardarDatos();
            dispose();
            AdminListaInmuebles admin1 = new AdminListaInmuebles();
            admin1.setVisible(true);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            // Obtener los datos del inmueble seleccionado
            String titulo = modelo.getValueAt(filaSeleccionada, 0).toString();
            // Crear un objeto Inmueble con los datos obtenidos
            Inmueble inmueble = FileUtilsInmuebles.buscarInmueblePorTitulo(titulo);
            // Cerrar esta ventana
            
            for (Puntuacion puntuacion : inmueble.getPuntuaciones()) {
                System.out.println(puntuacion.getComentario() + ": " + puntuacion.getCalificacion());
            }
            dispose();
            AdminListaInmuebles admin1 = new AdminListaInmuebles();
            admin1.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminListaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminListaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminListaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminListaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminListaInmuebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
