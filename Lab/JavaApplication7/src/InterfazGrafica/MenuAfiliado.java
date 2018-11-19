
package InterfazGrafica;

import javaapplication7.Afiliado;
import javaapplication7.Colecciones;
/**
 *
 * @author Fernando
 */
public class MenuAfiliado extends javax.swing.JFrame {
    
    private Colecciones colecciones;
    private Afiliado afiliado;
    
    public MenuAfiliado(){
        initComponents();
    }
    
    /**
     * Creates new form MenuAfiliado
     */
    public MenuAfiliado(Afiliado a, Colecciones e) {
        afiliado=a;
        colecciones=e;
        setTitle("Menu Afiliado");
        setResizable(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarafiliado = new javax.swing.JButton();
        modificarafiliados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listarafiliados = new javax.swing.JButton();
        eliminarafiliados = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 450));

        agregarafiliado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        agregarafiliado.setText("Añadir Afiliado");
        agregarafiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarafiliadoActionPerformed(evt);
            }
        });

        modificarafiliados.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        modificarafiliados.setText("Modificar Afiliado");
        modificarafiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarafiliadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel1.setText("Gestionar Afiliados");

        listarafiliados.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        listarafiliados.setText("Lista de Afiliados");
        listarafiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarafiliadosActionPerformed(evt);
            }
        });

        eliminarafiliados.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        eliminarafiliados.setText("Dar de Baja a Afiliado");
        eliminarafiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarafiliadosActionPerformed(evt);
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
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(listarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregarafiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(agregarafiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(listarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(modificarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(eliminarafiliados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarafiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarafiliadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarafiliadosActionPerformed

    private void listarafiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarafiliadosActionPerformed
        // TODO add your handling code here:
        ListarAfiliados listaafi=new ListarAfiliados(afiliado, colecciones);
        listaafi.setVisible(true);
        dispose();
    }//GEN-LAST:event_listarafiliadosActionPerformed

    private void eliminarafiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarafiliadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarafiliadosActionPerformed

    private void agregarafiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarafiliadoActionPerformed
        // TODO add your handling code here:
        
        AgregarAfiliado agregarafi=new AgregarAfiliado();
        agregarafi.setVisible(true);
        dispose();
    }//GEN-LAST:event_agregarafiliadoActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menuprinc=new MenuPrincipal(afiliado, colecciones);
        menuprinc.setVisible(true);
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
            java.util.logging.Logger.getLogger(MenuAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAfiliado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAfiliado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarafiliado;
    private javax.swing.JButton atras;
    private javax.swing.JButton eliminarafiliados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listarafiliados;
    private javax.swing.JButton modificarafiliados;
    // End of variables declaration//GEN-END:variables
}
