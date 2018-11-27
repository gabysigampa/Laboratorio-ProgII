
package Interfaz;

import laboratorio2018.Afiliado;
import laboratorio2018.Empleado;
import laboratorio2018.Sistema;


public class MenuBajas extends javax.swing.JFrame {

    
    private Sistema sistema;
    private Afiliado afiliado;
    private Empleado empleado;
    public MenuBajas(){
        initComponents();
    }
    public MenuBajas(Sistema c) {
        sistema=c;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU GESTION AFILIADOS");
    }

    public MenuBajas(Sistema c,Afiliado a,Empleado e) {
        sistema=c;
        afiliado=a;
        empleado=e;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU BAJAS");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonBajaAfiliado = new javax.swing.JButton();
        jButtonVolverMenuAfiliado = new javax.swing.JButton();
        jButtonBajaFamiliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Bajas de Afiliados");

        jButtonBajaAfiliado.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jButtonBajaAfiliado.setText("Baja de Afiliado");
        jButtonBajaAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaAfiliadoActionPerformed(evt);
            }
        });

        jButtonVolverMenuAfiliado.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jButtonVolverMenuAfiliado.setText("Atras");
        jButtonVolverMenuAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverMenuAfiliadoActionPerformed(evt);
            }
        });

        jButtonBajaFamiliar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jButtonBajaFamiliar.setText("Baja de Familiar");
        jButtonBajaFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonBajaFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBajaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVolverMenuAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jButtonBajaAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButtonBajaFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButtonVolverMenuAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBajaAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaAfiliadoActionPerformed
        // TODO add your handling code here:
        BajaAfiliado b = new BajaAfiliado(sistema,afiliado,empleado);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBajaAfiliadoActionPerformed

    private void jButtonVolverMenuAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverMenuAfiliadoActionPerformed
        // TODO add your handling code here:
        GestionAfiliados gs = new GestionAfiliados(sistema,afiliado,empleado);
        gs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverMenuAfiliadoActionPerformed

    private void jButtonBajaFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaFamiliarActionPerformed
        // TODO add your handling code here:
        BajaFamiliar bf = new BajaFamiliar(sistema,afiliado,empleado);
        bf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBajaFamiliarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBajaAfiliado;
    private javax.swing.JButton jButtonBajaFamiliar;
    private javax.swing.JButton jButtonVolverMenuAfiliado;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
