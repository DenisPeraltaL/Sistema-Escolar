/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;
import MODELO.ConexionDB;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ALEJANDRO
 */
public class AdminAlumnosUnirGrupos extends javax.swing.JFrame {

    /**
     * Creates new form AdminAlumnosUnirGrupos
     */
    public AdminAlumnosUnirGrupos() {
        initComponents();
            llenarComboBox(); // Llamar al método que llena los combobox
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

        lblCalif = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblDatosDocente = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreoAlumno = new javax.swing.JTextField();
        lblCorreo1 = new javax.swing.JLabel();
        cmbAlumno = new javax.swing.JComboBox<>();
        cmbGrupos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminarAlumnoGrupo = new javax.swing.JButton();
        btnAñadirAlumnosGrupo = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCalif.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCalif.setForeground(new java.awt.Color(51, 51, 51));
        lblCalif.setText("REGISTRAR ALUMNOS A GRUPO");
        getContentPane().add(lblCalif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Hope logo 13.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblDatosDocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatosDocente.setText("Añadir alumnos");
        getContentPane().add(lblDatosDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblCorreo.setText("Correo electrónico");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 260, 30));

        txtCorreoAlumno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        txtCorreoAlumno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        txtCorreoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 520, 40));

        lblCorreo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblCorreo1.setText("Lista de alumnos");
        getContentPane().add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 250, 30));

        cmbAlumno.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        cmbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Alumno", "Administrador", "Profesor", "Alumno" }));
        cmbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 670, 40));

        cmbGrupos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        cmbGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo" }));
        cmbGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGruposActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 350, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 1130, 210));

        btnEliminarAlumnoGrupo.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarAlumnoGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Eliminar.png"))); // NOI18N
        btnEliminarAlumnoGrupo.setText("Eliminar Alumno");
        btnEliminarAlumnoGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarAlumnoGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 702, 170, 30));

        btnAñadirAlumnosGrupo.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirAlumnosGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/Añadir.png"))); // NOI18N
        btnAñadirAlumnosGrupo.setText("Crear");
        btnAñadirAlumnosGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirAlumnosGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirAlumnosGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1273, 702, 130, 30));

        btnAnadir.setBackground(new java.awt.Color(204, 204, 204));
        btnAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desing/clip.png"))); // NOI18N
        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnoActionPerformed
        // TODO add your handling code here:
         // Obtener el alumno seleccionado
    String alumnoSeleccionado = (String) cmbAlumno.getSelectedItem();

    // Si no es la opción predeterminada, buscamos el correo del alumno
    if (!alumnoSeleccionado.equals("Seleccionar Alumno")) {
        String[] nombreApellido = alumnoSeleccionado.split(" ");
        String nombre = nombreApellido[0];
        String apellidoPaterno = nombreApellido[1];

        String sql = "SELECT correo FROM public.alumnos WHERE nombre = ? AND apellido_paterno = ?";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, apellidoPaterno);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    txtCorreoAlumno.setText(rs.getString("correo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el correo del alumno.");
        }
    }
    }//GEN-LAST:event_cmbAlumnoActionPerformed

    private void txtCorreoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoAlumnoActionPerformed

    private void cmbGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGruposActionPerformed

    private void btnEliminarAlumnoGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoGrupoActionPerformed
       // Obtener el alumno y grupo seleccionados
    String alumnoSeleccionado = cmbAlumno.getSelectedItem().toString();
    String grupoSeleccionado = cmbGrupos.getSelectedItem().toString();

    // Validar si se ha seleccionado un alumno y un grupo
    if (!alumnoSeleccionado.equals("Seleccionar Alumno") && !grupoSeleccionado.equals("Seleccionar Grupo")) {
        // Obtener el id del alumno y grupo desde la base de datos
        int idAlumno = obtenerIdAlumno(alumnoSeleccionado);
        int idGrupo = obtenerIdGrupo(grupoSeleccionado);

        if (idAlumno != -1 && idGrupo != -1) {
            // Verificar si el alumno está en el grupo
            if (estaEnGrupo(idAlumno, idGrupo)) {
                // Eliminar el alumno del grupo
                String sql = "DELETE FROM public.grupos_alumnos WHERE id_grupo = ? AND id_alumno = ?";
                try (Connection conn = ConexionDB.getConnection();
                     PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setInt(1, idGrupo);
                    stmt.setInt(2, idAlumno);
                    stmt.executeUpdate();
                    System.out.println(alumnoSeleccionado + " eliminado de " + grupoSeleccionado);
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Error al eliminar el alumno del grupo.");
                }
            } else {
                System.out.println("El alumno no está en este grupo.");
            }
        } else {
            System.out.println("No se pudo encontrar el alumno o el grupo.");
        }
    } else {
        System.out.println("Por favor, seleccione un alumno y un grupo.");
    }
    }//GEN-LAST:event_btnEliminarAlumnoGrupoActionPerformed

    private void btnAñadirAlumnosGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirAlumnosGrupoActionPerformed
       // Obtener el alumno y grupo seleccionados
    String alumnoSeleccionado = cmbAlumno.getSelectedItem().toString();
    String grupoSeleccionado = cmbGrupos.getSelectedItem().toString();

    // Validar si se ha seleccionado un alumno y un grupo
    if (!alumnoSeleccionado.equals("Seleccionar Alumno") && !grupoSeleccionado.equals("Seleccionar Grupo")) {
        // Obtener el id del alumno y grupo desde la base de datos
        int idAlumno = obtenerIdAlumno(alumnoSeleccionado);
        int idGrupo = obtenerIdGrupo(grupoSeleccionado);

        if (idAlumno != -1 && idGrupo != -1) {
            // Verificar si el alumno ya está en el grupo
            if (!estaEnGrupo(idAlumno, idGrupo)) {
                // Insertar alumno en la tabla grupos_alumnos
                String sql = "INSERT INTO public.grupos_alumnos (id_grupo, id_alumno) VALUES (?, ?)";
                try (Connection conn = ConexionDB.getConnection();
                     PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setInt(1, idGrupo);
                    stmt.setInt(2, idAlumno);
                    stmt.executeUpdate();
                    System.out.println(alumnoSeleccionado + " añadido a " + grupoSeleccionado);
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("Error al agregar el alumno al grupo.");
                }
            } else {
                System.out.println("El alumno ya está en este grupo.");
            }
        } else {
            System.out.println("No se pudo encontrar el alumno o el grupo.");
        }
    } else {
        System.out.println("Por favor, seleccione un alumno y un grupo.");
    }
    }//GEN-LAST:event_btnAñadirAlumnosGrupoActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        // Obtener el alumno y el grupo seleccionados
    String alumnoSeleccionado = (String) cmbAlumno.getSelectedItem();
    String grupoSeleccionado = (String) cmbGrupos.getSelectedItem();

    // Verificar que se haya seleccionado un alumno y un grupo
    if (!alumnoSeleccionado.equals("Seleccionar Alumno") && !grupoSeleccionado.equals("Seleccionar Grupo")) {
        // Dividir el nombre del alumno para obtener el nombre completo (o usar solo el índice)
        String[] nombreApellido = alumnoSeleccionado.split(" ");
        String nombre = nombreApellido[0];
        String apellidoPaterno = nombreApellido[1];

        // Obtener el id del alumno
        String sqlAlumno = "SELECT id FROM public.alumnos WHERE nombre = ? AND apellido_paterno = ?";
        int idAlumno = -1;
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlAlumno)) {

            stmt.setString(1, nombre);
            stmt.setString(2, apellidoPaterno);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idAlumno = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el id del alumno.");
            return;
        }

        // Obtener el id del grupo
        String sqlGrupo = "SELECT id FROM public.grupos WHERE nombre_grupo = ?";
        int idGrupo = -1;
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlGrupo)) {

            stmt.setString(1, grupoSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idGrupo = rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el id del grupo.");
            return;
        }

        // Insertar la relación en la tabla grupos_alumnos
        String sqlInsertar = "INSERT INTO public.grupos_alumnos (id_grupo, id_alumno) VALUES (?, ?)";
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlInsertar)) {

            stmt.setInt(1, idGrupo);
            stmt.setInt(2, idAlumno);
            stmt.executeUpdate();

            // Agregar los datos al JTable
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{alumnoSeleccionado, grupoSeleccionado});

        //    System.out.println("Alumno añadido al grupo correctamente.");
            JOptionPane.showMessageDialog(this, "Alumno añadido al grupo correctamente.");
            
        } catch (SQLException e) {
            e.printStackTrace();
            
             JOptionPane.showMessageDialog(this, "Error al insertar la relación en la base de datos.");
        }
    } else {
        System.out.println("Debe seleccionar un alumno y un grupo.");
    }
    }//GEN-LAST:event_btnAnadirActionPerformed


    private int obtenerIdAlumno(String alumnoNombre) {
    String sql = "SELECT id FROM public.alumnos WHERE nombre || ' ' || apellido_paterno = ?";
    try (Connection conn = ConexionDB.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, alumnoNombre);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return -1;
}
private int obtenerIdGrupo(String grupoNombre) {
    String sql = "SELECT id FROM public.grupos WHERE nombre_grupo = ?";
    try (Connection conn = ConexionDB.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, grupoNombre);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("id");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return -1;
}
private boolean estaEnGrupo(int idAlumno, int idGrupo) {
    String sql = "SELECT 1 FROM public.grupos_alumnos WHERE id_grupo = ? AND id_alumno = ?";
    try (Connection conn = ConexionDB.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, idGrupo);
        stmt.setInt(2, idAlumno);
        ResultSet rs = stmt.executeQuery();

        return rs.next(); // Si existe un registro, el alumno ya está en el grupo.
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
private void llenarComboBox() {
    // Llenar cmbAlumno con los alumnos
    DefaultComboBoxModel<String> modelAlumno = new DefaultComboBoxModel<>();
    cmbAlumno.setModel(modelAlumno);
    modelAlumno.addElement("Seleccionar Alumno");  // Elemento por defecto

    String sqlAlumnos = "SELECT nombre, apellido_paterno FROM public.alumnos";
    try (Connection conn = ConexionDB.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sqlAlumnos)) {

        while (rs.next()) {
            String nombreCompleto = rs.getString("nombre") + " " + rs.getString("apellido_paterno");
            modelAlumno.addElement(nombreCompleto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al cargar los alumnos.");
    }

    // Llenar cmbGrupos con los grupos
    DefaultComboBoxModel<String> modelGrupo = new DefaultComboBoxModel<>();
    cmbGrupos.setModel(modelGrupo);
    modelGrupo.addElement("Seleccionar Grupo");  // Elemento por defecto

    String sqlGrupos = "SELECT nombre_grupo FROM public.grupos";
    try (Connection conn = ConexionDB.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sqlGrupos)) {

        while (rs.next()) {
            modelGrupo.addElement(rs.getString("nombre_grupo"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al cargar los grupos.");
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
            java.util.logging.Logger.getLogger(AdminAlumnosUnirGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAlumnosUnirGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAlumnosUnirGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAlumnosUnirGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlumnosUnirGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnAñadirAlumnosGrupo;
    private javax.swing.JButton btnEliminarAlumnoGrupo;
    private javax.swing.JComboBox<String> cmbAlumno;
    private javax.swing.JComboBox<String> cmbGrupos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCalif;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblDatosDocente;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtCorreoAlumno;
    // End of variables declaration//GEN-END:variables
}
