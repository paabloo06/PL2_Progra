package view;
import controller.FileUtils;
import controller.SessionManager;
import java.io.Serial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClienteBase;
import model.UsuarioBase;

public class Login extends javax.swing.JFrame {
    
    @Serial
    private static final long serialVersionUID = 2379313079115426828L;

    public Login() {
        FileUtils.cargarDatos();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Correo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        Texto_Correo = new javax.swing.JTextField();
        Boton_Entrar = new javax.swing.JButton();
        No_tienes_cuenta = new javax.swing.JLabel();
        Registrarse = new javax.swing.JButton();
        Contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 224, 239));

        Correo.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Correo.setText("Correo:");

        Clave.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        Clave.setText("Contraseña:");

        Texto_Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Boton_Entrar.setBackground(new java.awt.Color(143, 194, 206));
        Boton_Entrar.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        Boton_Entrar.setText("Entrar");
        Boton_Entrar.setAlignmentY(0.1F);
        Boton_Entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        Boton_Entrar.setOpaque(true);
        Boton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EntrarActionPerformed(evt);
            }
        });

        No_tienes_cuenta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        No_tienes_cuenta.setText("¿No tienes cuenta?");

        Registrarse.setBackground(new java.awt.Color(238, 247, 255));
        Registrarse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Registrarse.setText("Registrarse");
        Registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        Contrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Correo)
                    .addComponent(Clave))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(No_tienes_cuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Texto_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                        .addComponent(Contrasena)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(Boton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clave)
                            .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Boton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Registrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(No_tienes_cuenta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EntrarActionPerformed
        if (Texto_Correo.getText().equals("") || Contrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos");
        } else {
            String correo = Texto_Correo.getText();
            String clave = String.valueOf(Contrasena.getPassword());

            // Buscar en la lista de clientes
            ArrayList<ClienteBase> clientes = FileUtils.getClienteBase();
            
            for (ClienteBase cliente : clientes) {
                System.out.println("Correo: " + cliente.getCorreo() + ", Contraseña: " + cliente.getContrasena());
            }
            
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
            
            // Si el usuario no se encuentra en la lista de clientes, verificar si es admin
            if (correo.equals("admin@javabnb.com") && clave.equals("admin")) {
                Admin admin = new Admin();
                admin.setVisible(true);
                dispose();
                return; // Salir del método si es admin
            }
            
            // Si el usuario no se encuentra en la lista de clientes ni es admin, mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }//GEN-LAST:event_Boton_EntrarActionPerformed

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        Registro i = new Registro();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistrarseActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Entrar;
    private javax.swing.JLabel Clave;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel No_tienes_cuenta;
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField Texto_Correo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
