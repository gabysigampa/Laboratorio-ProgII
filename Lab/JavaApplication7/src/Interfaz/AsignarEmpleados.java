package Interfaz;

import Exceptions.VerficarCampoVacioException;
import javax.swing.JOptionPane;
import laboratorio2018.Administrativo;
import laboratorio2018.Afiliado;
import laboratorio2018.Asistencia;
import laboratorio2018.Chofer;
import laboratorio2018.Diagnostico;
import laboratorio2018.Doctor;
import laboratorio2018.Empleado;
import laboratorio2018.Enfermero;
import laboratorio2018.Familiar;
import laboratorio2018.Movil;
import laboratorio2018.Sistema;


public class AsignarEmpleados extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    private Afiliado afil;
    private Familiar famil;

    public AsignarEmpleados() {
        initComponents();
    }

    public AsignarEmpleados(Sistema c, Afiliado a, Empleado e,Afiliado af,Familiar famili) {
        sistema = c;
        afiliado = a;
        empleado = e;
        afil=af;
        famil=famili;
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Asignar Empleados");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        legajoDoctor = new javax.swing.JTextField();
        listaDoc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        legajoEnfermero = new javax.swing.JTextField();
        listaEnf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        legajoChofer = new javax.swing.JTextField();
        listaChof = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        legajoMovil = new javax.swing.JTextField();
        listaMov = new javax.swing.JButton();
        legajoAdmi = new javax.swing.JTextField();
        listaAd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        diaAc = new javax.swing.JTextField();
        ConfirmarEmple = new javax.swing.JButton();
        jButtonVolverMenuAsistencias = new javax.swing.JButton();
        mesAc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        anioAc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Seleccione Empleados para Asistir");

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel2.setText("Doctor legajo n°:");

        legajoDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoDoctorActionPerformed(evt);
            }
        });

        listaDoc.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        listaDoc.setText("Doctores Disponibles");
        listaDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDocActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel3.setText("Enfermero legajo n°:");

        legajoEnfermero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoEnfermeroActionPerformed(evt);
            }
        });

        listaEnf.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        listaEnf.setText("Enfermeros Disponibles");
        listaEnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEnfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Chofer legajo n°:");

        legajoChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoChoferActionPerformed(evt);
            }
        });

        listaChof.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        listaChof.setText("Choferes Disponibles");
        listaChof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaChofActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel5.setText("Movil n°:");

        legajoMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoMovilActionPerformed(evt);
            }
        });

        listaMov.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        listaMov.setText("Moviles Disponibles");
        listaMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMovActionPerformed(evt);
            }
        });

        legajoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoAdmiActionPerformed(evt);
            }
        });

        listaAd.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        listaAd.setText("Admin. Disponibles");
        listaAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("Administrativo legajo n°:");

        diaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaAcActionPerformed(evt);
            }
        });

        ConfirmarEmple.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        ConfirmarEmple.setText("Confirmar");
        ConfirmarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarEmpleActionPerformed(evt);
            }
        });

        jButtonVolverMenuAsistencias.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButtonVolverMenuAsistencias.setText("Volver");
        jButtonVolverMenuAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuAsistenciasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel8.setText("Fecha (d/m/a):");

        anioAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioAcActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel7.setText("Dia");

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel9.setText("Mes");

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        jLabel10.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel9)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(anioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(legajoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(legajoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(listaMov, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                                    .addComponent(listaAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(legajoEnfermero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(legajoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(legajoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(listaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(listaChof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(listaEnf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(0, 23, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ConfirmarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mesAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoEnfermero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaEnf, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaChof, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaMov, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaAd, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioAc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVolverMenuAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void legajoDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoDoctorActionPerformed

    private void legajoEnfermeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoEnfermeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoEnfermeroActionPerformed

    private void legajoChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoChoferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoChoferActionPerformed

    private void legajoMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoMovilActionPerformed

    private void legajoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoAdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoAdmiActionPerformed

    private void diaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaAcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaAcActionPerformed

    private void ConfirmarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarEmpleActionPerformed
        try {
            String legDoc, legEnf, legCho, legAd, legMov, d, me, a;
            d = diaAc.getText();
            me = mesAc.getText();
            a = anioAc.getText();
            verificarCampo1(d, me, a);
            legDoc = legajoDoctor.getText();
            legEnf = legajoEnfermero.getText();
            legCho = legajoChofer.getText();
            legAd = legajoAdmi.getText();
            legMov = legajoMovil.getText();
            verificarCampo(legDoc, legEnf, legCho, legAd, legMov);
            Diagnostico diagnostico = new Diagnostico("");
            Movil movil = null;
            Doctor doctor = null;
            Enfermero enfermero = null;
            Chofer chofer = null;
            Administrativo administrativo = null;
            for (Movil mov : sistema.getMovil()) {
                if (mov.getNum().equals(legMov)) {
                    movil = mov;
                }
            }
            for (Doctor doc : empleado.getDoctores()) {
                if (doc.getLegajo().equals(legDoc)) {
                    doctor = doc;

                }
            }
            for (Enfermero enf : empleado.getEnfermeros()) {
                if (enf.getLegajo().equals(legEnf)) {
                    enfermero = enf;

                }
            }
            for (Chofer ch : empleado.getChoferes()) {
                if (ch.getLegajo().equals(legCho)) {
                    chofer = ch;

                }
            }
            for (Administrativo ad : empleado.getAdminis()) {
                if (ad.getLegajo().equals(legAd)) {
                    administrativo = ad;

                }
            }
            if(famil==null){
                famil = new Familiar("NINGUN FAMILIAR PIDIO","ASISTENCIA, FUE EL AFILIADO!!!","","","","",0,0,0,"","");
            }
            if (afil!=null &&movil != null && doctor != null && enfermero != null && chofer != null && administrativo != null) {
                Asistencia asi = new Asistencia(afil,famil,movil, doctor, enfermero, chofer, administrativo, d, me, a, diagnostico);
                sistema.setAsistencias(asi);
                JOptionPane.showMessageDialog(null, "AYUDA EN CAMINO...", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (movil == null && doctor == null && enfermero == null && chofer == null && administrativo == null) {
                    JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN EMPLEADO", "Atencion!", JOptionPane.QUESTION_MESSAGE);
                } else {
                    if (movil == null) {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL MOVIL", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (doctor == null) {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL DOCTOR", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (enfermero == null) {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL ENFERMERO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (chofer == null) {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL CHOFER", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (administrativo == null) {
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO AL ADMINISTRATIVO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }
                JOptionPane.showMessageDialog(null, "VUELVA A INTENTARLO MAS TARDE", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
            }

            this.limpliarTextos();
            MenuAsistencias m = new MenuAsistencias(sistema, afiliado, empleado);
            m.setVisible(true);
            dispose();

        } catch (VerficarCampoVacioException cav) {
            JOptionPane.showMessageDialog(null, "Ingreso un campo vacio", "Atencion!", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarEmpleActionPerformed
    
    
public void limpliarTextos() {
        legajoDoctor.setText(null);
        legajoEnfermero.setText(null);
        legajoChofer.setText(null);
        legajoAdmi.setText(null);
        legajoMovil.setText(null);
    }

    public void verificarCampo1(String dia, String mes, String anio) throws VerficarCampoVacioException {

        if (dia.equals("") && mes.equals("") && anio.equals("")) {
            throw new VerficarCampoVacioException();
        }

    }

    public void verificarCampo(String leg, String leg1, String leg2, String leg3, String leg4) throws VerficarCampoVacioException {

        if (leg.equals("") && leg1.equals("") && leg2.equals("") && leg3.equals("") && leg4.equals("")) {
            throw new VerficarCampoVacioException();
        }

    }
    private void jButtonVolverMenuAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuAsistenciasActionPerformed

        MenuAsistencias m = new MenuAsistencias(sistema, afiliado, empleado);
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonVolverMenuAsistenciasActionPerformed

    private void listaDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDocActionPerformed
        VerDoctores ver = new VerDoctores(sistema, afiliado, empleado);
        ver.setVisible(true);
    }//GEN-LAST:event_listaDocActionPerformed

    private void listaEnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEnfActionPerformed
        VerEnfermeros en = new VerEnfermeros(sistema, afiliado, empleado);
        en.setVisible(true);
    }//GEN-LAST:event_listaEnfActionPerformed

    private void listaChofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaChofActionPerformed
        VerChofer va = new VerChofer(sistema, afiliado, empleado);
        va.setVisible(true);       
    }//GEN-LAST:event_listaChofActionPerformed

    private void listaMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMovActionPerformed
        VerMoviles vr = new VerMoviles(sistema, afiliado, empleado);
        vr.setVisible(true);
    }//GEN-LAST:event_listaMovActionPerformed

    private void listaAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAdActionPerformed
        VerAdministrativos add = new VerAdministrativos(sistema, afiliado, empleado);
        add.setVisible(true);
    }//GEN-LAST:event_listaAdActionPerformed

    private void anioAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioAcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioAcActionPerformed

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
            java.util.logging.Logger.getLogger(AsignarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmarEmple;
    private javax.swing.JTextField anioAc;
    private javax.swing.JTextField diaAc;
    private javax.swing.JButton jButtonVolverMenuAsistencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField legajoAdmi;
    private javax.swing.JTextField legajoChofer;
    private javax.swing.JTextField legajoDoctor;
    private javax.swing.JTextField legajoEnfermero;
    private javax.swing.JTextField legajoMovil;
    private javax.swing.JButton listaAd;
    private javax.swing.JButton listaChof;
    private javax.swing.JButton listaDoc;
    private javax.swing.JButton listaEnf;
    private javax.swing.JButton listaMov;
    private javax.swing.JTextField mesAc;
    // End of variables declaration//GEN-END:variables
}
