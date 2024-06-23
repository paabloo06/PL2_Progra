package view;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuarios = new javax.swing.JButton();
        Inmuebles = new javax.swing.JButton();
        Reservas = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Usuarios.setBackground(new java.awt.Color(218, 228, 234));
        Usuarios.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Usuarios.setText("CONSULTAR USUARIOS");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        Inmuebles.setBackground(new java.awt.Color(218, 228, 234));
        Inmuebles.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Inmuebles.setText("CONSULTAR INMUEBLES");
        Inmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmueblesActionPerformed(evt);
            }
        });

        Reservas.setBackground(new java.awt.Color(218, 228, 234));
        Reservas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Reservas.setText("CONSULTAR RESERVAS");
        Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservasActionPerformed(evt);
            }
        });

        cerrarSesion.setBackground(new java.awt.Color(255, 204, 204));
        cerrarSesion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cerrarSesion.setText("CERRAR SESION");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        Registro.setText("BIENVENIDO ADMINISTRADOR!");
        Registro.setToolTipText("");
        Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Registro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Inmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        AdminListadoUsuarios usuarios = new AdminListadoUsuarios();
        usuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsuariosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        controller.FileUtils.guardarDatos();
        
        Login inicio = new Login();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasActionPerformed
        AdminListaReservas reservas = new AdminListaReservas();
        reservas.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReservasActionPerformed

    private void InmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmueblesActionPerformed
        AdminListaInmuebles inmuebles = new AdminListaInmuebles();
        inmuebles.setVisible(true);
        dispose();
    }//GEN-LAST:event_InmueblesActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inmuebles;
    private javax.swing.JLabel Registro;
    private javax.swing.JButton Reservas;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton cerrarSesion;
    // End of variables declaration//GEN-END:variables
}
