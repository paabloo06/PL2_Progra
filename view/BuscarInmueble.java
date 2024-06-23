
package view;

import controller.FileUtilsInmuebles;
import controller.SessionManager;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClienteBase;
import model.Inmueble;

public class BuscarInmueble extends javax.swing.JFrame {

    ArrayList<Inmueble> inmuebles = new ArrayList<>();
    Inmueble inmuebleSeleccionado;
    
    public BuscarInmueble() {
        initComponents();
        FileUtilsInmuebles.cargarDatosInmuebles();
        mostrarTodosLosInmuebles(); // Mostrar todos los inmuebles al iniciar el panel
    }

    private void mostrarTodosLosInmuebles() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Tipo");
        modelo.addColumn("Calificacion");

        // cargar datos
        ArrayList<Inmueble> inmuebles = FileUtilsInmuebles.getInmueble();
        // agregar los datos a la tabla
        for (Inmueble inmueble : inmuebles) {
            modelo.addRow(new Object[]{inmueble.getTitulo(), inmueble.getPrecioPorNoche(), inmueble.getTipoPropiedad(), inmueble.getCalificacionMediaEstrellas()});
        }
        jTable1.setModel(modelo);
    }
    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }
    public void limpiaTabla() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Tipo");
        modelo.addColumn("Calificacion");
        
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        jTable1.setModel(modelo);
    }
    
    public void rellenaTabla(String criterio) {
        limpiaTabla();
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Tipo");
        modelo.addColumn("Calificacion");
        
        ArrayList<Inmueble> inmOrdenado = FileUtilsInmuebles.getInmueble();
        if (criterio.equals("Nombre")) {
            inmOrdenado = FileUtilsInmuebles.getInmueblesPorNombre();
        } else if (criterio.equals("Precio")) {
            inmOrdenado = FileUtilsInmuebles.getInmueblesPorPrecio();
        } else if (criterio.equals("Tipo")){
            inmOrdenado = FileUtilsInmuebles.getInmueblesPorTipo();
        } else if (criterio.equals("Calificacion")){
            inmOrdenado = FileUtilsInmuebles.getInmueblesPorCalificacion();
        }
        for (Inmueble inm : inmOrdenado) {
            modelo.addRow(new Object[]{inm.getTitulo(), inm.getPrecioPorNoche(), inm.getTipoPropiedad(), inm.getCalificacionMediaEstrellas()});
        }
        jTable1.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        ciudadLabel = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        buscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        RESESVAR = new javax.swing.JButton();
        ordenarComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ciudadLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadLabelActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buscarButton.setBackground(new java.awt.Color(228, 255, 228));
        buscarButton.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        buscarButton.setText("BUSCAR");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel3.setText("Ciudad:");

        RESESVAR.setText("RESERVAR");
        RESESVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESESVARActionPerformed(evt);
            }
        });

        ordenarComboBox.setEditable(true);
        ordenarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio", "Tipo", "Calificacion" }));
        ordenarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setText("Ordenar por:");

        jButton2.setText("CALIFICAR");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ciudadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordenarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(buscarButton))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RESESVAR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ordenarComboBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarButton)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESESVAR)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciudadLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadLabelActionPerformed
        
    }//GEN-LAST:event_ciudadLabelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClienteParticular cliente = new ClienteParticular();
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
    try {
        limpiarTabla();
        String ciudad = ciudadLabel.getText().trim().toUpperCase(); // Convertir a mayúsculas
        if (!ciudad.isEmpty()) {
            ArrayList<Inmueble> busquedas = FileUtilsInmuebles.busquedaInmueblesCiudad(ciudad);

            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false;
                }
            };

            modelo.addColumn("Titulo");
            modelo.addColumn("Precio");
            modelo.addColumn("Tipo");
            modelo.addColumn("Calificacion");

            for (Inmueble inmueble : busquedas) {
                modelo.addRow(new Object[]{inmueble.getTitulo(), inmueble.getPrecioPorNoche(), inmueble.getTipoPropiedad(), inmueble.getCalificacionMediaEstrellas()});
            }
            jTable1.setModel(modelo);
        } else {
            mostrarTodosLosInmuebles();
        }
        } catch (NumberFormatException ne) {
        JOptionPane.showMessageDialog(this, "Rellene el campo salario con numeros.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }
    

    }//GEN-LAST:event_buscarButtonActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
    
    }//GEN-LAST:event_jTable1AncestorAdded

    private void ordenarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarComboBoxActionPerformed
        // TODO add your handling code here:
        String orden = (String) ordenarComboBox.getSelectedItem();
        rellenaTabla(orden);        
    }//GEN-LAST:event_ordenarComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (inmuebleSeleccionado != null) {
            CalificarInmueble calificar = new CalificarInmueble(inmuebleSeleccionado);
            calificar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un inmueble para calificar.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();
            if (selectedRow != -1) {
                String titulo = (String) jTable1.getValueAt(selectedRow, 0);
                inmuebleSeleccionado = FileUtilsInmuebles.buscarInmueblePorTitulo(titulo);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void RESESVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESESVARActionPerformed
        ClienteBase cliente = SessionManager.getInstance().getClienteActual();
        PagoReserva pago = new PagoReserva(inmuebleSeleccionado, cliente);
        pago.setVisible(true);
        dispose();
    }//GEN-LAST:event_RESESVARActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESESVAR;
    private javax.swing.JButton buscarButton;
    private javax.swing.JFormattedTextField ciudadLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> ordenarComboBox;
    // End of variables declaration//GEN-END:variables



}
