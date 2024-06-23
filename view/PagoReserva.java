
package view;

import controller.FileUtilsReservas;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ClienteBase;
import model.Inmueble;
import model.Reserva;

public class PagoReserva extends javax.swing.JFrame {
    private Inmueble inmueble;
    private ClienteBase cliente;
    public PagoReserva(Inmueble inmueble, ClienteBase cliente) {
        FileUtilsReservas.cargarDatosReservass();
        initComponents();
        this.inmueble = inmueble;
        this.cliente = cliente;
        jDateChooserEntrada.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                actualizarImporte();
            }
        });

        jDateChooser_Caducidad.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                actualizarImporte();
            }
        });
        importeTextField.setEditable(false);

    }

    private void actualizarImporte() {
        Date fechaEntrada = jDateChooserEntrada.getDate();
        Date fechaSalida = jDateChooser_Caducidad.getDate();

        if (fechaEntrada != null && fechaSalida != null && fechaSalida.after(fechaEntrada)) {
            LocalDate entrada = fechaEntrada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate salida = fechaSalida.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            long noches = ChronoUnit.DAYS.between(entrada, salida);
            double precioPorNoche = inmueble.getPrecioPorNoche();
            double importe = noches * precioPorNoche;

            importeTextField.setText(String.valueOf(importe));
        } else {
            importeTextField.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser_Caducidad = new com.toedter.calendar.JDateChooser();
        jDateChooserEntrada = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        importeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PAGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDateChooser_Caducidad.setPreferredSize(new java.awt.Dimension(89, 27));

        jDateChooserEntrada.setPreferredSize(new java.awt.Dimension(89, 27));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("FECHA DE ENTRADA:");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("FECHA DE SALIDA:");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("IMPORTE A PAGAR:");

        importeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importeTextFieldActionPerformed(evt);
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
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooserEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importeTextField)))
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jDateChooserEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarInmueble buscar = new BuscarInmueble();
        buscar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ArrayList<Reserva> reservas = FileUtilsReservas.getReservas();
        String idReserva = "R0001";
        boolean idUnico = false;
        int contador = 1;
        String nuevoIdReserva = idReserva;

        while (!idUnico) {
            idUnico = true;
            for (Reserva reserva : reservas) {
                if (reserva.getIdReserva().equals(nuevoIdReserva)) {
                    idUnico = false;
                    nuevoIdReserva = idReserva + contador;
                    contador++;
                    break;
                }
            }
        }

        Date fechaEntrada = jDateChooserEntrada.getDate();
        Date fechaSalida = jDateChooser_Caducidad.getDate();

        if (fechaEntrada == null || fechaSalida == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona las fechas de entrada y salida.");
            return;
        }

        double importe = Double.parseDouble(importeTextField.getText());

        Reserva reserva = new Reserva(nuevoIdReserva, (model.ClienteParticular) cliente, inmueble, fechaEntrada, importe);
        FileUtilsReservas.altaReservas(reserva);
        try {
            FileUtilsReservas.generaFicha(reserva);
        } catch (IOException ex) {
            Logger.getLogger(PagoReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClienteParticular cliente = new ClienteParticular();
        cliente.setVisible(true);
        FileUtilsReservas.guardarDatosReservass();

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void importeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importeTextFieldActionPerformed
        
    }//GEN-LAST:event_importeTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField importeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooserEntrada;
    private com.toedter.calendar.JDateChooser jDateChooser_Caducidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
