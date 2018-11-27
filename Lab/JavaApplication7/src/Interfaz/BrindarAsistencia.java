
package Interfaz;

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.VerficarCampoVacioException;
import Exceptions.VerificarDniException;
import Exceptions.VerificarRepetidosException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorio2018.Administrativo;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Chofer;
import laboratorio2018.Doctor;
import laboratorio2018.Empleado;
import laboratorio2018.Enfermero;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;


public class BrindarAsistencia extends javax.swing.JFrame {
    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    public Afiliado afi;
    private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();

    public BrindarAsistencia(Sistema c) {
        sistema = c;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BRINDAR ASISTENCIA");
    }

    public BrindarAsistencia(Sistema c, Afiliado a,Empleado e) {
        sistema = c;
        afiliado = a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("BRINDAR ASISTENCIA");
    }

    public BrindarAsistencia() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        anioAc = new javax.swing.JTextField();
        legajoChofer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numeroMovil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        legajoDoctor = new javax.swing.JTextField();
        legajoAdministrativo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        legajoEnfermero = new javax.swing.JTextField();
        diaAc = new javax.swing.JTextField();
        jButtonGuardarAsistencia = new javax.swing.JButton();
        jButtonVolverMenuAsistencias = new javax.swing.JButton();
        mesAc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setText("Chofer legajo n°:");

        anioAc.setText("año");
        anioAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioAcActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel6.setText("N° de móvil");

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Seleccione Empleados para Asistir");

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setText("Doctor legajo n°:");

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel7.setText("Aministrativo legajo n°:");

        legajoDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoDoctorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setText("Enfermero legajo n°:");

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel8.setText("Fecha :");

        diaAc.setText("dia");
        diaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaAcActionPerformed(evt);
            }
        });

        jButtonGuardarAsistencia.setFont(new java.awt.Font("Bell MT", 0, 13)); // NOI18N
        jButtonGuardarAsistencia.setText("Guardar");
        jButtonGuardarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarAsistenciaActionPerformed(evt);
            }
        });

        jButtonVolverMenuAsistencias.setFont(new java.awt.Font("Bell MT", 0, 13)); // NOI18N
        jButtonVolverMenuAsistencias.setText("Volver");
        jButtonVolverMenuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuAsistenciasActionPerformed(evt);
            }
        });

        mesAc.setText("mes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mesAc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(anioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(numeroMovil, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(legajoChofer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(legajoEnfermero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(legajoDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(legajoAdministrativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void legajoDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoDoctorActionPerformed

    private void diaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaAcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaAcActionPerformed

    private void jButtonGuardarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarAsistenciaActionPerformed
        /*try {
            String legDoc,legEnf,legCho,legAd,legMov;
            int dia, mes, anio;
            legDoc = legajoDoctor.getText();
            legEnf = legajoEnfermero.getText();
            legCho = legajoChofer.getText();
            legAd = legajoAdministrativo.getText();
            legMov = numeroMovil.getText();
            dia = Integer.parseInt(diaAc.getText());
            mes = Integer.parseInt(mesAc.getText());
            anio = Integer.parseInt(anioAc.getText());
            //verificarCampo(leg);
            //leg = Legajo.getText();
            //sistema.verificarDatos(doc, nom, ape, dire, tele);
            //sistema.buscarRepetido(doc);
            if (this.Profesion.getSelectedItem().equals("Doctor")) {
                profe = "Doctor";
                Doctor doct = new Doctor(nom,ape,sex,doc,dire,tele,dia,mes,anio,profe,leg);
                sistema.setDoctores(doct);
                sistema.setEmpleados(doct);
                empleado.setDoctores(doct);
                
            } else if (this.Profesion.getSelectedItem().equals("Chofer")) {
                profe = "Chofer";
                Chofer cho = new Chofer(nom,ape,sex,doc,dire,tele,dia,mes,anio,profe,leg);
                sistema.setChoferes(cho);
                sistema.setEmpleados(cho);
                empleado.setChoferes(cho);
                
            } else if (this.Profesion.getSelectedItem().equals("Administrativo")) {
                profe = "Administrativo";
                Administrativo adm = new Administrativo(nom,ape,sex,doc,dire,tele,dia,mes,anio,profe,leg);
                sistema.setAdminis(ad);
                sistema.setEmpleados(adm);
                empleado.setAdminis(ad);
                
            } else if(this.Profesion.getSelectedItem().equals("Enfermero")){
                profe = "Enfermero";
                Enfermero enfe = new Enfermero(nom,ape,sex,doc,dire,tele,dia,mes,anio,profe,leg);
                sistema.setEnfermeros(enfe);
                sistema.setEmpleados(enfe);
                empleado.setEnfermeros(enfe);
            }
            this.limpliarTextos();
            JOptionPane.showMessageDialog(null, "Empleado Guardado", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            GestionEmpleados ge = new GestionEmpleados(sistema,afiliado,empleado);
            ge.setVisible(true);
            dispose();

        }catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Ingreso un campo vacio", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        } */ /////////////
        
        /*int doc, enf,cho,adm, dia,mes,anio;
        String mov="";
        doc=Integer.parseInt(legajoDoctor.getText());
        enf = Integer.parseInt(legajoEnfermero.getText());
        cho = Integer.parseInt(legajoChofer.getText());
        mov = numeroMovil.getText();
        adm = Integer.parseInt(legajoAdministrativo.getText());
        dia = Integer.parseInt(diaAc.getText());
        mes = Integer.parseInt(mesAc.getText());
        anio = Integer.parseInt(anioAc.getText());
        // System.out.println("nom: "+nom+" \nape: "+ape+" \nsexo: "+sex+" \ndoc: "+doc+" \ndire: "+dire+" \ntele: "+tele+" \ndia: "+dia+" \nmes: "+mes+" \nanio: "+anio);
        Asistencia as=new Asistencia(doc, enf,cho,mov,adm,dia,mes,anio);
        sistema.setAfiliados(afi);
        this.limpliarTextos();
        JOptionPane.showMessageDialog(null, "Asistencia Otorgada", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
        MenuAsistencias mn= new MenuAsistencias(sistema,afiliado,empleado);
        mn.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_jButtonGuardarAsistenciaActionPerformed

    public void verificarCampo(String leg) throws VerficarCampoVacioException {

        if (leg.equals("")) {
            throw new VerficarCampoVacioException();
        }
        
    }
    public void limpliarTextos(){
        legajoDoctor.setText(null);
        legajoEnfermero.setText(null);        
        legajoChofer.setText(null);
        legajoAdministrativo.setText(null);        
        numeroMovil.setText(null);
    }
    
    private void jButtonVolverMenuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuAsistenciasActionPerformed

        MenuAsistencias mn= new MenuAsistencias(sistema,afiliado,empleado);
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverMenuAsistenciasActionPerformed

    private void anioAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioAcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioAcActionPerformed

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
            java.util.logging.Logger.getLogger(BrindarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrindarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrindarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrindarAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrindarAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioAc;
    private javax.swing.JTextField diaAc;
    private javax.swing.JButton jButtonGuardarAsistencia;
    private javax.swing.JButton jButtonVolverMenuAsistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField legajoAdministrativo;
    private javax.swing.JTextField legajoChofer;
    private javax.swing.JTextField legajoDoctor;
    private javax.swing.JTextField legajoEnfermero;
    private javax.swing.JTextField mesAc;
    private javax.swing.JTextField numeroMovil;
    // End of variables declaration//GEN-END:variables
}
