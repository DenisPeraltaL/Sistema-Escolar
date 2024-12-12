/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author ALEJANDRO
 *
import java.sql.*;
import java.util.*;

public class ProfesorDAO {
    private Connection conexion;

    // Constructor de ProfesorDAO
    public ProfesorDAO() {
        // Usamos el método getConnection para obtener la conexión
        conexion = ConexionDB.getConnection();
    }
    

    // Método para obtener el ID de usuario por nombre de usuario
    public int obtenerIdUsuario(String nombreUsuario) throws SQLException {
        String query = "SELECT id FROM usuarios WHERE nombre_usuario = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {  // Cambié 'connection' por 'conexion'
            stmt.setString(1, nombreUsuario);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1; // Usuario no encontrado
            }
        }
    }

    // Método para insertar un nuevo profesor
    public void insertarProfesor(Profesor profesor) throws SQLException {
        String sql = "INSERT INTO profesores (nombre, apellidoP, apellidoM, telefono, domicilio, cedula) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getApellidoP());
            ps.setString(3, profesor.getApellidoM());
            ps.setString(4, profesor.getTelefono());
            ps.setString(5, profesor.getDomicilio());
            ps.setString(6, profesor.getCedula());
            ps.executeUpdate();
        }
    }

    // Método para modificar los datos de un profesor
    public void modificarProfesor(Profesor profesor) throws SQLException {
        String sql = "UPDATE profesores SET nombre = ?, apellidoP = ?, apellidoM = ?, telefono = ?, domicilio = ? WHERE cedula = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, profesor.getNombre());
            ps.setString(2, profesor.getApellidoP());
            ps.setString(3, profesor.getApellidoM());
            ps.setString(4, profesor.getTelefono());
            ps.setString(5, profesor.getDomicilio());
            ps.setString(6, profesor.getCedula());
            ps.executeUpdate();
        }
    }

    // Método para eliminar un profesor por su cédula
    public void eliminarProfesor(String cedula) throws SQLException {
        String sql = "DELETE FROM profesores WHERE cedula = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, cedula);
            ps.executeUpdate();
        }
    }

    // Método para obtener todos los profesores
  
}
*/