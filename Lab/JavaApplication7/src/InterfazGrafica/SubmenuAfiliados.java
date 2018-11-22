/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import javaapplication7.Afiliado;
import javaapplication7.Colecciones;

/**
 *
 * @author Fernando
 */
public class SubmenuAfiliados extends javax.swing.JFrame {

    private Afiliado afiliado;
    private Colecciones colecciones;
    
    public SubmenuAfiliados(Afiliado a, Colecciones c) {
        afiliado=a;
        colecciones=c;
        initComponents();
        setTitle("Menu Familiares");
        setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public SubmenuAfiliados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        agregarfamiliar = new javax.swing.JButton();
        bajafamiliar = new javax.swing.JButton();
        listarfamiliar = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar Familiares de Afiliados");

        agregarfamiliar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        agregarfamiliar.setText("Añadir Familiar");
        agregarfamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarfamiliarActionPerformed(evt);
            }
        });

        bajafamiliar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        bajafamiliar.setText("Dar de Baja Familiar");
        bajafamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajafamiliarActionPerformed(evt);
            }
        });

        listarfamiliar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        listarfamiliar.setText("Lista de Familiares");
        listarfamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarfamiliarActionPerformed(evt);
            }
        });

        atras.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(agregarfamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(bajafamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(listarfamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(agregarfamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(listarfamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bajafamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarfamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarfamiliarActionPerformed
        // TODO add your handling code here:
        AgregarFamiliar agregarfam=new AgregarFamiliar(afiliado, colecciones);
        agregarfam.setVisible(true);
        dispose();
    }//GEN-LAST:event_agregarfamiliarActionPerformed

    private void bajafamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajafamiliarActionPerformed
        // TODO add your handling code here:
        DniFamiliar dni= new DniFamiliar(afiliado, colecciones);
        dni.setVisible(true);
        dispose();
    }//GEN-LAST:event_bajafamiliarActionPerformed

    private void listarfamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarfamiliarActionPerformed
        // TODO add your handling code here:
        DniFamiliar dni=new DniFamiliar();
        dni.setVisible(true);
        dispose();
    }//GEN-LAST:event_listarfamiliarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        MenuAfiliado menuafi= new MenuAfiliado();
        menuafi.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(SubmenuAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmenuAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmenuAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmenuAfiliados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmenuAfiliados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarfamiliar;
    private javax.swing.JButton atras;
    private javax.swing.JButton bajafamiliar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listarfamiliar;
    // End of variables declaration//GEN-END:variables
}
