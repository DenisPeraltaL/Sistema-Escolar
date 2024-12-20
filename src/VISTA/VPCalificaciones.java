/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import javax.swing.JFrame;

/**
 *
 * @author Denis Peralta
 */
public class VPCalificaciones extends javax.swing.JFrame {

    /**
     * Creates new form VPCalificaciones
     */
    public VPCalificaciones() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbGrupo = new javax.swing.JComboBox<>();
        cbmUnidad = new javax.swing.JComboBox<>();
        lblCalif = new javax.swing.JLabel();
        lblUnidad = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblLogo = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        btnEnviarGmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbGrupo.setForeground(new java.awt.Color(153, 153, 153));
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo", "Grupo1", "Grupo2", "Grupo3", " " }));
        getContentPane().add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 30));

        cbmUnidad.setForeground(new java.awt.Color(153, 153, 153));
        cbmUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad", "Unidad1", "Unidad2", "Unidad3", "Unidad4", "Unidad5", "Unidad6" }));
        getContentPane().add(cbmUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 90, 30));

        lblCalif.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCalif.setForeground(new java.awt.Color(51, 51, 51));
        lblCalif.setText("CALIFICACIONES (REGISTRO DE TAREAS)");
        getContentPane().add(lblCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        lblUnidad.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblUnidad.setForeground(new java.awt.Color(153, 153, 153));
        lblUnidad.setText("Unidad");
        getContentPane().add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, 20));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, 120, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N/P", "NOMBRE", "Tarea 1", "Tarea 2", "Tarea 3", "Tarea 4", "Tarea 5", "Tarea 6", "Tarea 7", "Tarea 8", "CALIFICACIÓN"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(25);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setMinWidth(250);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(2).setMinWidth(45);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(3).setMinWidth(45);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(4).setMinWidth(45);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(5).setMinWidth(45);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(6).setMinWidth(45);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(7).setMinWidth(45);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(8).setMinWidth(45);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(9).setMinWidth(45);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(10).setMinWidth(90);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(90);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 1110, 400));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Hope logo 13.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblGrupo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblGrupo.setForeground(new java.awt.Color(153, 153, 153));
        lblGrupo.setText("Grupo");
        getContentPane().add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 20));

        btnGenerarPDF.setBackground(new java.awt.Color(204, 204, 204));
        btnGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/pdf.png"))); // NOI18N
        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 140, 40));

        btnEnviarGmail.setBackground(new java.awt.Color(204, 204, 204));
        btnEnviarGmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Mail.png"))); // NOI18N
        btnEnviarGmail.setText("Enviar por Gmail");
        btnEnviarGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarGmailActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 170, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPDFActionPerformed

    private void btnEnviarGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarGmailActionPerformed

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
            java.util.logging.Logger.getLogger(VPCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarGmail;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbmUnidad;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCalif;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUnidad;
    // End of variables declaration//GEN-END:variables
}
