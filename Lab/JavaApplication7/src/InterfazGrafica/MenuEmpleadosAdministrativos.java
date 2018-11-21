/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

/**
 *
 * @author Braian
 */
public class MenuEmpleadosAdministrativos extends javax.swing.JFrame {

    /**
     * Creates new form MenuEmpleadosAdministrativos
     */
    public MenuEmpleadosAdministrativos() {
        initComponents();
        
    this.setLocationRelativeTo(null);
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
        atras = new javax.swing.JButton();
        añadirempleado = new javax.swing.JButton();
        listadoempleados = new javax.swing.JButton();
        moficarempleado = new javax.swing.JButton();
        eliminarempledo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar Empleados Administrativos");

        atras.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        añadirempleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        añadirempleado.setText("Añadir Empleado");
        añadirempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirempleadoActionPerformed(evt);
            }
        });

        listadoempleados.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        listadoempleados.setText("Lista de Empleados");
        listadoempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoempleadosActionPerformed(evt);
            }
        });

        moficarempleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        moficarempleado.setText("Modificar Empleado");
        moficarempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moficarempleadoActionPerformed(evt);
            }
        });

        eliminarempledo.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        eliminarempledo.setText("Dar de Baja Empleado");
        eliminarempledo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarempledoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(añadirempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listadoempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moficarempleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarempledo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(0, 200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(añadirempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(listadoempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(moficarempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(eliminarempledo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuEmpleadosPrincipal menuEmpleadosPrincipal =new MenuEmpleadosPrincipal();
        menuEmpleadosPrincipal.setVisible(true);
        this.dispose();
     
                
                
    }//GEN-LAST:event_atrasActionPerformed

    private void listadoempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoempleadosActionPerformed
       ListarEmpleadosAdministrativos listarEmpleadosAdministrativos=new ListarEmpleadosAdministrativos();
       listarEmpleadosAdministrativos.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_listadoempleadosActionPerformed

    private void moficarempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moficarempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moficarempleadoActionPerformed

    private void añadirempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirempleadoActionPerformed
         AgregarEmpleadoAdministrativo agregarEmpleadoAdministrativo = new AgregarEmpleadoAdministrativo();
         agregarEmpleadoAdministrativo.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_añadirempleadoActionPerformed

    private void eliminarempledoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarempledoActionPerformed
       BajaEmpleadoAdministrativo bajaEmpleadoAdministrativo = new BajaEmpleadoAdministrativo();
       bajaEmpleadoAdministrativo.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_eliminarempledoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpleadosAdministrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleadosAdministrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleadosAdministrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleadosAdministrativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpleadosAdministrativos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton añadirempleado;
    private javax.swing.JButton eliminarempledo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listadoempleados;
    private javax.swing.JButton moficarempleado;
    // End of variables declaration//GEN-END:variables
}
