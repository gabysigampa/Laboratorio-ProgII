package Interfaz;

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;


public class ComprobarAsistencia extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private Asistencia asistencia;

    public ComprobarAsistencia() {
        initComponents();
    }

    public ComprobarAsistencia(Sistema c, Afiliado a, Empleado e) {
        sistema = c;
        empleado = e;
        afiliado = a;

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("COMPROBAR ASISTENCIA");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonVolverMenuAsistencias = new javax.swing.JButton();
        jButtonBuscaAsistencia = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        buscarDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 350));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel2.setText("Buscar Asistencia Medica");

        jButtonVolverMenuAsistencias.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButtonVolverMenuAsistencias.setText("Volver");
        jButtonVolverMenuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuAsistenciasActionPerformed(evt);
            }
        });

        jButtonBuscaAsistencia.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButtonBuscaAsistencia.setText("Buscar");
        jButtonBuscaAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaAsistenciaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese Fecha de la Asistencia");

        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        buscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese DNI del Afiliado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBuscaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(42, 42, 42)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverMenuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuAsistenciasActionPerformed

        MenuAsistencias mn = new MenuAsistencias(sistema, afiliado, empleado);
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverMenuAsistenciasActionPerformed

    private void jButtonBuscaAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaAsistenciaActionPerformed
        try {
            String diaa, mess, anioo;
            String dni = buscarDni.getText();
            diaa = dia.getText();
            mess = mes.getText();
            anioo = anio.getText();
            verificarDatos(dni);
            verificarCampo1(diaa, mess, anioo);
            sistema.buscarAfiliado(dni);
            Asistencia as = null;
            Afiliado af = null;

            for (Afiliado afil : sistema.getAfiliados()) {
                if (afil.getDni().equals(dni)) {
                    af = afil;

                }
            }
            for (Asistencia asis : sistema.getAsistencias()) {
                if (asis.getDia().equals(diaa) && asis.getMes().equals(mess) && asis.getAnio().equals(anioo)) {
                    as = asis;
                }
            }
            if (as != null) {
                ListadoAsistencias lis = new ListadoAsistencias(sistema,afiliado,empleado,diaa,mess,anioo);
                lis.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO ASISTENCIA EN ESA FECHA", "VERIFIQUE!!!!", JOptionPane.OK_OPTION);
            }

        } catch (VerificarDniException vdni) {
            JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        } catch (AfiliadoNoEncontradoException pnee) {
            JOptionPane.showMessageDialog(null, "No se encontro al afiliado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Campo Vacio, ingrese de nuevo", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonBuscaAsistenciaActionPerformed

    public void verificarCampo1(String dia, String mes, String anio) throws VerficarCampoVacioException {

        if (dia.equals("") && mes.equals("") && anio.equals("")) {
            throw new VerficarCampoVacioException();
        }

    }
    public void verificarDatos(String dni) throws VerificarDniException, VerficarCampoVacioException {

        if (dni.equals("")) {
            throw new VerficarCampoVacioException();
        }
        if (dni.length() == 8 || dni.length() == 7) {
            int numero = Integer.parseInt(dni);
            if (numero < 1000000) {
                throw new VerificarDniException();
            }
        } else {
            throw new VerificarDniException();
        }
    }
    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void buscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDniActionPerformed

    }//GEN-LAST:event_buscarDniActionPerformed

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
            java.util.logging.Logger.getLogger(ComprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobarAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JTextField buscarDni;
    private javax.swing.JTextField dia;
    private javax.swing.JButton jButtonBuscaAsistencia;
    private javax.swing.JButton jButtonVolverMenuAsistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mes;
    // End of variables declaration//GEN-END:variables
}
