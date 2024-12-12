/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author ALEJANDRO
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class UsuarioControl {

    // Método para obtener todos los usuarios y llenar el modelo de la tabla
    public static void obtenerUsuarios(DefaultTableModel model) {
        String sql = "SELECT nombre_usuario, nombre, apellidos, correo, tipo_usuario FROM usuario WHERE tipo_usuario IN ('admin', 'profesor', 'alumno')";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            // Limpiar la tabla antes de agregar los nuevos datos
            model.setRowCount(0);

            // Verificar si hay registros en el ResultSet
            if (!rs.isBeforeFirst()) {
                System.out.println("No se encontraron registros.");
            } else {
                // Recorrer el ResultSet y agregar las filas al modelo de la tabla
                while (rs.next()) {
                    String nombreUsuario = rs.getString("nombre_usuario") != null ? rs.getString("nombre_usuario") : "";
                    String nombre = rs.getString("nombre") != null ? rs.getString("nombre") : "";
                    String apellidos = rs.getString("apellidos") != null ? rs.getString("apellidos") : "";
                    String correo = rs.getString("correo") != null ? rs.getString("correo") : "";
                    String tipoUsuario = rs.getString("tipo_usuario") != null ? rs.getString("tipo_usuario") : "";

                    // Agregar la fila al modelo
                    model.addRow(new Object[]{nombreUsuario, nombre, apellidos, correo, tipoUsuario});
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los usuarios: " + e.getMessage());
        }
    }
}
