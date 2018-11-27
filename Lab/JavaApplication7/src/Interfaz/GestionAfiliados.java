
package Interfaz;

import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;


public class GestionAfiliados extends javax.swing.JFrame {

    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    public GestionAfiliados(){
        initComponents();
    }
    public GestionAfiliados(Sistema c) {
        sistema=c;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU GESTION AFILIADOS");
    }

    public GestionAfiliados(Sistema c,Afiliado a,Empleado e) {
        sistema=c;
        afiliado=a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU GESTION AFILIADOS");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAltaAfiliado = new javax.swing.JButton();
        jButtonVolverMenuPrincipal1 = new javax.swing.JButton();
        jButtonBajaAfiliado = new javax.swing.JButton();
        jButtonListAfiliados = new javax.swing.JButton();
        jButtonListaFamiliares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar Afiliados");

        jButtonAltaAfiliado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButtonAltaAfiliado.setText("Alta Afiliado-Familiar");
        jButtonAltaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaAfiliadoActionPerformed(evt);
            }
        });

        jButtonVolverMenuPrincipal1.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jButtonVolverMenuPrincipal1.setText("Atras");
        jButtonVolverMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuPrincipal1ActionPerformed(evt);
            }
        });

        jButtonBajaAfiliado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButtonBajaAfiliado.setText("Baja Afiliado-Familiar");
        jButtonBajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaAfiliadoActionPerformed(evt);
            }
        });

        jButtonListAfiliados.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButtonListAfiliados.setText("Listado de Afiliados");
        jButtonListAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListAfiliadosActionPerformed(evt);
            }
        });

        jButtonListaFamiliares.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButtonListaFamiliares.setText("Listado de Familiares");
        jButtonListaFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaFamiliaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVolverMenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBajaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAltaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListaFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jButtonAltaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBajaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListAfiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButtonListaFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButtonVolverMenuPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuPrincipal1ActionPerformed
        // TODO add your handling code here:
        MenuGestiones mg = new MenuGestiones(sistema,afiliado,empleado);
        mg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverMenuPrincipal1ActionPerformed

    private void jButtonAltaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaAfiliadoActionPerformed
        // TODO add your handling code here:
        AfiliadoFamiliar afifa = new AfiliadoFamiliar(sistema,afiliado,empleado);
        afifa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAltaAfiliadoActionPerformed

    private void jButtonBajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaAfiliadoActionPerformed
        // TODO add your handling code here:
        MenuBajas mb = new MenuBajas(sistema,afiliado,empleado);
        mb.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBajaAfiliadoActionPerformed

    private void jButtonListAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListAfiliadosActionPerformed
        // TODO add your handling code here:
        ListadoAfiliados lista = new ListadoAfiliados(sistema,afiliado,empleado);
        lista.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonListAfiliadosActionPerformed

    private void jButtonListaFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaFamiliaresActionPerformed
        // TODO add your handling code here:
        BuscarFamiliares bf = new BuscarFamiliares(sistema,afiliado,empleado);
        bf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonListaFamiliaresActionPerformed

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
            java.util.logging.Logger.getLogger(GestionAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionAfiliados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaAfiliado;
    private javax.swing.JButton jButtonBajaAfiliado;
    private javax.swing.JButton jButtonListAfiliados;
    private javax.swing.JButton jButtonListaFamiliares;
    private javax.swing.JButton jButtonVolverMenuPrincipal1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
