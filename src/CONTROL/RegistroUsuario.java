/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;

/**
 *
 * @author ALEJANDRO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import MODELO.ConexionDB;


public class RegistroUsuario {
    public boolean registrarUsuario(String nombreUsuario, String correo, String contrasena, String tipoUsuario) {
        Connection conn = ConexionDB.conectar();
        if (conn != null) {
            String query = "INSERT INTO usuarios (nombre_usuario, correo, contrasena, tipo_usuario) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                // Setear los valores de los parámetros
                pstmt.setString(1, nombreUsuario);
                pstmt.setString(2, correo);
                pstmt.setString(3, contrasena);
                pstmt.setString(4, tipoUsuario);

                // Ejecutar la consulta
                int filasInsertadas = pstmt.executeUpdate();
                if (filasInsertadas > 0) {
                    return true;  // Usuario registrado exitosamente
                }
            } catch (SQLException ex) {
                System.out.println("Error al insertar el usuario: " + ex.getMessage());
            }
        }
        return false;
    }
}
