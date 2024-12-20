/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;


import MODELO.ConexionDB;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.ResultSet;
import java.sql.Connection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Denis Peralta
 */
public class VAdmNuevaMateria extends javax.swing.JFrame {

    /**
     * Creates new form NuevaMateria
     */
    public VAdmNuevaMateria() {
        initComponents();
        loadProfessorNames();
        loadHours();
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

        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        lblDatosMat = new javax.swing.JLabel();
        lblNMat = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        blCreditos = new javax.swing.JLabel();
        cmbCréditos = new javax.swing.JComboBox<>();
        lblAula = new javax.swing.JLabel();
        cmbAula = new javax.swing.JComboBox<>();
        lblSemestre = new javax.swing.JLabel();
        cmbSemestre = new javax.swing.JComboBox<>();
        lblCupo = new javax.swing.JLabel();
        cmbCupo = new javax.swing.JComboBox<>();
        lblDatosDocente = new javax.swing.JLabel();
        lblNDocente = new javax.swing.JLabel();
        txtNDocente = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblDatosHora = new javax.swing.JLabel();
        cmbHoraInicio = new javax.swing.JComboBox<>();
        cmbHoraFin = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        cmbUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Hope logo 13.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setText("NUEVA MATERIA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        lblTexto2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(153, 153, 153));
        lblTexto2.setText("Complete la información con los datos de la materia");
        getContentPane().add(lblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, 20));

        lblDatosMat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosMat.setText("Datos de la materia");
        getContentPane().add(lblDatosMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 220, 30));

        lblNMat.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblNMat.setText("Nombre de la materia");
        getContentPane().add(lblNMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 210, 30));

        txtNombreMateria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        txtNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 450, 40));

        blCreditos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        blCreditos.setText("Créditos");
        getContentPane().add(blCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, 30));

        cmbCréditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Créditos", "1", "2", "3", "4", "5", "6" }));
        getContentPane().add(cmbCréditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 200, 30));

        lblAula.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblAula.setText("Aula");
        getContentPane().add(lblAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 110, 30));

        cmbAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aula", "I1", "I2", "I3", "I4", "I5", "I6", "I7", "I8" }));
        getContentPane().add(cmbAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 200, 30));

        lblSemestre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblSemestre.setText("Semestre");
        getContentPane().add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 140, 30));

        cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(cmbSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 200, 30));

        lblCupo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblCupo.setText("Cupo");
        getContentPane().add(lblCupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 30));

        cmbCupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cupo", "15", "20", "25", "30", "35", "40" }));
        getContentPane().add(cmbCupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 200, 30));

        lblDatosDocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosDocente.setText("Datos del docente");
        getContentPane().add(lblDatosDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 210, 30));

        lblNDocente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblNDocente.setText("Nombre del docente");
        getContentPane().add(lblNDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 200, 30));

        txtNDocente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        getContentPane().add(txtNDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 450, 40));

        lblCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblCorreo.setText("Correo electrónico");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 190, 30));

        txtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 450, 40));

        lblDatosHora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosHora.setText("Datos del horario");
        getContentPane().add(lblDatosHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 200, 30));

        cmbHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora inicio", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        getContentPane().add(cmbHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 200, 40));

        cmbHoraFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora fin", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        getContentPane().add(cmbHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 240, 200, 40));

        btnVolver.setBackground(new java.awt.Color(204, 204, 204));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, 120, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Eliminar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 120, 30));

        btnCrear.setBackground(new java.awt.Color(204, 204, 204));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Añadir.png"))); // NOI18N
        btnCrear.setText("Dias de la Semana");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 670, 250, 30));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Profesor" }));
        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
        // Validar si se seleccionó un profesor
        int selectedIndex = cmbUsuario.getSelectedIndex();
        if (selectedIndex <= 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor.");
            return;
        }

        // Validar nombre de materia
        if (txtNombreMateria.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre para la materia.");
            return;
        }

        // Obtener el ID del profesor seleccionado
        int profesorId = getProfesorIdFromComboBox(selectedIndex);

        // Crear un diálogo para seleccionar múltiples días
        JDialog dialogoDias = new JDialog();
        dialogoDias.setTitle("Selecciona los días");
        dialogoDias.setLayout(new BorderLayout());
        
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        JCheckBox[] checkBoxDias = new JCheckBox[diasSemana.length];
        JPanel panelDias = new JPanel(new GridLayout(0, 3));
        
        for (String dia : diasSemana) {
            JCheckBox checkBox = new JCheckBox(dia);
            panelDias.add(checkBox);
            checkBoxDias[Arrays.asList(diasSemana).indexOf(dia)] = checkBox;
        }
        
        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(e -> {
            List<String> diasSeleccionados = new ArrayList<>();
            for (JCheckBox checkBox : checkBoxDias) {
                if (checkBox.isSelected()) {
                    diasSeleccionados.add(checkBox.getText());
                }
            }
            
            // Validar que se hayan seleccionado días
            if (diasSeleccionados.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un día.");
                return;
            }
            
            try {
                // Conexión a la base de datos
                Connection conn = ConexionDB.getConnection();
                String query = "INSERT INTO materias (nombre_materia, creditos, aula, semestre, cupo, id_profesor, dia_semana, hora_inicio, hora_fin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pst = conn.prepareStatement(query);
                pst.setString(1, txtNombreMateria.getText());
                pst.setInt(2, Integer.parseInt(cmbCréditos.getSelectedItem().toString()));
                pst.setString(3, cmbAula.getSelectedItem().toString());
                pst.setInt(4, Integer.parseInt(cmbSemestre.getSelectedItem().toString()));
                pst.setInt(5, Integer.parseInt(cmbCupo.getSelectedItem().toString()));

                // Establecer el ID del profesor en la consulta
                pst.setInt(6, profesorId);

                // Convertir días seleccionados a string separado por comas
                String diasParaBaseDeDatos = String.join(", ", diasSeleccionados);
                pst.setString(7, diasParaBaseDeDatos);
                
                // Al obtener la hora del ComboBox, convertirla a formato adecuado
                String horaInicioStr = cmbHoraInicio.getSelectedItem().toString();
                String horaFinStr = cmbHoraFin.getSelectedItem().toString();
                
                // Convertir la hora al formato adecuado para la base de datos
                Time horaInicio = Time.valueOf(horaInicioStr + ":00");
                Time horaFin = Time.valueOf(horaFinStr + ":00");

                // Validar que la hora de fin sea posterior a la hora de inicio
                if (horaFin.before(horaInicio) || horaFin.equals(horaInicio)) {
                    JOptionPane.showMessageDialog(null, "La hora de fin debe ser posterior a la hora de inicio.");
                    return;
                }

                pst.setTime(8, horaInicio);  // Hora de inicio
                pst.setTime(9, horaFin);     // Hora de fin

                // Ejecutar la consulta
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Materia creada exitosamente");

                pst.close();
                conn.close();
                dialogoDias.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al crear la materia: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
        
        dialogoDias.add(panelDias, BorderLayout.CENTER);
        dialogoDias.add(botonAceptar, BorderLayout.SOUTH);
        dialogoDias.pack();
        dialogoDias.setLocationRelativeTo(null);
        dialogoDias.setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
  int selectedIndex = cmbUsuario.getSelectedIndex();

    if (selectedIndex > 0) {
        Profesor profesorSeleccionado = profesoresList.get(selectedIndex - 1);
        txtNDocente.setText(profesorSeleccionado.nombre + " " + profesorSeleccionado.apellidoPaterno + " " + profesorSeleccionado.apellidoMaterno);
        txtCorreo.setText(profesorSeleccionado.correo);
    } else {
        txtNDocente.setText("");
        txtCorreo.setText("");
    }
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void txtNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMateriaActionPerformed
// Método para cargar los nombres de los profesores en el ComboBox
    private void loadHours() {
    // Formato de hora: de 00:00 a 23:00 en intervalos de 1 hora
    for (int hour = 0; hour < 24; hour++) {
        for (int minute = 0; minute < 60; minute += 30) {  // Intervalos de 30 minutos
            String hourString = String.format("%02d:%02d", hour, minute);
            cmbHoraInicio.addItem(hourString);
            cmbHoraFin.addItem(hourString);
        }
    }
}
private void loadProfessorNames() {
    try {
        // Conexión a la base de datos
        Connection conn = ConexionDB.getConnection();
        String query = "SELECT p.id, p.nombre, p.apellido_paterno, p.apellido_materno, p.telefono, p.domicilio, p.cedula, u.correo " +
                       "FROM profesores p " +
                       "JOIN usuarios u ON p.id_usuario = u.id " +
                       "WHERE u.tipo_usuario = 'Profesor'";

        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        // Limpiar los elementos existentes
        cmbUsuario.removeAllItems();
        cmbUsuario.addItem("Seleccionar Profesor");

        // Lista para almacenar información de profesores
        profesoresList.clear();

        // Llenar el ComboBox con los nombres de los profesores
        while (rs.next()) {
            int usuarioId = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellidoPaterno = rs.getString("apellido_paterno");
            String apellidoMaterno = rs.getString("apellido_materno");
            String correo = rs.getString("correo");

            String fullName = nombre + " " + apellidoPaterno + " " + apellidoMaterno;
            cmbUsuario.addItem(fullName);

            // Guardar información completa del profesor
            Profesor profesor = new Profesor(usuarioId, nombre, apellidoPaterno, apellidoMaterno, correo);
            profesoresList.add(profesor);
        }

        rs.close();
        pst.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar profesores: " + e.getMessage());
        e.printStackTrace();
    }
}

private int getProfesorIdFromComboBox(int selectedIndex) {
        if (selectedIndex > 0) {
            Profesor profesorSeleccionado = profesoresList.get(selectedIndex - 1);
            return profesorSeleccionado.id;
        }
        return -1;  // Retorna -1 si no se seleccionó un profesor
    }

// Clase para almacenar información del profesor
// Clase para almacenar información del profesor
private class Profesor {
    int id;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String correo;
    
    public Profesor(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
    }
}
private List<Profesor> profesoresList = new ArrayList<>();

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
            java.util.logging.Logger.getLogger(VAdmNuevaMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmNuevaMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmNuevaMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmNuevaMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmNuevaMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blCreditos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAula;
    private javax.swing.JComboBox<String> cmbCréditos;
    private javax.swing.JComboBox<String> cmbCupo;
    private javax.swing.JComboBox<String> cmbHoraFin;
    private javax.swing.JComboBox<String> cmbHoraInicio;
    private javax.swing.JComboBox<String> cmbSemestre;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCupo;
    private javax.swing.JLabel lblDatosDocente;
    private javax.swing.JLabel lblDatosHora;
    private javax.swing.JLabel lblDatosMat;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNDocente;
    private javax.swing.JLabel lblNMat;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNDocente;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
