package view;

import controller.FileUtils;
import model.*;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registro extends javax.swing.JFrame {
    
    @Serial
    private static final long serialVersionUID = -357447078064174583L;
    
    public Registro() {
        initComponents();
        controller.FileUtils.cargarDatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        Registro = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        Clave = new javax.swing.JLabel();
        Repita_la_clave = new javax.swing.JLabel();
        Contrasena = new javax.swing.JPasswordField();
        Repita_Contrasena = new javax.swing.JPasswordField();
        Rellenar_Correo = new javax.swing.JTextField();
        Rellenar_Telefono = new javax.swing.JTextField();
        Rellenar_Nombre = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelDniCif = new javax.swing.JLabel();
        Rellenar_Dni = new javax.swing.JTextField();
        jRadioButtonParticular = new javax.swing.JRadioButton();
        jRadioButtonAnfitrion = new javax.swing.JRadioButton();
        Tarjeta = new javax.swing.JLabel();
        Rellenar_tarjeta = new javax.swing.JTextField();
        jDateChooser_Caducidad = new com.toedter.calendar.JDateChooser();
        Caducidad = new javax.swing.JLabel();
        Titular = new javax.swing.JLabel();
        Rellenar_Titular = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Registro.setText("                        REGISTRO");
        Registro.setToolTipText("");
        Registro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nombre.setText("Nombre: ");

        Telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Telefono.setText("Telefono:");

        Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Correo.setText("Correo:");

        Clave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Clave.setText("Clave:");

        Repita_la_clave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Repita_la_clave.setText("Repita la Clave:");

        Contrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Repita_Contrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Telefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Rellenar_Nombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rellenar_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar_NombreActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(196, 238, 179));
        jButtonRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(16, 30, 24));
        jButtonRegister.setText("Registrar");
        jButtonRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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

        buttonGroup1.add(jRadioButtonParticular);
        jRadioButtonParticular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButtonParticular.setText("Particular");
        jRadioButtonParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonParticularActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAnfitrion);
        jRadioButtonAnfitrion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRadioButtonAnfitrion.setText("Anfitrion");
        jRadioButtonAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAnfitrionActionPerformed(evt);
            }
        });

        Tarjeta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Tarjeta.setText("Tarjeta");

        Rellenar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar_tarjetaActionPerformed(evt);
            }
        });

        jDateChooser_Caducidad.setPreferredSize(new java.awt.Dimension(89, 27));

        Caducidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Caducidad.setText("Caducidad");

        Titular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Titular.setText("Titular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rellenar_Titular)
                            .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Rellenar_tarjeta)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Repita_la_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDniCif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Repita_Contrasena)
                            .addComponent(Contrasena)
                            .addComponent(Rellenar_Telefono)
                            .addComponent(Rellenar_Correo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rellenar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Rellenar_Dni))))
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Repita_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Repita_la_clave))
                        .addGap(12, 12, 12)
                        .addComponent(Rellenar_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDniCif, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tarjeta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Caducidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar_Titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonRegister)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rellenar_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rellenar_NombreActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        if (!isValidForm()) return;
        // Comprobamos si las contraseñas coinciden con getPassword()
        if (String.valueOf(Contrasena.getPassword()).equals(String.valueOf(Repita_Contrasena.getPassword()))) {
            
            // Inicializamos el cliente, ya sea particular o empresa
            ClienteBase cliente = new ClienteBase();

            // Si se seleccionó ClienteParticular, creamos una instancia de esa clase y configuramos los campos específicos de esa clase
            if (jRadioButtonParticular.isSelected()) {
                cliente = new model.ClienteParticular();
                TarjetaCredito tarjeta = new TarjetaCredito(Rellenar_Nombre.getText(), Rellenar_tarjeta.getText(), jDateChooser_Caducidad.getDate());
                ((model.ClienteParticular)cliente).setTarjeta(tarjeta);
            } else {
                Date fechaActual = new Date();
                cliente = new model.Anfitrion();
                ((model.Anfitrion)cliente).setFechaRegistro(fechaActual);
                ((model.Anfitrion)cliente).isSuperAnfitrion();
            }

            // Configuramos los campos comunes entre ClienteParticular y Anfitrion
            cliente.setDni(Rellenar_Dni.getText());
            cliente.setNombre(Rellenar_Nombre.getText());
            cliente.setTelefono(Rellenar_Telefono.getText());
            cliente.setCorreo(Rellenar_Correo.getText());
            cliente.setContrasena(String.valueOf(Contrasena.getPassword()));
            
            ArrayList<ClienteBase> clientes = FileUtils.getClienteBase();
            
            // Si existe ya uno con ese correo no lo registramos
            boolean correoExistente = false;
            Iterator<ClienteBase> iterator = clientes.iterator();
            while (iterator.hasNext()) {
                ClienteBase unCliente = iterator.next();
                if (unCliente.getCorreo().equals(cliente.getCorreo())) {
                    JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese correo");
                    correoExistente = true;
                    break;
                }
            }

            if (!correoExistente) {
                //lo insertamos en el array
                if (FileUtils.altaClienteBase(cliente)) {
                    JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al dar de alta.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            ArrayList<ClienteBase> clientesGuardados = FileUtils.getClienteBase();
            for (ClienteBase cliente1 : clientesGuardados) {
                System.out.println("Correo: " + cliente1.getCorreo() + ", Contraseña: " + cliente1.getContrasena() + "\n" + "-----------------------------------------");
            }

            // Generamos la ficha del cliente
            
            try {
                FileUtils.generaFicha(cliente);
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }

            FileUtils.guardarDatos();
            
            // Volvemos a la pantalla de login
            Login login = new Login();
            login.setVisible(true);
            this.setVisible(false);

        } else {
            // Si las contraseñas no coinciden, mostramos un mensaje de error
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jRadioButtonParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonParticularActionPerformed
        // Habilitar campos específicos de Cliente Particular
        Tarjeta.setEnabled(true);
        Caducidad.setEnabled(true);
        Titular.setEnabled(true);
        Rellenar_tarjeta.setEnabled(true);
        jDateChooser_Caducidad.setEnabled(true);
        Rellenar_Titular.setEnabled(true);
        // Limpiar campos específicos de Anfitrión si es necesario
    }//GEN-LAST:event_jRadioButtonParticularActionPerformed

    private void jRadioButtonAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAnfitrionActionPerformed
        Tarjeta.setEnabled(false);
        Caducidad.setEnabled(false);
        Titular.setEnabled(false);
        Rellenar_tarjeta.setEnabled(false);
        jDateChooser_Caducidad.setEnabled(false);
        Rellenar_Titular.setEnabled(false);
        // Limpiar campos específicos de Cliente Particular si es necesario
        Rellenar_tarjeta.setText("");
        jDateChooser_Caducidad.setDate(null);
        Rellenar_Titular.setText("");
        
    }//GEN-LAST:event_jRadioButtonAnfitrionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void Rellenar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rellenar_tarjetaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caducidad;
    private javax.swing.JLabel Clave;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Registro;
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegister;
    private com.toedter.calendar.JDateChooser jDateChooser_Caducidad;
    private javax.swing.JLabel jLabelDniCif;
    private javax.swing.JRadioButton jRadioButtonAnfitrion;
    private javax.swing.JRadioButton jRadioButtonParticular;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
/*
    private boolean isValidForm() {
        // Comprobación de validez del formulario
        if (Rellenar_Nombre.getText().isEmpty() ||
                Rellenar_Telefono.getText().isEmpty() ||
                Rellenar_Correo.getText().isEmpty() ||
                String.valueOf(Contrasena.getPassword()).isEmpty() ||
                Rellenar_Dni.getText().isEmpty() ||
                Rellenar_tarjeta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
            return false;
        }

        try {
            Integer.parseInt(Rellenar_Telefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de teléfono no válido");
            return false;
        }

        if (!Rellenar_Correo.getText().contains("@")) {
            JOptionPane.showMessageDialog(null, "Correo electrónico no válido");
            return false;
        }

        // comprobar que la tarjeta de credito tiene solo numeros
        try {
            Long.parseLong(Rellenar_tarjeta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número de tarjeta debe contener solo números");
            return false;
        }

        // comprobar que longitud de la tarjeta de crédito es 16
        if (Rellenar_tarjeta.getText().length() != 16) {
            JOptionPane.showMessageDialog(null, "El número de tarjeta debe tener 16 dígitos");
            return false;
        }
        // validar fecha de registro
        if (jDateChooser_FechaRegistro.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Fecha de registro no válida");
            return false;
        }

        // comprobar que la fecha de registro no es anterior a la fecha actual
        if (jDateChooser_FechaRegistro.getDate().before(new Date())) {
            JOptionPane.showMessageDialog(null, "Fecha de registro no válida");
            return false;
        }
        
        // validar fecha de caducidad
        if (jDateChooser_Caducidad.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Fecha de caducidad no válida");
            return false;
        }

        // comprobar que la fecha de caducidad no es anterior a la fecha actual
        if (jDateChooser_Caducidad.getDate().before(new Date())) {
            JOptionPane.showMessageDialog(null, "Fecha de caducidad no válida");
            return false;
        }
        return true;
    }
*/
    private boolean isValidForm() {
    // Verificar campos comunes a ambos tipos de clientes
    if (Rellenar_Dni.getText().isEmpty() || Rellenar_Nombre.getText().isEmpty() || Rellenar_Telefono.getText().isEmpty() || Rellenar_Correo.getText().isEmpty() || String.valueOf(Contrasena.getPassword()).isEmpty() || String.valueOf(Repita_Contrasena.getPassword()).isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios");
        return false;
    }
    try {
            Integer.parseInt(Rellenar_Telefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de teléfono no válido");
            return false;
        }
    if (!Rellenar_Correo.getText().contains("@")) {
            JOptionPane.showMessageDialog(null, "Correo electrónico no válido");
            return false;
        }

    // Verificar campos específicos de Cliente Particular
    if (jRadioButtonParticular.isSelected() && (Rellenar_tarjeta.getText().isEmpty() || !isValidDate(jDateChooser_Caducidad.getDate()) || Rellenar_Titular.getText().isEmpty())) {
        JOptionPane.showMessageDialog(null, "Por favor, complete el campo de tarjeta para el cliente particular");
        return false;
    }
    // comprobar que longitud de la tarjeta de crédito es 16
    if (jRadioButtonParticular.isSelected() && Rellenar_tarjeta.getText().length() != 16) {
            JOptionPane.showMessageDialog(null, "El número de tarjeta debe tener 16 dígitos");
            return false;
    }
    // comprobar que la tarjeta de credito tiene solo numeros
    if (jRadioButtonParticular.isSelected()){
        try {
            Long.parseLong(Rellenar_tarjeta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El número de tarjeta debe contener solo números");
            return false;
        }
    }
    

    // Verificar que las contraseñas coincidan
    if (!String.valueOf(Contrasena.getPassword()).equals(String.valueOf(Repita_Contrasena.getPassword()))) {
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        return false;
    }

    return true;
}

private boolean isValidDate(Date date) {
    // Verificar si la fecha es null
    if (date == null) {
        return false;
    }
    
    // Obtener la fecha actual
    Date currentDate = new Date();
    
    // Verificar si la fecha ingresada es anterior a la fecha actual
    if (date.before(currentDate)) {
        return false;
    }
    
    // Si la fecha es posterior o igual a la fecha actual, es válida
    return true;
}

    private boolean validarDni(String dni) {
        // validar dni bien formado y letra sea valida
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        // comprobar longitud y que el ultimo caracter sea una letra
        if (dni.length() != 9 || !Character.isLetter(dni.charAt(8))) {
            return false;
        }
        // convertir a mayuscula
        dni = dni.toUpperCase();
        // calcular la letra a partir del numero del dni y comprobar que coincide con la letra
        return letras.charAt(Integer.parseInt(dni.substring(0, 8)) % 23) == dni.charAt(8);
    }

}
