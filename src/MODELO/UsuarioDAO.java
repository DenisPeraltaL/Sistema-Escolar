/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Denis Peralta
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // Método para obtener los usuarios desde la base de datos
    public List<Usuario> obtenerUsuariosDeBaseDeDatos() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        
        String query = "SELECT * FROM usuarios"; // Asegúrate de que la consulta SQL esté correcta
        
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            // Recorrer el resultado de la consulta y agregar cada usuario a la lista
            while (rs.next()) {
                String nombreUsuario = rs.getString("nombreUsuario");
                String nombres = rs.getString("nombres");
                String apellidos = rs.getString("apellidos");
                String correo = rs.getString("correo");
                String tipoUsuario = rs.getString("tipoUsuario");
                
                // Crear un objeto Usuario con los datos obtenidos de la base de datos
                Usuario usuario = new Usuario(nombreUsuario, nombres, apellidos, correo, tipoUsuario);
                
                // Agregar el usuario a la lista
                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores
        }
        
        return listaUsuarios;
    }

    // Método de conexión a la base de datos
    private Connection conectar() throws SQLException {
        // Aquí va la lógica de conexión a tu base de datos
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final", "root", "dpl123456");
    }
}
